import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/number-of-good-pairs/

public class GoodPairs {

 public static void main(String[] args) {
  int[] arr = new int[] { 1, 2, 3, 1, 1, 3 };

  System.out.println("After the function call" + MethodName(arr));

  int[] arr2 = new int[] { 1, 1, 1, 1, 1 };

  System.out.println("After the AlternativeSolution function call" + AlternativeSolution(arr2));

 }

 private static int AlternativeSolution(int[] array) {
  int totalGoodPairs = 0;
  int mapIndex = 0;
  Map<Integer, Integer> map = new HashMap<>();
  for (int i = 0; i < array.length; i++) {
   mapIndex = map.getOrDefault(array[i], 0);
   map.put(array[i], mapIndex + 1);
  }
  for (int x : map.values()) {
   System.out.println(x);
   totalGoodPairs += (((x) * (x - 1)) / 2);

  }

  return totalGoodPairs;

 }

 private static int MethodName(int[] array) {
  int totalGoodPairs = 0;
  for (int i = 0; i < array.length; i++) {
   int currentNumber = array[i];
   for (int j = i + 1; j < array.length; j++) {
    if (array[j] == currentNumber) {
     totalGoodPairs = totalGoodPairs + 1;
    }

   }
  }

  return totalGoodPairs;

 }
}
