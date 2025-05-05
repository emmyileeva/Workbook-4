# Workbook 4 – Java Practice Projects

This folder contains my Java exercises from Workbook 4.  

---

## 📘 Exercises Included

### ✅ ToDoApp
- Builds a simple to-do list and note-taking app using object-oriented programming
- Defines and uses the following classes:
  - `Note` – represents a note with title, content, subject, and date
  - `ToDoItem` – extends `Note` to add completion status, due date, and priority
  - `NoteManager` – manages a list of notes and to-do items; includes search, sort, and filter features
  - `TodoList` – tracks a list of tasks and calculates overall progress
  - `MenuUI` – placeholder for user interface logic (not yet implemented)
  - `Main` – entry point that creates and displays a sample note
- Great practice for:
  - Building and organizing classes using OOP principles
  - Using inheritance and method overriding
  - Managing collections with `ArrayList`
  - Filtering and sorting objects
  - Working with dates using `LocalDateTime`

### ✅ HotelOperations
- Builds core classes for a hotel application using object-oriented programming
- Defines and uses the following classes:
  - `Room` – tracks beds, price, occupancy, cleanliness, and availability
  - `Reservation` – stores guest stay info, calculates price with weekend adjustment
  - `Employee` – tracks employee payroll, including regular and overtime hours
- Great practice for:
  - Using constructors to initialize objects
  - Writing derived getters and conditional logic
  - Encapsulating data with private fields and public methods
  - Working with class design for real-world use cases
- Exercise 2 updates:
  - `Room` – added `checkIn()`, `checkOut()`, and `cleanRoom()` methods to handle room status
  - `Employee` – added `punchTimeCard()` to track hours worked using time inputs
- Great practice for:
  - Adding behavior (methods) to existing classes
  - Updating object state based on method actions
  - Working with time tracking and basic calculations

---

## ✨ What I Learned
- How to create and extend Java classes using object-oriented programming  
- How to store and manage objects using `ArrayList`  
- How to filter and sort data based on fields like subject and date  
- How to build a flexible structure for future app features  
