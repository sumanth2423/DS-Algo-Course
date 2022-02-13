package Examples;

import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Collections;

public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        /* adding elements to the linked list */
        linkedList.add(1);
        linkedList.add(2);
        linkedList.addLast(3);
        System.out.println("add elements to array" + linkedList);

        linkedList.add(2, 20);
        System.out.println("add 20 at index 2" + linkedList);

        linkedList.addFirst(10);
        System.out.println("add 10 at first" + linkedList);

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);

        linkedList.addAll(2, arrayList);

        System.out.println("adding all array list elemets to the linked list at index 2 " + linkedList);

        System.out.println("fetching first element " + linkedList.getFirst());

        System.out.println("fetching the last element " + linkedList.getLast());

        System.out.println("fetching the element at index 2 " + linkedList.get(2));

        System.out.println("removing first element " + linkedList.removeFirst());

        System.out.println("removing last element " + linkedList.removeLast());

        System.out.println("removing element at index 2 " + linkedList.remove(2));

        linkedList.remove(new Integer(300));
        System.out.println("removing first occurance of element 200" + linkedList);

        linkedList.removeLastOccurrence(new Integer(100));
        System.out.println("removing last occurance of element 300" + linkedList);

        Collections.sort(linkedList);
        System.out.println("sorted linked list " + linkedList);

    }

}
