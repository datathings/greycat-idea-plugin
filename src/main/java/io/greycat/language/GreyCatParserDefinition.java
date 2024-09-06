package io.greycat.language;

import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import io.greycat.GreyCatLanguage;
import io.greycat.language.parser.GreyCatParser;
import io.greycat.language.psi.GreyCatFile;
import io.greycat.language.psi.GreyCatTypes;
import io.greycat.language.psi.GreyCatTypesExt;
import org.jetbrains.annotations.NotNull;

public class GreyCatParserDefinition implements ParserDefinition {

    public static final IFileElementType FILE = new IFileElementType((GreyCatLanguage.INSTANCE));

    @Override
    public @NotNull Lexer createLexer(Project project) {
        return new GreyCatLexerAdapter();
    }

    @Override
    public @NotNull PsiParser createParser(Project project) {
        return new GreyCatParser();
    }

    @Override
    public @NotNull PsiFile createFile(@NotNull FileViewProvider viewProvider) {
        return new GreyCatFile(viewProvider);
    }

    @Override
    public @NotNull PsiElement createElement(ASTNode node) {
        return GreyCatTypes.Factory.createElement(node);
    }

    @Override
    public @NotNull TokenSet getCommentTokens() {
        return GreyCatTypesExt.COMMENTS;
    }

    @Override
    public @NotNull TokenSet getStringLiteralElements() {
        return GreyCatTypesExt.STRINGS;
    }

    @Override
    public @NotNull IFileElementType getFileNodeType() {
        return GreyCatParserDefinition.FILE;
    }

    @Override
    public @NotNull SpaceRequirements spaceExistenceTypeBetweenTokens(ASTNode left, ASTNode right) {
        return SpaceRequirements.MAY;
    }
}
