# Assignment 3 – Implementing Lists

## Deadline: Saturday, February 15, 2024, 9:59 PM

### Objective:
The goal of this assignment is to implement and work with different types of List data structures in Java. By creating a `Song` class and implementing Array-based, Singly Linked, and Doubly Linked lists to store and manipulate data. Additionally, you will implement a version of each list that uses generics to handle any type of object.

---

## Table of Contents:
1. [Song Class](#1-song-class)
2. [Array-Based List](#2-array-based-list)
3. [Singly Linked List](#3-singly-linked-list)
4. [Doubly Linked List](#4-doubly-linked-list)
5. [Generics Implementation](#5-generics-implementation)
6. [How to Run](#6-how-to-run)
7. [License](#7-license)

---

## 1. Song Class

### Description:
The `Song` class represents a song object, containing information such as the title, artist, and length (in minutes). This class is used throughout the assignment to represent individual songs.

### Attributes:
- `title` (String): The name of the song.
- `artist` (String): The artist of the song.
- `length` (double): The length of the song in minutes.

### Example:
```java
Song song1 = new Song("El Pibe De Mi Barrio", "Dr. Krapula", 2.47);
