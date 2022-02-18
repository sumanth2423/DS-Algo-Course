import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class HashSetDemo {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();

        set.add(100);
        set.add(200);
        set.add(300);

        System.out.println(set);

        // Check element exists in a hashset
        System.out.println(set.contains(100));

        // loop a hashset
        for (int i : set) {
            System.out.println(i);
        }

        System.out.println("Using iterator in hashset");
        Iterator itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("Using foreach in HashSet");
        set.forEach(System.out::println);

        System.out.println("Sorting a HashSet");
        // Create a list from HashSet

        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);

        // Remove an element from HashSet
        set.remove(100);

        // Check if HashSet is empty
        if (!set.isEmpty()) {
            // Remove all the elements from HashSet
            set.clear();
        }
    }

}
