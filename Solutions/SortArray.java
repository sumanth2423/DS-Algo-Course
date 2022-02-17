
import java.util.Arrays;
//Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.

public class SortArray {

 public static void main(String[] args) {
  int[] arr = new int[] { 3, 1, 2, 4 };

  System.out.println("After the function call" + Arrays.toString(MethodName(arr)));
 }

 private static int[] MethodName(int[] array) {
  int startIndex = 0;
  int temp = 0;

  for (int i = 0; i < array.length; i++) {

   if (array[i] % 2 == 0) {
    temp = array[startIndex];
    array[startIndex] = array[i];
    array[i] = temp;
    startIndex++;
   }

  }

  return array;

 }

}
