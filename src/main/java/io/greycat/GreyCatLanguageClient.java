package io.greycat;

import com.intellij.openapi.project.Project;
import com.redhat.devtools.lsp4ij.client.LanguageClientImpl;

public class GreyCatLanguageClient extends LanguageClientImpl {
    public GreyCatLanguageClient(Project project) {
        super(project);
    }
}