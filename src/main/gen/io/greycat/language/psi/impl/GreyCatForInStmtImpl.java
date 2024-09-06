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

public class GreyCatForInStmtImpl extends ASTWrapperPsiElement implements GreyCatForInStmt {

  public GreyCatForInStmtImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull GreyCatVisitor visitor) {
    visitor.visitForInStmt(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GreyCatVisitor) accept((GreyCatVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public GreyCatBlock getBlock() {
    return findNotNullChildByClass(GreyCatBlock.class);
  }

  @Override
  @NotNull
  public GreyCatForExpr getForExpr() {
    return findNotNullChildByClass(GreyCatForExpr.class);
  }

  @Override
  @Nullable
  public GreyCatForInLimit getForInLimit() {
    return findChildByClass(GreyCatForInLimit.class);
  }

  @Override
  @NotNull
  public GreyCatForInParams getForInParams() {
    return findNotNullChildByClass(GreyCatForInParams.class);
  }

  @Override
  @Nullable
  public GreyCatForInSampling getForInSampling() {
    return findChildByClass(GreyCatForInSampling.class);
  }

  @Override
  @Nullable
  public GreyCatForInSkip getForInSkip() {
    return findChildByClass(GreyCatForInSkip.class);
  }

}
