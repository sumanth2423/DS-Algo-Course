public class FloorNumber {
 public static void main(String[] args) {
  System.out.println(searchFloorOfANumber(new int[] { 4, 6, 10 }, 6));
  System.out.println(searchFloorOfANumber(new int[] { 1, 3, 8, 10, 15 }, 12));
  System.out.println(searchFloorOfANumber(new int[] { 4, 6, 10 }, 17));
  System.out.println(searchFloorOfANumber(new int[] { 4, 6, 10 }, -1));
 }

 public static int searchFloorOfANumber(int[] arr, int key) {

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

  return endIndex;
 }
}
