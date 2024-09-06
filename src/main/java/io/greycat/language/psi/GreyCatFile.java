package io.greycat.language.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import io.greycat.GreyCatFileType;
import io.greycat.GreyCatLanguage;
import org.jetbrains.annotations.NotNull;

public class GreyCatFile extends PsiFileBase {
    public GreyCatFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, GreyCatLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return GreyCatFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "GreyCat File";
    }
}
