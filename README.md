# Food Delivery Billing System (Java)

## Overview

This project is a simple Java console application that demonstrates **Inheritance and basic business logic implementation** using an example of a food delivery platform.

The system models different types of restaurants and calculates delivery charges or final bills based on restaurant type.

---

## Concepts Used

* Java Classes and Objects
* Inheritance
* Constructor usage
* Method implementation
* Code reuse through parent class

---

## Class Structure

Restaurant (Parent Class)

* restaurantId
* restaurantName
* location
* displayRestaurantInfo()

FastFoodRestaurant (Child Class)

* deliveryChargePerKm
* calculateDeliveryCharge()

FineDiningRestaurant (Child Class)

* serviceChargePercentage
* calculateBill()

---

## Program Flow

1. Create restaurant objects.
2. Display restaurant information.
3. Calculate delivery charges for fast food restaurants.
4. Calculate final bill including service charge for fine dining restaurants.

---

## Sample Output

```
Restaurant Id: 101
Restaurant Name: Burger Hub
Location: Bangalore
Delivery Charge per Km: 10.0
Distance: 5 km
Total Delivery Charge: 50.0

Restaurant Id: 202
Restaurant Name: Royal Dine
Location: Bangalore
Food Amount: 2000.0
Service Charge: 10.0%
Final Bill Amount: 2200.0
```

---

## Learning Objective

This project demonstrates how **inheritance helps reduce code duplication** by allowing child classes to reuse properties and methods from a parent class.

---

## Author

Nishant Sakesh
CDAC PG-DAC / PGCP AC Batch 2026
