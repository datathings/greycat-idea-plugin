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

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return GreyCat(b, l + 1);
  }

  /* ********************************************************** */
  // Expression (COMMA Expression)*
  public static boolean Arguments(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Arguments")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ARGUMENTS, "<arguments>");
    r = Expression(b, l + 1);
    r = r && Arguments_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (COMMA Expression)*
  private static boolean Arguments_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Arguments_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Arguments_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Arguments_1", c)) break;
    }
    return true;
  }

  // COMMA Expression
  private static boolean Arguments_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Arguments_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // AT_KW LPAREN Expression RPAREN Block
  public static boolean AtStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AtStmt")) return false;
    if (!nextTokenIs(b, AT_KW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, AT_KW, LPAREN);
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    r = r && Block(b, l + 1);
    exit_section_(b, m, AT_STMT, r);
    return r;
  }

  /* ********************************************************** */
  // IdentOrKeywordOrStrLit
  public static boolean AttrIdent(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AttrIdent")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ATTR_IDENT, "<attr ident>");
    r = IdentOrKeywordOrStrLit(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
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
  public static boolean BinOp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BinOp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BIN_OP, "<bin op>");
    r = consumeToken(b, BAR_BAR);
    if (!r) r = consumeToken(b, QUESTION_QUESTION);
    if (!r) r = consumeToken(b, AMP_AMP);
    if (!r) r = consumeToken(b, EQ_EQ);
    if (!r) r = consumeToken(b, NOT_EQ);
    if (!r) r = consumeToken(b, LT);
    if (!r) r = consumeToken(b, GT);
    if (!r) r = consumeToken(b, LT_EQ);
    if (!r) r = consumeToken(b, GT_EQ);
    if (!r) r = consumeToken(b, PLUS);
    if (!r) r = consumeToken(b, MINUS);
    if (!r) r = consumeToken(b, STAR);
    if (!r) r = consumeToken(b, SLASH);
    if (!r) r = consumeToken(b, PERCENT);
    if (!r) r = consumeToken(b, CARET);
    if (!r) r = consumeToken(b, EQ);
    if (!r) r = consumeToken(b, QUESTION_EQ);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // LCURLY Statement* RCURLY
  public static boolean Block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Block")) return false;
    if (!nextTokenIs(b, LCURLY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LCURLY);
    r = r && Block_1(b, l + 1);
    r = r && consumeToken(b, RCURLY);
    exit_section_(b, m, BLOCK, r);
    return r;
  }

  // Statement*
  private static boolean Block_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Block_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Block_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // Block SEMI?
  public static boolean BlockStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BlockStmt")) return false;
    if (!nextTokenIs(b, LCURLY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Block(b, l + 1);
    r = r && BlockStmt_1(b, l + 1);
    exit_section_(b, m, BLOCK_STMT, r);
    return r;
  }

  // SEMI?
  private static boolean BlockStmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BlockStmt_1")) return false;
    consumeToken(b, SEMI);
    return true;
  }

  /* ********************************************************** */
  // BREAK_KW SEMI
  public static boolean BreakStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BreakStmt")) return false;
    if (!nextTokenIs(b, BREAK_KW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, BREAK_KW, SEMI);
    exit_section_(b, m, BREAK_STMT, r);
    return r;
  }

  /* ********************************************************** */
  // INT_ID|FLOAT_ID|TIME_ID|GEO_ID|DURATION_ID|T2_ID|T2F_ID|T3_ID|T3F_ID|STR_ID|NODE_ID|NODE_TIME_ID|NODE_GEO_ID|NODE_LIST_ID|NODE_INDEX_ID
  public static boolean BuiltInType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BuiltInType")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BUILT_IN_TYPE, "<built in type>");
    r = consumeToken(b, INT_ID);
    if (!r) r = consumeToken(b, FLOAT_ID);
    if (!r) r = consumeToken(b, TIME_ID);
    if (!r) r = consumeToken(b, GEO_ID);
    if (!r) r = consumeToken(b, DURATION_ID);
    if (!r) r = consumeToken(b, T2_ID);
    if (!r) r = consumeToken(b, T2F_ID);
    if (!r) r = consumeToken(b, T3_ID);
    if (!r) r = consumeToken(b, T3F_ID);
    if (!r) r = consumeToken(b, STR_ID);
    if (!r) r = consumeToken(b, NODE_ID);
    if (!r) r = consumeToken(b, NODE_TIME_ID);
    if (!r) r = consumeToken(b, NODE_GEO_ID);
    if (!r) r = consumeToken(b, NODE_LIST_ID);
    if (!r) r = consumeToken(b, NODE_INDEX_ID);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // LPAREN Arguments? COMMA? RPAREN
  public static boolean CallArgs(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallArgs")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && CallArgs_1(b, l + 1);
    r = r && CallArgs_2(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, CALL_ARGS, r);
    return r;
  }

  // Arguments?
  private static boolean CallArgs_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallArgs_1")) return false;
    Arguments(b, l + 1);
    return true;
  }

  // COMMA?
  private static boolean CallArgs_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallArgs_2")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // PrimaryExpr CallExprSpec*
  public static boolean CallExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallExpr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CALL_EXPR, "<call expr>");
    r = PrimaryExpr(b, l + 1);
    r = r && CallExpr_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // CallExprSpec*
  private static boolean CallExpr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallExpr_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!CallExprSpec(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "CallExpr_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // CallArgs | StaticAccess | PropAccess | OffsetAccess | NOT_NOT
  public static boolean CallExprSpec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CallExprSpec")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CALL_EXPR_SPEC, "<call expr spec>");
    r = CallArgs(b, l + 1);
    if (!r) r = StaticAccess(b, l + 1);
    if (!r) r = PropAccess(b, l + 1);
    if (!r) r = OffsetAccess(b, l + 1);
    if (!r) r = consumeToken(b, NOT_NOT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // CATCH_KW (LPAREN IDENTIFIER RPAREN)? Block
  public static boolean CatchStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CatchStmt")) return false;
    if (!nextTokenIs(b, CATCH_KW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CATCH_KW);
    r = r && CatchStmt_1(b, l + 1);
    r = r && Block(b, l + 1);
    exit_section_(b, m, CATCH_STMT, r);
    return r;
  }

  // (LPAREN IDENTIFIER RPAREN)?
  private static boolean CatchStmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CatchStmt_1")) return false;
    CatchStmt_1_0(b, l + 1);
    return true;
  }

  // LPAREN IDENTIFIER RPAREN
  private static boolean CatchStmt_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CatchStmt_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LPAREN, IDENTIFIER, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // CONTINUE_KW SEMI
  public static boolean ContinueStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ContinueStmt")) return false;
    if (!nextTokenIs(b, CONTINUE_KW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, CONTINUE_KW, SEMI);
    exit_section_(b, m, CONTINUE_STMT, r);
    return r;
  }

  /* ********************************************************** */
  // DO_KW Block WHILE_KW LPAREN Expression RPAREN SEMI
  public static boolean DoWhileStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DoWhileStmt")) return false;
    if (!nextTokenIs(b, DO_KW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DO_KW);
    r = r && Block(b, l + 1);
    r = r && consumeTokens(b, 0, WHILE_KW, LPAREN);
    r = r && Expression(b, l + 1);
    r = r && consumeTokens(b, 0, RPAREN, SEMI);
    exit_section_(b, m, DO_WHILE_STMT, r);
    return r;
  }

  /* ********************************************************** */
  // ELSE_KW (Block | IfStmt)
  public static boolean ElseStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ElseStmt")) return false;
    if (!nextTokenIs(b, ELSE_KW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ELSE_KW);
    r = r && ElseStmt_1(b, l + 1);
    exit_section_(b, m, ELSE_STMT, r);
    return r;
  }

  // Block | IfStmt
  private static boolean ElseStmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ElseStmt_1")) return false;
    boolean r;
    r = Block(b, l + 1);
    if (!r) r = IfStmt(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // SEMI
  public static boolean EmptyStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EmptyStmt")) return false;
    if (!nextTokenIs(b, SEMI)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SEMI);
    exit_section_(b, m, EMPTY_STMT, r);
    return r;
  }

  /* ********************************************************** */
  // Pragmas? PRIVATE_KW? ENUM_KW EnumIdent LCURLY (EnumField SEMI)* RCURLY
  public static boolean EnumDecl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumDecl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENUM_DECL, "<enum decl>");
    r = EnumDecl_0(b, l + 1);
    r = r && EnumDecl_1(b, l + 1);
    r = r && consumeToken(b, ENUM_KW);
    r = r && EnumIdent(b, l + 1);
    r = r && consumeToken(b, LCURLY);
    r = r && EnumDecl_5(b, l + 1);
    r = r && consumeToken(b, RCURLY);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Pragmas?
  private static boolean EnumDecl_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumDecl_0")) return false;
    Pragmas(b, l + 1);
    return true;
  }

  // PRIVATE_KW?
  private static boolean EnumDecl_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumDecl_1")) return false;
    consumeToken(b, PRIVATE_KW);
    return true;
  }

  // (EnumField SEMI)*
  private static boolean EnumDecl_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumDecl_5")) return false;
    while (true) {
      int c = current_position_(b);
      if (!EnumDecl_5_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "EnumDecl_5", c)) break;
    }
    return true;
  }

  // EnumField SEMI
  private static boolean EnumDecl_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumDecl_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = EnumField(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // EnumFieldIdent (LPAREN Literal RPAREN)?
  public static boolean EnumField(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumField")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENUM_FIELD, "<enum field>");
    r = EnumFieldIdent(b, l + 1);
    r = r && EnumField_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (LPAREN Literal RPAREN)?
  private static boolean EnumField_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumField_1")) return false;
    EnumField_1_0(b, l + 1);
    return true;
  }

  // LPAREN Literal RPAREN
  private static boolean EnumField_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumField_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && Literal(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IdentOrKeywordOrStrLit
  public static boolean EnumFieldIdent(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumFieldIdent")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENUM_FIELD_IDENT, "<enum field ident>");
    r = IdentOrKeywordOrStrLit(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean EnumIdent(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EnumIdent")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, ENUM_IDENT, r);
    return r;
  }

  /* ********************************************************** */
  // Expression SEMI
  public static boolean ExprStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ExprStmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPR_STMT, "<expr stmt>");
    r = Expression(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // PostfixExpr (BinOp PostfixExpr | (AS_KW | IS_KW) TypeSpecifier)*
  public static boolean Expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXPRESSION, "<expression>");
    r = PostfixExpr(b, l + 1);
    r = r && Expression_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (BinOp PostfixExpr | (AS_KW | IS_KW) TypeSpecifier)*
  private static boolean Expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Expression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Expression_1", c)) break;
    }
    return true;
  }

  // BinOp PostfixExpr | (AS_KW | IS_KW) TypeSpecifier
  private static boolean Expression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expression_1_0_0(b, l + 1);
    if (!r) r = Expression_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // BinOp PostfixExpr
  private static boolean Expression_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = BinOp(b, l + 1);
    r = r && PostfixExpr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (AS_KW | IS_KW) TypeSpecifier
  private static boolean Expression_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Expression_1_0_1_0(b, l + 1);
    r = r && TypeSpecifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // AS_KW | IS_KW
  private static boolean Expression_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Expression_1_0_1_0")) return false;
    boolean r;
    r = consumeToken(b, AS_KW);
    if (!r) r = consumeToken(b, IS_KW);
    return r;
  }

  /* ********************************************************** */
  // PRIVATE_KW | ABSTRACT_KW | STATIC_KW | NATIVE_KW
  public static boolean Flags(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Flags")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FLAGS, "<flags>");
    r = consumeToken(b, PRIVATE_KW);
    if (!r) r = consumeToken(b, ABSTRACT_KW);
    if (!r) r = consumeToken(b, STATIC_KW);
    if (!r) r = consumeToken(b, NATIVE_KW);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // Pragmas? Flags* FnOrTask FnIdent GenericParams? LPAREN FnParams? RPAREN TypeSpec? (Block | SEMI)
  public static boolean FnDecl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FnDecl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FN_DECL, "<fn decl>");
    r = FnDecl_0(b, l + 1);
    r = r && FnDecl_1(b, l + 1);
    r = r && FnOrTask(b, l + 1);
    r = r && FnIdent(b, l + 1);
    r = r && FnDecl_4(b, l + 1);
    r = r && consumeToken(b, LPAREN);
    r = r && FnDecl_6(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    r = r && FnDecl_8(b, l + 1);
    r = r && FnDecl_9(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Pragmas?
  private static boolean FnDecl_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FnDecl_0")) return false;
    Pragmas(b, l + 1);
    return true;
  }

  // Flags*
  private static boolean FnDecl_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FnDecl_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Flags(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FnDecl_1", c)) break;
    }
    return true;
  }

  // GenericParams?
  private static boolean FnDecl_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FnDecl_4")) return false;
    GenericParams(b, l + 1);
    return true;
  }

  // FnParams?
  private static boolean FnDecl_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FnDecl_6")) return false;
    FnParams(b, l + 1);
    return true;
  }

  // TypeSpec?
  private static boolean FnDecl_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FnDecl_8")) return false;
    TypeSpec(b, l + 1);
    return true;
  }

  // Block | SEMI
  private static boolean FnDecl_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FnDecl_9")) return false;
    boolean r;
    r = Block(b, l + 1);
    if (!r) r = consumeToken(b, SEMI);
    return r;
  }

  /* ********************************************************** */
  // FN_KW LPAREN FnParams? RPAREN Block
  public static boolean FnExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FnExpr")) return false;
    if (!nextTokenIs(b, FN_KW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, FN_KW, LPAREN);
    r = r && FnExpr_2(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    r = r && Block(b, l + 1);
    exit_section_(b, m, FN_EXPR, r);
    return r;
  }

  // FnParams?
  private static boolean FnExpr_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FnExpr_2")) return false;
    FnParams(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean FnIdent(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FnIdent")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, FN_IDENT, r);
    return r;
  }

  /* ********************************************************** */
  // FN_KW | TASK_KW
  public static boolean FnOrTask(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FnOrTask")) return false;
    if (!nextTokenIs(b, "<fn or task>", FN_KW, TASK_KW)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FN_OR_TASK, "<fn or task>");
    r = consumeToken(b, FN_KW);
    if (!r) r = consumeToken(b, TASK_KW);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // Pragmas? FnParamIdent TypeSpec
  public static boolean FnParam(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FnParam")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FN_PARAM, "<fn param>");
    r = FnParam_0(b, l + 1);
    r = r && FnParamIdent(b, l + 1);
    r = r && TypeSpec(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Pragmas?
  private static boolean FnParam_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FnParam_0")) return false;
    Pragmas(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // IdentOrKeyword
  public static boolean FnParamIdent(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FnParamIdent")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FN_PARAM_IDENT, "<fn param ident>");
    r = IdentOrKeyword(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // FnParam (COMMA FnParam)* COMMA?
  public static boolean FnParams(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FnParams")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FN_PARAMS, "<fn params>");
    r = FnParam(b, l + 1);
    r = r && FnParams_1(b, l + 1);
    r = r && FnParams_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (COMMA FnParam)*
  private static boolean FnParams_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FnParams_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!FnParams_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "FnParams_1", c)) break;
    }
    return true;
  }

  // COMMA FnParam
  private static boolean FnParams_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FnParams_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && FnParam(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA?
  private static boolean FnParams_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FnParams_2")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // Expression QUESTION? RangeAccess?
  public static boolean ForExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForExpr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FOR_EXPR, "<for expr>");
    r = Expression(b, l + 1);
    r = r && ForExpr_1(b, l + 1);
    r = r && ForExpr_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // QUESTION?
  private static boolean ForExpr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForExpr_1")) return false;
    consumeToken(b, QUESTION);
    return true;
  }

  // RangeAccess?
  private static boolean ForExpr_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForExpr_2")) return false;
    RangeAccess(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // LIMIT_KW Expression
  public static boolean ForInLimit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForInLimit")) return false;
    if (!nextTokenIs(b, LIMIT_KW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LIMIT_KW);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, FOR_IN_LIMIT, r);
    return r;
  }

  /* ********************************************************** */
  // FnParam | IDENTIFIER
  public static boolean ForInParam(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForInParam")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FOR_IN_PARAM, "<for in param>");
    r = FnParam(b, l + 1);
    if (!r) r = consumeToken(b, IDENTIFIER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ForInParam (COMMA ForInParam)*
  public static boolean ForInParams(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForInParams")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FOR_IN_PARAMS, "<for in params>");
    r = ForInParam(b, l + 1);
    r = r && ForInParams_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (COMMA ForInParam)*
  private static boolean ForInParams_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForInParams_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ForInParams_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ForInParams_1", c)) break;
    }
    return true;
  }

  // COMMA ForInParam
  private static boolean ForInParams_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForInParams_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && ForInParam(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // SAMPLING_KW Expression
  public static boolean ForInSampling(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForInSampling")) return false;
    if (!nextTokenIs(b, SAMPLING_KW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SAMPLING_KW);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, FOR_IN_SAMPLING, r);
    return r;
  }

  /* ********************************************************** */
  // SKIP_KW Expression
  public static boolean ForInSkip(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForInSkip")) return false;
    if (!nextTokenIs(b, SKIP_KW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SKIP_KW);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, FOR_IN_SKIP, r);
    return r;
  }

  /* ********************************************************** */
  // FOR_KW LPAREN ForInParams IN_KW ForExpr ForInSampling? ForInSkip? ForInLimit? RPAREN Block
  public static boolean ForInStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForInStmt")) return false;
    if (!nextTokenIs(b, FOR_KW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, FOR_KW, LPAREN);
    r = r && ForInParams(b, l + 1);
    r = r && consumeToken(b, IN_KW);
    r = r && ForExpr(b, l + 1);
    r = r && ForInStmt_5(b, l + 1);
    r = r && ForInStmt_6(b, l + 1);
    r = r && ForInStmt_7(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    r = r && Block(b, l + 1);
    exit_section_(b, m, FOR_IN_STMT, r);
    return r;
  }

  // ForInSampling?
  private static boolean ForInStmt_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForInStmt_5")) return false;
    ForInSampling(b, l + 1);
    return true;
  }

  // ForInSkip?
  private static boolean ForInStmt_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForInStmt_6")) return false;
    ForInSkip(b, l + 1);
    return true;
  }

  // ForInLimit?
  private static boolean ForInStmt_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForInStmt_7")) return false;
    ForInLimit(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // FOR_KW LPAREN VarDecl ExprStmt ForExpr RPAREN Block
  public static boolean ForStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ForStmt")) return false;
    if (!nextTokenIs(b, FOR_KW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, FOR_KW, LPAREN);
    r = r && VarDecl(b, l + 1);
    r = r && ExprStmt(b, l + 1);
    r = r && ForExpr(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    r = r && Block(b, l + 1);
    exit_section_(b, m, FOR_STMT, r);
    return r;
  }

  /* ********************************************************** */
  // LT TypeSpecifier (COMMA TypeSpecifier)* GT
  public static boolean GenericParams(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GenericParams")) return false;
    if (!nextTokenIs(b, LT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LT);
    r = r && TypeSpecifier(b, l + 1);
    r = r && GenericParams_2(b, l + 1);
    r = r && consumeToken(b, GT);
    exit_section_(b, m, GENERIC_PARAMS, r);
    return r;
  }

  // (COMMA TypeSpecifier)*
  private static boolean GenericParams_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GenericParams_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!GenericParams_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "GenericParams_2", c)) break;
    }
    return true;
  }

  // COMMA TypeSpecifier
  private static boolean GenericParams_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GenericParams_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && TypeSpecifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ModuleStatement*
  static boolean GreyCat(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "GreyCat")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ModuleStatement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "GreyCat", c)) break;
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
  public static boolean IdentOrKeyword(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IdentOrKeyword")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IDENT_OR_KEYWORD, "<ident or keyword>");
    r = consumeToken(b, ABSTRACT_KW);
    if (!r) r = consumeToken(b, AS_KW);
    if (!r) r = consumeToken(b, AT_KW);
    if (!r) r = consumeToken(b, BREAK_KW);
    if (!r) r = consumeToken(b, CATCH_KW);
    if (!r) r = consumeToken(b, DO_KW);
    if (!r) r = consumeToken(b, ELSE_KW);
    if (!r) r = consumeToken(b, ENUM_KW);
    if (!r) r = consumeToken(b, FN_KW);
    if (!r) r = consumeToken(b, FOR_KW);
    if (!r) r = consumeToken(b, IF_KW);
    if (!r) r = consumeToken(b, IN_KW);
    if (!r) r = consumeToken(b, IS_KW);
    if (!r) r = consumeToken(b, LIMIT_KW);
    if (!r) r = consumeToken(b, NATIVE_KW);
    if (!r) r = consumeToken(b, NULL_KW);
    if (!r) r = consumeToken(b, PRIVATE_KW);
    if (!r) r = consumeToken(b, RETURN_KW);
    if (!r) r = consumeToken(b, SAMPLING_KW);
    if (!r) r = consumeToken(b, SKIP_KW);
    if (!r) r = consumeToken(b, STATIC_KW);
    if (!r) r = consumeToken(b, THIS_KW);
    if (!r) r = consumeToken(b, THROW_KW);
    if (!r) r = consumeToken(b, TRY_KW);
    if (!r) r = consumeToken(b, TASK_KW);
    if (!r) r = consumeToken(b, TYPE_KW);
    if (!r) r = consumeToken(b, USE_KW);
    if (!r) r = consumeToken(b, VAR_KW);
    if (!r) r = consumeToken(b, WHILE_KW);
    if (!r) r = consumeToken(b, WITHOUT_KW);
    if (!r) r = BuiltInType(b, l + 1);
    if (!r) r = NumAppendix(b, l + 1);
    if (!r) r = consumeToken(b, IDENTIFIER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TemplateString | IdentOrKeyword
  public static boolean IdentOrKeywordOrStrLit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IdentOrKeywordOrStrLit")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IDENT_OR_KEYWORD_OR_STR_LIT, "<ident or keyword or str lit>");
    r = TemplateString(b, l + 1);
    if (!r) r = IdentOrKeyword(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // IF_KW LPAREN Expression RPAREN Block ElseStmt?
  public static boolean IfStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfStmt")) return false;
    if (!nextTokenIs(b, IF_KW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IF_KW, LPAREN);
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    r = r && Block(b, l + 1);
    r = r && IfStmt_5(b, l + 1);
    exit_section_(b, m, IF_STMT, r);
    return r;
  }

  // ElseStmt?
  private static boolean IfStmt_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IfStmt_5")) return false;
    ElseStmt(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // EQ Expression
  public static boolean Initializer(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Initializer")) return false;
    if (!nextTokenIs(b, EQ)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EQ);
    r = r && Expression(b, l + 1);
    exit_section_(b, m, INITIALIZER, r);
    return r;
  }

  /* ********************************************************** */
  // ENTER_INTERPOLATION Expression? EXIT_INTERPOLATION
  public static boolean Interpolation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Interpolation")) return false;
    if (!nextTokenIs(b, ENTER_INTERPOLATION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ENTER_INTERPOLATION);
    r = r && Interpolation_1(b, l + 1);
    r = r && consumeToken(b, EXIT_INTERPOLATION);
    exit_section_(b, m, INTERPOLATION, r);
    return r;
  }

  // Expression?
  private static boolean Interpolation_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Interpolation_1")) return false;
    Expression(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // StringLit | (PLUS|MINUS)? NUMBER NumAppendix? | NULL_KW | THIS_KW | TRUE_KW | FALSE_KW
  public static boolean Literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Literal")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITERAL, "<literal>");
    r = StringLit(b, l + 1);
    if (!r) r = Literal_1(b, l + 1);
    if (!r) r = consumeToken(b, NULL_KW);
    if (!r) r = consumeToken(b, THIS_KW);
    if (!r) r = consumeToken(b, TRUE_KW);
    if (!r) r = consumeToken(b, FALSE_KW);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (PLUS|MINUS)? NUMBER NumAppendix?
  private static boolean Literal_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Literal_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Literal_1_0(b, l + 1);
    r = r && consumeToken(b, NUMBER);
    r = r && Literal_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (PLUS|MINUS)?
  private static boolean Literal_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Literal_1_0")) return false;
    Literal_1_0_0(b, l + 1);
    return true;
  }

  // PLUS|MINUS
  private static boolean Literal_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Literal_1_0_0")) return false;
    boolean r;
    r = consumeToken(b, PLUS);
    if (!r) r = consumeToken(b, MINUS);
    return r;
  }

  // NumAppendix?
  private static boolean Literal_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Literal_1_2")) return false;
    NumAppendix(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // IdentOrKeyword
  public static boolean MethodIdent(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MethodIdent")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, METHOD_IDENT, "<method ident>");
    r = IdentOrKeyword(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // PragmaStmt | UseStmt | FnDecl | TypeDecl | EnumDecl | TypeAlias | VarDecl | EmptyStmt
  public static boolean ModuleStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ModuleStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MODULE_STATEMENT, "<module statement>");
    r = PragmaStmt(b, l + 1);
    if (!r) r = UseStmt(b, l + 1);
    if (!r) r = FnDecl(b, l + 1);
    if (!r) r = TypeDecl(b, l + 1);
    if (!r) r = EnumDecl(b, l + 1);
    if (!r) r = TypeAlias(b, l + 1);
    if (!r) r = VarDecl(b, l + 1);
    if (!r) r = EmptyStmt(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TypeIdent LCURLY Arguments? COMMA? RCURLY
  public static boolean NativeObjExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NativeObjExpr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NATIVE_OBJ_EXPR, "<native obj expr>");
    r = TypeIdent(b, l + 1);
    r = r && consumeToken(b, LCURLY);
    r = r && NativeObjExpr_2(b, l + 1);
    r = r && NativeObjExpr_3(b, l + 1);
    r = r && consumeToken(b, RCURLY);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Arguments?
  private static boolean NativeObjExpr_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NativeObjExpr_2")) return false;
    Arguments(b, l + 1);
    return true;
  }

  // COMMA?
  private static boolean NativeObjExpr_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NativeObjExpr_3")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // D_US|D_MS|D_S|D_MIN|D_HR|D_DAY|'f'|NODE_ID|NODE_TIME_ID|NODE_GEO_ID|NODE_LIST_ID|NODE_INDEX_ID|TIME_ID
  public static boolean NumAppendix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NumAppendix")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NUM_APPENDIX, "<num appendix>");
    r = consumeToken(b, D_US);
    if (!r) r = consumeToken(b, D_MS);
    if (!r) r = consumeToken(b, D_S);
    if (!r) r = consumeToken(b, D_MIN);
    if (!r) r = consumeToken(b, D_HR);
    if (!r) r = consumeToken(b, D_DAY);
    if (!r) r = consumeToken(b, "f");
    if (!r) r = consumeToken(b, NODE_ID);
    if (!r) r = consumeToken(b, NODE_TIME_ID);
    if (!r) r = consumeToken(b, NODE_GEO_ID);
    if (!r) r = consumeToken(b, NODE_LIST_ID);
    if (!r) r = consumeToken(b, NODE_INDEX_ID);
    if (!r) r = consumeToken(b, TIME_ID);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TypeIdent? LCURLY ObjectProps? RCURLY
  public static boolean ObjectExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectExpr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OBJECT_EXPR, "<object expr>");
    r = ObjectExpr_0(b, l + 1);
    r = r && consumeToken(b, LCURLY);
    r = r && ObjectExpr_2(b, l + 1);
    r = r && consumeToken(b, RCURLY);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // TypeIdent?
  private static boolean ObjectExpr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectExpr_0")) return false;
    TypeIdent(b, l + 1);
    return true;
  }

  // ObjectProps?
  private static boolean ObjectExpr_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectExpr_2")) return false;
    ObjectProps(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // ObjectPropIdent COLON Expression
  public static boolean ObjectProp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectProp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OBJECT_PROP, "<object prop>");
    r = ObjectPropIdent(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && Expression(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // IdentOrKeyword | STRING
  public static boolean ObjectPropIdent(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectPropIdent")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OBJECT_PROP_IDENT, "<object prop ident>");
    r = IdentOrKeyword(b, l + 1);
    if (!r) r = consumeToken(b, STRING);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ObjectProp (COMMA ObjectProp)* COMMA?
  public static boolean ObjectProps(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectProps")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OBJECT_PROPS, "<object props>");
    r = ObjectProp(b, l + 1);
    r = r && ObjectProps_1(b, l + 1);
    r = r && ObjectProps_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (COMMA ObjectProp)*
  private static boolean ObjectProps_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectProps_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!ObjectProps_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "ObjectProps_1", c)) break;
    }
    return true;
  }

  // COMMA ObjectProp
  private static boolean ObjectProps_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectProps_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && ObjectProp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA?
  private static boolean ObjectProps_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ObjectProps_2")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // QUESTION? LSQUARE Expression RSQUARE
  public static boolean OffsetAccess(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OffsetAccess")) return false;
    if (!nextTokenIs(b, "<offset access>", LSQUARE, QUESTION)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OFFSET_ACCESS, "<offset access>");
    r = OffsetAccess_0(b, l + 1);
    r = r && consumeToken(b, LSQUARE);
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, RSQUARE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // QUESTION?
  private static boolean OffsetAccess_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OffsetAccess_0")) return false;
    consumeToken(b, QUESTION);
    return true;
  }

  /* ********************************************************** */
  // LPAREN Expression RPAREN
  public static boolean ParenExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ParenExpr")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, PAREN_EXPR, r);
    return r;
  }

  /* ********************************************************** */
  // PrefixExpr (PLUS_PLUS | MINUS_MINUS)?
  public static boolean PostfixExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PostfixExpr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, POSTFIX_EXPR, "<postfix expr>");
    r = PrefixExpr(b, l + 1);
    r = r && PostfixExpr_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (PLUS_PLUS | MINUS_MINUS)?
  private static boolean PostfixExpr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PostfixExpr_1")) return false;
    PostfixExpr_1_0(b, l + 1);
    return true;
  }

  // PLUS_PLUS | MINUS_MINUS
  private static boolean PostfixExpr_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PostfixExpr_1_0")) return false;
    boolean r;
    r = consumeToken(b, PLUS_PLUS);
    if (!r) r = consumeToken(b, MINUS_MINUS);
    return r;
  }

  /* ********************************************************** */
  // PragmaIdent PragmaArgs?
  public static boolean Pragma(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Pragma")) return false;
    if (!nextTokenIs(b, AT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = PragmaIdent(b, l + 1);
    r = r && Pragma_1(b, l + 1);
    exit_section_(b, m, PRAGMA, r);
    return r;
  }

  // PragmaArgs?
  private static boolean Pragma_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Pragma_1")) return false;
    PragmaArgs(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // LPAREN Literal (COMMA Literal)* RPAREN
  public static boolean PragmaArgs(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PragmaArgs")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && Literal(b, l + 1);
    r = r && PragmaArgs_2(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, PRAGMA_ARGS, r);
    return r;
  }

  // (COMMA Literal)*
  private static boolean PragmaArgs_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PragmaArgs_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!PragmaArgs_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "PragmaArgs_2", c)) break;
    }
    return true;
  }

  // COMMA Literal
  private static boolean PragmaArgs_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PragmaArgs_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && Literal(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // AT IdentOrKeyword
  public static boolean PragmaIdent(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PragmaIdent")) return false;
    if (!nextTokenIs(b, AT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AT);
    r = r && IdentOrKeyword(b, l + 1);
    exit_section_(b, m, PRAGMA_IDENT, r);
    return r;
  }

  /* ********************************************************** */
  // Pragma SEMI
  public static boolean PragmaStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PragmaStmt")) return false;
    if (!nextTokenIs(b, AT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Pragma(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, m, PRAGMA_STMT, r);
    return r;
  }

  /* ********************************************************** */
  // Pragma+
  public static boolean Pragmas(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Pragmas")) return false;
    if (!nextTokenIs(b, AT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = Pragma(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!Pragma(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "Pragmas", c)) break;
    }
    exit_section_(b, m, PRAGMAS, r);
    return r;
  }

  /* ********************************************************** */
  // (NOT | STAR | PLUS | MINUS | PLUS_PLUS | MINUS_MINUS)? CallExpr
  public static boolean PrefixExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PrefixExpr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PREFIX_EXPR, "<prefix expr>");
    r = PrefixExpr_0(b, l + 1);
    r = r && CallExpr(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (NOT | STAR | PLUS | MINUS | PLUS_PLUS | MINUS_MINUS)?
  private static boolean PrefixExpr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PrefixExpr_0")) return false;
    PrefixExpr_0_0(b, l + 1);
    return true;
  }

  // NOT | STAR | PLUS | MINUS | PLUS_PLUS | MINUS_MINUS
  private static boolean PrefixExpr_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PrefixExpr_0_0")) return false;
    boolean r;
    r = consumeToken(b, NOT);
    if (!r) r = consumeToken(b, STAR);
    if (!r) r = consumeToken(b, PLUS);
    if (!r) r = consumeToken(b, MINUS);
    if (!r) r = consumeToken(b, PLUS_PLUS);
    if (!r) r = consumeToken(b, MINUS_MINUS);
    return r;
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
  public static boolean PrimaryExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PrimaryExpr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PRIMARY_EXPR, "<primary expr>");
    r = Literal(b, l + 1);
    if (!r) r = FnExpr(b, l + 1);
    if (!r) r = TupleExpr(b, l + 1);
    if (!r) r = NativeObjExpr(b, l + 1);
    if (!r) r = ShortArrayExpr(b, l + 1);
    if (!r) r = TableExpr(b, l + 1);
    if (!r) r = ParenExpr(b, l + 1);
    if (!r) r = ObjectExpr(b, l + 1);
    if (!r) r = IdentOrKeywordOrStrLit(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // QUESTION? (DOT | ARROW) IdentOrKeywordOrStrLit
  public static boolean PropAccess(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PropAccess")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROP_ACCESS, "<prop access>");
    r = PropAccess_0(b, l + 1);
    r = r && PropAccess_1(b, l + 1);
    r = r && IdentOrKeywordOrStrLit(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // QUESTION?
  private static boolean PropAccess_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PropAccess_0")) return false;
    consumeToken(b, QUESTION);
    return true;
  }

  // DOT | ARROW
  private static boolean PropAccess_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PropAccess_1")) return false;
    boolean r;
    r = consumeToken(b, DOT);
    if (!r) r = consumeToken(b, ARROW);
    return r;
  }

  /* ********************************************************** */
  // (LSQUARE|RSQUARE) Expression? DOT_DOT Expression? (LSQUARE|RSQUARE)
  public static boolean RangeAccess(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RangeAccess")) return false;
    if (!nextTokenIs(b, "<range access>", LSQUARE, RSQUARE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RANGE_ACCESS, "<range access>");
    r = RangeAccess_0(b, l + 1);
    r = r && RangeAccess_1(b, l + 1);
    r = r && consumeToken(b, DOT_DOT);
    r = r && RangeAccess_3(b, l + 1);
    r = r && RangeAccess_4(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // LSQUARE|RSQUARE
  private static boolean RangeAccess_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RangeAccess_0")) return false;
    boolean r;
    r = consumeToken(b, LSQUARE);
    if (!r) r = consumeToken(b, RSQUARE);
    return r;
  }

  // Expression?
  private static boolean RangeAccess_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RangeAccess_1")) return false;
    Expression(b, l + 1);
    return true;
  }

  // Expression?
  private static boolean RangeAccess_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RangeAccess_3")) return false;
    Expression(b, l + 1);
    return true;
  }

  // LSQUARE|RSQUARE
  private static boolean RangeAccess_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RangeAccess_4")) return false;
    boolean r;
    r = consumeToken(b, LSQUARE);
    if (!r) r = consumeToken(b, RSQUARE);
    return r;
  }

  /* ********************************************************** */
  // RETURN_KW Expression? SEMI
  public static boolean ReturnStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReturnStmt")) return false;
    if (!nextTokenIs(b, RETURN_KW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, RETURN_KW);
    r = r && ReturnStmt_1(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, m, RETURN_STMT, r);
    return r;
  }

  // Expression?
  private static boolean ReturnStmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ReturnStmt_1")) return false;
    Expression(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // LSQUARE Arguments? COMMA? RSQUARE
  public static boolean ShortArrayExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ShortArrayExpr")) return false;
    if (!nextTokenIs(b, LSQUARE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LSQUARE);
    r = r && ShortArrayExpr_1(b, l + 1);
    r = r && ShortArrayExpr_2(b, l + 1);
    r = r && consumeToken(b, RSQUARE);
    exit_section_(b, m, SHORT_ARRAY_EXPR, r);
    return r;
  }

  // Arguments?
  private static boolean ShortArrayExpr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ShortArrayExpr_1")) return false;
    Arguments(b, l + 1);
    return true;
  }

  // COMMA?
  private static boolean ShortArrayExpr_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ShortArrayExpr_2")) return false;
    consumeToken(b, COMMA);
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
  public static boolean Statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "Statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT, "<statement>");
    r = VarDecl(b, l + 1);
    if (!r) r = ReturnStmt(b, l + 1);
    if (!r) r = TryStmt(b, l + 1);
    if (!r) r = ThrowStmt(b, l + 1);
    if (!r) r = IfStmt(b, l + 1);
    if (!r) r = WhileStmt(b, l + 1);
    if (!r) r = DoWhileStmt(b, l + 1);
    if (!r) r = ForStmt(b, l + 1);
    if (!r) r = ForInStmt(b, l + 1);
    if (!r) r = BreakStmt(b, l + 1);
    if (!r) r = ContinueStmt(b, l + 1);
    if (!r) r = AtStmt(b, l + 1);
    if (!r) r = ExprStmt(b, l + 1);
    if (!r) r = BlockStmt(b, l + 1);
    if (!r) r = EmptyStmt(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // COLON_COLON (TypeSpecifier COLON_COLON)? StaticPropIdent
  public static boolean StaticAccess(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StaticAccess")) return false;
    if (!nextTokenIs(b, COLON_COLON)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON_COLON);
    r = r && StaticAccess_1(b, l + 1);
    r = r && StaticPropIdent(b, l + 1);
    exit_section_(b, m, STATIC_ACCESS, r);
    return r;
  }

  // (TypeSpecifier COLON_COLON)?
  private static boolean StaticAccess_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StaticAccess_1")) return false;
    StaticAccess_1_0(b, l + 1);
    return true;
  }

  // TypeSpecifier COLON_COLON
  private static boolean StaticAccess_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StaticAccess_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = TypeSpecifier(b, l + 1);
    r = r && consumeToken(b, COLON_COLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IdentOrKeywordOrStrLit
  public static boolean StaticPropIdent(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StaticPropIdent")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATIC_PROP_IDENT, "<static prop ident>");
    r = IdentOrKeywordOrStrLit(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TemplateString | STRING
  public static boolean StringLit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "StringLit")) return false;
    if (!nextTokenIs(b, "<string lit>", DQUOTE, STRING)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRING_LIT, "<string lit>");
    r = TemplateString(b, l + 1);
    if (!r) r = consumeToken(b, STRING);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TypeIdent LCURLY TableExprRows? COMMA? RCURLY
  public static boolean TableExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TableExpr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TABLE_EXPR, "<table expr>");
    r = TypeIdent(b, l + 1);
    r = r && consumeToken(b, LCURLY);
    r = r && TableExpr_2(b, l + 1);
    r = r && TableExpr_3(b, l + 1);
    r = r && consumeToken(b, RCURLY);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // TableExprRows?
  private static boolean TableExpr_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TableExpr_2")) return false;
    TableExprRows(b, l + 1);
    return true;
  }

  // COMMA?
  private static boolean TableExpr_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TableExpr_3")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // ShortArrayExpr (COMMA ShortArrayExpr)*
  public static boolean TableExprRows(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TableExprRows")) return false;
    if (!nextTokenIs(b, LSQUARE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ShortArrayExpr(b, l + 1);
    r = r && TableExprRows_1(b, l + 1);
    exit_section_(b, m, TABLE_EXPR_ROWS, r);
    return r;
  }

  // (COMMA ShortArrayExpr)*
  private static boolean TableExprRows_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TableExprRows_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!TableExprRows_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TableExprRows_1", c)) break;
    }
    return true;
  }

  // COMMA ShortArrayExpr
  private static boolean TableExprRows_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TableExprRows_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && ShortArrayExpr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // DQUOTE (RAW_STRING | Interpolation)* DQUOTE
  public static boolean TemplateString(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateString")) return false;
    if (!nextTokenIs(b, DQUOTE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DQUOTE);
    r = r && TemplateString_1(b, l + 1);
    r = r && consumeToken(b, DQUOTE);
    exit_section_(b, m, TEMPLATE_STRING, r);
    return r;
  }

  // (RAW_STRING | Interpolation)*
  private static boolean TemplateString_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateString_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!TemplateString_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TemplateString_1", c)) break;
    }
    return true;
  }

  // RAW_STRING | Interpolation
  private static boolean TemplateString_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TemplateString_1_0")) return false;
    boolean r;
    r = consumeToken(b, RAW_STRING);
    if (!r) r = Interpolation(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // THROW_KW Expression SEMI
  public static boolean ThrowStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ThrowStmt")) return false;
    if (!nextTokenIs(b, THROW_KW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, THROW_KW);
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, m, THROW_STMT, r);
    return r;
  }

  /* ********************************************************** */
  // TRY_KW Block CatchStmt
  public static boolean TryStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TryStmt")) return false;
    if (!nextTokenIs(b, TRY_KW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, TRY_KW);
    r = r && Block(b, l + 1);
    r = r && CatchStmt(b, l + 1);
    exit_section_(b, m, TRY_STMT, r);
    return r;
  }

  /* ********************************************************** */
  // LPAREN Expression COMMA Expression COMMA? RPAREN
  public static boolean TupleExpr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TupleExpr")) return false;
    if (!nextTokenIs(b, LPAREN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LPAREN);
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, COMMA);
    r = r && Expression(b, l + 1);
    r = r && TupleExpr_4(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    exit_section_(b, m, TUPLE_EXPR, r);
    return r;
  }

  // COMMA?
  private static boolean TupleExpr_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TupleExpr_4")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // TypeSpecifier (BAR TypeSpecifier)* SEMI
  public static boolean TypeAlias(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeAlias")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_ALIAS, "<type alias>");
    r = TypeSpecifier(b, l + 1);
    r = r && TypeAlias_1(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (BAR TypeSpecifier)*
  private static boolean TypeAlias_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeAlias_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!TypeAlias_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TypeAlias_1", c)) break;
    }
    return true;
  }

  // BAR TypeSpecifier
  private static boolean TypeAlias_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeAlias_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, BAR);
    r = r && TypeSpecifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Pragmas? Flags? AttrIdent TypeSpec Initializer? SEMI
  public static boolean TypeAttr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeAttr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_ATTR, "<type attr>");
    r = TypeAttr_0(b, l + 1);
    r = r && TypeAttr_1(b, l + 1);
    r = r && AttrIdent(b, l + 1);
    r = r && TypeSpec(b, l + 1);
    r = r && TypeAttr_4(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Pragmas?
  private static boolean TypeAttr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeAttr_0")) return false;
    Pragmas(b, l + 1);
    return true;
  }

  // Flags?
  private static boolean TypeAttr_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeAttr_1")) return false;
    Flags(b, l + 1);
    return true;
  }

  // Initializer?
  private static boolean TypeAttr_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeAttr_4")) return false;
    Initializer(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // Pragmas? PRIVATE_KW? ABSTRACT_KW? NATIVE_KW? TYPE_KW TypeIdent GenericParams? TypeExtends? LCURLY TypeField* RCURLY
  public static boolean TypeDecl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeDecl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_DECL, "<type decl>");
    r = TypeDecl_0(b, l + 1);
    r = r && TypeDecl_1(b, l + 1);
    r = r && TypeDecl_2(b, l + 1);
    r = r && TypeDecl_3(b, l + 1);
    r = r && consumeToken(b, TYPE_KW);
    r = r && TypeIdent(b, l + 1);
    r = r && TypeDecl_6(b, l + 1);
    r = r && TypeDecl_7(b, l + 1);
    r = r && consumeToken(b, LCURLY);
    r = r && TypeDecl_9(b, l + 1);
    r = r && consumeToken(b, RCURLY);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Pragmas?
  private static boolean TypeDecl_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeDecl_0")) return false;
    Pragmas(b, l + 1);
    return true;
  }

  // PRIVATE_KW?
  private static boolean TypeDecl_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeDecl_1")) return false;
    consumeToken(b, PRIVATE_KW);
    return true;
  }

  // ABSTRACT_KW?
  private static boolean TypeDecl_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeDecl_2")) return false;
    consumeToken(b, ABSTRACT_KW);
    return true;
  }

  // NATIVE_KW?
  private static boolean TypeDecl_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeDecl_3")) return false;
    consumeToken(b, NATIVE_KW);
    return true;
  }

  // GenericParams?
  private static boolean TypeDecl_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeDecl_6")) return false;
    GenericParams(b, l + 1);
    return true;
  }

  // TypeExtends?
  private static boolean TypeDecl_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeDecl_7")) return false;
    TypeExtends(b, l + 1);
    return true;
  }

  // TypeField*
  private static boolean TypeDecl_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeDecl_9")) return false;
    while (true) {
      int c = current_position_(b);
      if (!TypeField(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TypeDecl_9", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // EXTENDS_KW TypeSpecifier
  public static boolean TypeExtends(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeExtends")) return false;
    if (!nextTokenIs(b, EXTENDS_KW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EXTENDS_KW);
    r = r && TypeSpecifier(b, l + 1);
    exit_section_(b, m, TYPE_EXTENDS, r);
    return r;
  }

  /* ********************************************************** */
  // TypeAttr | TypeMethod
  public static boolean TypeField(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeField")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_FIELD, "<type field>");
    r = TypeAttr(b, l + 1);
    if (!r) r = TypeMethod(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // TYPE_OF_KW? (IdentOrKeyword (LT TypeIdent (COMMA TypeIdent)* GT)? COLON_COLON)? IdentOrKeyword (LT TypeIdent (COMMA TypeIdent)* GT)? QUESTION?
  public static boolean TypeIdent(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeIdent")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_IDENT, "<type ident>");
    r = TypeIdent_0(b, l + 1);
    r = r && TypeIdent_1(b, l + 1);
    r = r && IdentOrKeyword(b, l + 1);
    r = r && TypeIdent_3(b, l + 1);
    r = r && TypeIdent_4(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // TYPE_OF_KW?
  private static boolean TypeIdent_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeIdent_0")) return false;
    consumeToken(b, TYPE_OF_KW);
    return true;
  }

  // (IdentOrKeyword (LT TypeIdent (COMMA TypeIdent)* GT)? COLON_COLON)?
  private static boolean TypeIdent_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeIdent_1")) return false;
    TypeIdent_1_0(b, l + 1);
    return true;
  }

  // IdentOrKeyword (LT TypeIdent (COMMA TypeIdent)* GT)? COLON_COLON
  private static boolean TypeIdent_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeIdent_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = IdentOrKeyword(b, l + 1);
    r = r && TypeIdent_1_0_1(b, l + 1);
    r = r && consumeToken(b, COLON_COLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // (LT TypeIdent (COMMA TypeIdent)* GT)?
  private static boolean TypeIdent_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeIdent_1_0_1")) return false;
    TypeIdent_1_0_1_0(b, l + 1);
    return true;
  }

  // LT TypeIdent (COMMA TypeIdent)* GT
  private static boolean TypeIdent_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeIdent_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LT);
    r = r && TypeIdent(b, l + 1);
    r = r && TypeIdent_1_0_1_0_2(b, l + 1);
    r = r && consumeToken(b, GT);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA TypeIdent)*
  private static boolean TypeIdent_1_0_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeIdent_1_0_1_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!TypeIdent_1_0_1_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TypeIdent_1_0_1_0_2", c)) break;
    }
    return true;
  }

  // COMMA TypeIdent
  private static boolean TypeIdent_1_0_1_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeIdent_1_0_1_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && TypeIdent(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (LT TypeIdent (COMMA TypeIdent)* GT)?
  private static boolean TypeIdent_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeIdent_3")) return false;
    TypeIdent_3_0(b, l + 1);
    return true;
  }

  // LT TypeIdent (COMMA TypeIdent)* GT
  private static boolean TypeIdent_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeIdent_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LT);
    r = r && TypeIdent(b, l + 1);
    r = r && TypeIdent_3_0_2(b, l + 1);
    r = r && consumeToken(b, GT);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA TypeIdent)*
  private static boolean TypeIdent_3_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeIdent_3_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!TypeIdent_3_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TypeIdent_3_0_2", c)) break;
    }
    return true;
  }

  // COMMA TypeIdent
  private static boolean TypeIdent_3_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeIdent_3_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && TypeIdent(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // QUESTION?
  private static boolean TypeIdent_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeIdent_4")) return false;
    consumeToken(b, QUESTION);
    return true;
  }

  /* ********************************************************** */
  // Pragmas? Flags* FnOrTask MethodIdent GenericParams? LPAREN FnParams? RPAREN TypeSpec? (Block | SEMI)
  public static boolean TypeMethod(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeMethod")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_METHOD, "<type method>");
    r = TypeMethod_0(b, l + 1);
    r = r && TypeMethod_1(b, l + 1);
    r = r && FnOrTask(b, l + 1);
    r = r && MethodIdent(b, l + 1);
    r = r && TypeMethod_4(b, l + 1);
    r = r && consumeToken(b, LPAREN);
    r = r && TypeMethod_6(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    r = r && TypeMethod_8(b, l + 1);
    r = r && TypeMethod_9(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Pragmas?
  private static boolean TypeMethod_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeMethod_0")) return false;
    Pragmas(b, l + 1);
    return true;
  }

  // Flags*
  private static boolean TypeMethod_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeMethod_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!Flags(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TypeMethod_1", c)) break;
    }
    return true;
  }

  // GenericParams?
  private static boolean TypeMethod_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeMethod_4")) return false;
    GenericParams(b, l + 1);
    return true;
  }

  // FnParams?
  private static boolean TypeMethod_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeMethod_6")) return false;
    FnParams(b, l + 1);
    return true;
  }

  // TypeSpec?
  private static boolean TypeMethod_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeMethod_8")) return false;
    TypeSpec(b, l + 1);
    return true;
  }

  // Block | SEMI
  private static boolean TypeMethod_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeMethod_9")) return false;
    boolean r;
    r = Block(b, l + 1);
    if (!r) r = consumeToken(b, SEMI);
    return r;
  }

  /* ********************************************************** */
  // COLON TypeSpecifier
  public static boolean TypeSpec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeSpec")) return false;
    if (!nextTokenIs(b, COLON)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && TypeSpecifier(b, l + 1);
    exit_section_(b, m, TYPE_SPEC, r);
    return r;
  }

  /* ********************************************************** */
  // TypeSpecifier (COMMA TypeSpecifier)*
  public static boolean TypeSpecList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeSpecList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_SPEC_LIST, "<type spec list>");
    r = TypeSpecifier(b, l + 1);
    r = r && TypeSpecList_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (COMMA TypeSpecifier)*
  private static boolean TypeSpecList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeSpecList_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!TypeSpecList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "TypeSpecList_1", c)) break;
    }
    return true;
  }

  // COMMA TypeSpecifier
  private static boolean TypeSpecList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeSpecList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && TypeSpecifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TYPE_OF_KW? (IdentOrKeyword COLON_COLON)? IdentOrKeyword (LT TypeSpecList GT)? QUESTION?
  public static boolean TypeSpecifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeSpecifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_SPECIFIER, "<type specifier>");
    r = TypeSpecifier_0(b, l + 1);
    r = r && TypeSpecifier_1(b, l + 1);
    r = r && IdentOrKeyword(b, l + 1);
    r = r && TypeSpecifier_3(b, l + 1);
    r = r && TypeSpecifier_4(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // TYPE_OF_KW?
  private static boolean TypeSpecifier_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeSpecifier_0")) return false;
    consumeToken(b, TYPE_OF_KW);
    return true;
  }

  // (IdentOrKeyword COLON_COLON)?
  private static boolean TypeSpecifier_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeSpecifier_1")) return false;
    TypeSpecifier_1_0(b, l + 1);
    return true;
  }

  // IdentOrKeyword COLON_COLON
  private static boolean TypeSpecifier_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeSpecifier_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = IdentOrKeyword(b, l + 1);
    r = r && consumeToken(b, COLON_COLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // (LT TypeSpecList GT)?
  private static boolean TypeSpecifier_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeSpecifier_3")) return false;
    TypeSpecifier_3_0(b, l + 1);
    return true;
  }

  // LT TypeSpecList GT
  private static boolean TypeSpecifier_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeSpecifier_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LT);
    r = r && TypeSpecList(b, l + 1);
    r = r && consumeToken(b, GT);
    exit_section_(b, m, null, r);
    return r;
  }

  // QUESTION?
  private static boolean TypeSpecifier_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TypeSpecifier_4")) return false;
    consumeToken(b, QUESTION);
    return true;
  }

  /* ********************************************************** */
  // USE_KW IDENTIFIER SEMI
  //           | USE_KW IDENTIFIER COLON_COLON IDENTIFIER (AS_KW IDENTIFIER)? SEMI
  //           | USE_KW IDENTIFIER WITHOUT_KW IDENTIFIER (COMMA IDENTIFIER)* SEMI
  public static boolean UseStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UseStmt")) return false;
    if (!nextTokenIs(b, USE_KW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parseTokens(b, 0, USE_KW, IDENTIFIER, SEMI);
    if (!r) r = UseStmt_1(b, l + 1);
    if (!r) r = UseStmt_2(b, l + 1);
    exit_section_(b, m, USE_STMT, r);
    return r;
  }

  // USE_KW IDENTIFIER COLON_COLON IDENTIFIER (AS_KW IDENTIFIER)? SEMI
  private static boolean UseStmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UseStmt_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, USE_KW, IDENTIFIER, COLON_COLON, IDENTIFIER);
    r = r && UseStmt_1_4(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, m, null, r);
    return r;
  }

  // (AS_KW IDENTIFIER)?
  private static boolean UseStmt_1_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UseStmt_1_4")) return false;
    UseStmt_1_4_0(b, l + 1);
    return true;
  }

  // AS_KW IDENTIFIER
  private static boolean UseStmt_1_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UseStmt_1_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, AS_KW, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  // USE_KW IDENTIFIER WITHOUT_KW IDENTIFIER (COMMA IDENTIFIER)* SEMI
  private static boolean UseStmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UseStmt_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, USE_KW, IDENTIFIER, WITHOUT_KW, IDENTIFIER);
    r = r && UseStmt_2_4(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA IDENTIFIER)*
  private static boolean UseStmt_2_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UseStmt_2_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!UseStmt_2_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "UseStmt_2_4", c)) break;
    }
    return true;
  }

  // COMMA IDENTIFIER
  private static boolean UseStmt_2_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "UseStmt_2_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, COMMA, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // Pragmas? VAR_KW VarDeclIdent TypeSpec? Initializer? SEMI
  public static boolean VarDecl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VarDecl")) return false;
    if (!nextTokenIs(b, "<var decl>", AT, VAR_KW)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VAR_DECL, "<var decl>");
    r = VarDecl_0(b, l + 1);
    r = r && consumeToken(b, VAR_KW);
    r = r && VarDeclIdent(b, l + 1);
    r = r && VarDecl_3(b, l + 1);
    r = r && VarDecl_4(b, l + 1);
    r = r && consumeToken(b, SEMI);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // Pragmas?
  private static boolean VarDecl_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VarDecl_0")) return false;
    Pragmas(b, l + 1);
    return true;
  }

  // TypeSpec?
  private static boolean VarDecl_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VarDecl_3")) return false;
    TypeSpec(b, l + 1);
    return true;
  }

  // Initializer?
  private static boolean VarDecl_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VarDecl_4")) return false;
    Initializer(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean VarDeclIdent(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VarDeclIdent")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, VAR_DECL_IDENT, r);
    return r;
  }

  /* ********************************************************** */
  // WHILE_KW LPAREN Expression RPAREN Block
  public static boolean WhileStmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WhileStmt")) return false;
    if (!nextTokenIs(b, WHILE_KW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, WHILE_KW, LPAREN);
    r = r && Expression(b, l + 1);
    r = r && consumeToken(b, RPAREN);
    r = r && Block(b, l + 1);
    exit_section_(b, m, WHILE_STMT, r);
    return r;
  }

}
