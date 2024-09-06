package io.greycat.language.psi;

import com.intellij.psi.tree.IElementType;
import io.greycat.GreyCatLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class GreyCatTokenType extends IElementType {

    public GreyCatTokenType(@NotNull @NonNls String debugName) {
        super(debugName, GreyCatLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "GreyCatTokenType." + super.toString();
    }
}
