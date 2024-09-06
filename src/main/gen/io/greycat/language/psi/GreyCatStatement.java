// This is a generated file. Not intended for manual editing.
package io.greycat.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GreyCatStatement extends PsiElement {

  @Nullable
  GreyCatAtStmt getAtStmt();

  @Nullable
  GreyCatBlockStmt getBlockStmt();

  @Nullable
  GreyCatBreakStmt getBreakStmt();

  @Nullable
  GreyCatContinueStmt getContinueStmt();

  @Nullable
  GreyCatDoWhileStmt getDoWhileStmt();

  @Nullable
  GreyCatEmptyStmt getEmptyStmt();

  @Nullable
  GreyCatExprStmt getExprStmt();

  @Nullable
  GreyCatForInStmt getForInStmt();

  @Nullable
  GreyCatForStmt getForStmt();

  @Nullable
  GreyCatIfStmt getIfStmt();

  @Nullable
  GreyCatReturnStmt getReturnStmt();

  @Nullable
  GreyCatThrowStmt getThrowStmt();

  @Nullable
  GreyCatTryStmt getTryStmt();

  @Nullable
  GreyCatVarDecl getVarDecl();

  @Nullable
  GreyCatWhileStmt getWhileStmt();

}
