# Browser History Management System (Java)

## Overview

This project is a console-based Java application that simulates how a web browser manages navigation history.

The system allows users to visit pages, go back, go forward, and view browsing history using stack data structures. It is designed to understand how **state management works using Stack**.

---

## Concepts Used

* Stack Data Structure
* Java Collections Framework
* Interface implementation
* Method overriding
* Menu-driven program
* State management logic

---

## Class Structure

### BrowserOperations (Interface)

Defines the core functionalities:

* visitPage()
* goBack()
* goForward()
* showCurrentPage()
* showHistory()

---

### BrowserManager

Implements the browser logic.

Maintains:

* currentPage → currently opened page
* backStack → stores previous pages
* forwardStack → stores forward navigation

---

### Main

Provides menu-driven interaction with the user.

---

## Data Structures Used

```text id="s6g9h0"
Stack<String> backStack
Stack<String> forwardStack
```

---

## Features

### 1. Visit Page

* Opens a new page
* Pushes current page into back stack
* Clears forward stack

---

### 2. Go Back

* Moves current page to forward stack
* Loads the previous page from back stack

---

### 3. Go Forward

* Moves current page to back stack
* Loads next page from forward stack

---

### 4. Show Current Page

Displays the currently active page.

---

### 5. Show History

Displays:

* Back history
* Current page
* Forward history

---

## Sample Flow

```text id="hjchzx"
Visit google.com
Visit youtube.com
Visit github.com

Go Back → youtube.com
Go Back → google.com

Go Forward → youtube.com
```

---

## Learning Outcome

This project helped in understanding:

* How Stack works (push, pop, peek)
* How real-world applications use data structures
* Managing application state transitions
* Designing simple system logic using Java

---

## Author

Nishant Sakesh
CDAC PG-DAC / PGCP AC Batch 2026
