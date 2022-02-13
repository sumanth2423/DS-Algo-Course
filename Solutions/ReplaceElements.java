package CodingQuestions;

import java.util.Arrays;

// Given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.
// After doing so, return the array.

public class ReplaceElements {

 public static void main(String[] args) {
  int[] array = new int[] { 17, 18, 5, 4, 6, 1 };
  System.out.print("Solution one is" + Arrays.toString(replaceElementsSolutionOne(array)));

  array = new int[] { 17, 18, 5, 4, 6, 1 };
  System.out.print("\nSolution two is" + Arrays.toString(replaceElementsSolutionTwo(array)));

 }

 private static int[] replaceElementsSolutionTwo(int[] arr) {
  int max = -1;
  int temp = 0;
  for (int i = arr.length - 1; i >= 0; i--) {
   temp = arr[i];
   arr[i] = max;
   max = Math.max(max, temp);
  }

  return arr;

 }

 private static int[] replaceElementsSolutionOne(int[] arr) {
  int j = 0;
  while (j < arr.length - 1) {
   int higherNumber = 0;
   for (int i = j + 1; i < arr.length; i++) {
    if (arr[i] > higherNumber) {
     higherNumber = arr[i];
    }
   }
   arr[j] = higherNumber;
   j++;
  }

  arr[arr.length - 1] = -1;

  return arr;

 }

}
