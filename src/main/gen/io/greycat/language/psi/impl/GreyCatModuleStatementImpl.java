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

public class GreyCatModuleStatementImpl extends ASTWrapperPsiElement implements GreyCatModuleStatement {

  public GreyCatModuleStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull GreyCatVisitor visitor) {
    visitor.visitModuleStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GreyCatVisitor) accept((GreyCatVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public GreyCatEmptyStmt getEmptyStmt() {
    return findChildByClass(GreyCatEmptyStmt.class);
  }

  @Override
  @Nullable
  public GreyCatEnumDecl getEnumDecl() {
    return findChildByClass(GreyCatEnumDecl.class);
  }

  @Override
  @Nullable
  public GreyCatFnDecl getFnDecl() {
    return findChildByClass(GreyCatFnDecl.class);
  }

  @Override
  @Nullable
  public GreyCatPragmaStmt getPragmaStmt() {
    return findChildByClass(GreyCatPragmaStmt.class);
  }

  @Override
  @Nullable
  public GreyCatTypeDecl getTypeDecl() {
    return findChildByClass(GreyCatTypeDecl.class);
  }

  @Override
  @Nullable
  public GreyCatUseStmt getUseStmt() {
    return findChildByClass(GreyCatUseStmt.class);
  }

  @Override
  @Nullable
  public GreyCatVarDecl getVarDecl() {
    return findChildByClass(GreyCatVarDecl.class);
  }

}
