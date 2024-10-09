// This is a generated file. Not intended for manual editing.
package io.greycat.language.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static io.greycat.language.psi.GreyCatTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import io.greycat.language.psi.*;

public class GreyCatPrimaryExprImpl extends ASTWrapperPsiElement implements GreyCatPrimaryExpr {

  public GreyCatPrimaryExprImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull GreyCatVisitor visitor) {
    visitor.visitPrimaryExpr(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GreyCatVisitor) accept((GreyCatVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public GreyCatArrayExpr getArrayExpr() {
    return findChildByClass(GreyCatArrayExpr.class);
  }

  @Override
  @Nullable
  public GreyCatFnExpr getFnExpr() {
    return findChildByClass(GreyCatFnExpr.class);
  }

  @Override
  @Nullable
  public GreyCatIdentOrKeywordOrStrLit getIdentOrKeywordOrStrLit() {
    return findChildByClass(GreyCatIdentOrKeywordOrStrLit.class);
  }

  @Override
  @Nullable
  public GreyCatLiteral getLiteral() {
    return findChildByClass(GreyCatLiteral.class);
  }

  @Override
  @Nullable
  public GreyCatObjectExpr getObjectExpr() {
    return findChildByClass(GreyCatObjectExpr.class);
  }

  @Override
  @Nullable
  public GreyCatOneFieldObj getOneFieldObj() {
    return findChildByClass(GreyCatOneFieldObj.class);
  }

  @Override
  @Nullable
  public GreyCatParenExpr getParenExpr() {
    return findChildByClass(GreyCatParenExpr.class);
  }

  @Override
  @Nullable
  public GreyCatTableExpr getTableExpr() {
    return findChildByClass(GreyCatTableExpr.class);
  }

  @Override
  @Nullable
  public GreyCatThreeFieldsObj getThreeFieldsObj() {
    return findChildByClass(GreyCatThreeFieldsObj.class);
  }

  @Override
  @Nullable
  public GreyCatTupleExpr getTupleExpr() {
    return findChildByClass(GreyCatTupleExpr.class);
  }

  @Override
  @Nullable
  public GreyCatTwoFieldsObj getTwoFieldsObj() {
    return findChildByClass(GreyCatTwoFieldsObj.class);
  }

}
