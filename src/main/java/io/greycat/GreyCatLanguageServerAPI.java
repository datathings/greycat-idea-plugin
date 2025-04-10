package io.greycat;

import com.intellij.openapi.application.Application;
import org.eclipse.lsp4j.jsonrpc.services.JsonRequest;
import org.eclipse.lsp4j.services.LanguageServer;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface GreyCatLanguageServerAPI  extends LanguageServer {

    @JsonRequest("my/applications")
    CompletableFuture<List<Application>> getApplications();

}