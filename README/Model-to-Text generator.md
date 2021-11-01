# Model-to-Text generator

![https://i.imgur.com/1PSMkdk.png](https://i.imgur.com/1PSMkdk.png)

The DRESS-ML has been designed to be attached with different ModelToText (M2T) generators, which means that it can generate code or scripts representing the specified exception scenarios to distinct target platforms.

A generator is a translator that maps elements of the model to elements of another model, thus allowing the conversion between them. This translation can be achieved by either a model-to-model transformation, generating a new model as output, or a model-to-text transformation, generating text or source code as output. A target platform is where the generated code has to run on at the end of the process, then it needs to be platform understandable. It is common to assume that there are several target platforms, therefore each target platform has to have a specific generator.

### MoveAside Wrapper Generator (detailed process)

An export is made to the Dragonfly tool using an M2T process in which it transforms models implemented using DRESS-ML for wrapper code.

Figure below shows the mapping between the BDD concepts used in the DRESS-ML and the AOP technique for creating wrappers for the Dragonfly tool. The state of the context (Given), along with the occurred event (When), represents the conditional pointcut, the adaptive behavior (Then) represents a advice.

![https://i.imgur.com/N1amdLg.png](https://i.imgur.com/N1amdLg.png)

The MoveAside exceptional scenario implemented in DRES-ML is used to exemplify how TextGen performs to generate wrapper code. Figure below exhibits the modeled AST and the generator script for that example. The nodes, the child nodes, properties of AST are shown through regular boxes, while the scripts to produce the wrapper code using the Textgen language based on each in node are shown through dashed boxes.

The M2T process, through the implemented script, obtains the necessary information from the AST to create the target code using the Textgen language. Therefore, it provides in its syntax instructions for getting information from each node, such as ${node.child} and ${attributed node}, to obtain information from a child node and from attributes from current node, respectively. The values that do not follow this syntax are constants, such as "public aspect" in the Exceptional Script node.

The generator performs the transformation process using the defined template by the TextGen script by starting the execution from the root (Exceptional Scenario) and going through the tree according to the script specifications. That template constructs the header and delimits the body of the aspect object. The name and body content of the aspect class are requested from attribute name, and Given, When and Then child nodes, respectively.

The sub tree of the AST that specifies the Given clause represents actual context of drone and environment forming the condition of advice. This is designed with conjunctive associations (logical expressions related by logical operators \&\& ) of expressions of drone resources in relation to distance of regions and wind speed. These expressions contain templates that use the Dragonfly API and values specified in the attributes of each resource node to define the conditions understandable by the tool.

The _Safe Landing_ event is the join point to the adaptive behavior of _Move Aside_, thus the _When_ node contains the template that declares the pointcut and it child specifies the signature of the method from tool's API that represents this event.

The Then node contains the device type specification (before, after or around) and specifies instructions for the drone to perform the expected adaptation. This new behavior was translated using _while_ statement (repetition structure) to execute command for the drone repetitively, while it is not flying over a land region. The repetition stop condition was built using a method defined in the tool's API that returns the drone's distance to a region passed by parameter as a String. That distance is obtained through value defined in current node from the region attribute (WATER). Furthermore, for the operator (==) and the value for comparison (0) are obtained from the same node through the values specified for the operator and the distance attributes. In addition, the body of statement contains maneuver commands to land. It is translated by an API method of the tool causing the drone to maneuver to a position that approaches the passed region (LAND).

![https://i.imgur.com/SxX6CwA.png](https://i.imgur.com/SxX6CwA.png)

After the M2T process has been carried out, an artifact is produced containing the _MoveAside_ exceptional scenario using the wrapper technique and using API commands of the target tool (Figure below). Thus, the artifact can be compiled and executed together with the Dragonfly simulator. 

![image](https://user-images.githubusercontent.com/84074511/139753167-d2942172-8735-41fc-b2b3-c7c847119174.png)

### Keepflying Wrapper Generator

Figure below represents the corresponding wrapper for the _KeepFlying_ exceptional scenario. The conditional pointcut is defined by the _When_ and _Given_ clauses. The former represents the call of the safe landing method of the tool's API (join point), while the latter implements the conditional expression of pointcut inside the _if_'s guard. They check whether the wind direction is to the east and its speed is greater or equal than 5 m/s, and the distance of the drone from destination is smaller than 2000 meters (meaning 2 cells of environment panel of the Dragonfly). These conditions are implemented by the accessible methods e_nvironment.getWindDirection_ - returning a wind direction string value, _environment.getWindSpeed_ - returning a speed wind integer value and _drone.getDistance_ - returning an integer value of the drone's distance to a specified region, from environment and drone entities of the simulator.

The Then clause specifies the advice that implements the adaptive behaviors. The statements needed for adaptation are grouped within a method that is called within the body of the advice. The adaptation is implemented using the _While_ structure and the _drone.directionManeuver_ method, while receives parameters directing the drone to the destination location. Besides, that clause specifies the advice type that is implemented at the beginning of the advice signature.

![image](https://user-images.githubusercontent.com/84074511/139753455-14baf715-36e8-4b2b-9d11-a9b9dc8aeba1.png)


### SafeRTH Wrapper Generator

Figure below shows the generated wrapper of _SafeRTH_ exceptional scenario. It uses an around advice in the join point that performs drone maneuvers for any direction (_drone.directionManeuver(*)_). The conditions of the pointcut are implemented using a methods of the drone's API that get the state of the _return to home_ operation and the state of the collision sensor. They verify whether it is performing the operation to return to the home point (_drone.isReturningToHome()_) and check if the collision sensor is failing (_drone.getCollisionSensorState()_ == "FAILURE"). The adaptation represented by the advice implements a forced landing through the_ safelanding()_ method. 

![image](https://user-images.githubusercontent.com/84074511/139753645-36fc1c79-906c-4bf7-92d5-16f6dd556fe5.png)

### SwitchToManual Wrapper Generator

Figure below shows the generated wrapper from _SwitchToManual_ exceptional scenario. The _RTH STARTS_ event in DRES-ML is represented by ReturnToHome method call, building the pointcut implementation. To validate whether the GPS resource is in an error status, it is implemented using a GPS API method (_drone.getGPSState()_) that is compared to "FAILURE". In addition, methods of the drone API are used to check the distance to a defined region (_drone.getDistance()_) and to check whether drone is running an automatic flight, (it is used the _isAutomatic()_ method). The adaptive behavior is facilitated by the method already implemented in the drone API, _setIsAutomatic(false)_, forcing the manual pilot control.

![image](https://user-images.githubusercontent.com/84074511/139753766-e51763dc-1156-43bc-8972-4b46a6c57827.png)

### MonitorEnvironment Wrapper Generator

Figure below illustrates the wrapper created from the exceptional scenario _MonitorEnvironment_. The pointcut is implemented using the _directionManeuvre()_ method included in the drone API. In order to check if the status of the camera actuator is not started, it is used the _getCameraState()_ method of the drone entity and compared whether its value is different from "ON". In addition, to perform the framework flight looking for fire, call the maneuvre method _(drone.directionManeuvre())_ were used indicating in the parameter the direction obtained from the drone resource attribute.

![image](https://user-images.githubusercontent.com/84074511/139753868-d1ff50f8-ea36-442f-bdfc-ec6000d79dbf.png)

### EmergencyCamera Wrapper Generator

The _EmergencyCamera_ exceptional scenario has the generated wrapper represented in Figurebelow. As already known, the _SafeLanding starts_ event is implemented in a pointcut of the _safeLanding()_ join point and the verification of the GPS status inside the Given clause is mapped to the condition of the advice implemented through the _drone.getCameraState()_ method. To implement the commands to start the camera and the automatic gimbal, it is necessary to use the modifiers _setCameraState()_ and _setGimbalState()_ passing as parameter "ON" for each resource and, to start the drone's Energy Saving mode, it is necessary to use the _setEconomyMode(true)_ method. The _setGimbalDirection()_ method of the drone entity is capable of indicating the desired rotation in yam axis for which the degree of rotation is implemented as directions.

![image](https://user-images.githubusercontent.com/84074511/139753945-7f0235d4-9afb-4698-ac18-7a0208249330.png)

