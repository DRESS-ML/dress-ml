package WrapperDSL.behavior;

/*Generated by MPS */

import jetbrains.mps.core.aspects.behaviour.BaseBHDescriptor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import java.util.List;
import jetbrains.mps.core.aspects.behaviour.api.SMethod;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.core.aspects.behaviour.api.SConstructor;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.core.aspects.behaviour.api.BHMethodNotFoundException;
import org.jetbrains.mps.openapi.language.SProperty;
import org.jetbrains.mps.openapi.language.SContainmentLink;

public final class GPSSensorNormalLogicalExpression__BehaviorDescriptor extends BaseBHDescriptor {
  private static final SAbstractConcept CONCEPT = MetaAdapterFactory.getConcept(0x3c0688eb4e024d93L, 0x86be1d02f4019544L, 0x570c33aa527a9793L, "WrapperDSL.structure.GPSSensorNormalLogicalExpression");


  private static final List<SMethod<?>> BH_METHODS = Arrays.<SMethod<?>>asList();

  private static void ___init___(@NotNull SNode __thisNode__) {
    SNode stringConstantNode = SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0x3c0688eb4e024d93L, 0x86be1d02f4019544L, 0x2bffada1898d13c7L, "WrapperDSL.structure.StringConstant"));
    SPropertyOperations.assign(stringConstantNode, PROPS.value$aI20, "Distance to Destiny");
    SLinkOperations.setTarget(__thisNode__, LINKS.leftElement$blNu, stringConstantNode);
  }


  /*package*/ GPSSensorNormalLogicalExpression__BehaviorDescriptor() {
  }

  @Override
  protected void initNode(@NotNull SNode node, @NotNull SConstructor constructor, @Nullable Object[] parameters) {
    ___init___(node);
  }

  @Override
  protected <T> T invokeSpecial0(@NotNull SNode node, @NotNull SMethod<T> method, @Nullable Object[] parameters) {
    int methodIndex = BH_METHODS.indexOf(method);
    if (methodIndex < 0) {
      throw new BHMethodNotFoundException(this, method);
    }
    switch (methodIndex) {
      default:
        throw new BHMethodNotFoundException(this, method);
    }
  }

  @Override
  protected <T> T invokeSpecial0(@NotNull SAbstractConcept concept, @NotNull SMethod<T> method, @Nullable Object[] parameters) {
    int methodIndex = BH_METHODS.indexOf(method);
    if (methodIndex < 0) {
      throw new BHMethodNotFoundException(this, method);
    }
    switch (methodIndex) {
      default:
        throw new BHMethodNotFoundException(this, method);
    }
  }

  @NotNull
  @Override
  public List<SMethod<?>> getDeclaredMethods() {
    return BH_METHODS;
  }

  @NotNull
  @Override
  public SAbstractConcept getConcept() {
    return CONCEPT;
  }

  private static final class PROPS {
    /*package*/ static final SProperty value$aI20 = MetaAdapterFactory.getProperty(0x3c0688eb4e024d93L, 0x86be1d02f4019544L, 0x2bffada1898d13c7L, 0x2bffada1898d13c8L, "value");
  }

  private static final class LINKS {
    /*package*/ static final SContainmentLink leftElement$blNu = MetaAdapterFactory.getContainmentLink(0x3c0688eb4e024d93L, 0x86be1d02f4019544L, 0xf8231681b95e20fL, 0x2bffada1898cef7eL, "leftElement");
  }
}
