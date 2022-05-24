//https://leetcode.com/problems/missing-number/


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

public class MissingNumber {

 public static void main(String[] args) {
  int[] arr = new int[] { 3, 2, 0, 1 };

  System.out.println("After the function call" + MethodName3(arr));

 }

 private static int MethodName3(int[] array) {

  Set<Integer> hashSet = new HashSet<>();
  for (Integer integer : array) {
   hashSet.add(integer);
  }

  int expectedNumCount = array.length + 1;

  for (int number = 0; number < expectedNumCount; number++) {

   if (!hashSet.contains(number)) {
    return number;
   }
  }

  return -1;

 }

 private static int MethodName2(int[] array) {

  Arrays.sort(array);
  if (array[0] != 0) {
   return 0;
  }

  for (int i = 0; i < array.length - 1; i++) {

   if (array[i] + 1 == array[i + 1]) {

   } else {
    return array[i] + 1;
   }

  }
  return array[array.length - 1] + 1;
 }
}
