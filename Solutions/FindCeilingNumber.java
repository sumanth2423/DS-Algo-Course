public class FindCeilingNumber {

 // Given an array of numbers sorted in an ascending order, find the ceiling of a
 // given number ‘key’. The ceiling of the ‘key’ will be the smallest element in
 // the given array greater than or equal to the ‘key’.
 // Write a function to return the index of the ceiling of the ‘key’. If there
 // isn’t any ceiling return -1.
 public static void main(String[] args) {
  System.out.println(searchCeilingOfANumber(new int[] { 4, 6, 10 }, 6));
  System.out.println(searchCeilingOfANumber(new int[] { 1, 3, 8, 10, 15 }, 12));
  System.out.println(searchCeilingOfANumber(new int[] { 4, 6, 10 }, 17));
  System.out.println(searchCeilingOfANumber(new int[] { 4, 6, 10 }, -1));
 }

 public static int searchCeilingOfANumber(int[] arr, int key) {

  if (arr[arr.length - 1] < key) {
   return -1;
  }

  int startIndex = 0;
  int endIndex = arr.length - 1;

  while (startIndex <= endIndex) {
   int middleIndex = startIndex + (endIndex - startIndex) / 2;
   if (arr[middleIndex] > key) {
    endIndex = middleIndex - 1;
   } else if (arr[middleIndex] < key) {
    startIndex = middleIndex + 1;
   } else {
    return middleIndex;
   }

  }

  return startIndex;
 }
}
