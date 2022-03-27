import java.util.HashSet;

public class FindDuplicates {

 public static void main(String[] args) {

  int[] numbersArray = new int[] { 12, 342, 2242, 1134, 12 };

  System.out.println(SearchDuplicate(numbersArray));

 }

 private static boolean SearchDuplicate(int[] numbersArray) {
  HashSet<Integer> set = new HashSet<Integer>();

  for (int i = 0; i < numbersArray.length; i++) {
   if (set.contains(numbersArray[i])) {
    return true;
   } else {
    set.add(numbersArray[i]);
   }
  }

  return false;
 }

}
