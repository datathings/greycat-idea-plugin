package io.greycat.language.psi;

import com.intellij.psi.tree.IElementType;
import io.greycat.GreyCatLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class GreyCatElementType extends IElementType {

    public GreyCatElementType(@NotNull @NonNls String debugName) {
        super(debugName, GreyCatLanguage.INSTANCE);
    }
}
