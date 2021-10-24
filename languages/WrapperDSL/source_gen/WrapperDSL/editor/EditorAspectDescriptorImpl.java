package WrapperDSL.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.EditorAspectDescriptorBase;
import org.jetbrains.annotations.NotNull;
import java.util.Collection;
import jetbrains.mps.openapi.editor.descriptor.ConceptEditor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import java.util.Collections;
import jetbrains.mps.lang.smodel.ConceptSwitchIndex;
import jetbrains.mps.lang.smodel.ConceptSwitchIndexBuilder;
import jetbrains.mps.smodel.adapter.ids.MetaIdFactory;

public class EditorAspectDescriptorImpl extends EditorAspectDescriptorBase {
  @NotNull
  public Collection<ConceptEditor> getDeclaredEditors(SAbstractConcept concept) {
    SAbstractConcept cncpt = ((SAbstractConcept) concept);
    switch (conceptIndex.index(cncpt)) {
      case 0:
        return Collections.<ConceptEditor>singletonList(new AdviceAbstract_Editor());
      case 1:
        return Collections.<ConceptEditor>singletonList(new ConjunctionExpression_Editor());
      case 2:
        return Collections.<ConceptEditor>singletonList(new CoordinatesState_Editor());
      case 3:
        return Collections.<ConceptEditor>singletonList(new DestinyRegion_Editor());
      case 4:
        return Collections.<ConceptEditor>singletonList(new DisjunctionExpression_Editor());
      case 5:
        return Collections.<ConceptEditor>singletonList(new Given_Editor());
      case 6:
        return Collections.<ConceptEditor>singletonList(new IntegerConstant_Editor());
      case 7:
        return Collections.<ConceptEditor>singletonList(new LandRegionState_Editor());
      case 8:
        return Collections.<ConceptEditor>singletonList(new LightWindState_Editor());
      case 9:
        return Collections.<ConceptEditor>singletonList(new LoadedState_Editor());
      case 10:
        return Collections.<ConceptEditor>singletonList(new NormalLogicalExpression_Editor());
      case 11:
        return Collections.<ConceptEditor>singletonList(new NormalWindState_Editor());
      case 12:
        return Collections.<ConceptEditor>singletonList(new Operator_Editor());
      case 13:
        return Collections.<ConceptEditor>singletonList(new OrigemRegion_Editor());
      case 14:
        return Collections.<ConceptEditor>singletonList(new SafeLanding_Editor());
      case 15:
        return Collections.<ConceptEditor>singletonList(new StepNearestToOrigem_Editor());
      case 16:
        return Collections.<ConceptEditor>singletonList(new StringConstant_Editor());
      case 17:
        return Collections.<ConceptEditor>singletonList(new StrongWindState_Editor());
      case 18:
        return Collections.<ConceptEditor>singletonList(new Then_Editor());
      case 19:
        return Collections.<ConceptEditor>singletonList(new UnloadedState_Editor());
      case 20:
        return Collections.<ConceptEditor>singletonList(new WaterRegionState_Editor());
      case 21:
        return Collections.<ConceptEditor>singletonList(new When_Editor());
      case 22:
        return Collections.<ConceptEditor>singletonList(new While_Editor());
      case 23:
        return Collections.<ConceptEditor>singletonList(new WrapperScript_Editor());
      default:
    }
    return Collections.<ConceptEditor>emptyList();
  }



  private static final ConceptSwitchIndex conceptIndex = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0x3c0688eb4e024d93L, 0x86be1d02f4019544L, 0x6b53188b89b66863L), MetaIdFactory.conceptId(0x3c0688eb4e024d93L, 0x86be1d02f4019544L, 0x2bffada1898cef7cL), MetaIdFactory.conceptId(0x3c0688eb4e024d93L, 0x86be1d02f4019544L, 0x570c33aa528361a8L), MetaIdFactory.conceptId(0x3c0688eb4e024d93L, 0x86be1d02f4019544L, 0x2bffada189a44a43L), MetaIdFactory.conceptId(0x3c0688eb4e024d93L, 0x86be1d02f4019544L, 0x2bffada1898cef7dL), MetaIdFactory.conceptId(0x3c0688eb4e024d93L, 0x86be1d02f4019544L, 0x7cbf9892eb647158L), MetaIdFactory.conceptId(0x3c0688eb4e024d93L, 0x86be1d02f4019544L, 0x2bffada1898cef84L), MetaIdFactory.conceptId(0x3c0688eb4e024d93L, 0x86be1d02f4019544L, 0x570c33aa52836172L), MetaIdFactory.conceptId(0x3c0688eb4e024d93L, 0x86be1d02f4019544L, 0x570c33aa5283616aL), MetaIdFactory.conceptId(0x3c0688eb4e024d93L, 0x86be1d02f4019544L, 0x570c33aa52849c5cL), MetaIdFactory.conceptId(0x3c0688eb4e024d93L, 0x86be1d02f4019544L, 0x2bffada1898cefa7L), MetaIdFactory.conceptId(0x3c0688eb4e024d93L, 0x86be1d02f4019544L, 0x570c33aa5283616bL), MetaIdFactory.conceptId(0x3c0688eb4e024d93L, 0x86be1d02f4019544L, 0x2bffada1898cefa8L), MetaIdFactory.conceptId(0x3c0688eb4e024d93L, 0x86be1d02f4019544L, 0x2bffada189a44a44L), MetaIdFactory.conceptId(0x3c0688eb4e024d93L, 0x86be1d02f4019544L, 0x2bffada189a3a7d9L), MetaIdFactory.conceptId(0x3c0688eb4e024d93L, 0x86be1d02f4019544L, 0x6875dbacb66bbb47L), MetaIdFactory.conceptId(0x3c0688eb4e024d93L, 0x86be1d02f4019544L, 0x2bffada1898d13c7L), MetaIdFactory.conceptId(0x3c0688eb4e024d93L, 0x86be1d02f4019544L, 0x570c33aa52836169L), MetaIdFactory.conceptId(0x3c0688eb4e024d93L, 0x86be1d02f4019544L, 0x7cbf9892eb647164L), MetaIdFactory.conceptId(0x3c0688eb4e024d93L, 0x86be1d02f4019544L, 0x570c33aa52849c5dL), MetaIdFactory.conceptId(0x3c0688eb4e024d93L, 0x86be1d02f4019544L, 0x570c33aa5283616fL), MetaIdFactory.conceptId(0x3c0688eb4e024d93L, 0x86be1d02f4019544L, 0x7cbf9892eb647163L), MetaIdFactory.conceptId(0x3c0688eb4e024d93L, 0x86be1d02f4019544L, 0xf8231681b95e221L), MetaIdFactory.conceptId(0x3c0688eb4e024d93L, 0x86be1d02f4019544L, 0x5ef0a89f564c5022L)).seal();
}