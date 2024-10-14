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

public class GreyCatTypeDeclImpl extends ASTWrapperPsiElement implements GreyCatTypeDecl {

  public GreyCatTypeDeclImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull GreyCatVisitor visitor) {
    visitor.visitTypeDecl(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GreyCatVisitor) accept((GreyCatVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public GreyCatGenericParams getGenericParams() {
    return findChildByClass(GreyCatGenericParams.class);
  }

  @Override
  @Nullable
  public GreyCatPragmas getPragmas() {
    return findChildByClass(GreyCatPragmas.class);
  }

  @Override
  @Nullable
  public GreyCatTypeExtends getTypeExtends() {
    return findChildByClass(GreyCatTypeExtends.class);
  }

  @Override
  @NotNull
  public List<GreyCatTypeField> getTypeFieldList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, GreyCatTypeField.class);
  }

  @Override
  @NotNull
  public GreyCatTypeIdent getTypeIdent() {
    return findNotNullChildByClass(GreyCatTypeIdent.class);
  }

}
