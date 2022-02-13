package Examples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Collections;

public class ArrayListDemo {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(7);
        list.add(5);

        System.out.println("The elements in the list are " + list);

        list.add(4);
        System.out.println("Add another element " + list);

        list.add(1, 50);
        System.out.println("Add new element at index 1 " + list);

        ArrayList<Integer> newList = new ArrayList<Integer>();
        newList.add(100);
        newList.add(200);
        newList.add(300);
        list.addAll(newList);

        System.out.println("Add another list " + list);

        System.out.println("The element at index 2 is " + list.get(1));

        System.out.println("The size of the list is " + list.size());

        list.remove(1); // remove at index 1

        list.remove(new Integer(100)); // remove a particulat element in the list

        list.set(1, 199); // update an element at index 1

        list.contains(new Integer(100)); // check if element exists

        list.indexOf(new Integer(19)); // index of first occurance of the element

        list.lastIndexOf(new Integer(233)); // index of last occurance of the element

        for (int i = 0; i < list.size(); i++) {
            System.out.println("Looping List" + list.get(i));
        }

        for (Integer i : list) {
            System.out.println("Enhanced for loop: " + i);
        }

        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()) {

            System.out.println("Looping through iterator: " + itr.next());
            if (itr.next() == 300) {
                itr.remove();
            }
        }

        // iterator: we can only iterate only in the forward direction and we cannot
        // update or insert an element to the list while iterating
        // list iterator: we can update or insert while iterating
        ListIterator<Integer> listIterator = list.listIterator();

        while (listIterator.hasNext()) {
            System.out.println("looping using list iterator " + listIterator.next() + "The index of which is "
                    + listIterator.nextIndex());
        }

        while (listIterator.hasPrevious()) {
            System.out.println("previous element is " + listIterator.previous() + "And the previous index is "
                    + listIterator.previousIndex());
        }

        Collections.sort(list);

        list.clear(); // remove all the elements in the list

        // sorting in descening order
        Collections.sort(list, Collections.reverseOrder());

    }

}