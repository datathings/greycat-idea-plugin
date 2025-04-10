package io.greycat;

import com.intellij.execution.configurations.GeneralCommandLine;
import com.intellij.openapi.project.Project;
import com.redhat.devtools.lsp4ij.server.OSProcessStreamConnectionProvider;
import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;

public class GreyCatLanguageServer extends OSProcessStreamConnectionProvider {

    public GreyCatLanguageServer(@NotNull Project project) {
        String lsp_path = null;
        Path lsp;
//        = Paths.get(project.getBasePath(), "misc", "lang-server.js");
//        if (lsp.toFile().exists()) {
//            lsp_path = lsp.toAbsolutePath().toString();
//        } else {
        String greycatHome = System.getProperty("user.home") + File.separator + ".greycat";
        lsp = Paths.get(greycatHome, "misc", "lang-server.js");
        if (lsp.toFile().exists()) {
            lsp_path = lsp.toAbsolutePath().toString();
        }
//        }
        if (lsp_path == null) {
            // missing LSP installation
            throw new RuntimeException("GreyCat Lang Server not found");
        }
        GeneralCommandLine commandLine = new GeneralCommandLine(lsp_path, "--stdio");
        commandLine.withParentEnvironmentType(GeneralCommandLine.ParentEnvironmentType.CONSOLE);
        commandLine.withCharset(StandardCharsets.UTF_8);
        commandLine.withWorkDirectory(project.getBasePath());
        super.setCommandLine(commandLine);
    }

}
