package io.greycat.language;

import com.intellij.psi.tree.IElementType;
import io.greycat.language.psi.GreyCatTypes;
import com.intellij.lang.annotation.*;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.util.Key;
import com.intellij.psi.PsiElement;
import org.eclipse.lsp4j.Diagnostic;
import org.jetbrains.annotations.NotNull;

import java.util.*;

public class GreyCatAnnotator implements Annotator {

    private static final Key<List<Diagnostic>> GREYCAT_DIAGS = Key.create("GREYCAT_DIAGS");

    @Override
    public void annotate(@NotNull PsiElement element, @NotNull AnnotationHolder holder) {
        if (holder.isBatchMode()) return;

        final IElementType type = element.getNode().getElementType();
        if (type == GreyCatTypes.TYPE_IDENT) {
            setHighlighting(holder, GreyCatColors.TYPE);
        } else if (type == GreyCatTypes.ATTR_IDENT) {
            PsiElement firstChild = element.getParent().getFirstChild();
            if (firstChild == null || firstChild.equals(element)) {
                setHighlighting(holder, GreyCatColors.INSTANCE_FIELD_DECLARATION);
            } else {
                setHighlighting(holder, GreyCatColors.STATIC_FIELD_DECLARATION);
            }
        } else if (type == GreyCatTypes.FN_IDENT) {
            setHighlighting(holder, GreyCatColors.FUNCTION_CALL);
        } else if (type == GreyCatTypes.ENUM_FIELD_IDENT) {
            setHighlighting(holder, GreyCatColors.ENUM_FIELD);
        } else if (type == GreyCatTypes.OBJECT_PROP_IDENT) {
            setHighlighting(holder, GreyCatColors.INSTANCE_FIELD_REFERENCE);
        } else if (type == GreyCatTypes.FN_PARAM_IDENT) {
            setHighlighting(holder, GreyCatColors.PARAMETER_DECLARATION);
        } else if (type == GreyCatTypes.VAR_DECL_IDENT) {
            setHighlighting(holder, GreyCatColors.LOCAL_VARIABLE_DECLARATION);
        } else if (type == GreyCatTypes.METHOD_IDENT) {
            PsiElement firstChild = element.getParent().getFirstChild();
            if (firstChild != null && firstChild.getText().equals("static")) {
                setHighlighting(holder, GreyCatColors.STATIC_METHOD_DECLARATION);
                return;
            }
            setHighlighting(holder, GreyCatColors.INSTANCE_METHOD_DECLARATION);
        } else if (type == GreyCatTypes.PRAGMA_IDENT) {
            setHighlighting(holder, GreyCatColors.ANNOTATION);
        }
    }

    private static void setHighlighting(@NotNull final AnnotationHolder holder,
                                        @NotNull final TextAttributesKey key) {
        holder
                .newSilentAnnotation(HighlightSeverity.INFORMATION)
                .textAttributes(key)
                .create();
    }

}
