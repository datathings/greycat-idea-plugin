// This is a generated file. Not intended for manual editing.
package io.greycat.language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import io.greycat.language.psi.impl.*;

public interface GreyCatTypes {

  IElementType ARGUMENTS = new GreyCatElementType("ARGUMENTS");
  IElementType ATTR_IDENT = new GreyCatElementType("ATTR_IDENT");
  IElementType AT_STMT = new GreyCatElementType("AT_STMT");
  IElementType BIN_OP = new GreyCatElementType("BIN_OP");
  IElementType BLOCK = new GreyCatElementType("BLOCK");
  IElementType BLOCK_STMT = new GreyCatElementType("BLOCK_STMT");
  IElementType BREAK_STMT = new GreyCatElementType("BREAK_STMT");
  IElementType BUILT_IN_TYPE = new GreyCatElementType("BUILT_IN_TYPE");
  IElementType CALL_ARGS = new GreyCatElementType("CALL_ARGS");
  IElementType CALL_EXPR = new GreyCatElementType("CALL_EXPR");
  IElementType CALL_EXPR_SPEC = new GreyCatElementType("CALL_EXPR_SPEC");
  IElementType CATCH_STMT = new GreyCatElementType("CATCH_STMT");
  IElementType CONTINUE_STMT = new GreyCatElementType("CONTINUE_STMT");
  IElementType DO_WHILE_STMT = new GreyCatElementType("DO_WHILE_STMT");
  IElementType ELSE_STMT = new GreyCatElementType("ELSE_STMT");
  IElementType EMPTY_STMT = new GreyCatElementType("EMPTY_STMT");
  IElementType ENUM_DECL = new GreyCatElementType("ENUM_DECL");
  IElementType ENUM_FIELD = new GreyCatElementType("ENUM_FIELD");
  IElementType ENUM_FIELD_IDENT = new GreyCatElementType("ENUM_FIELD_IDENT");
  IElementType ENUM_IDENT = new GreyCatElementType("ENUM_IDENT");
  IElementType EXPRESSION = new GreyCatElementType("EXPRESSION");
  IElementType EXPR_STMT = new GreyCatElementType("EXPR_STMT");
  IElementType FLAGS = new GreyCatElementType("FLAGS");
  IElementType FN_DECL = new GreyCatElementType("FN_DECL");
  IElementType FN_EXPR = new GreyCatElementType("FN_EXPR");
  IElementType FN_IDENT = new GreyCatElementType("FN_IDENT");
  IElementType FN_OR_TASK = new GreyCatElementType("FN_OR_TASK");
  IElementType FN_PARAM = new GreyCatElementType("FN_PARAM");
  IElementType FN_PARAMS = new GreyCatElementType("FN_PARAMS");
  IElementType FN_PARAM_IDENT = new GreyCatElementType("FN_PARAM_IDENT");
  IElementType FOR_EXPR = new GreyCatElementType("FOR_EXPR");
  IElementType FOR_IN_LIMIT = new GreyCatElementType("FOR_IN_LIMIT");
  IElementType FOR_IN_PARAM = new GreyCatElementType("FOR_IN_PARAM");
  IElementType FOR_IN_PARAMS = new GreyCatElementType("FOR_IN_PARAMS");
  IElementType FOR_IN_SAMPLING = new GreyCatElementType("FOR_IN_SAMPLING");
  IElementType FOR_IN_SKIP = new GreyCatElementType("FOR_IN_SKIP");
  IElementType FOR_IN_STMT = new GreyCatElementType("FOR_IN_STMT");
  IElementType FOR_STMT = new GreyCatElementType("FOR_STMT");
  IElementType GENERIC_PARAMS = new GreyCatElementType("GENERIC_PARAMS");
  IElementType IDENT_OR_KEYWORD = new GreyCatElementType("IDENT_OR_KEYWORD");
  IElementType IDENT_OR_KEYWORD_OR_STR_LIT = new GreyCatElementType("IDENT_OR_KEYWORD_OR_STR_LIT");
  IElementType IF_STMT = new GreyCatElementType("IF_STMT");
  IElementType INITIALIZER = new GreyCatElementType("INITIALIZER");
  IElementType INTERPOLATION = new GreyCatElementType("INTERPOLATION");
  IElementType LITERAL = new GreyCatElementType("LITERAL");
  IElementType METHOD_IDENT = new GreyCatElementType("METHOD_IDENT");
  IElementType MODULE_STATEMENT = new GreyCatElementType("MODULE_STATEMENT");
  IElementType NATIVE_OBJ_EXPR = new GreyCatElementType("NATIVE_OBJ_EXPR");
  IElementType NUM_APPENDIX = new GreyCatElementType("NUM_APPENDIX");
  IElementType OBJECT_EXPR = new GreyCatElementType("OBJECT_EXPR");
  IElementType OBJECT_PROP = new GreyCatElementType("OBJECT_PROP");
  IElementType OBJECT_PROPS = new GreyCatElementType("OBJECT_PROPS");
  IElementType OBJECT_PROP_IDENT = new GreyCatElementType("OBJECT_PROP_IDENT");
  IElementType OFFSET_ACCESS = new GreyCatElementType("OFFSET_ACCESS");
  IElementType PAREN_EXPR = new GreyCatElementType("PAREN_EXPR");
  IElementType POSTFIX_EXPR = new GreyCatElementType("POSTFIX_EXPR");
  IElementType PRAGMA = new GreyCatElementType("PRAGMA");
  IElementType PRAGMAS = new GreyCatElementType("PRAGMAS");
  IElementType PRAGMA_ARGS = new GreyCatElementType("PRAGMA_ARGS");
  IElementType PRAGMA_IDENT = new GreyCatElementType("PRAGMA_IDENT");
  IElementType PRAGMA_STMT = new GreyCatElementType("PRAGMA_STMT");
  IElementType PREFIX_EXPR = new GreyCatElementType("PREFIX_EXPR");
  IElementType PRIMARY_EXPR = new GreyCatElementType("PRIMARY_EXPR");
  IElementType PROP_ACCESS = new GreyCatElementType("PROP_ACCESS");
  IElementType RANGE_ACCESS = new GreyCatElementType("RANGE_ACCESS");
  IElementType RETURN_STMT = new GreyCatElementType("RETURN_STMT");
  IElementType SHORT_ARRAY_EXPR = new GreyCatElementType("SHORT_ARRAY_EXPR");
  IElementType STATEMENT = new GreyCatElementType("STATEMENT");
  IElementType STATIC_ACCESS = new GreyCatElementType("STATIC_ACCESS");
  IElementType STATIC_PROP_IDENT = new GreyCatElementType("STATIC_PROP_IDENT");
  IElementType STRING_LIT = new GreyCatElementType("STRING_LIT");
  IElementType TABLE_EXPR = new GreyCatElementType("TABLE_EXPR");
  IElementType TABLE_EXPR_ROWS = new GreyCatElementType("TABLE_EXPR_ROWS");
  IElementType TEMPLATE_STRING = new GreyCatElementType("TEMPLATE_STRING");
  IElementType THROW_STMT = new GreyCatElementType("THROW_STMT");
  IElementType TRY_STMT = new GreyCatElementType("TRY_STMT");
  IElementType TUPLE_EXPR = new GreyCatElementType("TUPLE_EXPR");
  IElementType TYPE_ALIAS = new GreyCatElementType("TYPE_ALIAS");
  IElementType TYPE_ATTR = new GreyCatElementType("TYPE_ATTR");
  IElementType TYPE_DECL = new GreyCatElementType("TYPE_DECL");
  IElementType TYPE_EXTENDS = new GreyCatElementType("TYPE_EXTENDS");
  IElementType TYPE_FIELD = new GreyCatElementType("TYPE_FIELD");
  IElementType TYPE_IDENT = new GreyCatElementType("TYPE_IDENT");
  IElementType TYPE_METHOD = new GreyCatElementType("TYPE_METHOD");
  IElementType TYPE_SPEC = new GreyCatElementType("TYPE_SPEC");
  IElementType TYPE_SPECIFIER = new GreyCatElementType("TYPE_SPECIFIER");
  IElementType TYPE_SPEC_LIST = new GreyCatElementType("TYPE_SPEC_LIST");
  IElementType USE_STMT = new GreyCatElementType("USE_STMT");
  IElementType VAR_DECL = new GreyCatElementType("VAR_DECL");
  IElementType VAR_DECL_IDENT = new GreyCatElementType("VAR_DECL_IDENT");
  IElementType WHILE_STMT = new GreyCatElementType("WHILE_STMT");

