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

public class GreyCatElseStmtImpl extends ASTWrapperPsiElement implements GreyCatElseStmt {

  public GreyCatElseStmtImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull GreyCatVisitor visitor) {
    visitor.visitElseStmt(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GreyCatVisitor) accept((GreyCatVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public GreyCatBlock getBlock() {
    return findChildByClass(GreyCatBlock.class);
  }

  @Override
  @Nullable
  public GreyCatIfStmt getIfStmt() {
    return findChildByClass(GreyCatIfStmt.class);
  }

}
