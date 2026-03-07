# Smart Home Device Controller (Java)

## Overview

This is a small Java console project created to practice **Abstraction and Interfaces**.

The idea is to simulate a simple smart home setup where devices like lights and fans can be turned on/off and controlled using a remote.
Different devices behave differently, but they follow a common structure defined using an abstract class and an interface.

---

## Concepts Practiced

* Abstract Classes
* Interfaces
* Inheritance
* Method Overriding
* Basic object interaction

---

## Class Design

Device (Abstract Class)

* deviceId
* deviceName
* displayDeviceInfo()
* turnOn() *(abstract)*
* turnOff() *(abstract)*

RemoteControl (Interface)

* increaseLevel()
* decreaseLevel()

LightDevice (Child Class)

* brightness control
* implements RemoteControl
* overrides device behavior

FanDevice (Child Class)

* speed levels
* implements RemoteControl
* overrides device behavior

---

## Program Flow

1. Create device objects (Light and Fan).
2. Display device information.
3. Turn devices on/off.
4. Control brightness or speed using the remote control interface.
5. Print the updated device state to the console.

---

## Sample Output

```
ID: 101 | Device: Living Room LED
Living Room LED is now ON (Glow).
Living Room LED Brightness: 60%

---------------------------

ID: 202 | Device: Master Fan
Master Fan is now spinning.
Master Fan Speed Level: 2
Master Fan Speed Level: 1
Master Fan has stopped.
```

---

## Learning Goal

The goal of this project was to understand how:

* **Abstract classes** define a base structure for devices.
* **Interfaces** allow different device types to share common control methods.
* **Method overriding** enables each device to behave differently while following the same contract.

---

## Author

Nishant Sakesh
CDAC PG-DAC / PGCP AC Batch 2026
