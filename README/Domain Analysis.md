# Domain Analysis

The DRESS-ML is formed by _categories_. Each category has a set of _elements_, each of them with a one or a more  _attributes_ that characterise that element. The identified categories, elements, and attributes that compose the DRESS-ML are detailed in table below.

![image](https://user-images.githubusercontent.com/84074511/139712925-e451bed0-5ec9-4237-99e2-bd3f1d1d933c.png)

There are five categories in the DRESS language: _Drone_, _Mission_, _Flight Operation_, _Sensors_ and _Actuators_. The _Drone_ category contemplates the _MotionState_ and _Battery_ elements.

## _MotionState_
_MotionState_ element It encloses attributes associated with the drone movement, which may be in terms of direction maneuver, current position, distance from a position, rotation, speed, acceleration and altitude.

- Maneuver is specified by cardinal directions (such as, north, east, south and west) or direction to a specific region (for example, origin and destination);
- Current position indicates the current geographical position of the drone collected by the GPS (latitude and longitude);
- Distance between the current position of the drone and a given position (drone to regions, obstacles, pre-established points or GPS coordinates);
- Rotation is represented in degrees in principal axes (vertical axis (yaw), transverse axis (pitch) and longitudinal axis (roll));
- Acceleration and speed mode can be automatic or manual, and acceleration and speed level indicates the rate of change applied to the respective physical measure;
- Altitude, also collected by GPS, meaning the height of the drone in relation to the sea level.

## _Battery_
_Battery_ element provides information about the capacity, voltage, electrical current, actual percentage and status of the drone's battery. Drones have limited battery capabilities, therefore it is important to monitor and to ensure that they consume low power.


-------------OLD
The *resources* are a group of abstractions of domain elements that together assume the role of telemetry, flight control, sensor, and actuator. It was composed of three principal components namely the *Control*, *Sensors* and *Actuators*.

The *Control* component combines high-level resources from the remote and built-in smart control and internal state information to realize navigation operations. The Control component was divided in sub-components responsible for managing specific activities: Drone, Mission, RTH,
SafeLand, Landing, TakeOff, EmergencyStopMode, Fight and EmergencySanvingMode.









