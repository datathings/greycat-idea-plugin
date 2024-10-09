// This is a generated file. Not intended for manual editing.
package io.greycat.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GreyCatPrimaryExpr extends PsiElement {

  @Nullable
  GreyCatArrayExpr getArrayExpr();

  @Nullable
  GreyCatFnExpr getFnExpr();

  @Nullable
  GreyCatIdentOrKeywordOrStrLit getIdentOrKeywordOrStrLit();

  @Nullable
  GreyCatLiteral getLiteral();

  @Nullable
  GreyCatObjectExpr getObjectExpr();

  @Nullable
  GreyCatOneFieldObj getOneFieldObj();

  @Nullable
  GreyCatParenExpr getParenExpr();

  @Nullable
  GreyCatTableExpr getTableExpr();

  @Nullable
  GreyCatThreeFieldsObj getThreeFieldsObj();

  @Nullable
  GreyCatTupleExpr getTupleExpr();

  @Nullable
  GreyCatTwoFieldsObj getTwoFieldsObj();

}
