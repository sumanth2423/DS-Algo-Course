ArrayList is Dynamic Array in Java

ArrayList implements List interfac

    Elements are stored in the order of insertion
    Allows storage of duplicate elements
    Supports null elements

Lazy Initialization:
Upon creation the size is zero
when the first element is inserted the array size changes to ten

Internally before adding an element in ArrayList the capacity is checked and if its full then a new array of size: n + n/2 + 1 is created coping old elements into new array.
This increase and checking the size is a time consuming process.

Time Complexity:
Adding an element: O(1)
adds to the end of array irrespective of the size

Removing an element:
O(n)
when takes the element as an input to be removed. The array is scanned from the beginning to find the first occurance
O(1)
when removing by index as input

Fetching an element:
O(1) - When fetching by the index

Each wrapper class - Integer, Double and Long, String and Date implements an interface called Comparable. The interface contains a compareTo(T o) method which is used by
sorting methods to sort the Collection. This method returns a negative integer, zero, or a positive integer if the object is less than, equal to, or greater than the object passed as an argument.

One of the major drawbacks of using Comparable interface is that the comparing logic gets fixed. If we take the example of the vehicle class that we looked at in the previous lesson, then it can be sorted of the brand or the production year depending on the implementation of the compareTo() method.

Comparator interface
Compare(T o1, T o2)
Takes two objects
-1 if o1 < o2
1 if o1 > o2
0 if o1 = o2
