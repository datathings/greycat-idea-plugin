package io.greycat.language;

import com.intellij.lang.CodeDocumentationAwareCommenter;
import com.intellij.psi.PsiComment;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.Nullable;

import static io.greycat.language.psi.GreyCatTypes.*;
import static io.greycat.language.psi.GreyCatTypesExt.*;

public class GreyCatCommenter implements CodeDocumentationAwareCommenter {
    @Override
    public String getLineCommentPrefix() {
        return "//";
    }

    @Override
    public String getBlockCommentPrefix() {
        return "/*";
    }

    @Override
    public String getBlockCommentSuffix() {
        return "*/";
    }

    @Override
    public String getCommentedBlockCommentPrefix() {
        return null;
    }

    @Override
    public String getCommentedBlockCommentSuffix() {
        return null;
    }

    @Override
    public @Nullable IElementType getLineCommentTokenType() {
        return LINE_COMMENT;
    }

    @Override
    public @Nullable IElementType getBlockCommentTokenType() {
        return MULTI_LINE_COMMENT;
    }

    @Override
    public String getDocumentationCommentPrefix() {
        return "///";
    }

    @Override
    public String getDocumentationCommentLinePrefix() {
        return "*";
    }

    @Override
    public String getDocumentationCommentSuffix() {
        return "*/";
    }

    @Override
    public boolean isDocumentationComment(final PsiComment element) {
        return element.getTokenType() == DOC_COMMENT;
    }

    @Override
    public @Nullable IElementType getDocumentationCommentTokenType() {
        return DOC_COMMENT;
    }
}

