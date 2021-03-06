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

public class GCMPropImpl extends ASTWrapperPsiElement implements GCMProp {

  public GCMPropImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull GCMVisitor visitor) {
    visitor.visitProp(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GCMVisitor) accept((GCMVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public GCMAnnotation getAnnotation() {
    return findChildByClass(GCMAnnotation.class);
  }

  @Override
  @Nullable
  public GCMAttributeDeclaration getAttributeDeclaration() {
    return findChildByClass(GCMAttributeDeclaration.class);
  }

  @Override
  @Nullable
  public GCMIndexDeclaration getIndexDeclaration() {
    return findChildByClass(GCMIndexDeclaration.class);
  }

  @Override
  @Nullable
  public GCMRelationDeclaration getRelationDeclaration() {
    return findChildByClass(GCMRelationDeclaration.class);
  }

  @Override
  @Nullable
  public GCMSubConstDeclaration getSubConstDeclaration() {
    return findChildByClass(GCMSubConstDeclaration.class);
  }

  @Override
  @Nullable
  public PsiElement getIdent() {
    return findChildByType(IDENT);
  }

}
