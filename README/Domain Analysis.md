# Domain Analysis

The *resources* are a group of abstractions of domain elements that together assume the role of telemetry, flight control, sensor, and actuator. It was composed of three principal components namely the *Control*, *Sensors* and *Actuators*.

The *Control* component combines high-level resources from the remote and built-in smart control and internal state information to realize navigation operations. The Control component was divided in sub-components responsible for managing specific activities: Drone, Mission, RTH,
SafeLand, Landing, TakeOff, EmergencyStopMode, Fight and EmergencySanvingMode.

The *Drone* sub-component deals with operations directly associated with the drone movement,which may be in terms of direction maneuver, current position, distance from a position, rotation, speed, acceleration and altitude.

- Maneuver is specified by cardinal directions (such as, north, east, south and west) or direction to a specific region (for example, origin and destination);
- Current position indicates the current geographical position of the drone collected by the GPS (latitude and longitude);
- Distance between the current position of the drone and a given position (drone to regions, obstacles, pre-established points or GPS coordinates);
- Rotation is represented in degrees in principal axes (vertical axis (yaw), transverse axis (pitch) and longitudinal axis (roll));
- Acceleration and speed mode can be automatic or manual, and acceleration and speed level indicates the rate of change applied to the respective physical measure;
- Altitude, also collected by GPS, meaning the height of the drone in relation to the sea level.