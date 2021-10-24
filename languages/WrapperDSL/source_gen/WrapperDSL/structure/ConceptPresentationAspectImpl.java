package WrapperDSL.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.ConceptPresentationAspectBase;
import jetbrains.mps.smodel.runtime.ConceptPresentation;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.runtime.ConceptPresentationBuilder;

public class ConceptPresentationAspectImpl extends ConceptPresentationAspectBase {
  private ConceptPresentation props_Actuator;
  private ConceptPresentation props_AdviceAbstract;
  private ConceptPresentation props_After;
  private ConceptPresentation props_Around;
  private ConceptPresentation props_BatterySensorNormalLogicalExpression;
  private ConceptPresentation props_Before;
  private ConceptPresentation props_Command;
  private ConceptPresentation props_Component;
  private ConceptPresentation props_ConjunctionExpression;
  private ConceptPresentation props_Constant;
  private ConceptPresentation props_CoordinatesState;
  private ConceptPresentation props_DestinyRegion;
  private ConceptPresentation props_DisjunctionExpression;
  private ConceptPresentation props_GPSSensorNormalLogicalExpression;
  private ConceptPresentation props_Given;
  private ConceptPresentation props_If;
  private ConceptPresentation props_IntegerConstant;
  private ConceptPresentation props_Land;
  private ConceptPresentation props_LandRegionState;
  private ConceptPresentation props_LightWindState;
  private ConceptPresentation props_LoadActuator;
  private ConceptPresentation props_LoadSensorNormalExpression;
  private ConceptPresentation props_LoadedState;
  private ConceptPresentation props_LoadingState;
  private ConceptPresentation props_LogicalExpression;
  private ConceptPresentation props_MathConstant;
  private ConceptPresentation props_MathElement;
  private ConceptPresentation props_NormalLogicalExpression;
  private ConceptPresentation props_NormalWindState;
  private ConceptPresentation props_Operator;
  private ConceptPresentation props_OrigemRegion;
  private ConceptPresentation props_RegionState;
  private ConceptPresentation props_Repeat;
  private ConceptPresentation props_SafeLanding;
  private ConceptPresentation props_SensorConstant;
  private ConceptPresentation props_SensorNormalLogicalExpression;
  private ConceptPresentation props_ShutDown;
  private ConceptPresentation props_Start;
  private ConceptPresentation props_State;
  private ConceptPresentation props_Statement;
  private ConceptPresentation props_StepLest;
  private ConceptPresentation props_StepNearestToDestiny;
  private ConceptPresentation props_StepNearestToLand;
  private ConceptPresentation props_StepNearestToOrigem;
  private ConceptPresentation props_StepNearestToPosition;
  private ConceptPresentation props_StepNearestToWater;
  private ConceptPresentation props_StepNorth;
  private ConceptPresentation props_StepSouth;
  private ConceptPresentation props_StepWest;
  private ConceptPresentation props_StringConstant;
  private ConceptPresentation props_StrongWindState;
  private ConceptPresentation props_TakeOff;
  private ConceptPresentation props_Then;
  private ConceptPresentation props_TurnLest;
  private ConceptPresentation props_TurnNorth;
  private ConceptPresentation props_TurnSouth;
  private ConceptPresentation props_TurnWest;
  private ConceptPresentation props_UnloadedState;
  private ConceptPresentation props_WaterRegionState;
  private ConceptPresentation props_When;
  private ConceptPresentation props_While;
  private ConceptPresentation props_WindSensorNormalLogicalExpression;
  private ConceptPresentation props_WindState;
  private ConceptPresentation props_WrapperScript;

