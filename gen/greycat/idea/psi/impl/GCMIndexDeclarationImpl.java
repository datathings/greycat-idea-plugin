// This is a generated file. Not intended for manual editing.
package greycat.idea.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static greycat.idea.psi.GCMTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import greycat.idea.psi.*;
import greycat.idea.GCMUtil;

public class GCMIndexDeclarationImpl extends ASTWrapperPsiElement implements GCMIndexDeclaration {

  public GCMIndexDeclarationImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull GCMVisitor visitor) {
    visitor.visitIndexDeclaration(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GCMVisitor) accept((GCMVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<GCMAttributeName> getAttributeNameList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, GCMAttributeName.class);
  }

  @Override
  @Nullable
  public GCMIndexedWithoutTimeDeclaration getIndexedWithoutTimeDeclaration() {
    return findChildByClass(GCMIndexedWithoutTimeDeclaration.class);
  }

  @Override
  @Nullable
  public GCMIndexedWithTimeDeclaration getIndexedWithTimeDeclaration() {
    return findChildByClass(GCMIndexedWithTimeDeclaration.class);
  }

  @Override
  @Nullable
  public GCMIndexNameDeclaration getIndexNameDeclaration() {
    return findChildByClass(GCMIndexNameDeclaration.class);
  }

}
