# Domain Analysis

The DRESS-ML is formed by _categories_. Each category has a set of _elements_, each of them with a one or a more  _attributes_ that characterise that element. The identified categories, elements, and attributes that compose the DRESS-ML are detailed in table below.

![image](https://user-images.githubusercontent.com/84074511/139712925-e451bed0-5ec9-4237-99e2-bd3f1d1d933c.png)

There are five categories in the DRESS language: _Drone_, _Mission_, _Flight Operation_, _Sensors_ and _Actuators_. The _Drone_ category contemplates the _MotionState_ and _Battery_ elements.

## _MotionState_
_MotionState_ element encloses attributes associated with the drone movement, which may be in terms of direction maneuver, current position, distance from a position, rotation, speed, acceleration and altitude.

- Maneuver is specified by cardinal directions (such as, north, east, south and west) or direction to a specific region (for example, origin and destination);
- Current position indicates the current geographical position of the drone collected by the GPS (latitude and longitude);
- Distance between the current position of the drone and a given position (drone to regions, obstacles, pre-established points or GPS coordinates);
- Rotation is represented in degrees in principal axes (vertical axis (yaw), transverse axis (pitch) and longitudinal axis (roll));
- Acceleration and speed mode can be automatic or manual, and acceleration and speed level indicates the rate of change applied to the respective physical measure;
- Altitude, also collected by GPS, meaning the height of the drone in relation to the sea level.

## _Battery_
_Battery_ element provides information about the capacity, voltage, electrical current, actual percentage and status of the drone's battery. Drones have limited battery capabilities, therefore it is important to monitor and to ensure that they consume low power. 

## _Flight Operation_
The _Flight Operation_ category contains elements responsible for managing specific flight activities: SafeLand, Landing, TakeOff, EmergencyStopMode, EmergencySavingMode, FlightControl and RTH. Elements that have only the _status_ attribute have been grouped, as seen in table.

- _Takeoff_ and _Landing_ elements represent operations for drone take off and landing, respectively;
- The _Safeland_ element deals with an operation to force landing in situations that may be considered dangerous for the drone (for instance, low level of battery, hardware/software errors or GPS failure);
- The _EmergencyStopMode_ element manages operation to disarm the motors if the drone has a critical error during the flight;
- The _EnergySavingMode_ element sets battery level thresholds, which should trigger warnings to the pilot or to pre-defined operations (for instance, safe landing and RTH);
- _FlightControl_ handles two possible flight modes: manual or automatic, each of them with their specific status. The former is possible via remote controller to manipulate limited features of the flight, while the latter is performed through high-level flight automation.

## _Mission_
The _Mission_ category models automate flight elements:
- The_Circuit_ means that the drone repeatedly flies in circles with respect to a specified point. The _FollowMe_ makes the drone to follow a specific GPS coordinate. They expose _waypoints_, which consist of a set of coordinates of interest (three-dimensional position) that the drone will fly to, and a _status_ that indicates the situation of the mission.
- The _RTH_ element represents the execution of the return-to-home operation, a useful safety feature that helps bringing the drone back to the journey start waypoint. Therefore, this resource has an attribute to represent the home point and another one that determines the situation of this operation (status).

## _Sensor_

The _Sensor_ category is responsible for telemetry and monitoring the environment in order to support the others categories. We have identified the following sensor elements: GPS, Inertial Measurement Unit (IMU), Accelerometer, Gyroscope, Compass, Magnetometer, Barometer, Anemometer, Thermometer, Hygrometer, SmokeDetector, and ObstacleAvoidance, and Camera.

- The _accelerometer_ measures the acceleration forces that the drone is subjected. Besides, it is also used to estimate linear acceleration in horizontal and vertical direction. This data can be used to calculate speed and direction.
- The _Gyroscope_ detects angular velocity in three axis, thus calculates angle in pitch, roll and yaw. It controls the speed dynamically to provide stability to the drone and to also ensure that the drone rotates at the exact expected angle.
- The _Compass_ provides information of magnetic field and then detects geographical direction.
The_Magnetic_ material can create variables in the sensor reading, thus calibration operations can be used to deal with possible interference and avoid accidents.
- The _Barometer_ converts atmospheric pressure into altitude, thereby it helps to achieve the desired altitude.
- The _IMU_ represents the inertial measurement unit sensor, which measures linear and angular velocity and attitude using data from other sensors, such as accelerometer, gyroscope and sometimes magnetometers. That unit works when the GPS is unavailable. 
- The _ObstacleAvoidance_ resource deals with the sensor that detects objects near the drone. The Global Positioning System (GPS) resource is used to determine the ground position of the drone. Both resources have result and status attributes. The first one represents the detection or not of an object and the other one represents strength of the GPS signal, respectively. The latter (status attribute) represent internal state of each sensor. 
- The _Anemometer_ resource handles the sensor that measures wind speed and direction, and provides information about the anemometer state.
- The _Thermometer_ resource wrappers the sensor that collects external temperature and also gives thermometer status.
- _Hygrometer_ and _SmokeDetector_ are resources that handle sensors for more specific applications. The former deals with the sensor used to measure relative humidity (humidity attribute), which is the amount of vapor in the air compared to the maximum amount possible. The latter manages the sensor that detects smoke (result attribute), indicating fire in the vicinity. Both features have a status attribute to display the status of each sensor.
- The _Camera_ element exposes the cameras action and status. It has a focus point attribute that allows the camera to fix the focus in a geographic position and automatically remain it during the flight.

## _Actuator_
The _Actuator_ category deal with elements that convert energy into mechanical movement in order to iterate the drone with the environment. We have included the following actuators: Gimbal, Light, LandingGear, and Payload

- The _Actuator_ concept deal with elements that convert energy into mechanical movement in order to iterate the drone with the environment.
- Gimbal element supports camera stabilization allowing the camera to remain horizontal regardless of the motion performed. The _Gimbal_ element treats gimbal motion control through rotation (rotation angle), axis (axis that the rotation is being applied) and mode (whether operations are automatic or manual). In addition, this element has a status attribute.
- The _Light_ element provides accesses information about on-board lights. Usually, lights are necessary to minimize the chance of collisions.
- The _LandingGear_ element prevents the drone from touching the ground when landing or taking off, as well as the gimbal/camera. Furthermore it absorbs the landing shock on any sudden landings.
- The _Payload_ element expresses the device that provides package/payload delivery.
