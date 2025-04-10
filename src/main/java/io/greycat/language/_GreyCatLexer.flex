package io.greycat.language;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static io.greycat.language.psi.GreyCatTypes.*;

%%

%{
  public _GreyCatLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _GreyCatLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\R
WHITE_SPACE=\s+

IDENTIFIER=[a-zA-Z_][a-zA-Z0-9_]*
WHITE_SPACE=[ \t\n\x0B\f\r]+
STRING='([^'\\]|\\.)*'|\"([^\"\\]|\\\"|\'|\\)*\"
NUMBER=[+-]?[0-9][_\d]*(\.[0-9][_\d]*)?
LINE_COMMENT="//"[^\r\n]*
BLOCK_COMMENT="/"\*(.|\n)*\*"/"

%%
<YYINITIAL> {
  {WHITE_SPACE}             { return WHITE_SPACE; }

  "("                       { return LPAREN; }
  ")"                       { return RPAREN; }
  "{"                       { return LCURLY; }
  "}"                       { return RCURLY; }
  "["                       { return LSQUARE; }
  "]"                       { return RSQUARE; }
  ","                       { return COMMA; }
  ".."                      { return DOT_DOT; }
  "."                       { return DOT; }
  "^"                       { return CARET; }
  "&&"                      { return AMP_AMP; }
  "&"                       { return AMP; }
  ">="                      { return GT_EQ; }
  ">"                       { return GT; }
  "<="                      { return LT_EQ; }
  "<"                       { return LT; }
  "||"                      { return BAR_BAR; }
  "|"                       { return BAR; }
  "->"                      { return ARROW; }
  "@"                       { return AT; }
  "'"                       { return SQUOTE; }
  "::"                      { return COLON_COLON; }
  ":"                       { return COLON; }
  ";"                       { return SEMI; }
  "$"                       { return DOLLAR; }
  "/="                      { return SLASH_EQ; }
  "/"                       { return SLASH; }
  "/*"                      { return SLASH_STAR; }
  "*/"                      { return STAR_SLASH; }
  "--"                      { return MINUS_MINUS; }
  "-="                      { return MINUS_EQ; }
  "-"                       { return MINUS; }
  "++"                      { return PLUS_PLUS; }
  "+="                      { return PLUS_EQ; }
  "+"                       { return PLUS; }
  "*="                      { return STAR_EQ; }
  "*"                       { return STAR; }
  "%="                      { return PERCENT_EQ; }
  "%"                       { return PERCENT; }
  "=="                      { return EQ_EQ; }
  "="                       { return EQ; }
  "!="                      { return NOT_EQ; }
  "!!"                      { return NOT_NOT; }
  "!"                       { return NOT; }
  "??"                      { return QUESTION_QUESTION; }
  "?"                       { return QUESTION; }
  "?="                      { return QUESTION_EQ; }
  "\""                      { return DQUOTE; }
  "abstract"                { return ABSTRACT_KW; }
  "as"                      { return AS_KW; }
  "at"                      { return AT_KW; }
  "break"                   { return BREAK_KW; }
  "continue"                { return CONTINUE_KW; }
  "catch"                   { return CATCH_KW; }
  "do"                      { return DO_KW; }
  "else"                    { return ELSE_KW; }
  "enum"                    { return ENUM_KW; }
  "fn"                      { return FN_KW; }
  "for"                     { return FOR_KW; }
  "if"                      { return IF_KW; }
  "in"                      { return IN_KW; }
  "is"                      { return IS_KW; }
  "limit"                   { return LIMIT_KW; }
  "native"                  { return NATIVE_KW; }
  "null"                    { return NULL_KW; }
  "private"                 { return PRIVATE_KW; }
  "return"                  { return RETURN_KW; }
  "sampling"                { return SAMPLING_KW; }
  "skip"                    { return SKIP_KW; }
  "static"                  { return STATIC_KW; }
  "this"                    { return THIS_KW; }
  "throw"                   { return THROW_KW; }
  "try"                     { return TRY_KW; }
  "type"                    { return TYPE_KW; }
  "use"                     { return USE_KW; }
  "var"                     { return VAR_KW; }
  "while"                   { return WHILE_KW; }
  "without"                 { return WITHOUT_KW; }
  "true"                    { return TRUE_KW; }
  "false"                   { return FALSE_KW; }
  "extends"                 { return EXTENDS_KW; }
  "task"                    { return TASK_KW; }
  "typeof"                  { return TYPE_OF_KW; }
  "t2"                      { return T2_ID; }
  "t2f"                     { return T2F_ID; }
  "t3"                      { return T3_ID; }
  "t3f"                     { return T3F_ID; }
  "str"                     { return STR_ID; }
  "geo"                     { return GEO_ID; }
  "duration"                { return DURATION_ID; }
  "time"                    { return TIME_ID; }
  "float"                   { return FLOAT_ID; }
  "int"                     { return INT_ID; }
  "node"                    { return NODE_ID; }
  "nodeTime"                { return NODE_TIME_ID; }
  "nodeList"                { return NODE_LIST_ID; }
  "nodeIndex"               { return NODE_INDEX_ID; }
  "nodeGeo"                 { return NODE_GEO_ID; }
  "us"                      { return D_US; }
  "ms"                      { return D_MS; }
  "s"                       { return D_S; }
  "min"                     { return D_MIN; }
  "hour"                    { return D_HR; }
  "day"                     { return D_DAY; }
  "RAW_STRING"              { return RAW_STRING; }
  "ENTER_INTERPOLATION"     { return ENTER_INTERPOLATION; }
  "EXIT_INTERPOLATION"      { return EXIT_INTERPOLATION; }

  {IDENTIFIER}              { return IDENTIFIER; }
  {WHITE_SPACE}             { return WHITE_SPACE; }
  {STRING}                  { return STRING; }
  {NUMBER}                  { return NUMBER; }
  {LINE_COMMENT}            { return LINE_COMMENT; }
  {BLOCK_COMMENT}           { return BLOCK_COMMENT; }

}

[^] { return BAD_CHARACTER; }
