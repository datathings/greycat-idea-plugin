package io.greycat.language;

import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.CodeInsightColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public final class GreyCatColors {
    public static final String GREYCAT_ERROR = "GREYCAT_ERROR";
    public static final String GREYCAT_WARNING = "GREYCAT_WARNING";
    public static final String GREYCAT_HINT = "GREYCAT_HINT";

    public static final String GREYCAT_ANNOTATION = "GREYCAT_ANNOTATION";
    public static final String GREYCAT_TYPE = "GREYCAT_CLASS";
    public static final String GREYCAT_FUNCTION_CALL = "GREYCAT_FUNCTION_CALL";
    public static final String GREYCAT_FUNCTION_DECLR = "GREYCAT_FUNCTION_DECLR";

    public static final String GREYCAT_DYNAMIC_LOCAL_VARIABLE_DECLARATION = "GREYCAT_DYNAMIC_LOCAL_VARIABLE_DECLARATION";
    public static final String GREYCAT_DYNAMIC_LOCAL_VARIABLE_REFERENCE = "GREYCAT_DYNAMIC_LOCAL_VARIABLE_REFERENCE";
    public static final String GREYCAT_DYNAMIC_PARAMETER_DECLARATION = "GREYCAT_DYNAMIC_PARAMETER_DECLARATION";
    public static final String GREYCAT_DYNAMIC_PARAMETER_REFERENCE = "GREYCAT_DYNAMIC_PARAMETER_REFERENCE";

    public static final String GREYCAT_ENUM = "GREYCAT_ENUM";
    public static final String GREYCAT_ENUM_CONSTANT = "GREYCAT_ENUM_CONSTANT";
    public static final String GREYCAT_FUNCTION_TYPE_ALIAS = "GREYCAT_FUNCTION_TYPE_ALIAS";

    public static final String GREYCAT_IDENTIFIER = "GREYCAT_IDENTIFIER";
    public static final String GREYCAT_INSTANCE_FIELD_DECLARATION = "GREYCAT_INSTANCE_FIELD_DECLARATION";
    public static final String GREYCAT_INSTANCE_FIELD_REFERENCE = "GREYCAT_INSTANCE_FIELD_REFERENCE";
    public static final String GREYCAT_INSTANCE_METHOD_DECLARATION = "GREYCAT_INSTANCE_METHOD_DECLARATION";

    public static final String GREYCAT_KEYWORD = "GREYCAT_KEYWORD";

    public static final String GREYCAT_LOCAL_FUNCTION_REFERENCE = "GREYCAT_LOCAL_FUNCTION_REFERENCE";
    public static final String GREYCAT_LOCAL_VARIABLE_DECLARATION = "GREYCAT_LOCAL_VARIABLE_DECLARATION";
    public static final String GREYCAT_LOCAL_VARIABLE_REFERENCE = "GREYCAT_LOCAL_VARIABLE_REFERENCE";

    public static final String GREYCAT_PARAMETER_DECLARATION = "GREYCAT_PARAMETER_DECLARATION";
    public static final String GREYCAT_PARAMETER_REFERENCE = "GREYCAT_PARAMETER_REFERENCE";

    public static final String GREYCAT_STATIC_FIELD_DECLARATION = "GREYCAT_STATIC_FIELD_DECLARATION";
    public static final String GREYCAT_STATIC_METHOD_DECLARATION = "GREYCAT_STATIC_METHOD_DECLARATION";
    public static final String GREYCAT_STATIC_METHOD_REFERENCE = "GREYCAT_STATIC_METHOD_REFERENCE";

    public static final String GREYCAT_TYPE_NAME_DYNAMIC = "GREYCAT_TYPE_NAME_DYNAMIC";
    public static final String GREYCAT_TYPE_PARAMETER = "GREYCAT_TYPE_PARAMETER";
    public static final String GREYCAT_UNRESOLVED_INSTANCE_MEMBER_REFERENCE = "GREYCAT_UNRESOLVED_INSTANCE_MEMBER_REFERENCE";

    private static final String GREYCAT_BLOCK_COMMENT = "GREYCAT_BLOCK_COMMENT";
    private static final String GREYCAT_DOC_COMMENT = "GREYCAT_DOC_COMMENT";
    private static final String GREYCAT_LINE_COMMENT = "GREYCAT_LINE_COMMENT";

    private static final String GREYCAT_NUMBER = "GREYCAT_NUMBER";
    private static final String GREYCAT_STRING = "GREYCAT_STRING";
    private static final String GREYCAT_VALID_STRING_ESCAPE = "GREYCAT_VALID_STRING_ESCAPE";
    private static final String GREYCAT_INVALID_STRING_ESCAPE = "GREYCAT_INVALID_STRING_ESCAPE";
    private static final String GREYCAT_OPERATION_SIGN = "GREYCAT_OPERATION_SIGN";
    private static final String GREYCAT_PARENTH = "GREYCAT_PARENTH";
    private static final String GREYCAT_BRACKETS = "GREYCAT_BRACKETS";
    private static final String GREYCAT_BRACES = "GREYCAT_BRACES";
    private static final String GREYCAT_COMMA = "GREYCAT_COMMA";
    private static final String GREYCAT_DOT = "GREYCAT_DOT";
    private static final String GREYCAT_SEMICOLON = "GREYCAT_SEMICOLON";
    private static final String GREYCAT_COLON = "GREYCAT_COLON";
    private static final String GREYCAT_FAT_ARROW = "GREYCAT_FAT_ARROW";
    private static final String GREYCAT_BAD_CHARACTER = "GREYCAT_BAD_CHARACTER";
    private static final String GREYCAT_SYMBOL_LITERAL = "GREYCAT_SYMBOL_LITERAL";

    public static final TextAttributesKey ERROR =
            createTextAttributesKey(GREYCAT_ERROR, CodeInsightColors.ERRORS_ATTRIBUTES);
    public static final TextAttributesKey WARNING =
            createTextAttributesKey(GREYCAT_WARNING, CodeInsightColors.WARNINGS_ATTRIBUTES);
    public static final TextAttributesKey HINT =
            createTextAttributesKey(GREYCAT_HINT, CodeInsightColors.WEAK_WARNING_ATTRIBUTES);

    public static final TextAttributesKey BLOCK_COMMENT =
            createTextAttributesKey(GREYCAT_BLOCK_COMMENT, DefaultLanguageHighlighterColors.BLOCK_COMMENT);
    public static final TextAttributesKey DOC_COMMENT =
            createTextAttributesKey(GREYCAT_DOC_COMMENT, DefaultLanguageHighlighterColors.DOC_COMMENT);
    public static final TextAttributesKey LINE_COMMENT =
            createTextAttributesKey(GREYCAT_LINE_COMMENT, DefaultLanguageHighlighterColors.LINE_COMMENT);

    public static final TextAttributesKey NUMBER = createTextAttributesKey(GREYCAT_NUMBER, DefaultLanguageHighlighterColors.NUMBER);
    public static final TextAttributesKey STRING = createTextAttributesKey(GREYCAT_STRING, DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey VALID_STRING_ESCAPE =
            createTextAttributesKey(GREYCAT_VALID_STRING_ESCAPE, DefaultLanguageHighlighterColors.VALID_STRING_ESCAPE);
    public static final TextAttributesKey INVALID_STRING_ESCAPE =
            createTextAttributesKey(GREYCAT_INVALID_STRING_ESCAPE, DefaultLanguageHighlighterColors.INVALID_STRING_ESCAPE);
    public static final TextAttributesKey OPERATION_SIGN =
            createTextAttributesKey(GREYCAT_OPERATION_SIGN, DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey PARENTHS = createTextAttributesKey(GREYCAT_PARENTH, DefaultLanguageHighlighterColors.PARENTHESES);
    public static final TextAttributesKey BRACKETS = createTextAttributesKey(GREYCAT_BRACKETS, DefaultLanguageHighlighterColors.BRACKETS);
    public static final TextAttributesKey BRACES = createTextAttributesKey(GREYCAT_BRACES, DefaultLanguageHighlighterColors.BRACES);
    public static final TextAttributesKey COMMA = createTextAttributesKey(GREYCAT_COMMA, DefaultLanguageHighlighterColors.COMMA);
    public static final TextAttributesKey DOT = createTextAttributesKey(GREYCAT_DOT, DefaultLanguageHighlighterColors.DOT);
    public static final TextAttributesKey SEMICOLON = createTextAttributesKey(GREYCAT_SEMICOLON, DefaultLanguageHighlighterColors.SEMICOLON);
    public static final TextAttributesKey COLON = createTextAttributesKey(GREYCAT_COLON, DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey FAT_ARROW =
            createTextAttributesKey(GREYCAT_FAT_ARROW, DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey BAD_CHARACTER = createTextAttributesKey(GREYCAT_BAD_CHARACTER, HighlighterColors.BAD_CHARACTER);
    public static final TextAttributesKey SYMBOL_LITERAL =
            createTextAttributesKey(GREYCAT_SYMBOL_LITERAL, DefaultLanguageHighlighterColors.KEYWORD);

    public static final TextAttributesKey ANNOTATION = createTextAttributesKey(GREYCAT_ANNOTATION, DefaultLanguageHighlighterColors.METADATA);
    public static final TextAttributesKey TYPE = createTextAttributesKey(GREYCAT_TYPE, DefaultLanguageHighlighterColors.CLASS_NAME);
    public static final TextAttributesKey ENUM = createTextAttributesKey(GREYCAT_ENUM, DefaultLanguageHighlighterColors.CLASS_NAME);
    public static final TextAttributesKey ENUM_FIELD =
            createTextAttributesKey(GREYCAT_ENUM_CONSTANT, DefaultLanguageHighlighterColors.INSTANCE_FIELD);
    public static final TextAttributesKey FUNCTION_TYPE_ALIAS =
            createTextAttributesKey(GREYCAT_FUNCTION_TYPE_ALIAS, DefaultLanguageHighlighterColors.CLASS_NAME);
    public static final TextAttributesKey IDENTIFIER =
            createTextAttributesKey(GREYCAT_IDENTIFIER, DefaultLanguageHighlighterColors.IDENTIFIER);

    public static final TextAttributesKey INSTANCE_FIELD_DECLARATION =
            createTextAttributesKey(GREYCAT_INSTANCE_FIELD_DECLARATION, DefaultLanguageHighlighterColors.INSTANCE_FIELD);
    public static final TextAttributesKey INSTANCE_FIELD_REFERENCE =
            createTextAttributesKey(GREYCAT_INSTANCE_FIELD_REFERENCE, DefaultLanguageHighlighterColors.INSTANCE_FIELD);
    public static final TextAttributesKey INSTANCE_METHOD_DECLARATION =
            createTextAttributesKey(GREYCAT_INSTANCE_METHOD_DECLARATION, DefaultLanguageHighlighterColors.INSTANCE_METHOD);

    public static final TextAttributesKey KEYWORD = createTextAttributesKey(GREYCAT_KEYWORD, DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey LOCAL_VARIABLE_DECLARATION =
            createTextAttributesKey(GREYCAT_LOCAL_VARIABLE_DECLARATION, DefaultLanguageHighlighterColors.LOCAL_VARIABLE);
    public static final TextAttributesKey LOCAL_VARIABLE_REFERENCE =
            createTextAttributesKey(GREYCAT_LOCAL_VARIABLE_REFERENCE, DefaultLanguageHighlighterColors.LOCAL_VARIABLE);
    public static final TextAttributesKey PARAMETER_DECLARATION =
            createTextAttributesKey(GREYCAT_PARAMETER_DECLARATION, DefaultLanguageHighlighterColors.PARAMETER);
    public static final TextAttributesKey PARAMETER_REFERENCE =
            createTextAttributesKey(GREYCAT_PARAMETER_REFERENCE, DefaultLanguageHighlighterColors.PARAMETER);

    public static final TextAttributesKey STATIC_FIELD_DECLARATION =
            createTextAttributesKey(GREYCAT_STATIC_FIELD_DECLARATION, DefaultLanguageHighlighterColors.STATIC_FIELD);
    public static final TextAttributesKey STATIC_METHOD_DECLARATION =
            createTextAttributesKey(GREYCAT_STATIC_METHOD_DECLARATION, DefaultLanguageHighlighterColors.STATIC_METHOD);
    public static final TextAttributesKey STATIC_METHOD_REFERENCE =
            createTextAttributesKey(GREYCAT_STATIC_METHOD_REFERENCE, DefaultLanguageHighlighterColors.STATIC_METHOD);

    public static final TextAttributesKey FUNCTION_CALL =
            createTextAttributesKey(GREYCAT_FUNCTION_CALL, DefaultLanguageHighlighterColors.FUNCTION_CALL);

    public static final TextAttributesKey TYPE_NAME_DYNAMIC =
            createTextAttributesKey(GREYCAT_TYPE_NAME_DYNAMIC, DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey TYPE_PARAMETER =
            createTextAttributesKey(GREYCAT_TYPE_PARAMETER, DefaultLanguageHighlighterColors.CLASS_NAME);
    public static final TextAttributesKey UNRESOLVED_INSTANCE_MEMBER_REFERENCE =
            createTextAttributesKey(GREYCAT_UNRESOLVED_INSTANCE_MEMBER_REFERENCE, DefaultLanguageHighlighterColors.IDENTIFIER);

    public static final TextAttributesKey DYNAMIC_LOCAL_VARIABLE_DECLARATION =
            createTextAttributesKey(GREYCAT_DYNAMIC_LOCAL_VARIABLE_DECLARATION, LOCAL_VARIABLE_DECLARATION);
    public static final TextAttributesKey DYNAMIC_LOCAL_VARIABLE_REFERENCE =
            createTextAttributesKey(GREYCAT_DYNAMIC_LOCAL_VARIABLE_REFERENCE, LOCAL_VARIABLE_REFERENCE);
    public static final TextAttributesKey DYNAMIC_PARAMETER_DECLARATION =
            createTextAttributesKey(GREYCAT_DYNAMIC_PARAMETER_DECLARATION, PARAMETER_DECLARATION);
    public static final TextAttributesKey DYNAMIC_PARAMETER_REFERENCE =
            createTextAttributesKey(GREYCAT_DYNAMIC_PARAMETER_REFERENCE, PARAMETER_REFERENCE);

    public static final TextAttributesKey LOCAL_FUNCTION_REFERENCE =
            createTextAttributesKey(GREYCAT_LOCAL_FUNCTION_REFERENCE, LOCAL_VARIABLE_REFERENCE);

    public static final TextAttributesKey FUNCTION_DECL =
            createTextAttributesKey(GREYCAT_FUNCTION_DECLR, DefaultLanguageHighlighterColors.FUNCTION_DECLARATION);

}

