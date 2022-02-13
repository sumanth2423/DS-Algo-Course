public class RemoveDuplicates {

 public static void main(String[] args) {
  int[] arr = new int[] { 2, 3, 3, 3, 6, 9, 9 };
  System.out.println("Total unique numbers count:" + removeDuplicates(arr));
  System.out.println("Total unique numbers count:" + removeDuplicatesAlternativeSolution(arr));

 }

 public static int removeDuplicatesAlternativeSolution(int[] arr) {
  int nextNonDuplicate = 1;
  for (int i = 1; i < arr.length; i++) {
   if (arr[nextNonDuplicate - 1] != arr[i]) {
    arr[nextNonDuplicate] = arr[i];
    nextNonDuplicate++;
   }
  }
  return nextNonDuplicate;
 }

 private static int removeDuplicates(int[] array) {
  int endPointer = array.length - 1;
  int previousNumber = 0;
  int uniqueNumberCount = 0;
  while (endPointer >= 0) {
   if (array[endPointer] == previousNumber) {
    // duplicate
   } else {
    uniqueNumberCount++;
   }
   previousNumber = array[endPointer];
   endPointer--;
  }
  return uniqueNumberCount;

 }
}