  @Override
  @Nullable
  public ConceptPresentation getDescriptor(SAbstractConcept c) {
    StructureAspectDescriptor structureDescriptor = (StructureAspectDescriptor) myLanguageRuntime.getAspect(jetbrains.mps.smodel.runtime.StructureAspectDescriptor.class);
    switch (structureDescriptor.internalIndex(c)) {
      case LanguageConceptSwitch.Actuator:
        if (props_Actuator == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          props_Actuator = cpb.create();
        }
        return props_Actuator;
      case LanguageConceptSwitch.AdviceAbstract:
        if (props_AdviceAbstract == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          props_AdviceAbstract = cpb.create();
        }
        return props_AdviceAbstract;
      case LanguageConceptSwitch.After:
        if (props_After == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("After");
          props_After = cpb.create();
        }
        return props_After;
      case LanguageConceptSwitch.Around:
        if (props_Around == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("Around");
          props_Around = cpb.create();
        }
        return props_Around;
      case LanguageConceptSwitch.BatterySensorNormalLogicalExpression:
        if (props_BatterySensorNormalLogicalExpression == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("BatteryExpression");
          props_BatterySensorNormalLogicalExpression = cpb.create();
        }
        return props_BatterySensorNormalLogicalExpression;
      case LanguageConceptSwitch.Before:
        if (props_Before == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("Before");
          props_Before = cpb.create();
        }
        return props_Before;
      case LanguageConceptSwitch.Command:
        if (props_Command == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          props_Command = cpb.create();
        }
        return props_Command;
      case LanguageConceptSwitch.Component:
        if (props_Component == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          props_Component = cpb.create();
        }
        return props_Component;
      case LanguageConceptSwitch.ConjunctionExpression:
        if (props_ConjunctionExpression == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("ConjunctionExpression");
          props_ConjunctionExpression = cpb.create();
        }
        return props_ConjunctionExpression;
      case LanguageConceptSwitch.Constant:
        if (props_Constant == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          props_Constant = cpb.create();
        }
        return props_Constant;
      case LanguageConceptSwitch.CoordinatesState:
        if (props_CoordinatesState == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("CoordinatesState");
          props_CoordinatesState = cpb.create();
        }
        return props_CoordinatesState;
      case LanguageConceptSwitch.DestinyRegion:
        if (props_DestinyRegion == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("Destiny");
          props_DestinyRegion = cpb.create();
        }
        return props_DestinyRegion;
      case LanguageConceptSwitch.DisjunctionExpression:
        if (props_DisjunctionExpression == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("DisjunctionExpression");
          props_DisjunctionExpression = cpb.create();
        }
        return props_DisjunctionExpression;
      case LanguageConceptSwitch.GPSSensorNormalLogicalExpression:
        if (props_GPSSensorNormalLogicalExpression == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("GpsExpression");
          props_GPSSensorNormalLogicalExpression = cpb.create();
        }
        return props_GPSSensorNormalLogicalExpression;
      case LanguageConceptSwitch.Given:
        if (props_Given == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("Given");
          props_Given = cpb.create();
        }
        return props_Given;
      case LanguageConceptSwitch.If:
        if (props_If == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("if");
          props_If = cpb.create();
        }
        return props_If;
      case LanguageConceptSwitch.IntegerConstant:
        if (props_IntegerConstant == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("IntegerConstant");
          props_IntegerConstant = cpb.create();
        }
        return props_IntegerConstant;
      case LanguageConceptSwitch.Land:
        if (props_Land == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("Land");
          props_Land = cpb.create();
        }
        return props_Land;
      case LanguageConceptSwitch.LandRegionState:
        if (props_LandRegionState == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("land region");
          props_LandRegionState = cpb.create();
        }
        return props_LandRegionState;
      case LanguageConceptSwitch.LightWindState:
        if (props_LightWindState == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("light wind");
          props_LightWindState = cpb.create();
        }
        return props_LightWindState;
      case LanguageConceptSwitch.LoadActuator:
        if (props_LoadActuator == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("LoadActuator");
          props_LoadActuator = cpb.create();
        }
        return props_LoadActuator;
      case LanguageConceptSwitch.LoadSensorNormalExpression:
        if (props_LoadSensorNormalExpression == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("LoadExpression");
          props_LoadSensorNormalExpression = cpb.create();
        }
        return props_LoadSensorNormalExpression;
      case LanguageConceptSwitch.LoadedState:
        if (props_LoadedState == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("loaded");
          props_LoadedState = cpb.create();
        }
        return props_LoadedState;
      case LanguageConceptSwitch.LoadingState:
        if (props_LoadingState == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          props_LoadingState = cpb.create();
        }
        return props_LoadingState;
      case LanguageConceptSwitch.LogicalExpression:
        if (props_LogicalExpression == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          props_LogicalExpression = cpb.create();
        }
        return props_LogicalExpression;
      case LanguageConceptSwitch.MathConstant:
        if (props_MathConstant == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("MathConstant");
          props_MathConstant = cpb.create();
        }
        return props_MathConstant;
      case LanguageConceptSwitch.MathElement:
        if (props_MathElement == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          props_MathElement = cpb.create();
        }
        return props_MathElement;
      case LanguageConceptSwitch.NormalLogicalExpression:
        if (props_NormalLogicalExpression == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("NormalLogicalExpression");
          props_NormalLogicalExpression = cpb.create();
        }
        return props_NormalLogicalExpression;
      case LanguageConceptSwitch.NormalWindState:
        if (props_NormalWindState == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("normal wind");
          props_NormalWindState = cpb.create();
        }
        return props_NormalWindState;
      case LanguageConceptSwitch.Operator:
        if (props_Operator == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("Operator");
          props_Operator = cpb.create();
        }
        return props_Operator;
      case LanguageConceptSwitch.OrigemRegion:
        if (props_OrigemRegion == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("Origem");
          props_OrigemRegion = cpb.create();
        }
        return props_OrigemRegion;
      case LanguageConceptSwitch.RegionState:
        if (props_RegionState == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          props_RegionState = cpb.create();
        }
        return props_RegionState;
      case LanguageConceptSwitch.Repeat:
        if (props_Repeat == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("repeat");
          props_Repeat = cpb.create();
        }
        return props_Repeat;
      case LanguageConceptSwitch.SafeLanding:
        if (props_SafeLanding == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("SafeLanding");
          props_SafeLanding = cpb.create();
        }
        return props_SafeLanding;
      case LanguageConceptSwitch.SensorConstant:
        if (props_SensorConstant == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("SensorConstant");
          props_SensorConstant = cpb.create();
        }
        return props_SensorConstant;
      case LanguageConceptSwitch.SensorNormalLogicalExpression:
        if (props_SensorNormalLogicalExpression == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          props_SensorNormalLogicalExpression = cpb.create();
        }
        return props_SensorNormalLogicalExpression;
      case LanguageConceptSwitch.ShutDown:
        if (props_ShutDown == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("Shut Down");
          props_ShutDown = cpb.create();
        }
        return props_ShutDown;
      case LanguageConceptSwitch.Start:
        if (props_Start == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("Start");
          props_Start = cpb.create();
        }
        return props_Start;
      case LanguageConceptSwitch.State:
        if (props_State == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          props_State = cpb.create();
        }
        return props_State;
      case LanguageConceptSwitch.Statement:
        if (props_Statement == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          props_Statement = cpb.create();
        }
        return props_Statement;
      case LanguageConceptSwitch.StepLest:
        if (props_StepLest == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("Step Lest");
          props_StepLest = cpb.create();
        }
        return props_StepLest;
      case LanguageConceptSwitch.StepNearestToDestiny:
        if (props_StepNearestToDestiny == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("Step Nearest To Destiny");
          props_StepNearestToDestiny = cpb.create();
        }
        return props_StepNearestToDestiny;
      case LanguageConceptSwitch.StepNearestToLand:
        if (props_StepNearestToLand == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("Step Nearest To Land");
          props_StepNearestToLand = cpb.create();
        }
        return props_StepNearestToLand;
      case LanguageConceptSwitch.StepNearestToOrigem:
        if (props_StepNearestToOrigem == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("Step Nearest To Origem");
          props_StepNearestToOrigem = cpb.create();
        }
        return props_StepNearestToOrigem;
      case LanguageConceptSwitch.StepNearestToPosition:
        if (props_StepNearestToPosition == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("Step Nearest To Position");
          props_StepNearestToPosition = cpb.create();
        }
        return props_StepNearestToPosition;
      case LanguageConceptSwitch.StepNearestToWater:
        if (props_StepNearestToWater == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("Step Nearest To Water");
          props_StepNearestToWater = cpb.create();
        }
        return props_StepNearestToWater;
      case LanguageConceptSwitch.StepNorth:
        if (props_StepNorth == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("Step North");
          props_StepNorth = cpb.create();
        }
        return props_StepNorth;
      case LanguageConceptSwitch.StepSouth:
        if (props_StepSouth == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("Step South");
          props_StepSouth = cpb.create();
        }
        return props_StepSouth;
      case LanguageConceptSwitch.StepWest:
        if (props_StepWest == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("Step West");
          props_StepWest = cpb.create();
        }
        return props_StepWest;
      case LanguageConceptSwitch.StringConstant:
        if (props_StringConstant == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("StringConstant");
          props_StringConstant = cpb.create();
        }
        return props_StringConstant;
      case LanguageConceptSwitch.StrongWindState:
        if (props_StrongWindState == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("strong wind");
          props_StrongWindState = cpb.create();
        }
        return props_StrongWindState;
      case LanguageConceptSwitch.TakeOff:
        if (props_TakeOff == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("Take Off");
          props_TakeOff = cpb.create();
        }
        return props_TakeOff;
      case LanguageConceptSwitch.Then:
        if (props_Then == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("Then");
          props_Then = cpb.create();
        }
        return props_Then;
      case LanguageConceptSwitch.TurnLest:
        if (props_TurnLest == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("Turn Lest");
          props_TurnLest = cpb.create();
        }
        return props_TurnLest;
      case LanguageConceptSwitch.TurnNorth:
        if (props_TurnNorth == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("Turn North");
          props_TurnNorth = cpb.create();
        }
        return props_TurnNorth;
      case LanguageConceptSwitch.TurnSouth:
        if (props_TurnSouth == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("Turn South");
          props_TurnSouth = cpb.create();
        }
        return props_TurnSouth;
      case LanguageConceptSwitch.TurnWest:
        if (props_TurnWest == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("Turn West");
          props_TurnWest = cpb.create();
        }
        return props_TurnWest;
      case LanguageConceptSwitch.UnloadedState:
        if (props_UnloadedState == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("unloaded");
          props_UnloadedState = cpb.create();
        }
        return props_UnloadedState;
      case LanguageConceptSwitch.WaterRegionState:
        if (props_WaterRegionState == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("water region");
          props_WaterRegionState = cpb.create();
        }
        return props_WaterRegionState;
      case LanguageConceptSwitch.When:
        if (props_When == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("When");
          props_When = cpb.create();
        }
        return props_When;
      case LanguageConceptSwitch.While:
        if (props_While == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("while");
          props_While = cpb.create();
        }
        return props_While;
      case LanguageConceptSwitch.WindSensorNormalLogicalExpression:
        if (props_WindSensorNormalLogicalExpression == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("WindExpression");
          props_WindSensorNormalLogicalExpression = cpb.create();
        }
        return props_WindSensorNormalLogicalExpression;
      case LanguageConceptSwitch.WindState:
        if (props_WindState == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          props_WindState = cpb.create();
        }
        return props_WindState;
      case LanguageConceptSwitch.WrapperScript:
        if (props_WrapperScript == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_WrapperScript = cpb.create();
        }
        return props_WrapperScript;
    }
    return null;
  }
}
