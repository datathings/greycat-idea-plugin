package io.greycat;

import com.intellij.execution.ExecutionException;
import com.intellij.execution.ExecutionManager;
import com.intellij.execution.configurations.GeneralCommandLine;
import com.intellij.execution.process.OSProcessHandler;
import com.intellij.execution.process.ProcessHandler;
import com.intellij.openapi.actionSystem.*;
import com.intellij.openapi.actionSystem.ex.ActionUtil;
import com.intellij.openapi.fileEditor.FileDocumentManager;
import com.intellij.openapi.project.Project;
import com.redhat.devtools.lsp4ij.commands.LSPCommand;
import com.redhat.devtools.lsp4ij.commands.LSPCommandAction;
import org.jetbrains.annotations.NotNull;

import java.nio.charset.Charset;

import static com.intellij.execution.runners.DefaultProgramRunnerKt.showRunContent;


public class GreyCatRunCommand extends LSPCommandAction {
    @Override
    protected void commandPerformed(@NotNull LSPCommand lspCommand, @NotNull AnActionEvent anActionEvent) {
//        Project project = anActionEvent.getProject();
//        if (project == null) {
//            return;
//        }
//
//
//        GeneralCommandLine generalCommandLine = new GeneralCommandLine("greycat", "-v");
//        generalCommandLine.setCharset(Charset.forName("UTF-8"));
//        generalCommandLine.setWorkDirectory(project.getBasePath());
//        try {
//            ProcessHandler processHandler;
//            processHandler = new OSProcessHandler(generalCommandLine);
//            processHandler.startNotify();
//
//        } catch (ExecutionException e) {
//            throw new RuntimeException(e);
//        }
//
//       // Content content = contentManager.findContent("tab name");
//       // JBTerminalWidget widget = TerminalView.getWidgetByContent(content);
//
////        AnAction codeCompletionAction = ActionManager.getInstance().getAction(CODE_COMPLETION_ACTION);
////        if (codeCompletionAction != null ) {
////            DataContext dataContext = createDataContext(activeEditor, project);
////            ActionUtil.invokeAction(codeCompletionAction, dataContext, ActionPlaces.UNKNOWN, null, null);
////        }
//
//
//
//
//
//        ExecutionManager.getInstance(project).startRunProfile(environment, state -> {
//            FileDocumentManager.getInstance().saveAllDocuments();
//            return showRunContent(state.execute(environment.getExecutor(), this), environment);
//        });
//

    }
}
