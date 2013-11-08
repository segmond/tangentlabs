package pl0.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.ConceptDescriptor;
import java.util.Arrays;
import jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder;
import jetbrains.mps.smodel.runtime.interpreted.StructureAspectInterpreted;

public class StructureAspectDescriptor implements jetbrains.mps.smodel.runtime.StructureAspectDescriptor {
  public StructureAspectDescriptor() {
  }

  public ConceptDescriptor getDescriptor(String conceptFqName) {
    switch (Arrays.binarySearch(stringSwitchCases_1htk8d_a0a0b, conceptFqName)) {
      case 0:
        return new ConceptDescriptorBuilder("pl0.structure.Expr").super_("jetbrains.mps.lang.core.structure.BaseConcept").parents("jetbrains.mps.lang.core.structure.BaseConcept").abstract_().create();
      case 1:
        return new ConceptDescriptorBuilder("pl0.structure.IntLiteral").super_("jetbrains.mps.lang.core.structure.BaseConcept").parents("jetbrains.mps.lang.core.structure.BaseConcept").properties("value").create();
      case 2:
        return new ConceptDescriptorBuilder("pl0.structure.TBoolean").super_("pl0.structure.TValue").parents("pl0.structure.TValue").abstract_().create();
      case 3:
        return new ConceptDescriptorBuilder("pl0.structure.TInteger").super_("jetbrains.mps.lang.core.structure.BaseConcept").parents("jetbrains.mps.lang.core.structure.BaseConcept").create();
      case 4:
        return new ConceptDescriptorBuilder("pl0.structure.TValue").super_("jetbrains.mps.lang.core.structure.BaseConcept").parents("jetbrains.mps.lang.core.structure.BaseConcept").abstract_().create();
      default:
        return StructureAspectInterpreted.getInstance().getDescriptor(conceptFqName);
    }
  }

  private static String[] stringSwitchCases_1htk8d_a0a0b = new String[]{"pl0.structure.Expr", "pl0.structure.IntLiteral", "pl0.structure.TBoolean", "pl0.structure.TInteger", "pl0.structure.TValue"};
}
