public class LargestNumber {

 /*
  * You are given an integer array nums where the largest integer is unique.
  * 
  * Determine whether the largest element in the array is at least twice as much
  * as every other number in the array. If it is, return the index of the largest
  * element, or return -1 otherwise.
  */
 public static void main(String[] args) {
  int[] arr = new int[] { 3, 6, 1, 0 };

  System.out.println("After the function call" + findLargestNumber(arr));
 }

 private static int findLargestNumber(int[] nums) {

  int firstLargest = 0;
  int secondLargest = 0;
  int firstLargestIndex = 0;
  for (int i = 0; i < nums.length; i++) {
   if (nums[i] > firstLargest) {
    secondLargest = firstLargest;
    firstLargest = nums[i];
    firstLargestIndex = i;
   } else if (nums[i] > secondLargest) {
    secondLargest = nums[i];
   }
  }

  if (secondLargest * 2 <= firstLargest) {
   return firstLargestIndex;
  }
  return -1;
 }
}