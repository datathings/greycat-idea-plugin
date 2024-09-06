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

public class GreyCatLiteralImpl extends ASTWrapperPsiElement implements GreyCatLiteral {

  public GreyCatLiteralImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull GreyCatVisitor visitor) {
    visitor.visitLiteral(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GreyCatVisitor) accept((GreyCatVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public GreyCatNumAppendix getNumAppendix() {
    return findChildByClass(GreyCatNumAppendix.class);
  }

  @Override
  @Nullable
  public GreyCatStringLit getStringLit() {
    return findChildByClass(GreyCatStringLit.class);
  }

  @Override
  @Nullable
  public PsiElement getNumber() {
    return findChildByType(NUMBER);
  }

}
