
public class BinarySearch {

 // Given a sorted array of numbers, find if a given number ‘key’ is present in
 // the array. Though we know that the array is sorted, we don’t know if it’s
 // sorted in ascending or descending order. You should assume that the array can
 // have duplicates.

 // Since we are reducing the search rang by half at every step, this means the
 // time complexity is O(logN) where N is total elements in the array
 // Space complexity is O(1)
 public static void main(String[] args) {

  System.out.println(FindElement(new int[] { 4, 6, 10 }, 10));
  System.out.println(FindElement(new int[] { 1, 2, 3, 4, 5, 6, 7 }, 5));
  System.out.println(FindElement(new int[] { 10, 6, 4 }, 10));
  System.out.println(FindElement(new int[] { 10, 6, 4 }, 4));
 }

 private static int FindElement(int[] arr, int key) {
  int startIndex = 0;
  int endIndex = arr.length - 1;
  boolean isAscending = arr[startIndex] < arr[endIndex];

  while (startIndex <= endIndex) {

   int middleIndex = startIndex + (endIndex - startIndex) / 2;

   if (arr[middleIndex] == key) {
    return middleIndex;
   }
   if (isAscending) {
    if (key < arr[middleIndex]) {
     endIndex = middleIndex - 1;
    } else {
     startIndex = middleIndex + 1;
    }
   } else {
    if (key > arr[middleIndex]) {
     endIndex = middleIndex - 1;
    } else {
     startIndex = middleIndex + 1;
    }
   }
  }
  return -1;
 }
}