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

public class GreyCatStatementImpl extends ASTWrapperPsiElement implements GreyCatStatement {

  public GreyCatStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull GreyCatVisitor visitor) {
    visitor.visitStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GreyCatVisitor) accept((GreyCatVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public GreyCatAtStmt getAtStmt() {
    return findChildByClass(GreyCatAtStmt.class);
  }

  @Override
  @Nullable
  public GreyCatBlockStmt getBlockStmt() {
    return findChildByClass(GreyCatBlockStmt.class);
  }

  @Override
  @Nullable
  public GreyCatBreakStmt getBreakStmt() {
    return findChildByClass(GreyCatBreakStmt.class);
  }

  @Override
  @Nullable
  public GreyCatContinueStmt getContinueStmt() {
    return findChildByClass(GreyCatContinueStmt.class);
  }

  @Override
  @Nullable
  public GreyCatDoWhileStmt getDoWhileStmt() {
    return findChildByClass(GreyCatDoWhileStmt.class);
  }

  @Override
  @Nullable
  public GreyCatEmptyStmt getEmptyStmt() {
    return findChildByClass(GreyCatEmptyStmt.class);
  }

  @Override
  @Nullable
  public GreyCatExprStmt getExprStmt() {
    return findChildByClass(GreyCatExprStmt.class);
  }

  @Override
  @Nullable
  public GreyCatForInStmt getForInStmt() {
    return findChildByClass(GreyCatForInStmt.class);
  }

  @Override
  @Nullable
  public GreyCatForStmt getForStmt() {
    return findChildByClass(GreyCatForStmt.class);
  }

  @Override
  @Nullable
  public GreyCatIfStmt getIfStmt() {
    return findChildByClass(GreyCatIfStmt.class);
  }

  @Override
  @Nullable
  public GreyCatReturnStmt getReturnStmt() {
    return findChildByClass(GreyCatReturnStmt.class);
  }

  @Override
  @Nullable
  public GreyCatThrowStmt getThrowStmt() {
    return findChildByClass(GreyCatThrowStmt.class);
  }

  @Override
  @Nullable
  public GreyCatTryStmt getTryStmt() {
    return findChildByClass(GreyCatTryStmt.class);
  }

  @Override
  @Nullable
  public GreyCatVarDecl getVarDecl() {
    return findChildByClass(GreyCatVarDecl.class);
  }

  @Override
  @Nullable
  public GreyCatWhileStmt getWhileStmt() {
    return findChildByClass(GreyCatWhileStmt.class);
  }

}
