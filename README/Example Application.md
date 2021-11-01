# Example Application
Forest Fire Application Executions:

The forest monitoring is intended to collect data about the evolution of fire deviation and to assist teams in the control of fire spots, thereby helping to protect to the environment and riverside communities.

![image](https://user-images.githubusercontent.com/84074511/139732567-5df75e7b-04ca-4bff-a8bd-b86b493aad55.png)

The environment of the proposed drone application was created using the Dragonfly tool and is shown in figure aboce. It illustrates a forest crossed by a river, represented by the blue squares, and regions of land. In addition, there are houses representing riverside communities and antennas that perform transmission and reception radio and TV signals. The drone will start at a home point that is located at the west side of the forest (represented by a circle with a letter H inside), it will fly over the forest following the flight plan and monitoring the environment, and it will land at the destination point (also indicated by a circle with a letter H) in the east side of the forest.

The drone flight can be carried out either automatically or manually. In the first one, the pilot creates the flight plan and loads it on the drone before starting the mission, while in the other one, the pilot can control the drone manually using a remote control. If necessary, the pilot can change the drone's flight mode.

Given that, the objectives of the application are (i) to monitor fire outbreak and (ii) to minimise drone losses. The exceptional scenarios were elaborated based on these goals. The drone will monitor the forest by using its sensors, such as camera, smoke detector and GPS.

![image](https://user-images.githubusercontent.com/84074511/139732119-aa0a192f-6c35-4025-bf48-232d83da0fb8.png)

**For ease of understanding, the execution of exceptional scenarios were exercised in the Dragonfly Simulator:** 

https://drive.google.com/drive/folders/1HPAnVDhr5XRj4YnXWf_rF-ujZYaDbCRk?usp=sharing


## MoveAside

Figure below depicts the exceptional scenario _MoveAside_ modelled using DRESS-ML. The exceptional scenario happens when the drone: (i) is flying over either a water region or region with fire; (ii) the wind is not strong; (iii) and the drone is at least 2000 m away from the target. This is represented by the join point 1 in the Figure General Scenarios. Note that, at this moment, the domain expert is interested in specifying the conditions that apply for the exceptional scenario regardless how the information will be acquired (e.g, how to know that the drone is above water). This will be translated to a drone platform or simulator by a technology expert in the code generation process.

![image](https://user-images.githubusercontent.com/84074511/139736790-5af0b6e8-f952-4d86-af9a-b34b0e07899f.png)


The _When_ clause indicates that a safe landing would be executed, but by following the specification of the _Then_ clause, the self-adaptive behaviour must occur before the execution of the safe landing command, since the advice \textit{Before} has been used. In this case, the drone verifies whether it is still over either water region or region with fire and, if so, it moves aside. This is performed  until it reaches a no-fire land. After the adaptive behaviour has been finished, then the safe landing command is executed.   

## KeepFlying
The purpose of the _KeepFlying_ exceptional scenario is to enable the drone to continue flying towards the destination when there are favorable conditions instead of a safe landing operation. This situation, it is understood as favorable conditions when the strong wind moves towards the destination location (east), and the distance to the destination location is less than 2000 meters, enabling the drone to reach its destination. And after this new behavior is realized, the drone can perform its predefined behavior flow.

Figure shows _KeepFlying_ exceptional scenario specified using DRES-ML. The conditions for triggering the adaptation should be implemented in the Given clause. Therefore, to compose the conditions shown in Figure general scenarios, two logical expressions were needed using the conjunctive operator "and", enabling the implementation of three conditional resource expressions.

![image](https://user-images.githubusercontent.com/84074511/139733223-4cd4faf1-31cd-4f3b-a37c-f15e8a2ce251.png)

The _Relative distance_ conditional expression is used to compere the drone's distance to a  destination region ("DESTINATION") with a distance in meters (2000) using a comparative operator ("less than"). To compare the wind speed, the _ wind speed _ conditional expression is used, which also uses a comparative operator ("equal to") and a speed value in m/s. The _wind direction_ conditional expression allows implementing the condition that verifies the wind direction, then it is passed an operator ("equal to") and a direction value ("EAST").

The When clause is implemented with the safe landing start event (indicated by the _Safelanding_ scenario) to represent that the interception must be performed when this event is invoked (see joint point 1). Note that if the exception scenario is executed, it replaces the predefined event. Therefore, the adaptation strategy has to be of type "around", as indicated in the When clause. In addition, this clause links to an adaptive behavior script called "goDestination". 

Finally, the adaptation script is implemented using command resources and statements. The modeled script must perform a repetition of the command that makes the drone to fly towards the destination region while it does not arrive at the destination. This modeling was performed using the _While_ statement.

The _while stop_ condition was implemented with _relative distance_ conditional expression, in which the distance relative to the destination region ("DESTINATION") is compared to 0 meters using the equality operator "not equal to". And drone while`s body was specified with a _maneuver direction_ command, which makes the drone to maneuver the flight towards the destination region ("DESTINATION").

Thus, the adaptation entitled "goDestination" collaborates with the objective (ii) of the application, enabling the drone to reach its destination.

### SwitchToManual

A proper operation of the GPS is necessary for the drone to follow the controller's flight plan since the waypoints are defined with latitude, longitude, and altitude, the information provided by that sensor. Thus, another situation that can cause an RTH operation is when the drone has a faulty connection to the GPS. Therefore, the drone should be gliding for a while or even perform some random movements until a good signal is reestablished. Based on that, the _SwitchToManual_ scenario was defined, causing the pilot to take control of the drone and preventing the drone from performing the RTH when it is close to the destination (see Figure General Scenarios).

![image](https://user-images.githubusercontent.com/84074511/139733450-21954984-4485-465a-9098-544c204e8412.png)


The implementation of SwitchToManual using DRES-ML syntax was shown in Figure above. The condition that guards this scenario is implemented inside of the _Given_ clause using the associated expressions that handles comparisons of the status of the GPS and flight resources, and comparative expression to the relative distance of drone.

To intercept the RTH scenario (join point 4), the _return to home starts_ event is implemented in the _When_ clause. In order to override the execution of the RTH predefined scenario with the adaptation called "turnManual", it was used the adaptation type "Around" in _Then_ clause.

The script in the _Then_ clause defines the _start manual flight control_ as a necessary adaptation. Thus, the drone control changes to the manual, enabling the pilot to take over the flight and to conduct it in the safest way possible. Thus, this adaptation collaborates so much with the objective (i) because the pilot can enable the continuity of the environment monitoring.

### SafeRTH
The Return to Home (RTH) operation (_RTH_ scenario) is a useful drone protection feature. When a drone control error occurs (for example, signal lost), it ascends to the pre-defined RTH height and starts to flying back straight to the initial location (home point). However, if the height has not been adjusted correctly to avoid tall obstacles, such as trees, antennas, and others, and the obstacle avoidance sensor does not work correctly, the drone can collide.

Thus, the _SafeRTH_ exceptional scenario performs a safe landing operation to guarantee the drone's safety in the situation where there is a malfunction in the collision sensor during the RTH operation. It is worth mentioning that this adaptation can bring new situations that require other adaptations, such as _MoveAside_ or _Keepflying_ (as can be seen in Figure General Scenarios).

![image](https://user-images.githubusercontent.com/84074511/139735316-e662aacb-ae23-4bcb-b504-6dda2d336d9f.png)

The modeling of this described scenario using DRES-ML syntax can be seen in Figure above. The _Given_ clause was implemented using a logical expression containing inner expressions about the status of the RTH and the collision sensor, associating them by an "and" operator.

The first internal expression compares, using the "equal to" as comparison operator, the status of the _return to home_ operation with the "STARTED" status. This condition validates whether the drone is performing a return home operation. The last internal expression checks whether the status of the obstacle sensor is equal to the error value, representing the situation in which that resource is faulty. These expressions represent the implementation of the guard for SafeRTH.

As can be seen, join point 3 (see Figure General Scenarios) allows interception in the predefined Flying scenario. This is modeled within the When clause using the drone maneuver direction event without defining a specific direction (wildcard "*"). This strategy is important because, whatever the direction of the drone's maneuver is, the intercept point can be used.

In the Then clause, "Around" is used to prevent that the drone continues maneuvering and make it to perform the adaptive behavior modeled within the script named "newSafeLand". The script that defines adaptive behavior forces only staring a safe landing command, assuming that making an safe landing is safer for the drone than it keep performing flight maneuvers towards home without monitoring the collision sensor. Therefore it reduces the loss of drones, objective (ii) of the application.

### MonitorEnvironment

To carry out an efficient monitoring environment, the smoke sensor is used together with a visual monitoring (camera) so that the pilot can view possible fires during the drone's mission. When the drone detects a region with fire through the smoke sensor, it takes some pictures of the environment for a further analysis of the firefighters and provides visual hints to assist in the location for any local combat operation. However, when a malfunction occurs with the camera, the drone must fly around the fire source position. These steps make it possible to restrict the area using GPS data.

![image](https://user-images.githubusercontent.com/84074511/139735591-4c42a8c0-eca9-474b-932a-f010f2e7e64a.png)

In this scenario, it was assumed that the fire detection is carried out from the source to the destination. Thus, Figure above illustrates the movements necessary to restrict the fire area used in the adaptation. The triangle represents the region where the smoke sensor detected the fire, while the circle indicates the end of the adaptive behavior. Besides, each numbered arrow indicates the direction and order of the required movements.


Figure below shows the _MonitorEnvironment_ exceptional scenario's implementation using the DRES-ML syntax. The condition is implemented, in the Given clause, using the status of the camera actuator and the result of smoker detector sensor expressions, both associated by the operator "and". The first one is compared to the "DETECTED" value using an equality operation ("equal to"), and the last one is compared to the "STARTED" value using an unequal operator ("not equal to").

![image](https://user-images.githubusercontent.com/84074511/139735611-8a8b8789-84c0-4391-b54a-3b330ad655a2.png)

The join point 3 (see Figure General Scenarios) is the interception of the _Flying_ scenario, however, _MonitorEnviroment_ determines the drone's maneuver event for a specific direction "EAST". In addition, this interception is realized before the _Flying_ scenario, thus, the adaptation strategy "Before" is used in the Then clause and the adaptation script called the "framework" is indicated. The necessary adaptation are implemented using the drone maneuver commands passing the necessary directions. This adaptation allows monitoring to be carried out even in such an emerging situation, therefore it collaborates with the objective (i) of the application.

It is worth mentioning that it was assumed that the drone is flying from west to east and that these commands are appropriate for that context situation being able to perform the expected adaptation (demarcate the area containing the fire).

### EmergencyCamera

Although the camera is used to support monitoring the flight region, it can also be used as an instrument to assist in locating a lost drone. Based on this premise, the _EmergencyCamera_ exceptional scenario was created.

When the drone needs to realize a safe landing and has a problem with the GPS (as shown in the condition in Figure General Scenarios, localizing, it may be challenging. Therefore, photos or videos that the camera can provide indications to assist in locating the drone. This scenario applies the emergency mode that reduces the drone's battery consumption, turns on the camera directed either to the origin or to the destination locations through the gimbal, depending on which one is closer.

![image](https://user-images.githubusercontent.com/84074511/139735900-069161ab-5b31-4067-9f38-e5aa2c9ed8f3.png)

Figure above shows the implementation of this scenario using the DRES-ML. The _When_ clause contains a conditional expression that handles GPS status, comparing it to the error status ("ERROR") using the comparison operator ("equal to").

As can be seen in Figure General Scenarios, that the join point 2 intercepts after the execution of the SafeLanding exceptional scenario. Therefore, it is modeled using the _safe landing event starts_ inside the When clause, and "After" is specified in the Then clause, representing the type of adaptation. Besides, in the last clause, it is indicated which script represents the adaptive behavior by name, in that situation, called "helperCamera".

Finally, it was modelled the script in terms of command and flow statements. Thus, they are executed to start the camera, start the manual gimbal and start the energy saving mode. To allow the camera to point to the nearest region between origin and destination, it is used the _if-else _ statement with the condition being modeled using the _comparative relative distance_ expression. It checks if the drone's distance from the origin is less than the destination's distance. If the drone distance to the origin is smaller, the drone should point the camera to the west using gimbal rotation event. In this case, the drone rotates the camera to 180 degrees on the yam axis. Otherwise, the drone rotates to 0 degrees also on the yam axis. It is worth mentioning that it was assumed that the drone always initiates it mission in the west and has the destination in the east, as stated in the problem description. This adaptation tries to maximize the change of the drone to be tracked in a situation where the drone is lost, therefore it assists in the objective (ii) of the system.
