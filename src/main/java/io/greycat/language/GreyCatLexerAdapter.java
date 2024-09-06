package io.greycat.language;

import com.intellij.lexer.FlexAdapter;

public class GreyCatLexerAdapter extends FlexAdapter {

    public GreyCatLexerAdapter() {
        super(new GreyCatFlexLexer(null));
    }
}
