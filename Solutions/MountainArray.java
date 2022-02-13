/*

Given an array of integers arr, return true if and only if it is a valid mountain array.
   Recall that arr is a mountain array if and only if:

   arr.length >= 3
   There exists some i with 0 < i < arr.length - 1 such that:
   arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
   arr[i] > arr[i + 1] > ... > arr[arr.length - 1]

Time Complexity: 
O(N)O(N),where N N is the length of A.
*/

public class MountainArray {
   public static void main(String[] args) {
      int[] arr = new int[] { 1, 2, 3, 4, 5, 4, 3, 2, 1, 0 };
      System.out.println("Is the array in ascending order: " + IsMountainArray(arr));
      System.out.println("Is the array in ascending order: " + IsMountainArraySolution2(arr));
   }

   private static boolean IsMountainArraySolution2(int[] arr) {
      int i = 0;

      while (i < arr.length - 1 && arr[i] < arr[i + 1]) {
         i++;
      }

      if (i == 0 || i == arr.length - 1) {
         return false;
      }

      while (i < arr.length - 1 && arr[i] > arr[i + 1]) {
         i++;
      }

      if (i == arr.length - 1) {
         return true;
      }
      return false;
   }

   private static boolean IsMountainArray(int[] arr) {

      int strictlyIncreasing = 0;
      int strictlyDecreasing = 0;

      for (int i = 0; i < arr.length - 1; i++) {

         if (arr[i] < arr[i + 1]) {
            strictlyIncreasing++;
            if (strictlyDecreasing > 0)
               return false;
         } else if (arr[i] > arr[i + 1]) {
            strictlyDecreasing++;
         } else {
            return false;
         }
      }

      if (strictlyIncreasing > 0 && strictlyDecreasing > 0
            && strictlyIncreasing + strictlyDecreasing == arr.length - 1) {
         return true;
      }

      return false;

   }
}