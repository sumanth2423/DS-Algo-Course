/*
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).

Reference:
https://leetcode.com/problems/median-of-two-sorted-arrays/
*/

public class Median {
 public static void main(String[] args) {
  int[] nums1 = new int[] { 1, 2 };
  int[] nums2 = new int[] { 3, 4, 5 };

  System.out.println("The median on two arrays is: " + calculateMedian(nums1, nums2));
 }

 private static double calculateMedian(int[] nums1, int[] nums2) {
  double median = 0;
  int firstArrayIndex = 0;
  int secondArrayIndex = 0;
  int[] arr = new int[nums1.length + nums2.length];

  for (int i = 0; i < arr.length; i++) {

   if (firstArrayIndex < nums1.length && secondArrayIndex < nums2.length
     && nums1[firstArrayIndex] <= nums2[secondArrayIndex]) {

    arr[i] = nums1[firstArrayIndex];
    firstArrayIndex++;

   } else if (firstArrayIndex < nums1.length && secondArrayIndex < nums2.length
     && nums2[secondArrayIndex] < nums1[firstArrayIndex]) {

    arr[i] = nums2[secondArrayIndex];
    secondArrayIndex++;

   } else if (firstArrayIndex < nums1.length) {

    arr[i] = nums1[firstArrayIndex];
    firstArrayIndex++;

   } else if (secondArrayIndex < nums2.length) {

    arr[i] = nums2[secondArrayIndex];
    secondArrayIndex++;
   }

   if (i == arr.length / 2) {
    if (arr.length % 2 == 0) {
     median = (double) ((arr[(arr.length / 2) - 1] + arr[(arr.length / 2)]) / 2.0);
    } else {
     median = arr[arr.length / 2];
    }
   }
  }
  return median;
 }
}
