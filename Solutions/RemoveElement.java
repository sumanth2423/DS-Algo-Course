import java.util.Arrays;

public class RemoveElement {

 public static void main(String[] args) {
  int[] arr = new int[] { 3, 2, 2, 3 };
  int numberToRemove = 3;

  System.out.println("After the function call" + Arrays.toString(MethodName(arr, numberToRemove)));

 }

 private static int[] MethodName(int[] array, int numberToRemove) {

  int startIndex = 0;
  int temp = 0;
  for (int i = 0; i < array.length; i++) {

   if (array[i] != numberToRemove) {
    temp = array[startIndex];
    array[startIndex] = array[i];
    array[i] = temp;
    startIndex++;
   }
  }
  return array;
 }
}