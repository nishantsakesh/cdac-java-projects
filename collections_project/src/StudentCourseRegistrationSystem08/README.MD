# Student Course Registration System (Java)

## Overview

This project is a console-based Java application that simulates a student registration system.

The system allows adding students, updating course details, searching records, and calculating total fees. It focuses on practicing **HashMap with object storage and business logic**.

---

## Concepts Used

* Object-Oriented Programming (OOP)
* Encapsulation
* HashMap (key-value storage)
* Interface implementation
* CRUD operations
* Business logic (fee calculation)

---

## Class Structure

### Student

Represents a student.

* studentId (auto-generated)
* studentName
* courseName
* fees

---

### StudentOperations (Interface)

Defines system operations:

* addStudent()
* viewStudents()
* searchStudent()
* updateCourse()
* removeStudent()
* calculateTotalFees()

---

### StudentManager

Handles logic:

* Stores students using HashMap
* Performs CRUD operations
* Applies discount logic

```text id="1v8s3q"
HashMap<Integer, Student>
```

---

### Main

Provides menu-driven interface.

---

## Features

### 1. Add Student

Register a student with auto-generated ID.

---

### 2. View Students

Display all registered students.

---

### 3. Search Student

Find student by name.

---

### 4. Update Course

Update course name and fees using ID.

---

### 5. Remove Student

Delete student using ID.

---

### 6. Calculate Total Fees

Apply discount rules:

* Fees > 20,000 → 10% discount
* Fees > 50,000 → 15% discount
* Only highest discount applied

---

## Sample Flow

```text id="6x2m9p"
Add Student
↓
View Students
↓
Update Course
↓
Calculate Fees
```

---

## Learning Outcome

This project helped in understanding:

* How HashMap manages data efficiently
* How to implement real-world logic
* How to structure Java applications

---

## Author

Nishant Sakesh
CDAC PG-DAC / PGCP AC Batch 2026
