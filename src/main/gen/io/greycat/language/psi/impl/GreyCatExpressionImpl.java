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

public class GreyCatExpressionImpl extends ASTWrapperPsiElement implements GreyCatExpression {

  public GreyCatExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull GreyCatVisitor visitor) {
    visitor.visitExpression(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GreyCatVisitor) accept((GreyCatVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<GreyCatBinOp> getBinOpList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, GreyCatBinOp.class);
  }

  @Override
  @NotNull
  public List<GreyCatPostfixExpr> getPostfixExprList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, GreyCatPostfixExpr.class);
  }

  @Override
  @NotNull
  public List<GreyCatTypeSpecifier> getTypeSpecifierList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, GreyCatTypeSpecifier.class);
  }

}
