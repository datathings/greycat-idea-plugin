package io.greycat;

import com.intellij.execution.configurations.GeneralCommandLine;
import com.intellij.openapi.project.Project;
import com.redhat.devtools.lsp4ij.server.OSProcessStreamConnectionProvider;
import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.intellij.util.EnvironmentUtil;

import static com.intellij.openapi.util.SystemInfo.isWindows;

public class GreyCatLanguageServer extends OSProcessStreamConnectionProvider {

    public GreyCatLanguageServer(@NotNull Project project) {
        String lsp_path = null;
        Path lsp;
        String greycatHome = System.getProperty("user.home") + File.separator + ".greycat";
        lsp = Paths.get(greycatHome, "misc", "lang-server.js");
        if (lsp.toFile().exists()) {
            lsp_path = lsp.toAbsolutePath().toString();
        }
        if (lsp_path == null) {
            // missing LSP installation
            throw new RuntimeException("GreyCat Lang Server not found");
        }

        String path_env_var = EnvironmentUtil.getValue("PATH");
        if (path_env_var == null) {
            throw new RuntimeException("GreyCat Lang Server unable to find PATH");
        }
        String[] paths_bins = path_env_var.split(File.pathSeparator);
        String node_path = null;
        for (String pathsBin : paths_bins) {
            Path node_bin;
            if (isWindows) {
                node_bin = Paths.get(pathsBin, "node.exe");
            } else {
                node_bin = Paths.get(pathsBin, "node");
            }
            if (node_bin.toFile().exists()) {
                node_path = node_bin.toAbsolutePath().toString();
                break;
            }
        }
        if (node_path == null) {
            throw new RuntimeException("GreyCat Lang Server requires a Node.js runtime in PATH");
        }

        GeneralCommandLine commandLine = new GeneralCommandLine(node_path, lsp_path, "--stdio");
        commandLine.withParentEnvironmentType(GeneralCommandLine.ParentEnvironmentType.CONSOLE);
        commandLine.withCharset(StandardCharsets.UTF_8);
        commandLine.withWorkDirectory(project.getBasePath());
        super.setCommandLine(commandLine);
    }

}
