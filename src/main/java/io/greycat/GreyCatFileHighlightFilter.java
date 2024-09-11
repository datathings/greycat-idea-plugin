package io.greycat;

import com.intellij.openapi.util.Condition;
import com.intellij.openapi.vfs.VirtualFile;

public class GreyCatFileHighlightFilter implements Condition<VirtualFile> {
    @Override
    public boolean value(VirtualFile virtualFile) {
        return virtualFile.getFileType() == GreyCatFileType.INSTANCE;
    }
}

