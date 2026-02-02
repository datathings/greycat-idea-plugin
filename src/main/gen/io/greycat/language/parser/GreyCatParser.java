// This is a generated file. Not intended for manual editing.
package io.greycat.language.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static io.greycat.language.psi.GreyCatTypes.*;
import static io.greycat.language.parser.GreyCatParserUtil.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class GreyCatParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType root_, PsiBuilder builder_) {
    parseLight(root_, builder_);
    return builder_.getTreeBuilt();
  }

  public void parseLight(IElementType root_, PsiBuilder builder_) {
    boolean result_;
    builder_ = adapt_builder_(root_, builder_, this, null);
    Marker marker_ = enter_section_(builder_, 0, _COLLAPSE_, null);
    result_ = parse_root_(root_, builder_);
    exit_section_(builder_, 0, marker_, root_, result_, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType root_, PsiBuilder builder_) {
    return parse_root_(root_, builder_, 0);
  }

  static boolean parse_root_(IElementType root_, PsiBuilder builder_, int level_) {
    return GreyCat(builder_, level_ + 1);
  }

  /* ********************************************************** */
  // Expression (COMMA Expression)*
  public static boolean Arguments(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Arguments")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ARGUMENTS, "<arguments>");
    result_ = Expression(builder_, level_ + 1);
    result_ = result_ && Arguments_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // (COMMA Expression)*
  private static boolean Arguments_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Arguments_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!Arguments_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "Arguments_1", pos_)) break;
    }
    return true;
  }

  // COMMA Expression
  private static boolean Arguments_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Arguments_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && Expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // AT_KW LPAREN Expression RPAREN Block
  public static boolean AtStmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "AtStmt")) return false;
    if (!nextTokenIs(builder_, AT_KW)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, AT_KW, LPAREN);
    result_ = result_ && Expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    result_ = result_ && Block(builder_, level_ + 1);
    exit_section_(builder_, marker_, AT_STMT, result_);
    return result_;
  }

  /* ********************************************************** */
  // IdentOrKeywordOrStrLit
  public static boolean AttrIdent(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "AttrIdent")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ATTR_IDENT, "<attr ident>");
    result_ = IdentOrKeywordOrStrLit(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // BAR_BAR | QUESTION_QUESTION // or
  //     | AMP_AMP                   // and
  //     | EQ_EQ | NOT_EQ            // equality
  //     | LT | GT | LT_EQ | GT_EQ   // relative
  //     | PLUS | MINUS              // additive
  //     | STAR | SLASH | PERCENT    // multiplicative
  //     | CARET                     // power
  //     | EQ | QUESTION_EQ
  public static boolean BinOp(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "BinOp")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, BIN_OP, "<bin op>");
    result_ = consumeToken(builder_, BAR_BAR);
    if (!result_) result_ = consumeToken(builder_, QUESTION_QUESTION);
    if (!result_) result_ = consumeToken(builder_, AMP_AMP);
    if (!result_) result_ = consumeToken(builder_, EQ_EQ);
    if (!result_) result_ = consumeToken(builder_, NOT_EQ);
    if (!result_) result_ = consumeToken(builder_, LT);
    if (!result_) result_ = consumeToken(builder_, GT);
    if (!result_) result_ = consumeToken(builder_, LT_EQ);
    if (!result_) result_ = consumeToken(builder_, GT_EQ);
    if (!result_) result_ = consumeToken(builder_, PLUS);
    if (!result_) result_ = consumeToken(builder_, MINUS);
    if (!result_) result_ = consumeToken(builder_, STAR);
    if (!result_) result_ = consumeToken(builder_, SLASH);
    if (!result_) result_ = consumeToken(builder_, PERCENT);
    if (!result_) result_ = consumeToken(builder_, CARET);
    if (!result_) result_ = consumeToken(builder_, EQ);
    if (!result_) result_ = consumeToken(builder_, QUESTION_EQ);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // LCURLY Statement* RCURLY
  public static boolean Block(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Block")) return false;
    if (!nextTokenIs(builder_, LCURLY)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LCURLY);
    result_ = result_ && Block_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RCURLY);
    exit_section_(builder_, marker_, BLOCK, result_);
    return result_;
  }

  // Statement*
  private static boolean Block_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Block_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!Statement(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "Block_1", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // Block SEMI?
  public static boolean BlockStmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "BlockStmt")) return false;
    if (!nextTokenIs(builder_, LCURLY)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = Block(builder_, level_ + 1);
    result_ = result_ && BlockStmt_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, BLOCK_STMT, result_);
    return result_;
  }

  // SEMI?
  private static boolean BlockStmt_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "BlockStmt_1")) return false;
    consumeToken(builder_, SEMI);
    return true;
  }

  /* ********************************************************** */
  // BREAK_KW SEMI
  public static boolean BreakStmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "BreakStmt")) return false;
    if (!nextTokenIs(builder_, BREAK_KW)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, BREAK_KW, SEMI);
    exit_section_(builder_, marker_, BREAK_STMT, result_);
    return result_;
  }

  /* ********************************************************** */
  // 'bool'|'int'|'float'|'time'|'geo'|'duration'|'t2'|'t2f'|'t3'|'t3f'|'str'|'node'|'nodeTime'|'nodeGeo'|'nodeList'|'nodeIndex'
  public static boolean BuiltInType(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "BuiltInType")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, BUILT_IN_TYPE, "<built in type>");
    result_ = consumeToken(builder_, "bool");
    if (!result_) result_ = consumeToken(builder_, "int");
    if (!result_) result_ = consumeToken(builder_, "float");
    if (!result_) result_ = consumeToken(builder_, "time");
    if (!result_) result_ = consumeToken(builder_, "geo");
    if (!result_) result_ = consumeToken(builder_, "duration");
    if (!result_) result_ = consumeToken(builder_, "t2");
    if (!result_) result_ = consumeToken(builder_, "t2f");
    if (!result_) result_ = consumeToken(builder_, "t3");
    if (!result_) result_ = consumeToken(builder_, "t3f");
    if (!result_) result_ = consumeToken(builder_, "str");
    if (!result_) result_ = consumeToken(builder_, "node");
    if (!result_) result_ = consumeToken(builder_, "nodeTime");
    if (!result_) result_ = consumeToken(builder_, "nodeGeo");
    if (!result_) result_ = consumeToken(builder_, "nodeList");
    if (!result_) result_ = consumeToken(builder_, "nodeIndex");
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // LPAREN Arguments? COMMA? RPAREN
  public static boolean CallArgs(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "CallArgs")) return false;
    if (!nextTokenIs(builder_, LPAREN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LPAREN);
    result_ = result_ && CallArgs_1(builder_, level_ + 1);
    result_ = result_ && CallArgs_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, CALL_ARGS, result_);
    return result_;
  }

  // Arguments?
  private static boolean CallArgs_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "CallArgs_1")) return false;
    Arguments(builder_, level_ + 1);
    return true;
  }

  // COMMA?
  private static boolean CallArgs_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "CallArgs_2")) return false;
    consumeToken(builder_, COMMA);
    return true;
  }

  /* ********************************************************** */
  // PrimaryExpr CallExprSpec*
  public static boolean CallExpr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "CallExpr")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, CALL_EXPR, "<call expr>");
    result_ = PrimaryExpr(builder_, level_ + 1);
    result_ = result_ && CallExpr_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // CallExprSpec*
  private static boolean CallExpr_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "CallExpr_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!CallExprSpec(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "CallExpr_1", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // CallArgs | StaticAccess | PropAccess | OffsetAccess | NOT_NOT
  public static boolean CallExprSpec(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "CallExprSpec")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, CALL_EXPR_SPEC, "<call expr spec>");
    result_ = CallArgs(builder_, level_ + 1);
    if (!result_) result_ = StaticAccess(builder_, level_ + 1);
    if (!result_) result_ = PropAccess(builder_, level_ + 1);
    if (!result_) result_ = OffsetAccess(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, NOT_NOT);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // CATCH_KW (LPAREN IDENTIFIER RPAREN)? Block
  public static boolean CatchStmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "CatchStmt")) return false;
    if (!nextTokenIs(builder_, CATCH_KW)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, CATCH_KW);
    result_ = result_ && CatchStmt_1(builder_, level_ + 1);
    result_ = result_ && Block(builder_, level_ + 1);
    exit_section_(builder_, marker_, CATCH_STMT, result_);
    return result_;
  }

  // (LPAREN IDENTIFIER RPAREN)?
  private static boolean CatchStmt_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "CatchStmt_1")) return false;
    CatchStmt_1_0(builder_, level_ + 1);
    return true;
  }

  // LPAREN IDENTIFIER RPAREN
  private static boolean CatchStmt_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "CatchStmt_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, LPAREN, IDENTIFIER, RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // CONTINUE_KW SEMI
  public static boolean ContinueStmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ContinueStmt")) return false;
    if (!nextTokenIs(builder_, CONTINUE_KW)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, CONTINUE_KW, SEMI);
    exit_section_(builder_, marker_, CONTINUE_STMT, result_);
    return result_;
  }

  /* ********************************************************** */
  // DO_KW Block WHILE_KW LPAREN Expression RPAREN SEMI
  public static boolean DoWhileStmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "DoWhileStmt")) return false;
    if (!nextTokenIs(builder_, DO_KW)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, DO_KW);
    result_ = result_ && Block(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, WHILE_KW, LPAREN);
    result_ = result_ && Expression(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, RPAREN, SEMI);
    exit_section_(builder_, marker_, DO_WHILE_STMT, result_);
    return result_;
  }

  /* ********************************************************** */
  // ELSE_KW (Block | IfStmt)
  public static boolean ElseStmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ElseStmt")) return false;
    if (!nextTokenIs(builder_, ELSE_KW)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ELSE_KW);
    result_ = result_ && ElseStmt_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, ELSE_STMT, result_);
    return result_;
  }

  // Block | IfStmt
  private static boolean ElseStmt_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ElseStmt_1")) return false;
    boolean result_;
    result_ = Block(builder_, level_ + 1);
    if (!result_) result_ = IfStmt(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // SEMI
  public static boolean EmptyStmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "EmptyStmt")) return false;
    if (!nextTokenIs(builder_, SEMI)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, SEMI);
    exit_section_(builder_, marker_, EMPTY_STMT, result_);
    return result_;
  }

  /* ********************************************************** */
  // DOC_COMMENT* Pragmas? PRIVATE_KW? ENUM_KW EnumIdent LCURLY EnumField? ((SEMI | COMMA) EnumField)* (SEMI | COMMA)? RCURLY
  public static boolean EnumDecl(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "EnumDecl")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ENUM_DECL, "<enum decl>");
    result_ = EnumDecl_0(builder_, level_ + 1);
    result_ = result_ && EnumDecl_1(builder_, level_ + 1);
    result_ = result_ && EnumDecl_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ENUM_KW);
    result_ = result_ && EnumIdent(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, LCURLY);
    result_ = result_ && EnumDecl_6(builder_, level_ + 1);
    result_ = result_ && EnumDecl_7(builder_, level_ + 1);
    result_ = result_ && EnumDecl_8(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RCURLY);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // DOC_COMMENT*
  private static boolean EnumDecl_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "EnumDecl_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!consumeToken(builder_, DOC_COMMENT)) break;
      if (!empty_element_parsed_guard_(builder_, "EnumDecl_0", pos_)) break;
    }
    return true;
  }

  // Pragmas?
  private static boolean EnumDecl_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "EnumDecl_1")) return false;
    Pragmas(builder_, level_ + 1);
    return true;
  }

  // PRIVATE_KW?
  private static boolean EnumDecl_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "EnumDecl_2")) return false;
    consumeToken(builder_, PRIVATE_KW);
    return true;
  }

  // EnumField?
  private static boolean EnumDecl_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "EnumDecl_6")) return false;
    EnumField(builder_, level_ + 1);
    return true;
  }

  // ((SEMI | COMMA) EnumField)*
  private static boolean EnumDecl_7(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "EnumDecl_7")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!EnumDecl_7_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "EnumDecl_7", pos_)) break;
    }
    return true;
  }

  // (SEMI | COMMA) EnumField
  private static boolean EnumDecl_7_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "EnumDecl_7_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = EnumDecl_7_0_0(builder_, level_ + 1);
    result_ = result_ && EnumField(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // SEMI | COMMA
  private static boolean EnumDecl_7_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "EnumDecl_7_0_0")) return false;
    boolean result_;
    result_ = consumeToken(builder_, SEMI);
    if (!result_) result_ = consumeToken(builder_, COMMA);
    return result_;
  }

  // (SEMI | COMMA)?
  private static boolean EnumDecl_8(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "EnumDecl_8")) return false;
    EnumDecl_8_0(builder_, level_ + 1);
    return true;
  }

  // SEMI | COMMA
  private static boolean EnumDecl_8_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "EnumDecl_8_0")) return false;
    boolean result_;
    result_ = consumeToken(builder_, SEMI);
    if (!result_) result_ = consumeToken(builder_, COMMA);
    return result_;
  }

  /* ********************************************************** */
  // EnumFieldIdent (LPAREN Literal RPAREN)?
  public static boolean EnumField(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "EnumField")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ENUM_FIELD, "<enum field>");
    result_ = EnumFieldIdent(builder_, level_ + 1);
    result_ = result_ && EnumField_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // (LPAREN Literal RPAREN)?
  private static boolean EnumField_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "EnumField_1")) return false;
    EnumField_1_0(builder_, level_ + 1);
    return true;
  }

  // LPAREN Literal RPAREN
  private static boolean EnumField_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "EnumField_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LPAREN);
    result_ = result_ && Literal(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // IdentOrKeywordOrStrLit
  public static boolean EnumFieldIdent(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "EnumFieldIdent")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ENUM_FIELD_IDENT, "<enum field ident>");
    result_ = IdentOrKeywordOrStrLit(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean EnumIdent(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "EnumIdent")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IDENTIFIER);
    exit_section_(builder_, marker_, ENUM_IDENT, result_);
    return result_;
  }

  /* ********************************************************** */
  // Expression SEMI
  public static boolean ExprStmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ExprStmt")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, EXPR_STMT, "<expr stmt>");
    result_ = Expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, SEMI);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // PostfixExpr (BinOp PostfixExpr | (AS_KW | IS_KW) TypeSpecifier)*
  public static boolean Expression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Expression")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, EXPRESSION, "<expression>");
    result_ = PostfixExpr(builder_, level_ + 1);
    result_ = result_ && Expression_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // (BinOp PostfixExpr | (AS_KW | IS_KW) TypeSpecifier)*
  private static boolean Expression_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Expression_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!Expression_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "Expression_1", pos_)) break;
    }
    return true;
  }

  // BinOp PostfixExpr | (AS_KW | IS_KW) TypeSpecifier
  private static boolean Expression_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Expression_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = Expression_1_0_0(builder_, level_ + 1);
    if (!result_) result_ = Expression_1_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // BinOp PostfixExpr
  private static boolean Expression_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Expression_1_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = BinOp(builder_, level_ + 1);
    result_ = result_ && PostfixExpr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (AS_KW | IS_KW) TypeSpecifier
  private static boolean Expression_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Expression_1_0_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = Expression_1_0_1_0(builder_, level_ + 1);
    result_ = result_ && TypeSpecifier(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // AS_KW | IS_KW
  private static boolean Expression_1_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Expression_1_0_1_0")) return false;
    boolean result_;
    result_ = consumeToken(builder_, AS_KW);
    if (!result_) result_ = consumeToken(builder_, IS_KW);
    return result_;
  }

  /* ********************************************************** */
  // PRIVATE_KW | ABSTRACT_KW | STATIC_KW | NATIVE_KW
  public static boolean Flags(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Flags")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, FLAGS, "<flags>");
    result_ = consumeToken(builder_, PRIVATE_KW);
    if (!result_) result_ = consumeToken(builder_, ABSTRACT_KW);
    if (!result_) result_ = consumeToken(builder_, STATIC_KW);
    if (!result_) result_ = consumeToken(builder_, NATIVE_KW);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // DOC_COMMENT* Pragmas? Flags* FnOrTask FnIdent GenericParams? LPAREN FnParams? RPAREN TypeSpec? (Block | SEMI)
  public static boolean FnDecl(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FnDecl")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, FN_DECL, "<fn decl>");
    result_ = FnDecl_0(builder_, level_ + 1);
    result_ = result_ && FnDecl_1(builder_, level_ + 1);
    result_ = result_ && FnDecl_2(builder_, level_ + 1);
    result_ = result_ && FnOrTask(builder_, level_ + 1);
    result_ = result_ && FnIdent(builder_, level_ + 1);
    result_ = result_ && FnDecl_5(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, LPAREN);
    result_ = result_ && FnDecl_7(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    result_ = result_ && FnDecl_9(builder_, level_ + 1);
    result_ = result_ && FnDecl_10(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // DOC_COMMENT*
  private static boolean FnDecl_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FnDecl_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!consumeToken(builder_, DOC_COMMENT)) break;
      if (!empty_element_parsed_guard_(builder_, "FnDecl_0", pos_)) break;
    }
    return true;
  }

  // Pragmas?
  private static boolean FnDecl_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FnDecl_1")) return false;
    Pragmas(builder_, level_ + 1);
    return true;
  }

  // Flags*
  private static boolean FnDecl_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FnDecl_2")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!Flags(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "FnDecl_2", pos_)) break;
    }
    return true;
  }

  // GenericParams?
  private static boolean FnDecl_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FnDecl_5")) return false;
    GenericParams(builder_, level_ + 1);
    return true;
  }

  // FnParams?
  private static boolean FnDecl_7(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FnDecl_7")) return false;
    FnParams(builder_, level_ + 1);
    return true;
  }

  // TypeSpec?
  private static boolean FnDecl_9(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FnDecl_9")) return false;
    TypeSpec(builder_, level_ + 1);
    return true;
  }

  // Block | SEMI
  private static boolean FnDecl_10(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FnDecl_10")) return false;
    boolean result_;
    result_ = Block(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, SEMI);
    return result_;
  }

  /* ********************************************************** */
  // FN_KW LPAREN FnParams? RPAREN Block
  public static boolean FnExpr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FnExpr")) return false;
    if (!nextTokenIs(builder_, FN_KW)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, FN_KW, LPAREN);
    result_ = result_ && FnExpr_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    result_ = result_ && Block(builder_, level_ + 1);
    exit_section_(builder_, marker_, FN_EXPR, result_);
    return result_;
  }

  // FnParams?
  private static boolean FnExpr_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FnExpr_2")) return false;
    FnParams(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean FnIdent(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FnIdent")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IDENTIFIER);
    exit_section_(builder_, marker_, FN_IDENT, result_);
    return result_;
  }

  /* ********************************************************** */
  // FN_KW | TASK_KW
  public static boolean FnOrTask(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FnOrTask")) return false;
    if (!nextTokenIs(builder_, "<fn or task>", FN_KW, TASK_KW)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, FN_OR_TASK, "<fn or task>");
    result_ = consumeToken(builder_, FN_KW);
    if (!result_) result_ = consumeToken(builder_, TASK_KW);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // Pragmas? FnParamIdent TypeSpec
  public static boolean FnParam(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FnParam")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, FN_PARAM, "<fn param>");
    result_ = FnParam_0(builder_, level_ + 1);
    result_ = result_ && FnParamIdent(builder_, level_ + 1);
    result_ = result_ && TypeSpec(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // Pragmas?
  private static boolean FnParam_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FnParam_0")) return false;
    Pragmas(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // IdentOrKeyword
  public static boolean FnParamIdent(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FnParamIdent")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, FN_PARAM_IDENT, "<fn param ident>");
    result_ = IdentOrKeyword(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // FnParam (COMMA FnParam)* COMMA?
  public static boolean FnParams(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FnParams")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, FN_PARAMS, "<fn params>");
    result_ = FnParam(builder_, level_ + 1);
    result_ = result_ && FnParams_1(builder_, level_ + 1);
    result_ = result_ && FnParams_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // (COMMA FnParam)*
  private static boolean FnParams_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FnParams_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!FnParams_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "FnParams_1", pos_)) break;
    }
    return true;
  }

  // COMMA FnParam
  private static boolean FnParams_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FnParams_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && FnParam(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // COMMA?
  private static boolean FnParams_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FnParams_2")) return false;
    consumeToken(builder_, COMMA);
    return true;
  }

  /* ********************************************************** */
  // Expression QUESTION? RangeAccess?
  public static boolean ForExpr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ForExpr")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, FOR_EXPR, "<for expr>");
    result_ = Expression(builder_, level_ + 1);
    result_ = result_ && ForExpr_1(builder_, level_ + 1);
    result_ = result_ && ForExpr_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // QUESTION?
  private static boolean ForExpr_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ForExpr_1")) return false;
    consumeToken(builder_, QUESTION);
    return true;
  }

  // RangeAccess?
  private static boolean ForExpr_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ForExpr_2")) return false;
    RangeAccess(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // LIMIT_KW Expression
  public static boolean ForInLimit(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ForInLimit")) return false;
    if (!nextTokenIs(builder_, LIMIT_KW)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LIMIT_KW);
    result_ = result_ && Expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, FOR_IN_LIMIT, result_);
    return result_;
  }

  /* ********************************************************** */
  // FnParam | IDENTIFIER
  public static boolean ForInParam(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ForInParam")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, FOR_IN_PARAM, "<for in param>");
    result_ = FnParam(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, IDENTIFIER);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // ForInParam (COMMA ForInParam)*
  public static boolean ForInParams(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ForInParams")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, FOR_IN_PARAMS, "<for in params>");
    result_ = ForInParam(builder_, level_ + 1);
    result_ = result_ && ForInParams_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // (COMMA ForInParam)*
  private static boolean ForInParams_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ForInParams_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!ForInParams_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "ForInParams_1", pos_)) break;
    }
    return true;
  }

  // COMMA ForInParam
  private static boolean ForInParams_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ForInParams_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && ForInParam(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // SAMPLING_KW Expression
  public static boolean ForInSampling(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ForInSampling")) return false;
    if (!nextTokenIs(builder_, SAMPLING_KW)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, SAMPLING_KW);
    result_ = result_ && Expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, FOR_IN_SAMPLING, result_);
    return result_;
  }

  /* ********************************************************** */
  // SKIP_KW Expression
  public static boolean ForInSkip(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ForInSkip")) return false;
    if (!nextTokenIs(builder_, SKIP_KW)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, SKIP_KW);
    result_ = result_ && Expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, FOR_IN_SKIP, result_);
    return result_;
  }

  /* ********************************************************** */
  // FOR_KW LPAREN ForInParams IN_KW ForExpr ForInSampling? ForInSkip? ForInLimit? RPAREN Block
  public static boolean ForInStmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ForInStmt")) return false;
    if (!nextTokenIs(builder_, FOR_KW)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, FOR_KW, LPAREN);
    result_ = result_ && ForInParams(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, IN_KW);
    result_ = result_ && ForExpr(builder_, level_ + 1);
    result_ = result_ && ForInStmt_5(builder_, level_ + 1);
    result_ = result_ && ForInStmt_6(builder_, level_ + 1);
    result_ = result_ && ForInStmt_7(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    result_ = result_ && Block(builder_, level_ + 1);
    exit_section_(builder_, marker_, FOR_IN_STMT, result_);
    return result_;
  }

  // ForInSampling?
  private static boolean ForInStmt_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ForInStmt_5")) return false;
    ForInSampling(builder_, level_ + 1);
    return true;
  }

  // ForInSkip?
  private static boolean ForInStmt_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ForInStmt_6")) return false;
    ForInSkip(builder_, level_ + 1);
    return true;
  }

  // ForInLimit?
  private static boolean ForInStmt_7(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ForInStmt_7")) return false;
    ForInLimit(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // FOR_KW LPAREN VarDecl ExprStmt ForExpr RPAREN Block
  public static boolean ForStmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ForStmt")) return false;
    if (!nextTokenIs(builder_, FOR_KW)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, FOR_KW, LPAREN);
    result_ = result_ && VarDecl(builder_, level_ + 1);
    result_ = result_ && ExprStmt(builder_, level_ + 1);
    result_ = result_ && ForExpr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    result_ = result_ && Block(builder_, level_ + 1);
    exit_section_(builder_, marker_, FOR_STMT, result_);
    return result_;
  }

  /* ********************************************************** */
  // LT TypeSpecifier (COMMA TypeSpecifier)* GT
  public static boolean GenericParams(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "GenericParams")) return false;
    if (!nextTokenIs(builder_, LT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LT);
    result_ = result_ && TypeSpecifier(builder_, level_ + 1);
    result_ = result_ && GenericParams_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, GT);
    exit_section_(builder_, marker_, GENERIC_PARAMS, result_);
    return result_;
  }

  // (COMMA TypeSpecifier)*
  private static boolean GenericParams_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "GenericParams_2")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!GenericParams_2_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "GenericParams_2", pos_)) break;
    }
    return true;
  }

  // COMMA TypeSpecifier
  private static boolean GenericParams_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "GenericParams_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && TypeSpecifier(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // ModuleStatement*
  static boolean GreyCat(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "GreyCat")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!ModuleStatement(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "GreyCat", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // ABSTRACT_KW
  //     | AS_KW
  //     | AT_KW
  //     | BREAK_KW
  //     | CATCH_KW
  //     | DO_KW
  //     | ELSE_KW
  //     | ENUM_KW
  //     | FN_KW
  //     | FOR_KW
  //     | IF_KW
  //     | IN_KW
  //     | IS_KW
  //     | LIMIT_KW
  //     | NATIVE_KW
  //     | NULL_KW
  //     | PRIVATE_KW
  //     | RETURN_KW
  //     | SAMPLING_KW
  //     | SKIP_KW
  //     | STATIC_KW
  //     | THIS_KW
  //     | THROW_KW
  //     | TRY_KW
  //     | TASK_KW
  //     | TYPE_KW
  //     | USE_KW
  //     | VAR_KW
  //     | WHILE_KW
  //     | WITHOUT_KW
  //     | BuiltInType
  //     | NumAppendix
  //     | IDENTIFIER
  public static boolean IdentOrKeyword(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "IdentOrKeyword")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, IDENT_OR_KEYWORD, "<ident or keyword>");
    result_ = consumeToken(builder_, ABSTRACT_KW);
    if (!result_) result_ = consumeToken(builder_, AS_KW);
    if (!result_) result_ = consumeToken(builder_, AT_KW);
    if (!result_) result_ = consumeToken(builder_, BREAK_KW);
    if (!result_) result_ = consumeToken(builder_, CATCH_KW);
    if (!result_) result_ = consumeToken(builder_, DO_KW);
    if (!result_) result_ = consumeToken(builder_, ELSE_KW);
    if (!result_) result_ = consumeToken(builder_, ENUM_KW);
    if (!result_) result_ = consumeToken(builder_, FN_KW);
    if (!result_) result_ = consumeToken(builder_, FOR_KW);
    if (!result_) result_ = consumeToken(builder_, IF_KW);
    if (!result_) result_ = consumeToken(builder_, IN_KW);
    if (!result_) result_ = consumeToken(builder_, IS_KW);
    if (!result_) result_ = consumeToken(builder_, LIMIT_KW);
    if (!result_) result_ = consumeToken(builder_, NATIVE_KW);
    if (!result_) result_ = consumeToken(builder_, NULL_KW);
    if (!result_) result_ = consumeToken(builder_, PRIVATE_KW);
    if (!result_) result_ = consumeToken(builder_, RETURN_KW);
    if (!result_) result_ = consumeToken(builder_, SAMPLING_KW);
    if (!result_) result_ = consumeToken(builder_, SKIP_KW);
    if (!result_) result_ = consumeToken(builder_, STATIC_KW);
    if (!result_) result_ = consumeToken(builder_, THIS_KW);
    if (!result_) result_ = consumeToken(builder_, THROW_KW);
    if (!result_) result_ = consumeToken(builder_, TRY_KW);
    if (!result_) result_ = consumeToken(builder_, TASK_KW);
    if (!result_) result_ = consumeToken(builder_, TYPE_KW);
    if (!result_) result_ = consumeToken(builder_, USE_KW);
    if (!result_) result_ = consumeToken(builder_, VAR_KW);
    if (!result_) result_ = consumeToken(builder_, WHILE_KW);
    if (!result_) result_ = consumeToken(builder_, WITHOUT_KW);
    if (!result_) result_ = BuiltInType(builder_, level_ + 1);
    if (!result_) result_ = NumAppendix(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, IDENTIFIER);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // TemplateString | IdentOrKeyword
  public static boolean IdentOrKeywordOrStrLit(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "IdentOrKeywordOrStrLit")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, IDENT_OR_KEYWORD_OR_STR_LIT, "<ident or keyword or str lit>");
    result_ = TemplateString(builder_, level_ + 1);
    if (!result_) result_ = IdentOrKeyword(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // IF_KW LPAREN Expression RPAREN Block ElseStmt?
  public static boolean IfStmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "IfStmt")) return false;
    if (!nextTokenIs(builder_, IF_KW)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, IF_KW, LPAREN);
    result_ = result_ && Expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    result_ = result_ && Block(builder_, level_ + 1);
    result_ = result_ && IfStmt_5(builder_, level_ + 1);
    exit_section_(builder_, marker_, IF_STMT, result_);
    return result_;
  }

  // ElseStmt?
  private static boolean IfStmt_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "IfStmt_5")) return false;
    ElseStmt(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // EQ Expression
  public static boolean Initializer(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Initializer")) return false;
    if (!nextTokenIs(builder_, EQ)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, EQ);
    result_ = result_ && Expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, INITIALIZER, result_);
    return result_;
  }

  /* ********************************************************** */
  // ENTER_INTERPOLATION Expression? EXIT_INTERPOLATION
  public static boolean Interpolation(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Interpolation")) return false;
    if (!nextTokenIs(builder_, ENTER_INTERPOLATION)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ENTER_INTERPOLATION);
    result_ = result_ && Interpolation_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, EXIT_INTERPOLATION);
    exit_section_(builder_, marker_, INTERPOLATION, result_);
    return result_;
  }

  // Expression?
  private static boolean Interpolation_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Interpolation_1")) return false;
    Expression(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // StringLit | NumLit | NULL_KW | THIS_KW | TRUE_KW | FALSE_KW
  public static boolean Literal(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Literal")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, LITERAL, "<literal>");
    result_ = StringLit(builder_, level_ + 1);
    if (!result_) result_ = NumLit(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, NULL_KW);
    if (!result_) result_ = consumeToken(builder_, THIS_KW);
    if (!result_) result_ = consumeToken(builder_, TRUE_KW);
    if (!result_) result_ = consumeToken(builder_, FALSE_KW);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // IdentOrKeyword
  public static boolean MethodIdent(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "MethodIdent")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, METHOD_IDENT, "<method ident>");
    result_ = IdentOrKeyword(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // PragmaStmt | UseStmt | FnDecl | TypeDecl | EnumDecl | VarDecl | EmptyStmt
  public static boolean ModuleStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ModuleStatement")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, MODULE_STATEMENT, "<module statement>");
    result_ = PragmaStmt(builder_, level_ + 1);
    if (!result_) result_ = UseStmt(builder_, level_ + 1);
    if (!result_) result_ = FnDecl(builder_, level_ + 1);
    if (!result_) result_ = TypeDecl(builder_, level_ + 1);
    if (!result_) result_ = EnumDecl(builder_, level_ + 1);
    if (!result_) result_ = VarDecl(builder_, level_ + 1);
    if (!result_) result_ = EmptyStmt(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // TypeIdent LCURLY Arguments? COMMA? RCURLY
  public static boolean NativeObjExpr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "NativeObjExpr")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, NATIVE_OBJ_EXPR, "<native obj expr>");
    result_ = TypeIdent(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, LCURLY);
    result_ = result_ && NativeObjExpr_2(builder_, level_ + 1);
    result_ = result_ && NativeObjExpr_3(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RCURLY);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // Arguments?
  private static boolean NativeObjExpr_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "NativeObjExpr_2")) return false;
    Arguments(builder_, level_ + 1);
    return true;
  }

  // COMMA?
  private static boolean NativeObjExpr_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "NativeObjExpr_3")) return false;
    consumeToken(builder_, COMMA);
    return true;
  }

  /* ********************************************************** */
  // 'us'|'ms'|'s'|'min'|'hour'|'day'|'f'|'node'|'nodeTime'|'nodeGeo'|'nodeList'|'nodeIndex'|'time'
  public static boolean NumAppendix(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "NumAppendix")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, NUM_APPENDIX, "<num appendix>");
    result_ = consumeToken(builder_, "us");
    if (!result_) result_ = consumeToken(builder_, "ms");
    if (!result_) result_ = consumeToken(builder_, "s");
    if (!result_) result_ = consumeToken(builder_, "min");
    if (!result_) result_ = consumeToken(builder_, "hour");
    if (!result_) result_ = consumeToken(builder_, "day");
    if (!result_) result_ = consumeToken(builder_, "f");
    if (!result_) result_ = consumeToken(builder_, "node");
    if (!result_) result_ = consumeToken(builder_, "nodeTime");
    if (!result_) result_ = consumeToken(builder_, "nodeGeo");
    if (!result_) result_ = consumeToken(builder_, "nodeList");
    if (!result_) result_ = consumeToken(builder_, "nodeIndex");
    if (!result_) result_ = consumeToken(builder_, "time");
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // (PLUS|MINUS)? (NUMBER NumAppendix?)+
  public static boolean NumLit(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "NumLit")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, NUM_LIT, "<num lit>");
    result_ = NumLit_0(builder_, level_ + 1);
    result_ = result_ && NumLit_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // (PLUS|MINUS)?
  private static boolean NumLit_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "NumLit_0")) return false;
    NumLit_0_0(builder_, level_ + 1);
    return true;
  }

  // PLUS|MINUS
  private static boolean NumLit_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "NumLit_0_0")) return false;
    boolean result_;
    result_ = consumeToken(builder_, PLUS);
    if (!result_) result_ = consumeToken(builder_, MINUS);
    return result_;
  }

  // (NUMBER NumAppendix?)+
  private static boolean NumLit_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "NumLit_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = NumLit_1_0(builder_, level_ + 1);
    while (result_) {
      int pos_ = current_position_(builder_);
      if (!NumLit_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "NumLit_1", pos_)) break;
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // NUMBER NumAppendix?
  private static boolean NumLit_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "NumLit_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, NUMBER);
    result_ = result_ && NumLit_1_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // NumAppendix?
  private static boolean NumLit_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "NumLit_1_0_1")) return false;
    NumAppendix(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // TypeIdent? LCURLY ObjectProps? RCURLY
  public static boolean ObjectExpr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ObjectExpr")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, OBJECT_EXPR, "<object expr>");
    result_ = ObjectExpr_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, LCURLY);
    result_ = result_ && ObjectExpr_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RCURLY);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // TypeIdent?
  private static boolean ObjectExpr_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ObjectExpr_0")) return false;
    TypeIdent(builder_, level_ + 1);
    return true;
  }

  // ObjectProps?
  private static boolean ObjectExpr_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ObjectExpr_2")) return false;
    ObjectProps(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // ObjectPropIdent COLON Expression
  public static boolean ObjectProp(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ObjectProp")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, OBJECT_PROP, "<object prop>");
    result_ = ObjectPropIdent(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, COLON);
    result_ = result_ && Expression(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // IdentOrKeywordOrStrLit | STRING
  public static boolean ObjectPropIdent(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ObjectPropIdent")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, OBJECT_PROP_IDENT, "<object prop ident>");
    result_ = IdentOrKeywordOrStrLit(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, STRING);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // ObjectProp (COMMA ObjectProp)* COMMA?
  public static boolean ObjectProps(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ObjectProps")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, OBJECT_PROPS, "<object props>");
    result_ = ObjectProp(builder_, level_ + 1);
    result_ = result_ && ObjectProps_1(builder_, level_ + 1);
    result_ = result_ && ObjectProps_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // (COMMA ObjectProp)*
  private static boolean ObjectProps_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ObjectProps_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!ObjectProps_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "ObjectProps_1", pos_)) break;
    }
    return true;
  }

  // COMMA ObjectProp
  private static boolean ObjectProps_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ObjectProps_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && ObjectProp(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // COMMA?
  private static boolean ObjectProps_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ObjectProps_2")) return false;
    consumeToken(builder_, COMMA);
    return true;
  }

  /* ********************************************************** */
  // QUESTION? LSQUARE Expression RSQUARE
  public static boolean OffsetAccess(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "OffsetAccess")) return false;
    if (!nextTokenIs(builder_, "<offset access>", LSQUARE, QUESTION)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, OFFSET_ACCESS, "<offset access>");
    result_ = OffsetAccess_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, LSQUARE);
    result_ = result_ && Expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RSQUARE);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // QUESTION?
  private static boolean OffsetAccess_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "OffsetAccess_0")) return false;
    consumeToken(builder_, QUESTION);
    return true;
  }

  /* ********************************************************** */
  // LPAREN Expression RPAREN
  public static boolean ParenExpr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ParenExpr")) return false;
    if (!nextTokenIs(builder_, LPAREN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LPAREN);
    result_ = result_ && Expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, PAREN_EXPR, result_);
    return result_;
  }

  /* ********************************************************** */
  // PrefixExpr (PLUS_PLUS | MINUS_MINUS)?
  public static boolean PostfixExpr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PostfixExpr")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, POSTFIX_EXPR, "<postfix expr>");
    result_ = PrefixExpr(builder_, level_ + 1);
    result_ = result_ && PostfixExpr_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // (PLUS_PLUS | MINUS_MINUS)?
  private static boolean PostfixExpr_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PostfixExpr_1")) return false;
    PostfixExpr_1_0(builder_, level_ + 1);
    return true;
  }

  // PLUS_PLUS | MINUS_MINUS
  private static boolean PostfixExpr_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PostfixExpr_1_0")) return false;
    boolean result_;
    result_ = consumeToken(builder_, PLUS_PLUS);
    if (!result_) result_ = consumeToken(builder_, MINUS_MINUS);
    return result_;
  }

  /* ********************************************************** */
  // PragmaIdent PragmaArgs?
  public static boolean Pragma(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Pragma")) return false;
    if (!nextTokenIs(builder_, AT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = PragmaIdent(builder_, level_ + 1);
    result_ = result_ && Pragma_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, PRAGMA, result_);
    return result_;
  }

  // PragmaArgs?
  private static boolean Pragma_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Pragma_1")) return false;
    PragmaArgs(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // LPAREN Expression (COMMA Expression)* RPAREN
  public static boolean PragmaArgs(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PragmaArgs")) return false;
    if (!nextTokenIs(builder_, LPAREN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LPAREN);
    result_ = result_ && Expression(builder_, level_ + 1);
    result_ = result_ && PragmaArgs_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, PRAGMA_ARGS, result_);
    return result_;
  }

  // (COMMA Expression)*
  private static boolean PragmaArgs_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PragmaArgs_2")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!PragmaArgs_2_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "PragmaArgs_2", pos_)) break;
    }
    return true;
  }

  // COMMA Expression
  private static boolean PragmaArgs_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PragmaArgs_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && Expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // AT IdentOrKeyword
  public static boolean PragmaIdent(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PragmaIdent")) return false;
    if (!nextTokenIs(builder_, AT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, AT);
    result_ = result_ && IdentOrKeyword(builder_, level_ + 1);
    exit_section_(builder_, marker_, PRAGMA_IDENT, result_);
    return result_;
  }

  /* ********************************************************** */
  // Pragma SEMI
  public static boolean PragmaStmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PragmaStmt")) return false;
    if (!nextTokenIs(builder_, AT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = Pragma(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, SEMI);
    exit_section_(builder_, marker_, PRAGMA_STMT, result_);
    return result_;
  }

  /* ********************************************************** */
  // Pragma+
  public static boolean Pragmas(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Pragmas")) return false;
    if (!nextTokenIs(builder_, AT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = Pragma(builder_, level_ + 1);
    while (result_) {
      int pos_ = current_position_(builder_);
      if (!Pragma(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "Pragmas", pos_)) break;
    }
    exit_section_(builder_, marker_, PRAGMAS, result_);
    return result_;
  }

  /* ********************************************************** */
  // (NOT | STAR | PLUS | MINUS | PLUS_PLUS | MINUS_MINUS)? CallExpr
  public static boolean PrefixExpr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PrefixExpr")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, PREFIX_EXPR, "<prefix expr>");
    result_ = PrefixExpr_0(builder_, level_ + 1);
    result_ = result_ && CallExpr(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // (NOT | STAR | PLUS | MINUS | PLUS_PLUS | MINUS_MINUS)?
  private static boolean PrefixExpr_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PrefixExpr_0")) return false;
    PrefixExpr_0_0(builder_, level_ + 1);
    return true;
  }

  // NOT | STAR | PLUS | MINUS | PLUS_PLUS | MINUS_MINUS
  private static boolean PrefixExpr_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PrefixExpr_0_0")) return false;
    boolean result_;
    result_ = consumeToken(builder_, NOT);
    if (!result_) result_ = consumeToken(builder_, STAR);
    if (!result_) result_ = consumeToken(builder_, PLUS);
    if (!result_) result_ = consumeToken(builder_, MINUS);
    if (!result_) result_ = consumeToken(builder_, PLUS_PLUS);
    if (!result_) result_ = consumeToken(builder_, MINUS_MINUS);
    return result_;
  }

  /* ********************************************************** */
  // Literal
  //     | FnExpr
  //     | TupleExpr
  //     | NativeObjExpr
  //     | ShortArrayExpr
  //     | TableExpr
  //     | ParenExpr
  //     | ObjectExpr
  //     | IdentOrKeywordOrStrLit
  public static boolean PrimaryExpr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PrimaryExpr")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, PRIMARY_EXPR, "<primary expr>");
    result_ = Literal(builder_, level_ + 1);
    if (!result_) result_ = FnExpr(builder_, level_ + 1);
    if (!result_) result_ = TupleExpr(builder_, level_ + 1);
    if (!result_) result_ = NativeObjExpr(builder_, level_ + 1);
    if (!result_) result_ = ShortArrayExpr(builder_, level_ + 1);
    if (!result_) result_ = TableExpr(builder_, level_ + 1);
    if (!result_) result_ = ParenExpr(builder_, level_ + 1);
    if (!result_) result_ = ObjectExpr(builder_, level_ + 1);
    if (!result_) result_ = IdentOrKeywordOrStrLit(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // QUESTION? (DOT | ARROW) IdentOrKeywordOrStrLit
  public static boolean PropAccess(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PropAccess")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, PROP_ACCESS, "<prop access>");
    result_ = PropAccess_0(builder_, level_ + 1);
    result_ = result_ && PropAccess_1(builder_, level_ + 1);
    result_ = result_ && IdentOrKeywordOrStrLit(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // QUESTION?
  private static boolean PropAccess_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PropAccess_0")) return false;
    consumeToken(builder_, QUESTION);
    return true;
  }

  // DOT | ARROW
  private static boolean PropAccess_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PropAccess_1")) return false;
    boolean result_;
    result_ = consumeToken(builder_, DOT);
    if (!result_) result_ = consumeToken(builder_, ARROW);
    return result_;
  }

  /* ********************************************************** */
  // (LSQUARE|RSQUARE) Expression? DOT_DOT Expression? (LSQUARE|RSQUARE)
  public static boolean RangeAccess(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "RangeAccess")) return false;
    if (!nextTokenIs(builder_, "<range access>", LSQUARE, RSQUARE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, RANGE_ACCESS, "<range access>");
    result_ = RangeAccess_0(builder_, level_ + 1);
    result_ = result_ && RangeAccess_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, DOT_DOT);
    result_ = result_ && RangeAccess_3(builder_, level_ + 1);
    result_ = result_ && RangeAccess_4(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // LSQUARE|RSQUARE
  private static boolean RangeAccess_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "RangeAccess_0")) return false;
    boolean result_;
    result_ = consumeToken(builder_, LSQUARE);
    if (!result_) result_ = consumeToken(builder_, RSQUARE);
    return result_;
  }

  // Expression?
  private static boolean RangeAccess_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "RangeAccess_1")) return false;
    Expression(builder_, level_ + 1);
    return true;
  }

  // Expression?
  private static boolean RangeAccess_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "RangeAccess_3")) return false;
    Expression(builder_, level_ + 1);
    return true;
  }

  // LSQUARE|RSQUARE
  private static boolean RangeAccess_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "RangeAccess_4")) return false;
    boolean result_;
    result_ = consumeToken(builder_, LSQUARE);
    if (!result_) result_ = consumeToken(builder_, RSQUARE);
    return result_;
  }

  /* ********************************************************** */
  // RETURN_KW Expression? SEMI
  public static boolean ReturnStmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ReturnStmt")) return false;
    if (!nextTokenIs(builder_, RETURN_KW)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, RETURN_KW);
    result_ = result_ && ReturnStmt_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, SEMI);
    exit_section_(builder_, marker_, RETURN_STMT, result_);
    return result_;
  }

  // Expression?
  private static boolean ReturnStmt_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ReturnStmt_1")) return false;
    Expression(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // LSQUARE Arguments? COMMA? RSQUARE
  public static boolean ShortArrayExpr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ShortArrayExpr")) return false;
    if (!nextTokenIs(builder_, LSQUARE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LSQUARE);
    result_ = result_ && ShortArrayExpr_1(builder_, level_ + 1);
    result_ = result_ && ShortArrayExpr_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RSQUARE);
    exit_section_(builder_, marker_, SHORT_ARRAY_EXPR, result_);
    return result_;
  }

  // Arguments?
  private static boolean ShortArrayExpr_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ShortArrayExpr_1")) return false;
    Arguments(builder_, level_ + 1);
    return true;
  }

  // COMMA?
  private static boolean ShortArrayExpr_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ShortArrayExpr_2")) return false;
    consumeToken(builder_, COMMA);
    return true;
  }

  /* ********************************************************** */
  // VarDecl
  //     | ReturnStmt
  //     | TryStmt
  //     | ThrowStmt
  //     | IfStmt
  //     | WhileStmt
  //     | DoWhileStmt
  //     | ForStmt
  //     | ForInStmt
  //     | BreakStmt
  //     | ContinueStmt
  //     | AtStmt
  //     | ExprStmt
  //     | BlockStmt
  //     | EmptyStmt
  public static boolean Statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Statement")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, STATEMENT, "<statement>");
    result_ = VarDecl(builder_, level_ + 1);
    if (!result_) result_ = ReturnStmt(builder_, level_ + 1);
    if (!result_) result_ = TryStmt(builder_, level_ + 1);
    if (!result_) result_ = ThrowStmt(builder_, level_ + 1);
    if (!result_) result_ = IfStmt(builder_, level_ + 1);
    if (!result_) result_ = WhileStmt(builder_, level_ + 1);
    if (!result_) result_ = DoWhileStmt(builder_, level_ + 1);
    if (!result_) result_ = ForStmt(builder_, level_ + 1);
    if (!result_) result_ = ForInStmt(builder_, level_ + 1);
    if (!result_) result_ = BreakStmt(builder_, level_ + 1);
    if (!result_) result_ = ContinueStmt(builder_, level_ + 1);
    if (!result_) result_ = AtStmt(builder_, level_ + 1);
    if (!result_) result_ = ExprStmt(builder_, level_ + 1);
    if (!result_) result_ = BlockStmt(builder_, level_ + 1);
    if (!result_) result_ = EmptyStmt(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // COLON_COLON (TypeSpecifier COLON_COLON)? StaticPropIdent
  public static boolean StaticAccess(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "StaticAccess")) return false;
    if (!nextTokenIs(builder_, COLON_COLON)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COLON_COLON);
    result_ = result_ && StaticAccess_1(builder_, level_ + 1);
    result_ = result_ && StaticPropIdent(builder_, level_ + 1);
    exit_section_(builder_, marker_, STATIC_ACCESS, result_);
    return result_;
  }

  // (TypeSpecifier COLON_COLON)?
  private static boolean StaticAccess_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "StaticAccess_1")) return false;
    StaticAccess_1_0(builder_, level_ + 1);
    return true;
  }

  // TypeSpecifier COLON_COLON
  private static boolean StaticAccess_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "StaticAccess_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = TypeSpecifier(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, COLON_COLON);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // IdentOrKeywordOrStrLit
  public static boolean StaticPropIdent(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "StaticPropIdent")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, STATIC_PROP_IDENT, "<static prop ident>");
    result_ = IdentOrKeywordOrStrLit(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // TemplateString | STRING
  public static boolean StringLit(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "StringLit")) return false;
    if (!nextTokenIs(builder_, "<string lit>", DQUOTE, STRING)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, STRING_LIT, "<string lit>");
    result_ = TemplateString(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, STRING);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // TypeIdent LCURLY TableExprRows? COMMA? RCURLY
  public static boolean TableExpr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TableExpr")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, TABLE_EXPR, "<table expr>");
    result_ = TypeIdent(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, LCURLY);
    result_ = result_ && TableExpr_2(builder_, level_ + 1);
    result_ = result_ && TableExpr_3(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RCURLY);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // TableExprRows?
  private static boolean TableExpr_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TableExpr_2")) return false;
    TableExprRows(builder_, level_ + 1);
    return true;
  }

  // COMMA?
  private static boolean TableExpr_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TableExpr_3")) return false;
    consumeToken(builder_, COMMA);
    return true;
  }

  /* ********************************************************** */
  // ShortArrayExpr (COMMA ShortArrayExpr)*
  public static boolean TableExprRows(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TableExprRows")) return false;
    if (!nextTokenIs(builder_, LSQUARE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = ShortArrayExpr(builder_, level_ + 1);
    result_ = result_ && TableExprRows_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, TABLE_EXPR_ROWS, result_);
    return result_;
  }

  // (COMMA ShortArrayExpr)*
  private static boolean TableExprRows_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TableExprRows_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!TableExprRows_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "TableExprRows_1", pos_)) break;
    }
    return true;
  }

  // COMMA ShortArrayExpr
  private static boolean TableExprRows_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TableExprRows_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && ShortArrayExpr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // DQUOTE (RAW_STRING | Interpolation)* DQUOTE
  public static boolean TemplateString(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TemplateString")) return false;
    if (!nextTokenIs(builder_, DQUOTE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, DQUOTE);
    result_ = result_ && TemplateString_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, DQUOTE);
    exit_section_(builder_, marker_, TEMPLATE_STRING, result_);
    return result_;
  }

  // (RAW_STRING | Interpolation)*
  private static boolean TemplateString_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TemplateString_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!TemplateString_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "TemplateString_1", pos_)) break;
    }
    return true;
  }

  // RAW_STRING | Interpolation
  private static boolean TemplateString_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TemplateString_1_0")) return false;
    boolean result_;
    result_ = consumeToken(builder_, RAW_STRING);
    if (!result_) result_ = Interpolation(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // THROW_KW Expression SEMI
  public static boolean ThrowStmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ThrowStmt")) return false;
    if (!nextTokenIs(builder_, THROW_KW)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, THROW_KW);
    result_ = result_ && Expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, SEMI);
    exit_section_(builder_, marker_, THROW_STMT, result_);
    return result_;
  }

  /* ********************************************************** */
  // TRY_KW Block CatchStmt
  public static boolean TryStmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TryStmt")) return false;
    if (!nextTokenIs(builder_, TRY_KW)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, TRY_KW);
    result_ = result_ && Block(builder_, level_ + 1);
    result_ = result_ && CatchStmt(builder_, level_ + 1);
    exit_section_(builder_, marker_, TRY_STMT, result_);
    return result_;
  }

  /* ********************************************************** */
  // LPAREN Expression COMMA Expression COMMA? RPAREN
  public static boolean TupleExpr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TupleExpr")) return false;
    if (!nextTokenIs(builder_, LPAREN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LPAREN);
    result_ = result_ && Expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, COMMA);
    result_ = result_ && Expression(builder_, level_ + 1);
    result_ = result_ && TupleExpr_4(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, TUPLE_EXPR, result_);
    return result_;
  }

  // COMMA?
  private static boolean TupleExpr_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TupleExpr_4")) return false;
    consumeToken(builder_, COMMA);
    return true;
  }

  /* ********************************************************** */
  // Pragmas? Flags? AttrIdent TypeSpec Initializer? SEMI
  public static boolean TypeAttr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeAttr")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, TYPE_ATTR, "<type attr>");
    result_ = TypeAttr_0(builder_, level_ + 1);
    result_ = result_ && TypeAttr_1(builder_, level_ + 1);
    result_ = result_ && AttrIdent(builder_, level_ + 1);
    result_ = result_ && TypeSpec(builder_, level_ + 1);
    result_ = result_ && TypeAttr_4(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, SEMI);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // Pragmas?
  private static boolean TypeAttr_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeAttr_0")) return false;
    Pragmas(builder_, level_ + 1);
    return true;
  }

  // Flags?
  private static boolean TypeAttr_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeAttr_1")) return false;
    Flags(builder_, level_ + 1);
    return true;
  }

  // Initializer?
  private static boolean TypeAttr_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeAttr_4")) return false;
    Initializer(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // DOC_COMMENT* Pragmas? PRIVATE_KW? ABSTRACT_KW? NATIVE_KW? TYPE_KW TypeIdent GenericParams? TypeExtends? LCURLY TypeField* RCURLY
  public static boolean TypeDecl(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeDecl")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, TYPE_DECL, "<type decl>");
    result_ = TypeDecl_0(builder_, level_ + 1);
    result_ = result_ && TypeDecl_1(builder_, level_ + 1);
    result_ = result_ && TypeDecl_2(builder_, level_ + 1);
    result_ = result_ && TypeDecl_3(builder_, level_ + 1);
    result_ = result_ && TypeDecl_4(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, TYPE_KW);
    result_ = result_ && TypeIdent(builder_, level_ + 1);
    result_ = result_ && TypeDecl_7(builder_, level_ + 1);
    result_ = result_ && TypeDecl_8(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, LCURLY);
    result_ = result_ && TypeDecl_10(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RCURLY);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // DOC_COMMENT*
  private static boolean TypeDecl_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeDecl_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!consumeToken(builder_, DOC_COMMENT)) break;
      if (!empty_element_parsed_guard_(builder_, "TypeDecl_0", pos_)) break;
    }
    return true;
  }

  // Pragmas?
  private static boolean TypeDecl_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeDecl_1")) return false;
    Pragmas(builder_, level_ + 1);
    return true;
  }

  // PRIVATE_KW?
  private static boolean TypeDecl_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeDecl_2")) return false;
    consumeToken(builder_, PRIVATE_KW);
    return true;
  }

  // ABSTRACT_KW?
  private static boolean TypeDecl_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeDecl_3")) return false;
    consumeToken(builder_, ABSTRACT_KW);
    return true;
  }

  // NATIVE_KW?
  private static boolean TypeDecl_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeDecl_4")) return false;
    consumeToken(builder_, NATIVE_KW);
    return true;
  }

  // GenericParams?
  private static boolean TypeDecl_7(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeDecl_7")) return false;
    GenericParams(builder_, level_ + 1);
    return true;
  }

  // TypeExtends?
  private static boolean TypeDecl_8(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeDecl_8")) return false;
    TypeExtends(builder_, level_ + 1);
    return true;
  }

  // TypeField*
  private static boolean TypeDecl_10(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeDecl_10")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!TypeField(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "TypeDecl_10", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // EXTENDS_KW TypeSpecifier
  public static boolean TypeExtends(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeExtends")) return false;
    if (!nextTokenIs(builder_, EXTENDS_KW)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, EXTENDS_KW);
    result_ = result_ && TypeSpecifier(builder_, level_ + 1);
    exit_section_(builder_, marker_, TYPE_EXTENDS, result_);
    return result_;
  }

  /* ********************************************************** */
  // TypeAttr | TypeMethod
  public static boolean TypeField(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeField")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, TYPE_FIELD, "<type field>");
    result_ = TypeAttr(builder_, level_ + 1);
    if (!result_) result_ = TypeMethod(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // TYPE_OF_KW? (IdentOrKeyword (LT TypeIdent (COMMA TypeIdent)* GT)? COLON_COLON)? IdentOrKeyword (LT TypeIdent (COMMA TypeIdent)* GT)? QUESTION?
  public static boolean TypeIdent(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeIdent")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, TYPE_IDENT, "<type ident>");
    result_ = TypeIdent_0(builder_, level_ + 1);
    result_ = result_ && TypeIdent_1(builder_, level_ + 1);
    result_ = result_ && IdentOrKeyword(builder_, level_ + 1);
    result_ = result_ && TypeIdent_3(builder_, level_ + 1);
    result_ = result_ && TypeIdent_4(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // TYPE_OF_KW?
  private static boolean TypeIdent_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeIdent_0")) return false;
    consumeToken(builder_, TYPE_OF_KW);
    return true;
  }

  // (IdentOrKeyword (LT TypeIdent (COMMA TypeIdent)* GT)? COLON_COLON)?
  private static boolean TypeIdent_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeIdent_1")) return false;
    TypeIdent_1_0(builder_, level_ + 1);
    return true;
  }

  // IdentOrKeyword (LT TypeIdent (COMMA TypeIdent)* GT)? COLON_COLON
  private static boolean TypeIdent_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeIdent_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = IdentOrKeyword(builder_, level_ + 1);
    result_ = result_ && TypeIdent_1_0_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, COLON_COLON);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (LT TypeIdent (COMMA TypeIdent)* GT)?
  private static boolean TypeIdent_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeIdent_1_0_1")) return false;
    TypeIdent_1_0_1_0(builder_, level_ + 1);
    return true;
  }

  // LT TypeIdent (COMMA TypeIdent)* GT
  private static boolean TypeIdent_1_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeIdent_1_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LT);
    result_ = result_ && TypeIdent(builder_, level_ + 1);
    result_ = result_ && TypeIdent_1_0_1_0_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, GT);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (COMMA TypeIdent)*
  private static boolean TypeIdent_1_0_1_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeIdent_1_0_1_0_2")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!TypeIdent_1_0_1_0_2_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "TypeIdent_1_0_1_0_2", pos_)) break;
    }
    return true;
  }

  // COMMA TypeIdent
  private static boolean TypeIdent_1_0_1_0_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeIdent_1_0_1_0_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && TypeIdent(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (LT TypeIdent (COMMA TypeIdent)* GT)?
  private static boolean TypeIdent_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeIdent_3")) return false;
    TypeIdent_3_0(builder_, level_ + 1);
    return true;
  }

  // LT TypeIdent (COMMA TypeIdent)* GT
  private static boolean TypeIdent_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeIdent_3_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LT);
    result_ = result_ && TypeIdent(builder_, level_ + 1);
    result_ = result_ && TypeIdent_3_0_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, GT);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (COMMA TypeIdent)*
  private static boolean TypeIdent_3_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeIdent_3_0_2")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!TypeIdent_3_0_2_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "TypeIdent_3_0_2", pos_)) break;
    }
    return true;
  }

  // COMMA TypeIdent
  private static boolean TypeIdent_3_0_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeIdent_3_0_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && TypeIdent(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // QUESTION?
  private static boolean TypeIdent_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeIdent_4")) return false;
    consumeToken(builder_, QUESTION);
    return true;
  }

  /* ********************************************************** */
  // Pragmas? Flags* FnOrTask MethodIdent GenericParams? LPAREN FnParams? RPAREN TypeSpec? (Block | SEMI)
  public static boolean TypeMethod(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeMethod")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, TYPE_METHOD, "<type method>");
    result_ = TypeMethod_0(builder_, level_ + 1);
    result_ = result_ && TypeMethod_1(builder_, level_ + 1);
    result_ = result_ && FnOrTask(builder_, level_ + 1);
    result_ = result_ && MethodIdent(builder_, level_ + 1);
    result_ = result_ && TypeMethod_4(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, LPAREN);
    result_ = result_ && TypeMethod_6(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    result_ = result_ && TypeMethod_8(builder_, level_ + 1);
    result_ = result_ && TypeMethod_9(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // Pragmas?
  private static boolean TypeMethod_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeMethod_0")) return false;
    Pragmas(builder_, level_ + 1);
    return true;
  }

  // Flags*
  private static boolean TypeMethod_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeMethod_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!Flags(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "TypeMethod_1", pos_)) break;
    }
    return true;
  }

  // GenericParams?
  private static boolean TypeMethod_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeMethod_4")) return false;
    GenericParams(builder_, level_ + 1);
    return true;
  }

  // FnParams?
  private static boolean TypeMethod_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeMethod_6")) return false;
    FnParams(builder_, level_ + 1);
    return true;
  }

  // TypeSpec?
  private static boolean TypeMethod_8(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeMethod_8")) return false;
    TypeSpec(builder_, level_ + 1);
    return true;
  }

  // Block | SEMI
  private static boolean TypeMethod_9(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeMethod_9")) return false;
    boolean result_;
    result_ = Block(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, SEMI);
    return result_;
  }

  /* ********************************************************** */
  // COLON TypeSpecifier
  public static boolean TypeSpec(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeSpec")) return false;
    if (!nextTokenIs(builder_, COLON)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COLON);
    result_ = result_ && TypeSpecifier(builder_, level_ + 1);
    exit_section_(builder_, marker_, TYPE_SPEC, result_);
    return result_;
  }

  /* ********************************************************** */
  // TypeSpecifier (COMMA TypeSpecifier)*
  public static boolean TypeSpecList(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeSpecList")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, TYPE_SPEC_LIST, "<type spec list>");
    result_ = TypeSpecifier(builder_, level_ + 1);
    result_ = result_ && TypeSpecList_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // (COMMA TypeSpecifier)*
  private static boolean TypeSpecList_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeSpecList_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!TypeSpecList_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "TypeSpecList_1", pos_)) break;
    }
    return true;
  }

  // COMMA TypeSpecifier
  private static boolean TypeSpecList_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeSpecList_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && TypeSpecifier(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // TYPE_OF_KW? (IdentOrKeyword COLON_COLON)? IdentOrKeyword (LT TypeSpecList GT)? QUESTION?
  public static boolean TypeSpecifier(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeSpecifier")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, TYPE_SPECIFIER, "<type specifier>");
    result_ = TypeSpecifier_0(builder_, level_ + 1);
    result_ = result_ && TypeSpecifier_1(builder_, level_ + 1);
    result_ = result_ && IdentOrKeyword(builder_, level_ + 1);
    result_ = result_ && TypeSpecifier_3(builder_, level_ + 1);
    result_ = result_ && TypeSpecifier_4(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // TYPE_OF_KW?
  private static boolean TypeSpecifier_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeSpecifier_0")) return false;
    consumeToken(builder_, TYPE_OF_KW);
    return true;
  }

  // (IdentOrKeyword COLON_COLON)?
  private static boolean TypeSpecifier_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeSpecifier_1")) return false;
    TypeSpecifier_1_0(builder_, level_ + 1);
    return true;
  }

  // IdentOrKeyword COLON_COLON
  private static boolean TypeSpecifier_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeSpecifier_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = IdentOrKeyword(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, COLON_COLON);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (LT TypeSpecList GT)?
  private static boolean TypeSpecifier_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeSpecifier_3")) return false;
    TypeSpecifier_3_0(builder_, level_ + 1);
    return true;
  }

  // LT TypeSpecList GT
  private static boolean TypeSpecifier_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeSpecifier_3_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LT);
    result_ = result_ && TypeSpecList(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, GT);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // QUESTION?
  private static boolean TypeSpecifier_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeSpecifier_4")) return false;
    consumeToken(builder_, QUESTION);
    return true;
  }

  /* ********************************************************** */
  // USE_KW IDENTIFIER SEMI
  //           | USE_KW IDENTIFIER COLON_COLON IDENTIFIER (AS_KW IDENTIFIER)? SEMI
  //           | USE_KW IDENTIFIER WITHOUT_KW IDENTIFIER (COMMA IDENTIFIER)* SEMI
  public static boolean UseStmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "UseStmt")) return false;
    if (!nextTokenIs(builder_, USE_KW)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = parseTokens(builder_, 0, USE_KW, IDENTIFIER, SEMI);
    if (!result_) result_ = UseStmt_1(builder_, level_ + 1);
    if (!result_) result_ = UseStmt_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, USE_STMT, result_);
    return result_;
  }

  // USE_KW IDENTIFIER COLON_COLON IDENTIFIER (AS_KW IDENTIFIER)? SEMI
  private static boolean UseStmt_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "UseStmt_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, USE_KW, IDENTIFIER, COLON_COLON, IDENTIFIER);
    result_ = result_ && UseStmt_1_4(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, SEMI);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (AS_KW IDENTIFIER)?
  private static boolean UseStmt_1_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "UseStmt_1_4")) return false;
    UseStmt_1_4_0(builder_, level_ + 1);
    return true;
  }

  // AS_KW IDENTIFIER
  private static boolean UseStmt_1_4_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "UseStmt_1_4_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, AS_KW, IDENTIFIER);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // USE_KW IDENTIFIER WITHOUT_KW IDENTIFIER (COMMA IDENTIFIER)* SEMI
  private static boolean UseStmt_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "UseStmt_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, USE_KW, IDENTIFIER, WITHOUT_KW, IDENTIFIER);
    result_ = result_ && UseStmt_2_4(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, SEMI);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (COMMA IDENTIFIER)*
  private static boolean UseStmt_2_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "UseStmt_2_4")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!UseStmt_2_4_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "UseStmt_2_4", pos_)) break;
    }
    return true;
  }

  // COMMA IDENTIFIER
  private static boolean UseStmt_2_4_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "UseStmt_2_4_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, COMMA, IDENTIFIER);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // DOC_COMMENT* Pragmas? PRIVATE_KW? VAR_KW VarDeclIdent TypeSpec? Initializer? SEMI
  public static boolean VarDecl(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "VarDecl")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, VAR_DECL, "<var decl>");
    result_ = VarDecl_0(builder_, level_ + 1);
    result_ = result_ && VarDecl_1(builder_, level_ + 1);
    result_ = result_ && VarDecl_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, VAR_KW);
    result_ = result_ && VarDeclIdent(builder_, level_ + 1);
    result_ = result_ && VarDecl_5(builder_, level_ + 1);
    result_ = result_ && VarDecl_6(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, SEMI);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // DOC_COMMENT*
  private static boolean VarDecl_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "VarDecl_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!consumeToken(builder_, DOC_COMMENT)) break;
      if (!empty_element_parsed_guard_(builder_, "VarDecl_0", pos_)) break;
    }
    return true;
  }

  // Pragmas?
  private static boolean VarDecl_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "VarDecl_1")) return false;
    Pragmas(builder_, level_ + 1);
    return true;
  }

  // PRIVATE_KW?
  private static boolean VarDecl_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "VarDecl_2")) return false;
    consumeToken(builder_, PRIVATE_KW);
    return true;
  }

  // TypeSpec?
  private static boolean VarDecl_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "VarDecl_5")) return false;
    TypeSpec(builder_, level_ + 1);
    return true;
  }

  // Initializer?
  private static boolean VarDecl_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "VarDecl_6")) return false;
    Initializer(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean VarDeclIdent(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "VarDeclIdent")) return false;
    if (!nextTokenIs(builder_, IDENTIFIER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IDENTIFIER);
    exit_section_(builder_, marker_, VAR_DECL_IDENT, result_);
    return result_;
  }

  /* ********************************************************** */
  // WHILE_KW LPAREN Expression RPAREN Block
  public static boolean WhileStmt(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "WhileStmt")) return false;
    if (!nextTokenIs(builder_, WHILE_KW)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, WHILE_KW, LPAREN);
    result_ = result_ && Expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    result_ = result_ && Block(builder_, level_ + 1);
    exit_section_(builder_, marker_, WHILE_STMT, result_);
    return result_;
  }

}
