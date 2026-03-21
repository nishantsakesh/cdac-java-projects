# Online Food Order System (Java)

## Overview

This project is a console-based Java application built to simulate the backend logic of a basic food ordering system.

The system allows users to manage a menu, place orders, and process them using a queue. It was designed to practice combining **OOP concepts with multiple data structures** in a single application.

---

## Concepts Used

* Object-Oriented Programming (OOP)
* Encapsulation
* Collections Framework:

  * HashMap (menu storage)
  * ArrayList (order history)
  * Queue / LinkedList (order processing)
* Interface implementation
* Business logic (discount handling)

---

## Class Structure

### FoodItem

Represents a food item in the menu.

* itemId (auto-generated)
* itemName
* price

---

### Order

Represents a customer order.

* orderId (auto-generated)
* customerName
* List of FoodItem
* totalAmount

---

### OrderOperations (Interface)

Defines the operations supported by the system:

* addFoodItem()
* viewMenu()
* placeOrder()
* viewOrders()
* processNextOrder()
* calculateBill()

---

### OrderManager

Handles all business logic:

* Stores menu using HashMap
* Stores all orders using ArrayList
* Manages processing using Queue

---

### Main

Provides a menu-driven interface for user interaction.

---

## Data Structures Used

```text
HashMap<Integer, FoodItem> → menu
ArrayList<Order> → order history
Queue<Order> → order processing
```

---

## Features

### 1. Add Food Item

Add new items to the menu with auto-generated IDs.

---

### 2. View Menu

Display all available food items.

---

### 3. Place Order

* Select multiple items from menu
* Store selected items in a list
* Generate an order
* Add order to:

  * Order history (ArrayList)
  * Processing queue (Queue)

---

### 4. View Orders

Display all placed orders with details.

---

### 5. Process Next Order

Simulate order processing using queue:

```text
First-in First-out (FIFO)
```

---

### 6. Discount Logic

Two types of discounts are applied:

#### Combo Discount

* If more than 3 items → 10% discount

#### High Value Discount

* If total > 1000 → 15% discount

Only the **highest applicable discount** is applied.

---

## Sample Flow

```text
Add Menu Items
↓
View Menu
↓
Place Order (select items)
↓
Order stored in list + queue
↓
Process orders using FIFO
```

---

## Learning Outcome

This project helped in understanding how to:

* Combine multiple data structures in one system
* Manage relationships between objects
* Implement real-world logic using Java
* Build structured, menu-driven applications

---

## Author

Nishant Sakesh
CDAC PG-DAC / PGCP AC Batch 2026
