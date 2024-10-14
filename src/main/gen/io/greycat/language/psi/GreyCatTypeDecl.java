// This is a generated file. Not intended for manual editing.
package io.greycat.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GreyCatTypeDecl extends PsiElement {

  @Nullable
  GreyCatGenericParams getGenericParams();

  @Nullable
  GreyCatPragmas getPragmas();

  @Nullable
  GreyCatTypeExtends getTypeExtends();

  @NotNull
  List<GreyCatTypeField> getTypeFieldList();

  @NotNull
  GreyCatTypeIdent getTypeIdent();

}
