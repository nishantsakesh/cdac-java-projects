# Library Book Management System (Java)

## Overview

This project is a simple Java console application created to practice **Java Collections** while building a small library management simulation.

The program allows a user to add books, view available books, borrow books, and return them.
If a book is already borrowed, the system places the request into a waiting queue.

The goal of this project was to understand how collections like **HashMap** and **Queue** can be used to manage objects in a real-world scenario.

---

## Concepts Practiced

* Java Classes and Objects
* HashMap (for storing books)
* Queue / LinkedList (for managing waiting list)
* Menu-driven program
* Basic object management

---

## Class Design

bookobj

* bookid
* title
* author
* isAvailable

This class represents a book in the library.

---

librarymanager

Handles all library operations.

Responsibilities:

* addBook() → add a new book to the system
* viewBooks() → display all stored books
* borrowBook() → borrow a book if available
* returnBook() → return a borrowed book and assign it to the next waiting user if any

Books are stored using:

```id="xumg8a"
HashMap<Integer, bookobj>
```

The waiting list is maintained using:

```id="ujtsov"
Queue<bookobj>
```

---

book (Main Class)

This class runs the application and provides a simple menu for the user.

The menu allows users to perform operations like:

1 Add Book
2 View Books
3 Borrow Book
4 Return Book
5 Exit

---

## Program Flow

1. The user starts the program.
2. Books can be added to the library system.
3. All books can be viewed from the collection.
4. A user can borrow a book if it is available.
5. If the book is unavailable, the request goes into a waiting queue.
6. When the book is returned, the next request from the queue is processed.

---

## Example Menu

```
1.Add 2.View 3.Borrow 4.Return 5.Exit
```

---

## Learning Goal

This project was built to understand how **Java collections manage data structures efficiently**.

Using a **HashMap** allows quick lookup of books using the book ID, while a **Queue** helps maintain the order of requests for unavailable books.

---

## Author

Nishant Sakesh
CDAC PG-DAC / PGCP AC Batch 2026
