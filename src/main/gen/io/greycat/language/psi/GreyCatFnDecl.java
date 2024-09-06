// This is a generated file. Not intended for manual editing.
package io.greycat.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GreyCatFnDecl extends PsiElement {

  @Nullable
  GreyCatBlock getBlock();

  @Nullable
  GreyCatFlags getFlags();

  @NotNull
  GreyCatFnIdent getFnIdent();

  @NotNull
  GreyCatFnOrTask getFnOrTask();

  @Nullable
  GreyCatFnParams getFnParams();

  @Nullable
  GreyCatGenericParams getGenericParams();

  @Nullable
  GreyCatPragmas getPragmas();

  @Nullable
  GreyCatTypeSpec getTypeSpec();

}
