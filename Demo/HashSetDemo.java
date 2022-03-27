import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {

        Set<Integer> hasSet = new HashSet<Integer>();
        hasSet.add(100);
        hasSet.add(200);
        hasSet.add(300);
        hasSet.add(100); // no exception when a same element is added
        System.out.println("Element in hash set : " + hasSet);

        if (hasSet.contains(100)) {
            System.out.println("HashSet has the element 100");
        }

        hasSet.remove(100);

        System.out.println("The Size of the HashSet is " + hasSet.size());

        for (Integer i : hasSet) {
            System.out.println("Iterate HashSet " + i);
        }

        hasSet.clear();
        if (hasSet.isEmpty()) {
            System.out.println("Hashset is empty!!");
        }
    }

}
