package io.greycat;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class GreyCatFileType extends LanguageFileType {

    public static final LanguageFileType INSTANCE = new GreyCatFileType();

    private GreyCatFileType() {
        super(GreyCatLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "GreyCat File";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "GreyCat language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "gcl";
    }

    @Override
    public Icon getIcon() {
        return GreyCatIcons.FILE;
    }
}
