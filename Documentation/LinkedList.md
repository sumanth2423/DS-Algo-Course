Linked List are similar to an array

array = [2,1,5,6]
Linked list = 3 -> 1 -> 4 -> 2
Reads from left to right

Array memory allocation: allocated back to back memeory slots

    Memory slots:
    each memory solt takes 8 bits
        for 64 bit integer we need total 8 memory slots
        for 32 bit integer we need total 4 memory slots

    For above example we need back to back memory slots

Biggest benetif of LinkedList, in comparision of an array, is that in a LinkedList, in comparision to an array, is that when new elements are added or removed, the other elements are not rearranged.

Linked list store elements anywhere in the memory unlike arrays which are stored back to back
Elements are connected using pointers
Pointers allows to have one memeory slot point to another memeory slot just by storing other memory slot address

Node:
each node in linked list has value and pointer to next node
Back to back memory slots - value + pointer to node

Space time complexity:

getting an element  
 overwriting an element
inserting element in the array
copy an array
Traverse an array
Popping out of array

Linked list = 3 -> 1 -> 4 -> 2
Finding an element at index
Head of the linked list: 3
Travese the linked list for

        Get => O(i) Time where i is the index
            example: To get element at index = 2 which is value 4 from the above example. Traverse until i = 2
          O(1) space as we are not storing anything additional in the array.

        Set => O(i) Time where i is the index
            Same as Get to find the element and constanct to set the value.
          O(1) space as we are not storing anything additional in the array.

Initialize linked list
initi=>o(n) space, time
note: O(2n) as we need two slots for value and pointer

Copy => O(n) Space Time
Traverse=> O(n) Time O(1) Space

Insertion
Insert an element in linked list
Create new node
Point the linked list head to the new node
head node pointer to current head
Time: O(1) constant time
Reason: created one new node

Anywhere - O(i) where i is the position or O(n)
Head - Constant time
End - If you know the tail address then constant time if not we need to traverse to the end which is O(n) Time

Deletion

Types of Linked List:
Singly Linked List
Every node has one pointer to the next node.
Double Lined List
Every node has two pointers. One to the next node and another to the previous node.
Circular Linked List
A linked list that has no clear head or tail because its tail points to its head effectivel forming a closed circle
A circilar linked list can be either a singly circular linked list or a doubly circilar linled list.

Linked list in Java

    LinkedList class has a static inner class called Node with three fields
        item - contains the value of the current element
        next - contains the pointer to next element
        prev - contains the pointer to previous element


    Creating a LinkedList
    List<Integer> list  = new LinkedList<integer>(); /* Create with size zero */

    Create from an existing LinkedList:
    List<Integer> list  = new LinkedList<Integer>(oldList);
