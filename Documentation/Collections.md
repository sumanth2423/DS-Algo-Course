Collections in java

A collection is an object that groups multiple elements into a single unit.

Collection interface
Classes under collection interface only store values
Extended By these interfaces
List
Set
Queue

Collection is an interface
Collections is a class

Collection interface provides standard functionality of a data structure to List, Set and Queue
Collections class provides the utility methods that can be used to search, sort and synchronize collection elements.

Classes in Collections
TreeSet
LinkedList
ArrayList
Vector
Stack
PrirotyQueue

Map interface
Stores key-value pairs and does not implement collections interface

ArrayList and LinkedList are not thread safe
Thread safe: multipe threads are simultaneously adding or removing elements from a list, it may not work as intended. If a thread is iterating over a list and, in the meantime,
another thread ties to add an element to the list, then ConcurrentModificationException will be thrown.

Vector is java is suited for the multi threaded environment. The entire list is locked.

HashSet:
Implements a Set interface
Does not allow duplicate elements
Allows only one null element
The elements are inserted in a random order
A HashSet is internally backed by a HashMap

        Set<Integer> hashSet = new HashSet<>();

Unlike ArrayList there is no get() method for HashSet(). The elements are stored in a random order in a HashSet and we cannot get a particular element.

TreeSet
Implements a Set interface
TreeSet does not allow duplicates
TreeSet does not allow null elements
Elements in TreeSet are sorted.
Since elements are stored in tree, the acccess and retrival times are quite fast in a TreeSet.
The elements are stored in ascending order in a TreeSet.

| HashSet                                                                          | TreeSet                               |
| -------------------------------------------------------------------------------- | ------------------------------------- |
| Allows one null element                                                          | Does not allow null element           |
| Elements are stored in a random order                                            | Elements are soted in ascending order |
| HashSet is fasted than TreeSet for operations like add, remove,contains,size etc | Access and Retrival times are faster  |

HashMap
Implements Map interface
Store Key-Value pair - Example stock prices of a company
Keys should be unique
Allows only one null value - null is treated as a key
Keys are stored in a random order

    Map<String, Integer> map = new HashMap<>();

    Load factor: IF the load factor is 0.75, then it means the Map should be resized when it is 75% full.

    The basic principle used by a HashMap to store elements in Hashing the key
    Hashing: assing a unique code called a hashcode

    Creating a HashMap
