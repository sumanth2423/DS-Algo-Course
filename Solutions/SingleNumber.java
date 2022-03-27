import java.util.HashSet;

public class SingleNumber {

 public static void main(String[] args) {

  int[] numbersArray = new int[] { 4, 1, 2, 1, 2 };

  System.out.println(SearchDuplicate(numbersArray));

 }

 private static int SearchDuplicate(int[] numbersArray) {
  HashSet<Integer> set = new HashSet<Integer>();

  for (int i = 0; i < numbersArray.length; i++) {
   if (set.contains(numbersArray[i])) {
    set.remove(numbersArray[i]);
   } else {
    set.add(numbersArray[i]);
   }
  }

  for (Integer integer : set) {
   return integer;
  }
  return 0;
 }

}
