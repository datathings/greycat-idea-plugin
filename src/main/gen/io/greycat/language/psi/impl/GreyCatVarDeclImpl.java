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

public class GreyCatVarDeclImpl extends ASTWrapperPsiElement implements GreyCatVarDecl {

  public GreyCatVarDeclImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull GreyCatVisitor visitor) {
    visitor.visitVarDecl(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GreyCatVisitor) accept((GreyCatVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public GreyCatInitializer getInitializer() {
    return findChildByClass(GreyCatInitializer.class);
  }

  @Override
  @Nullable
  public GreyCatPragmas getPragmas() {
    return findChildByClass(GreyCatPragmas.class);
  }

  @Override
  @Nullable
  public GreyCatTypeSpec getTypeSpec() {
    return findChildByClass(GreyCatTypeSpec.class);
  }

  @Override
  @NotNull
  public GreyCatVarDeclIdent getVarDeclIdent() {
    return findNotNullChildByClass(GreyCatVarDeclIdent.class);
  }

}
