// This is a generated file. Not intended for manual editing.
package io.greycat.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GreyCatTypeAttr extends PsiElement {

  @NotNull
  GreyCatAttrIdent getAttrIdent();

  @Nullable
  GreyCatFlags getFlags();

  @Nullable
  GreyCatInitializer getInitializer();

  @Nullable
  GreyCatPragmas getPragmas();

  @NotNull
  GreyCatTypeSpec getTypeSpec();

}
