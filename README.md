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
- Exercise 3 updates:
  - `Employee` – added overloaded `punchIn()` and `punchOut()` methods that use the current time
  - `Hotel` – new class that tracks room inventory and bookings for King Suites and Basic Doubles
    - Includes logic for checking availability and booking rooms
    - Adds derived getters: `getAvailableSuites()` and `getAvailableRooms()`
- Great practice for:
  - Method overloading and using `LocalDateTime`
  - Designing multiple constructors
  - Managing object state and availability logic
- Exercise 4 updates:
  - Created `RoomTest` to verify methods like `checkIn()`, `checkOut()`, and `cleanRoom()`
    - Ensured proper room status changes and restrictions (e.g., can't check in if already occupied)
  - Created `EmployeeTest` to verify punch-in and punch-out time tracking logic
    - Tested time calculation for hourly tracking using assertions
- Great practice for:
  - Writing unit tests using JUnit
  - Testing class behavior and verifying object state
  - Using assertions to catch bugs early and ensure expected behavior

---

## ✨ What I Learned
- How to create and extend Java classes using object-oriented programming  
- How to store and manage objects using `ArrayList`  
- How to filter and sort data based on fields like subject and date  
- How to build a flexible structure for future app features  
