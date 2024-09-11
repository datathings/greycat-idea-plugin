package io.greycat.language;

import com.intellij.lang.BracePair;
import com.intellij.lang.PairedBraceMatcher;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IElementType;
import io.greycat.language.psi.GreyCatTypesExt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static io.greycat.language.psi.GreyCatTypes.*;

public class GreyCatBraceMatcher implements PairedBraceMatcher {
    private static final BracePair[] BRACE_PAIRS = {
            new BracePair(LCURLY, RCURLY, true),
            new BracePair(LSQUARE, RSQUARE, false),
            new BracePair(LPAREN, RPAREN, false),
            new BracePair(DQUOTE, DQUOTE, false),
            new BracePair(SQUOTE, SQUOTE, false),
            new BracePair(ENTER_INTERPOLATION, EXIT_INTERPOLATION, false),
    };

    @Override
    public BracePair @NotNull [] getPairs() {
        return BRACE_PAIRS;
    }

    @Override
    public boolean isPairedBracesAllowedBeforeType(@NotNull IElementType lbraceType, @Nullable IElementType contextType) {
        return !GreyCatTypesExt.STRINGS.contains(contextType);
    }

    @Override
    public int getCodeConstructStart(PsiFile file, int openingBraceOffset) {
        return openingBraceOffset;
    }

}
