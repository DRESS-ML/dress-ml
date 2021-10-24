# DRESS-ML: A Domain-specific Language for Modelling Exceptional Scenarios and Self-adaptive Behaviours for Drone-based Applications

### Abstract
Drones are gaining attention due to its possibility to support wide different types of applications. Since they can operate in different environments, it is possible to encounter uncertainties and exceptional situations, not initially predicted, during the use of drone-based applications. In this realm, self-adaptive strategies have been successfully used to guarantee resilience and continuous execution of such applications despite environment changes. Although some approaches have proposed the use of scenario notations, to model exceptional situations, they are either very generic or demands a good knowledge on formal methods from the user, which may hinder their adoption. To mitigate those problems, this work proposes a domain-specific language, called DRESS-ML, which allows modelling exceptional situations and self-adaptive behaviours for drone-based applications. It relies on the Given-When-Then template used in the Behaviour-driven development (BDD) technique and the main Aspect-oriented Programming concepts. We also provide a model-to-text transformation engine that translates the modelled exceptional scenarios to a drone-specific platform in order to verify the adaptive behaviours. The approach is evaluated through a proof of concept that verifies its applicability in different exceptional scenarios.

## Abstract Syntax
### Metamodel

Usually, the abstract syntax is represented by the metamodels, which are normally based on object-oriented models, such as classes, attributes and associations. Figure below provides a visualization of the high-level specification of the elements of the DRESS-ML syntax using UML class diagrams. These elements are based on the resources listed in the domain analysis presented in last section and represent a set of abstractions to express a model for drone exceptional scenarios.

![](https://i.imgur.com/HFkDMEy.png)

## Modeling Environment

An exceptional scenario is outlined based on the Given-When-Then structure, therefore a template to model that structure is pre-established when creating that kind of element, as shown in figure below. The $<$value$>$ placeholder underlined in red represents entry points for software engineers filling the exceptional scenario.
![](https://i.imgur.com/X86Fdbv.png)

As shown in the next figure, it is possible to view enabled model elements to fill the respective fields through the code-completion pop-up menu (Ctrl+Space).In addition, along with the autocomplete menu, there are examples of each model element aiming it facilitating the understanding of the usefulness of a specific model element.

![](https://i.imgur.com/CvYjK0a.png)

<!-- ![](https://i.imgur.com/CUg031r.png) -->

## Model-to-Text generator
![](https://i.imgur.com/1PSMkdk.png)

The DRESS-ML has been designed to be attached with different ModelToText (M2T) generators, which means that it can generate code or scripts representing the specified exception scenarios to distinct target platforms.

A generator is a translator that maps elements of the model to elements of another model, thus allowing the conversion between them. This translation can be achieved by either a model-to-model transformation, generating a new model as output, or a model-to-text transformation, generating text or source code as output. A target platform is where the generated code has to run on at the end of the process, then it needs to be platform understandable. It is common to assume that there are several target platforms, therefore each target platform has to have a specific generator.

### Wrapper Generator
An export is made to the Dragonfly tool using an M2T process in which it transforms models implemented using DRESS-ML for wrapper code.

Figure below shows the mapping between the BDD concepts used in the DRESS-ML and the AOP technique for creating wrappers for the Dragonfly tool. The state of the context (Given), along with the occurred event (When), represents the conditional pointcut, the adaptive behavior (Then) represents a advice.
![](https://i.imgur.com/N1amdLg.png)

The MoveAside exceptional scenario implemented in DRES-ML is used to exemplify how TextGen performs to generate wrapper code. Figure below exhibits the modeled AST and the generator script for that example. The nodes, the child nodes, properties of AST are shown through regular boxes, while the scripts to produce the wrapper code using the Textgen language based on each in node are shown through dashed boxes.

The M2T process, through the implemented script, obtains the necessary information from the AST to create the target code using the Textgen language. Therefore, it provides in its syntax instructions for getting information from each node, such as ${node.child} and ${attributed node}, to obtain information from a child node and from attributes from current node, respectively. The values that do not follow this syntax are constants, such as "public aspect" in the Exceptional Script node.

The generator performs the transformation process using the defined template by the TextGen script by starting the execution from the root (Exceptional Scenario) and going through the tree according to the script specifications. That template constructs the header and delimits the body of the aspect object. The name and body content of the aspect class are requested from attribute name, and Given, When and Then child nodes, respectively.

![](https://i.imgur.com/SxX6CwA.png)

## Example Application

https://cutt.ly/fjw07ws

**Colocar aquela planilia do drive editável**
tentar colocar secoes por links
