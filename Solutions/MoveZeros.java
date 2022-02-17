import java.util.Arrays;

//Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

public class MoveZeros {

 public static void main(String[] args) {
  int[] arr = new int[] { 0, 1, 0, 3, 12 };

  System.err.println("After the function call" + Arrays.toString(MethodName(arr)));

 }

 private static int[] MethodName(int[] array) {

  int startIndex = 0;
  int temp = 0;
  for (int i = 0; i < array.length; i++) {

   if (array[i] != 0) {
    temp = array[startIndex];
    array[startIndex] = array[i];
    array[i] = temp;
    startIndex++;
   }

  }
  return array;

 }
}
