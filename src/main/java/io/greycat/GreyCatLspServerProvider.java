package io.greycat;

import com.intellij.execution.ExecutionException;
import com.intellij.javascript.nodejs.interpreter.NodeCommandLineConfigurator;
import com.intellij.javascript.nodejs.interpreter.NodeJsInterpreter;
import com.intellij.javascript.nodejs.interpreter.NodeJsInterpreterManager;
import com.intellij.javascript.nodejs.interpreter.local.NodeJsLocalInterpreter;
import com.intellij.platform.lsp.api.LspServerSupportProvider;
import com.intellij.platform.lsp.api.ProjectWideLspServerDescriptor;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.execution.configurations.GeneralCommandLine;
import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;

public class GreyCatLspServerProvider implements LspServerSupportProvider {
    @Override
    public void fileOpened(@NotNull Project project, VirtualFile file, @NotNull LspServerStarter serverStarter) {
        if ("gcl".equals(file.getExtension())) {
            serverStarter.ensureServerStarted(new GreyCatLspServerDescriptor(project));
        }
    }

    private static class GreyCatLspServerDescriptor extends ProjectWideLspServerDescriptor {
        protected GreyCatLspServerDescriptor(Project project) {
            super(project, "GreyCat");
        }

        @Override
        public boolean isSupportedFile(VirtualFile file) {
            return "gcl".equals(file.getExtension());
        }

        @Override
        public GeneralCommandLine createCommandLine() throws ExecutionException {
            final Project project = this.getProject();

            String greycatHome = System.getenv("GREYCAT_HOME");
            if (greycatHome == null) {
                greycatHome = System.getProperty("user.home") + File.separator + ".greycat";
            }

            Path lsp = Paths.get(greycatHome, "misc", "lang-server.js");
            if (!lsp.toFile().exists()) {
                // missing LSP installation
                throw new ExecutionException("GreyCat Lang Server not found");
            }

            NodeJsInterpreter interpreter = NodeJsInterpreterManager.getInstance(project).getInterpreter();
            if (interpreter == null) {
                throw new ExecutionException("Unable to find NodeJS");
            }

            GeneralCommandLine commandLine = new GeneralCommandLine();
//            commandLine.setExePath("node");
            commandLine.withParentEnvironmentType(GeneralCommandLine.ParentEnvironmentType.CONSOLE);
            commandLine.withCharset(StandardCharsets.UTF_8);
            commandLine.withWorkDirectory(project.getBasePath());
            commandLine.addParameter(lsp.toString());
            commandLine.addParameter("--stdio");

            NodeCommandLineConfigurator.find(interpreter)
                    .configure(commandLine, NodeCommandLineConfigurator.defaultOptions(project));

            return commandLine;
        }
    }
}
