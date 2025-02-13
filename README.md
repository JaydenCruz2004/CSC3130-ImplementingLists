# Assignment 3 – Implementing Lists

## Overview
This project involves implementing three types of lists in Java to work with a Song class. The project covers implementing an Array-based List, Singly Linked List, and Doubly Linked List. Additionally, the project involves creating generic versions of these lists, enabling them to handle any type of object, not just Song instances.

## Objectives
The goal of this assignment is to familiarize with the basics of List data structures, such as:
- Creation of lists
- Adding elements
- Removing elements
- Traversal of lists

## Structure
This project consists of the following components:

1. **Song Class**: A class representing a song with attributes such as title, artist, and length.
2. **AList (Array-based List)**: An array-based list that can store Book instances, with methods to add, remove, and print elements.
3. **SLList (Singly Linked List)**: A singly linked list that stores Song instances, with methods to add, remove, and print elements.
4. **DLList (Doubly Linked List)**: A doubly linked list that stores Song instances, with methods to add, remove, and print elements.
5. **Generics Implementation**: The AList, SLList, and DLList are implemented using generics, making them flexible to work with any type of object.

## Requirements

### 1. Song Class
Create a class to represent a song in Spotify with the following attributes:
- **title** (String)
- **artist** (String)
- **length** (double)

Example:
```java
Song song1 = new Song("El Pibe De Mi Barrio", "Dr. Krapula", 2.47);
