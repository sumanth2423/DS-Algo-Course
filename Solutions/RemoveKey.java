package CodingQuestions;

public class RemoveKey {

 public static void main(String[] args) {
  int[] arr = new int[] { 2, 11, 2, 2, 1 };
  int key = 2;

  System.out.println("After the function call: " + RemoveKeyInstances(arr, key));

  arr = new int[] { 2, 11, 2, 2, 1 }; // reset
  System.out.println("After the function call Alternative Solution: " + RemoveKeyInstancesAlternative(arr, key));
 }

 private static int RemoveKeyInstancesAlternative(int[] array, int key) {
  int nextIndex = 0;
  for (int i = 0; i < array.length; i++) {
   if (array[i] != key) {
    array[nextIndex] = array[i];
    nextIndex++;
   }
  }
  return nextIndex;
 }

 private static int RemoveKeyInstances(int[] array, int key) {
  int startIndex = 0;
  int arrayIndex = 0;

  while (startIndex <= array.length - 1) {
   if (array[startIndex] != key) {
    array[arrayIndex] = array[startIndex];
    arrayIndex++;
   }
   startIndex++;
  }

  return arrayIndex;

 }
}