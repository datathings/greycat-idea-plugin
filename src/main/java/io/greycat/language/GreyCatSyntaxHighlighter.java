package io.greycat.language;


import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.openapi.fileTypes.SyntaxHighlighterFactory;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

import static io.greycat.language.psi.GreyCatTypes.*;
import static io.greycat.language.psi.GreyCatTypesExt.*;

public class GreyCatSyntaxHighlighter extends SyntaxHighlighterBase {
    private static final Map<IElementType, TextAttributesKey> ATTRIBUTES = new HashMap<>();

    static {
        fillMap(ATTRIBUTES, KEYWORDS, GreyCatColors.KEYWORD);

        fillMap(ATTRIBUTES, ASSIGNMENT_OPERATORS, GreyCatColors.OPERATION_SIGN);
        fillMap(ATTRIBUTES, BINARY_OPERATORS, GreyCatColors.OPERATION_SIGN);
        fillMap(ATTRIBUTES, UNARY_OPERATORS, GreyCatColors.OPERATION_SIGN);

        fillMap(ATTRIBUTES, STRINGS, GreyCatColors.STRING);

        ATTRIBUTES.put(NUMBER, GreyCatColors.NUMBER);

        ATTRIBUTES.put(LPAREN, GreyCatColors.PARENTHS);
        ATTRIBUTES.put(RPAREN, GreyCatColors.PARENTHS);

        ATTRIBUTES.put(LCURLY, GreyCatColors.BRACES);
        ATTRIBUTES.put(RCURLY, GreyCatColors.BRACES);

        ATTRIBUTES.put(LSQUARE, GreyCatColors.BRACKETS);
        ATTRIBUTES.put(RSQUARE, GreyCatColors.BRACKETS);

        ATTRIBUTES.put(COMMA, GreyCatColors.COMMA);
        ATTRIBUTES.put(DOT, GreyCatColors.DOT);
        ATTRIBUTES.put(DOT_DOT, GreyCatColors.DOT);
        ATTRIBUTES.put(SEMI, GreyCatColors.SEMICOLON);
        ATTRIBUTES.put(ENTER_INTERPOLATION, GreyCatColors.SEMICOLON);
        ATTRIBUTES.put(EXIT_INTERPOLATION, GreyCatColors.SEMICOLON);
        ATTRIBUTES.put(COLON, GreyCatColors.COLON);
        ATTRIBUTES.put(ARROW, GreyCatColors.FAT_ARROW);

        ATTRIBUTES.put(LINE_COMMENT, GreyCatColors.LINE_COMMENT);
        ATTRIBUTES.put(DOC_COMMENT, GreyCatColors.DOC_COMMENT);

        ATTRIBUTES.put(MULTI_LINE_COMMENT_START, GreyCatColors.BLOCK_COMMENT);
        ATTRIBUTES.put(MULTI_LINE_COMMENT_END, GreyCatColors.BLOCK_COMMENT);
        ATTRIBUTES.put(MULTI_LINE_COMMENT_BODY, GreyCatColors.BLOCK_COMMENT);

        // Annotator API to specify type/enum/fn
        ATTRIBUTES.put(TYPE_IDENT, GreyCatColors.TYPE);
        ATTRIBUTES.put(ENUM_IDENT, GreyCatColors.ENUM);
        ATTRIBUTES.put(IDENTIFIER, GreyCatColors.IDENTIFIER);

        ATTRIBUTES.put(TYPE_ATTR, GreyCatColors.INSTANCE_FIELD_DECLARATION);
        ATTRIBUTES.put(TYPE_METHOD, GreyCatColors.INSTANCE_METHOD_DECLARATION);

        ATTRIBUTES.put(BAD_CHARACTER, GreyCatColors.BAD_CHARACTER);
    }

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new GreyCatLexerAdapter();
    }

    @Override
    public TextAttributesKey @NotNull [] getTokenHighlights(IElementType tokenType) {
        return pack(ATTRIBUTES.get(tokenType));
    }

    public static class Factory extends SyntaxHighlighterFactory {

        @NotNull
        @Override
        public SyntaxHighlighter getSyntaxHighlighter(Project project, VirtualFile virtualFile) {
            return new GreyCatSyntaxHighlighter();
        }
    }
}
