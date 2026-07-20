package io.greycat;

import com.intellij.execution.configurations.GeneralCommandLine;
import com.intellij.openapi.project.Project;
import com.redhat.devtools.lsp4ij.server.OSProcessStreamConnectionProvider;
import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;

import static com.intellij.openapi.util.SystemInfo.isWindows;

public class GreyCatLanguageServer extends OSProcessStreamConnectionProvider {

    public GreyCatLanguageServer(@NotNull Project project) {
        String greycat_bin = null;
        Path greycat_path = null;

        final String exe_name = isWindows ? "greycat.exe" : "greycat";

        String local_path = project.getBasePath();
        if (local_path != null) {
            greycat_path = Paths.get(local_path, "bin", exe_name);
        }
        String global_path = System.getProperty("user.home") + File.separator + ".greycat";
        if (greycat_path == null || !greycat_path.toFile().exists()) {
            greycat_path = Paths.get(global_path, "bin", exe_name);
        }
        if (greycat_path.toFile().exists()) {
            greycat_bin = greycat_path.toAbsolutePath().toString();
        }
        if (greycat_bin == null) {
            throw new RuntimeException("unable to locate GreyCat (looked-up locations: `./bin/greycat`, `~/.greycat/bin`)");
        }

        GeneralCommandLine cmd = new GeneralCommandLine(greycat_bin, "lsp");
        cmd.withParentEnvironmentType(GeneralCommandLine.ParentEnvironmentType.CONSOLE);
        cmd.withCharset(StandardCharsets.UTF_8);
        cmd.withWorkDirectory(project.getBasePath());
        super.setCommandLine(cmd);
    }
}
