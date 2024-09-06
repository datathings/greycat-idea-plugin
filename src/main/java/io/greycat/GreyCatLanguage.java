package io.greycat;

import com.intellij.lang.Language;

public class GreyCatLanguage extends Language {

    public static final GreyCatLanguage INSTANCE = new GreyCatLanguage();

    private GreyCatLanguage() {
        super("GreyCat");
    }
}
