import java.util.Arrays;
// Given an array containing 0 s,1 s and 2 s,sort the array in-place.
//You should treat numbers of the array as objects,hence,we can’t count 0 s,1 s,and 2 s to recreate the array.

public class DutchNationalFlag {
 public static void main(String[] args) {
  int[] array = new int[] { 1, 0, 2, 1, 0 };
  System.out.println("After Sorting " + Arrays.toString(Sort(array)));
 }

 /*
  * Time complexity is o(n) - iterating the array once
  * Space - O(n) in-place array sort
  */
 private static int[] Sort(int[] arr) {

  int startIndex = 0;
  int endIndex = arr.length - 1;
  int temp = 0;
  for (int i = 0; i <= endIndex;) {
   if (arr[i] == 0) {
    temp = arr[startIndex];
    arr[startIndex] = arr[i];
    arr[i] = temp;
    startIndex++;
    i++;
   } else if (arr[i] == 2) {
    temp = arr[endIndex];
    arr[endIndex] = arr[i];
    arr[i] = temp;
    endIndex--;
   } else {
    i++;
   }
  }
  return arr;
 }
}