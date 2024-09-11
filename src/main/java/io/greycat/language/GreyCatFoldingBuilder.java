package io.greycat.language;

import com.intellij.lang.ASTNode;
import com.intellij.lang.folding.FoldingBuilder;
import com.intellij.lang.folding.FoldingDescriptor;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.TokenSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

import static io.greycat.language.psi.GreyCatTypes.*;

public class GreyCatFoldingBuilder implements FoldingBuilder {
    private static final TokenSet CURLY_FOLDABLES = TokenSet.create(TYPE_DECL, FN_DECL, ENUM_DECL, TYPE_METHOD, BLOCK, FN_EXPR, ONE_FIELD_OBJ, TWO_FIELDS_OBJ, THREE_FIELDS_OBJ, ARRAY_EXPR, TABLE_EXPR, OBJECT_EXPR, ARRAY_OBJ);
    private static final TokenSet SQUARE_FOLDABLES = TokenSet.create(SHORT_ARRAY_EXPR);

    @NotNull
    @Override
    public FoldingDescriptor @NotNull [] buildFoldRegions(@NotNull ASTNode node, @NotNull Document document) {
        List<FoldingDescriptor> descriptors = new ArrayList<>();
        appendDescriptors(node, document, descriptors);
        return descriptors.toArray(new FoldingDescriptor[descriptors.size()]);
    }

    private void appendDescriptors(final ASTNode node, final Document document, final List<FoldingDescriptor> descriptors) {
        final IElementType type = node.getElementType();
        boolean isFoldable = false;
        boolean isSquare = false;
        if (CURLY_FOLDABLES.contains(type)) {
            isFoldable = true;
        } else if (SQUARE_FOLDABLES.contains(type)) {
            isFoldable = true;
            isSquare = true;
        }

        if (isFoldable) {
            TextRange fullRange = node.getTextRange();
            if (fullRange.getEndOffset() - fullRange.getStartOffset() > 0) {
                try {
                    int startOffset = fullRange.getStartOffset() + document.getText(fullRange).indexOf(isSquare ? "[" : "{") + 1;
                    int endOffset = fullRange.getEndOffset() - 1;
                    if (startOffset < endOffset) {
                        TextRange shortRange = new TextRange(startOffset, fullRange.getEndOffset() - 1);
                        if (shortRange.getEndOffset() - shortRange.getStartOffset() > 1) {
                            descriptors.add(new FoldingDescriptor(node, shortRange));
                        }
                    }
                } catch (Throwable e) {
                    e.printStackTrace();
                }
            }
        }

        ASTNode child = node.getFirstChildNode();
        while (child != null) {
            appendDescriptors(child, document, descriptors);
            child = child.getTreeNext();
        }
    }

    @Nullable
    @Override
    public String getPlaceholderText(@NotNull ASTNode node) {
        return "...";

    }

    @Override
    public boolean isCollapsedByDefault(@NotNull ASTNode astNode) {
        return false;
    }

}

