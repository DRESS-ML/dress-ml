# Model-to-Text generator

![https://i.imgur.com/1PSMkdk.png](https://i.imgur.com/1PSMkdk.png)

The DRESS-ML has been designed to be attached with different ModelToText (M2T) generators, which means that it can generate code or scripts representing the specified exception scenarios to distinct target platforms.

A generator is a translator that maps elements of the model to elements of another model, thus allowing the conversion between them. This translation can be achieved by either a model-to-model transformation, generating a new model as output, or a model-to-text transformation, generating text or source code as output. A target platform is where the generated code has to run on at the end of the process, then it needs to be platform understandable. It is common to assume that there are several target platforms, therefore each target platform has to have a specific generator.

### Wrapper Generator

An export is made to the Dragonfly tool using an M2T process in which it transforms models implemented using DRESS-ML for wrapper code.

Figure below shows the mapping between the BDD concepts used in the DRESS-ML and the AOP technique for creating wrappers for the Dragonfly tool. The state of the context (Given), along with the occurred event (When), represents the conditional pointcut, the adaptive behavior (Then) represents a advice.

![https://i.imgur.com/N1amdLg.png](https://i.imgur.com/N1amdLg.png)

The MoveAside exceptional scenario implemented in DRES-ML is used to exemplify how TextGen performs to generate wrapper code. Figure below exhibits the modeled AST and the generator script for that example. The nodes, the child nodes, properties of AST are shown through regular boxes, while the scripts to produce the wrapper code using the Textgen language based on each in node are shown through dashed boxes.

The M2T process, through the implemented script, obtains the necessary information from the AST to create the target code using the Textgen language. Therefore, it provides in its syntax instructions for getting information from each node, such as ${node.child} and ${attributed node}, to obtain information from a child node and from attributes from current node, respectively. The values that do not follow this syntax are constants, such as "public aspect" in the Exceptional Script node.

The generator performs the transformation process using the defined template by the TextGen script by starting the execution from the root (Exceptional Scenario) and going through the tree according to the script specifications. That template constructs the header and delimits the body of the aspect object. The name and body content of the aspect class are requested from attribute name, and Given, When and Then child nodes, respectively.

![https://i.imgur.com/SxX6CwA.png](https://i.imgur.com/SxX6CwA.png)