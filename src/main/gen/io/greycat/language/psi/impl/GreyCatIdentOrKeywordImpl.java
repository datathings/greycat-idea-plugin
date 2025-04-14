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

public class GreyCatIdentOrKeywordImpl extends ASTWrapperPsiElement implements GreyCatIdentOrKeyword {

  public GreyCatIdentOrKeywordImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull GreyCatVisitor visitor) {
    visitor.visitIdentOrKeyword(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GreyCatVisitor) accept((GreyCatVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public GreyCatBuiltInType getBuiltInType() {
    return findChildByClass(GreyCatBuiltInType.class);
  }

  @Override
  @Nullable
  public GreyCatNumAppendix getNumAppendix() {
    return findChildByClass(GreyCatNumAppendix.class);
  }

}
