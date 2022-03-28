
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TwoSum {
 public static void main(String[] args) {
  int[] arr = new int[] { 11, 15, 7, 2 };
  int targetSum = 9;

  int[] outputArray = MethodName(arr, targetSum);

  System.out.println("After the function call");

  for (int i = 0; i < outputArray.length; i++) {
   System.out.println(outputArray[i]);
  }

  int[] outputArray2 = ReturnIndex(arr, targetSum);

  System.out.println("After the function call - ReturnIndex");

  for (int i = 0; i < outputArray2.length; i++) {
   System.out.println(outputArray2[i]);
  }

 }

 private static int[] MethodName(int[] array, int targetSum) {
  Set<Integer> set = new HashSet<>();
  int[] arr = new int[2];

  for (int i = 0; i < array.length; i++) {

   int findElement = targetSum - array[i];

   if (set.contains(findElement)) {
    arr[0] = findElement;
    arr[1] = array[i];
    return arr;
   }
   if (!set.contains(array[i])) {
    set.add(array[i]);
   }
  }

  return array;

 }

 private static int[] ReturnIndex(int[] array, int targetSum) {
  Map<Integer, Integer> map = new HashMap<>();
  int[] arr = new int[2];

  for (int i = 0; i < array.length; i++) {

   int findElement = targetSum - array[i];

   if (map.containsKey(findElement)) {
    arr[0] = i;
    arr[1] = map.get(findElement);
    return arr;
   }
   if (!map.containsKey(array[i])) {
    map.put(array[i], i);
   }
  }

  return array;

 }

}