  IElementType ABSTRACT_KW = new GreyCatTokenType("abstract");
  IElementType AMP = new GreyCatTokenType("&");
  IElementType AMP_AMP = new GreyCatTokenType("&&");
  IElementType ARROW = new GreyCatTokenType("->");
  IElementType AS_KW = new GreyCatTokenType("as");
  IElementType AT = new GreyCatTokenType("@");
  IElementType AT_KW = new GreyCatTokenType("at");
  IElementType BAR = new GreyCatTokenType("|");
  IElementType BAR_BAR = new GreyCatTokenType("||");
  IElementType BLOCK_COMMENT = new GreyCatTokenType("BLOCK_COMMENT");
  IElementType BREAK_KW = new GreyCatTokenType("break");
  IElementType CARET = new GreyCatTokenType("^");
  IElementType CATCH_KW = new GreyCatTokenType("catch");
  IElementType COLON = new GreyCatTokenType(":");
  IElementType COLON_COLON = new GreyCatTokenType("::");
  IElementType COMMA = new GreyCatTokenType(",");
  IElementType CONTINUE_KW = new GreyCatTokenType("continue");
  IElementType DOLLAR = new GreyCatTokenType("$");
  IElementType DOT = new GreyCatTokenType(".");
  IElementType DOT_DOT = new GreyCatTokenType("..");
  IElementType DO_KW = new GreyCatTokenType("do");
  IElementType DQUOTE = new GreyCatTokenType("\"");
  IElementType DURATION_ID = new GreyCatTokenType("duration");
  IElementType D_DAY = new GreyCatTokenType("day");
  IElementType D_HR = new GreyCatTokenType("hour");
  IElementType D_MIN = new GreyCatTokenType("min");
  IElementType D_MS = new GreyCatTokenType("ms");
  IElementType D_S = new GreyCatTokenType("s");
  IElementType D_US = new GreyCatTokenType("us");
  IElementType ELSE_KW = new GreyCatTokenType("else");
  IElementType ENTER_INTERPOLATION = new GreyCatTokenType("ENTER_INTERPOLATION");
  IElementType ENUM_KW = new GreyCatTokenType("enum");
  IElementType EQ = new GreyCatTokenType("=");
  IElementType EQ_EQ = new GreyCatTokenType("==");
  IElementType EXIT_INTERPOLATION = new GreyCatTokenType("EXIT_INTERPOLATION");
  IElementType EXTENDS_KW = new GreyCatTokenType("extends");
  IElementType FALSE_KW = new GreyCatTokenType("false");
  IElementType FLOAT_ID = new GreyCatTokenType("float");
  IElementType FN_KW = new GreyCatTokenType("fn");
  IElementType FOR_KW = new GreyCatTokenType("for");
  IElementType GEO_ID = new GreyCatTokenType("geo");
  IElementType GT = new GreyCatTokenType(">");
  IElementType GT_EQ = new GreyCatTokenType(">=");
  IElementType IDENTIFIER = new GreyCatTokenType("IDENTIFIER");
  IElementType IF_KW = new GreyCatTokenType("if");
  IElementType INT_ID = new GreyCatTokenType("int");
  IElementType IN_KW = new GreyCatTokenType("in");
  IElementType IS_KW = new GreyCatTokenType("is");
  IElementType LCURLY = new GreyCatTokenType("{");
  IElementType LIMIT_KW = new GreyCatTokenType("limit");
  IElementType LINE_COMMENT = new GreyCatTokenType("LINE_COMMENT");
  IElementType LPAREN = new GreyCatTokenType("(");
  IElementType LSQUARE = new GreyCatTokenType("[");
  IElementType LT = new GreyCatTokenType("<");
  IElementType LT_EQ = new GreyCatTokenType("<=");
  IElementType MINUS = new GreyCatTokenType("-");
  IElementType MINUS_EQ = new GreyCatTokenType("-=");
  IElementType MINUS_MINUS = new GreyCatTokenType("--");
  IElementType NATIVE_KW = new GreyCatTokenType("native");
  IElementType NODE_GEO_ID = new GreyCatTokenType("nodeGeo");
  IElementType NODE_ID = new GreyCatTokenType("node");
  IElementType NODE_INDEX_ID = new GreyCatTokenType("nodeIndex");
  IElementType NODE_LIST_ID = new GreyCatTokenType("nodeList");
  IElementType NODE_TIME_ID = new GreyCatTokenType("nodeTime");
  IElementType NOT = new GreyCatTokenType("!");
  IElementType NOT_EQ = new GreyCatTokenType("!=");
  IElementType NOT_NOT = new GreyCatTokenType("!!");
  IElementType NULL_KW = new GreyCatTokenType("null");
  IElementType NUMBER = new GreyCatTokenType("NUMBER");
  IElementType PERCENT = new GreyCatTokenType("%");
  IElementType PERCENT_EQ = new GreyCatTokenType("%=");
  IElementType PLUS = new GreyCatTokenType("+");
  IElementType PLUS_EQ = new GreyCatTokenType("+=");
  IElementType PLUS_PLUS = new GreyCatTokenType("++");
  IElementType PRIVATE_KW = new GreyCatTokenType("private");
  IElementType QUESTION = new GreyCatTokenType("?");
  IElementType QUESTION_EQ = new GreyCatTokenType("?=");
  IElementType QUESTION_QUESTION = new GreyCatTokenType("??");
  IElementType RAW_STRING = new GreyCatTokenType("RAW_STRING");
  IElementType RCURLY = new GreyCatTokenType("}");
  IElementType RETURN_KW = new GreyCatTokenType("return");
  IElementType RPAREN = new GreyCatTokenType(")");
  IElementType RSQUARE = new GreyCatTokenType("]");
  IElementType SAMPLING_KW = new GreyCatTokenType("sampling");
  IElementType SEMI = new GreyCatTokenType(";");
  IElementType SKIP_KW = new GreyCatTokenType("skip");
  IElementType SLASH = new GreyCatTokenType("/");
  IElementType SLASH_EQ = new GreyCatTokenType("/=");
  IElementType SLASH_STAR = new GreyCatTokenType("/*");
  IElementType SQUOTE = new GreyCatTokenType("'");
  IElementType STAR = new GreyCatTokenType("*");
  IElementType STAR_EQ = new GreyCatTokenType("*=");
  IElementType STAR_SLASH = new GreyCatTokenType("*/");
  IElementType STATIC_KW = new GreyCatTokenType("static");
  IElementType STRING = new GreyCatTokenType("STRING");
  IElementType STR_ID = new GreyCatTokenType("str");
  IElementType T2F_ID = new GreyCatTokenType("t2f");
  IElementType T2_ID = new GreyCatTokenType("t2");
  IElementType T3F_ID = new GreyCatTokenType("t3f");
  IElementType T3_ID = new GreyCatTokenType("t3");
  IElementType TASK_KW = new GreyCatTokenType("task");
  IElementType THIS_KW = new GreyCatTokenType("this");
  IElementType THROW_KW = new GreyCatTokenType("throw");
  IElementType TIME_ID = new GreyCatTokenType("time");
  IElementType TRUE_KW = new GreyCatTokenType("true");
  IElementType TRY_KW = new GreyCatTokenType("try");
  IElementType TYPE_KW = new GreyCatTokenType("type");
  IElementType TYPE_OF_KW = new GreyCatTokenType("typeof");
  IElementType USE_KW = new GreyCatTokenType("use");
  IElementType VAR_KW = new GreyCatTokenType("var");
  IElementType WHILE_KW = new GreyCatTokenType("while");
  IElementType WITHOUT_KW = new GreyCatTokenType("without");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ARGUMENTS) {
        return new GreyCatArgumentsImpl(node);
      }
      else if (type == ATTR_IDENT) {
        return new GreyCatAttrIdentImpl(node);
      }
      else if (type == AT_STMT) {
        return new GreyCatAtStmtImpl(node);
      }
      else if (type == BIN_OP) {
        return new GreyCatBinOpImpl(node);
      }
      else if (type == BLOCK) {
        return new GreyCatBlockImpl(node);
      }
      else if (type == BLOCK_STMT) {
        return new GreyCatBlockStmtImpl(node);
      }
      else if (type == BREAK_STMT) {
        return new GreyCatBreakStmtImpl(node);
      }
      else if (type == BUILT_IN_TYPE) {
        return new GreyCatBuiltInTypeImpl(node);
      }
      else if (type == CALL_ARGS) {
        return new GreyCatCallArgsImpl(node);
      }
      else if (type == CALL_EXPR) {
        return new GreyCatCallExprImpl(node);
      }
      else if (type == CALL_EXPR_SPEC) {
        return new GreyCatCallExprSpecImpl(node);
      }
      else if (type == CATCH_STMT) {
        return new GreyCatCatchStmtImpl(node);
      }
      else if (type == CONTINUE_STMT) {
        return new GreyCatContinueStmtImpl(node);
      }
      else if (type == DO_WHILE_STMT) {
        return new GreyCatDoWhileStmtImpl(node);
      }
      else if (type == ELSE_STMT) {
        return new GreyCatElseStmtImpl(node);
      }
      else if (type == EMPTY_STMT) {
        return new GreyCatEmptyStmtImpl(node);
      }
      else if (type == ENUM_DECL) {
        return new GreyCatEnumDeclImpl(node);
      }
      else if (type == ENUM_FIELD) {
        return new GreyCatEnumFieldImpl(node);
      }
      else if (type == ENUM_FIELD_IDENT) {
        return new GreyCatEnumFieldIdentImpl(node);
      }
      else if (type == ENUM_IDENT) {
        return new GreyCatEnumIdentImpl(node);
      }
      else if (type == EXPRESSION) {
        return new GreyCatExpressionImpl(node);
      }
      else if (type == EXPR_STMT) {
        return new GreyCatExprStmtImpl(node);
      }
      else if (type == FLAGS) {
        return new GreyCatFlagsImpl(node);
      }
      else if (type == FN_DECL) {
        return new GreyCatFnDeclImpl(node);
      }
      else if (type == FN_EXPR) {
        return new GreyCatFnExprImpl(node);
      }
      else if (type == FN_IDENT) {
        return new GreyCatFnIdentImpl(node);
      }
      else if (type == FN_OR_TASK) {
        return new GreyCatFnOrTaskImpl(node);
      }
      else if (type == FN_PARAM) {
        return new GreyCatFnParamImpl(node);
      }
      else if (type == FN_PARAMS) {
        return new GreyCatFnParamsImpl(node);
      }
      else if (type == FN_PARAM_IDENT) {
        return new GreyCatFnParamIdentImpl(node);
      }
      else if (type == FOR_EXPR) {
        return new GreyCatForExprImpl(node);
      }
      else if (type == FOR_IN_LIMIT) {
        return new GreyCatForInLimitImpl(node);
      }
      else if (type == FOR_IN_PARAM) {
        return new GreyCatForInParamImpl(node);
      }
      else if (type == FOR_IN_PARAMS) {
        return new GreyCatForInParamsImpl(node);
      }
      else if (type == FOR_IN_SAMPLING) {
        return new GreyCatForInSamplingImpl(node);
      }
      else if (type == FOR_IN_SKIP) {
        return new GreyCatForInSkipImpl(node);
      }
      else if (type == FOR_IN_STMT) {
        return new GreyCatForInStmtImpl(node);
      }
      else if (type == FOR_STMT) {
        return new GreyCatForStmtImpl(node);
      }
      else if (type == GENERIC_PARAMS) {
        return new GreyCatGenericParamsImpl(node);
      }
      else if (type == IDENT_OR_KEYWORD) {
        return new GreyCatIdentOrKeywordImpl(node);
      }
      else if (type == IDENT_OR_KEYWORD_OR_STR_LIT) {
        return new GreyCatIdentOrKeywordOrStrLitImpl(node);
      }
      else if (type == IF_STMT) {
        return new GreyCatIfStmtImpl(node);
      }
      else if (type == INITIALIZER) {
        return new GreyCatInitializerImpl(node);
      }
      else if (type == INTERPOLATION) {
        return new GreyCatInterpolationImpl(node);
      }
      else if (type == LITERAL) {
        return new GreyCatLiteralImpl(node);
      }
      else if (type == METHOD_IDENT) {
        return new GreyCatMethodIdentImpl(node);
      }
      else if (type == MODULE_STATEMENT) {
        return new GreyCatModuleStatementImpl(node);
      }
      else if (type == NATIVE_OBJ_EXPR) {
        return new GreyCatNativeObjExprImpl(node);
      }
      else if (type == NUM_APPENDIX) {
        return new GreyCatNumAppendixImpl(node);
      }
      else if (type == OBJECT_EXPR) {
        return new GreyCatObjectExprImpl(node);
      }
      else if (type == OBJECT_PROP) {
        return new GreyCatObjectPropImpl(node);
      }
      else if (type == OBJECT_PROPS) {
        return new GreyCatObjectPropsImpl(node);
      }
      else if (type == OBJECT_PROP_IDENT) {
        return new GreyCatObjectPropIdentImpl(node);
      }
      else if (type == OFFSET_ACCESS) {
        return new GreyCatOffsetAccessImpl(node);
      }
      else if (type == PAREN_EXPR) {
        return new GreyCatParenExprImpl(node);
      }
      else if (type == POSTFIX_EXPR) {
        return new GreyCatPostfixExprImpl(node);
      }
      else if (type == PRAGMA) {
        return new GreyCatPragmaImpl(node);
      }
      else if (type == PRAGMAS) {
        return new GreyCatPragmasImpl(node);
      }
      else if (type == PRAGMA_ARGS) {
        return new GreyCatPragmaArgsImpl(node);
      }
      else if (type == PRAGMA_IDENT) {
        return new GreyCatPragmaIdentImpl(node);
      }
      else if (type == PRAGMA_STMT) {
        return new GreyCatPragmaStmtImpl(node);
      }
      else if (type == PREFIX_EXPR) {
        return new GreyCatPrefixExprImpl(node);
      }
      else if (type == PRIMARY_EXPR) {
        return new GreyCatPrimaryExprImpl(node);
      }
      else if (type == PROP_ACCESS) {
        return new GreyCatPropAccessImpl(node);
      }
      else if (type == RANGE_ACCESS) {
        return new GreyCatRangeAccessImpl(node);
      }
      else if (type == RETURN_STMT) {
        return new GreyCatReturnStmtImpl(node);
      }
      else if (type == SHORT_ARRAY_EXPR) {
        return new GreyCatShortArrayExprImpl(node);
      }
      else if (type == STATEMENT) {
        return new GreyCatStatementImpl(node);
      }
      else if (type == STATIC_ACCESS) {
        return new GreyCatStaticAccessImpl(node);
      }
      else if (type == STATIC_PROP_IDENT) {
        return new GreyCatStaticPropIdentImpl(node);
      }
      else if (type == STRING_LIT) {
        return new GreyCatStringLitImpl(node);
      }
      else if (type == TABLE_EXPR) {
        return new GreyCatTableExprImpl(node);
      }
      else if (type == TABLE_EXPR_ROWS) {
        return new GreyCatTableExprRowsImpl(node);
      }
      else if (type == TEMPLATE_STRING) {
        return new GreyCatTemplateStringImpl(node);
      }
      else if (type == THROW_STMT) {
        return new GreyCatThrowStmtImpl(node);
      }
      else if (type == TRY_STMT) {
        return new GreyCatTryStmtImpl(node);
      }
      else if (type == TUPLE_EXPR) {
        return new GreyCatTupleExprImpl(node);
      }
      else if (type == TYPE_ALIAS) {
        return new GreyCatTypeAliasImpl(node);
      }
      else if (type == TYPE_ATTR) {
        return new GreyCatTypeAttrImpl(node);
      }
      else if (type == TYPE_DECL) {
        return new GreyCatTypeDeclImpl(node);
      }
      else if (type == TYPE_EXTENDS) {
        return new GreyCatTypeExtendsImpl(node);
      }
      else if (type == TYPE_FIELD) {
        return new GreyCatTypeFieldImpl(node);
      }
      else if (type == TYPE_IDENT) {
        return new GreyCatTypeIdentImpl(node);
      }
      else if (type == TYPE_METHOD) {
        return new GreyCatTypeMethodImpl(node);
      }
      else if (type == TYPE_SPEC) {
        return new GreyCatTypeSpecImpl(node);
      }
      else if (type == TYPE_SPECIFIER) {
        return new GreyCatTypeSpecifierImpl(node);
      }
      else if (type == TYPE_SPEC_LIST) {
        return new GreyCatTypeSpecListImpl(node);
      }
      else if (type == USE_STMT) {
        return new GreyCatUseStmtImpl(node);
      }
      else if (type == VAR_DECL) {
        return new GreyCatVarDeclImpl(node);
      }
      else if (type == VAR_DECL_IDENT) {
        return new GreyCatVarDeclIdentImpl(node);
      }
      else if (type == WHILE_STMT) {
        return new GreyCatWhileStmtImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
