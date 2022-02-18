import java.util.Set;
import java.util.TreeSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class TreeSetDemo {
    public static void main(String[] args) {

        TreeSet<Integer> treeSet = new TreeSet<>();

        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(100);
        arrayList.add(4321);
        arrayList.add(50);
        arrayList.add(500);
        arrayList.add(56);
        System.out.println("Elements in the ArrayList:" + arrayList);

        treeSet.addAll(arrayList); // Sorted
        System.out.println("Elements in the TreeSet " + treeSet);

        treeSet.add(100); // true if element is inserted, false if the element is already present

        Set<Integer> reverseTreeSet = new TreeSet<>(Comparator.reverseOrder());
        reverseTreeSet.addAll(arrayList);
        System.out.println("Revese TreeSet " + reverseTreeSet);

        System.out.println("Removing an element " + treeSet.remove(new Integer(4321)));

        // Check empty
        treeSet.isEmpty();

        // check size
        treeSet.size();

        // check element exist
        treeSet.contains(new Integer(45));

        treeSet.first(); // first element
        treeSet.last(); // last element
        System.out.println("subset of 2 and 4 " + treeSet.subSet(50, 500));
        System.out.println("Fetching all the elements less than 40 " + treeSet.headSet(60));
        System.out.println("Fetching all the elements greater than 40 " + treeSet.tailSet(40));

    }

}
