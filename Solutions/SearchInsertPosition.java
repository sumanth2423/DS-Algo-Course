public class SearchInsertPosition {

 public static void main(String[] args) {

  System.out.println(FindElement(new int[] { 1, 3, 5, 6 }, 4));

 }

 private static int FindElement(int[] array, int key) {
  int startIndex = 0;
  int endIndex = array.length - 1;
  int potentialInsertPosition = 0;
  while (startIndex <= endIndex) {
   potentialInsertPosition = (startIndex + endIndex) / 2;

   if (array[potentialInsertPosition] == key) {
    return potentialInsertPosition;
   }

   if (array[potentialInsertPosition] > key) {
    endIndex = potentialInsertPosition - 1;
   } else {
    startIndex = potentialInsertPosition + 1;
   }

  }
  return startIndex;
 }

}
