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

public class GreyCatTypeMethodImpl extends ASTWrapperPsiElement implements GreyCatTypeMethod {

  public GreyCatTypeMethodImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull GreyCatVisitor visitor) {
    visitor.visitTypeMethod(this);
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
  @NotNull
  public List<GreyCatFlags> getFlagsList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, GreyCatFlags.class);
  }

  @Override
  @NotNull
  public GreyCatFnOrTask getFnOrTask() {
    return findNotNullChildByClass(GreyCatFnOrTask.class);
  }

  @Override
  @Nullable
  public GreyCatFnParams getFnParams() {
    return findChildByClass(GreyCatFnParams.class);
  }

  @Override
  @Nullable
  public GreyCatGenericParams getGenericParams() {
    return findChildByClass(GreyCatGenericParams.class);
  }

  @Override
  @NotNull
  public GreyCatMethodIdent getMethodIdent() {
    return findNotNullChildByClass(GreyCatMethodIdent.class);
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

}
