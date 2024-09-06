package io.greycat.language.psi;

import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.TokenSet;

import static io.greycat.language.psi.GreyCatTypes.*;

public interface GreyCatTypesExt {
    // can't appear in PSI because merged into MULTI_LINE_COMMENT
    IElementType WHITE_SPACE = TokenType.WHITE_SPACE;
    IElementType BAD_CHARACTER = TokenType.BAD_CHARACTER;

    IElementType MULTI_LINE_COMMENT_START = new GreyCatElementType("MULTI_LINE_COMMENT_START");
    IElementType MULTI_LINE_COMMENT_BODY = new GreyCatElementType("MULTI_LINE_COMMENT_BODY");
    IElementType MULTI_LINE_COMMENT_END = new GreyCatElementType("MULTI_LINE_COMMENT_END");

    IElementType MULTI_LINE_COMMENT = new GreyCatElementType("MULTI_LINE_COMMENT");

    TokenSet COMMENTS = TokenSet.create(LINE_COMMENT, BLOCK_COMMENT, MULTI_LINE_COMMENT);

    TokenSet KEYWORDS = TokenSet.create(
            ABSTRACT_KW, AS_KW, AT_KW, BREAK_KW, CATCH_KW, DO_KW, ELSE_KW, ENUM_KW, FOR_KW, FN_KW, IF_KW, IN_KW,
            LIMIT_KW, NATIVE_KW, NULL_KW, PRIVATE_KW, RETURN_KW, SAMPLING_KW, SKIP_KW, STATIC_KW, THIS_KW, THROW_KW,
            TRY_KW, TYPE_KW, USE_KW, VAR_KW, WHILE_KW, WITHOUT_KW, EXTENDS_KW, TASK_KW
    );

    TokenSet STRINGS = TokenSet.create(
            ENTER_TEMPLATE, EXIT_TEMPLATE, RAW_STRING, STRING
    );

    TokenSet OPERATORS = TokenSet.create(
            MINUS, MINUS_EQ, MINUS_MINUS, PLUS, PLUS_PLUS, PLUS_EQ, SLASH, SLASH_EQ, STAR, STAR_EQ, NOT, EQ, EQ_EQ,
            NOT_EQ, GT, GT_EQ, LT, LT_EQ, BAR, BAR_BAR, AMP, AMP_AMP, LSQUARE, RSQUARE, AS_KW, IS_KW, CARET, PERCENT,
            PERCENT_EQ, QUESTION
    );

    TokenSet ASSIGNMENT_OPERATORS = TokenSet.create(
            EQ, STAR_EQ, SLASH_EQ, PERCENT_EQ, PLUS_EQ, MINUS_EQ
    );

    TokenSet BINARY_OPERATORS = TokenSet.create(
            // '??'
            QUESTION_QUESTION,
            // '&&' '||'
            AMP_AMP, BAR_BAR,
            // '==' '!='
            EQ_EQ, NOT_EQ,
            // '<' '<=' '>' '>='
            LT, LT_EQ, GT, GT_EQ,
            // '&' '|' '^'
            AMP, BAR, CARET,
            // '+' '-'
            PLUS, MINUS,
            // '*' '/' '%'
            STAR, SLASH, PERCENT
    );

    TokenSet LOGIC_OPERATORS = TokenSet.create(
            BAR_BAR, AMP_AMP,
            // Strictly speaking, this isn't a logical operator, but should be formatted the same.
            QUESTION_QUESTION
    );

    TokenSet UNARY_OPERATORS = TokenSet.create(
            // '-' '!' '++' '--'
            MINUS, NOT, PLUS_PLUS, MINUS_MINUS
    );

    TokenSet FUNCTION_DEFINITION = TokenSet.create(FN_DECL, TYPE_METHOD);

    TokenSet BLOCKS = TokenSet.create(BLOCK);

    TokenSet DECLARATIONS = TokenSet.create(
            TYPE_DECL,
            ENUM_DECL,
            TYPE_ALIAS,
            FN_DECL,
            TYPE_METHOD,
            TYPE_ATTR,
            VAR_DECL
    );
}
