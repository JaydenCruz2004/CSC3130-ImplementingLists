# Assignment 3 – Implementing Lists

## Deadline: Saturday, February 15, 2024, 9:59 PM

### Objectives:
- Familiarize yourself with the basics of List data structures (i.e., creation, addition, removal, traversal).
  
## Description:
This assignment involves implementing different types of lists and manipulating song data in Java. You will create classes to represent a Song and then implement Array-based, Singly Linked, and Doubly Linked lists to store and manage collections of these songs. Additionally, you'll be working on generics to allow your list classes to handle any type of object.

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
The `Song` class represents a song in Spotify. The class includes the following attributes:
- `title` (String)
- `artist` (String)
- `length` (double) - the length of the song in minutes.

### Example Instance:
```java
Song song1 = new Song("El Pibe De Mi Barrio", "Dr. Krapula", 2.47);
