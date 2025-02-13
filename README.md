# Assignment 3 - Implementing Lists

## Objectives

The objective of this assignment is to familiarize with List data structures, including Array-based lists, Singly Linked Lists, and Doubly Linked Lists, as well as implementing generics for reusability.

## Overview

This project involves implementing different types of list data structures in Java. It includes creating a `Song` class, implementing an **Array-based List (AList)**, a **Singly Linked List (SLList)**, and a **Doubly Linked List (DLList)**. Additionally, generic versions of these lists will be developed to support multiple data types. A testing class is also included for extra credit.

## Deadline

**Saturday, February 15, 2024, 9:59 PM**

## Project Structure

The project is implemented in **Java** using **IntelliJ IDEA**.

### Folder Structure:

```
.
├── src
│   ├── Song.java               # Class representing a song
│   ├── AList.java              # Array-based list implementation
│   ├── SLNode.java             # Node for Singly Linked List
│   ├── SLList.java             # Singly Linked List implementation
│   ├── DLNode.java             # Node for Doubly Linked List
│   ├── DLList.java             # Doubly Linked List implementation
│   ├── GenericAList.java       # Generic implementation of AList
│   ├── GenericSLList.java      # Generic implementation of SLList
│   ├── GenericDLList.java      # Generic implementation of DLList
│   ├── Main.java               # Testing class (Extra Credit)
└── README.md                   # Project documentation
```

## Implemented Features

### 1. **Song Class** (7 points)

A simple Java class representing a song with the following attributes:

- `title` (String)
- `artist` (String)
- `length` (double)

### 2. **AList (Array-based List)** (20 points)

Implemented an array-based list that stores **Song** instances, supporting:

- Constructor to create an empty list
- `addy(Song p)`: Adds a new song, resizing the list when necessary
- `removy(int pos)`: Removes the song at a specific position
- `toString()`: Returns a formatted string of all songs in the list

### 3. **SLList (Singly Linked List)** (20 points)

Implemented a **singly linked list** storing **Song** instances, with:

- Constructor initializing an empty list
- `addy(Song s)`: Adds a song to the end
- `removy(int pos)`: Removes a song from a specific position
- `toString()`: Returns a formatted string of all songs

### 4. **DLList (Doubly Linked List)** (20 points)

Implemented a **doubly linked list** storing **Song** instances, with:

- Constructor initializing an empty list
- `addy(Song s)`: Adds a song to the end
- `removy(int pos)`: Removes a song from a specific position
- `toString()`: Returns a formatted string of all songs

### 5. **Generic Implementations** (33 points)

Implemented **AList, SLList, and DLList** as **generic classes** to work with any type of object.

- Generic `AList<T>`
- Generic `SLList<T>`
- Generic `DLList<T>`

### 6. **Extra Credit - Testing Class** (5 points)

A **Main.java** class to test all the implemented data structures with multiple test cases.

## Compilation & Execution

1. Clone the repository:
   ```sh
   git clone <repository_url>
   ```
2. Open the project in **IntelliJ IDEA**.
3. Compile and run **Main.java** to test the implementations.

## Submission Instructions

- Ensure the **GitHub repository link** is correctly submitted on **Canvas** before the deadline.
- The repository should contain:
  - **Java source code**
  - **A PDF with answers to text-based problems**
  - **README.md** (this file)
- Make sure the code **compiles successfully** to avoid penalties.

## Grading Rubric

| Item                             | Points |
| -------------------------------- | ------ |
| Song Class                       | 7      |
| AList (Array List)               | 20     |
| SLList (Singly LL)               | 20     |
| DLList (Doubly LL)               | 20     |
| Generics (AList, SLList, DLList) | 33     |
| **Extra Credit** (Testing Class) | 5      |
| **Total**                        | 100    |

## Author

**Jayden Cruz** 

**Course:** CSC 3130: Intro to Algorithms\
**University:** Belmont University

