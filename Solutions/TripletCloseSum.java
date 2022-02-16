import java.util.Arrays;

// Given an array of unsorted numbers and a target number,find a triplet in the array whose sum is as close to the target number as possible,return the sum of the triplet.If there are more than one such triplet,return the sum of the triplet with the smallest sum.
// referred from https://www.educative.io/courses/grokking-the-coding-interview/3YlQz7PE7OA

public class TripletCloseSum {
 public static void main(String[] args) {
  int[] inputArray = new int[] { -2, 0, 1, 2 };
  int target = 2;
  System.out.println("The closest tripel sum is: " + ClosestTripletSum(inputArray, target));

  System.out.println(ClosestTripletSum(new int[] { -2, 0, 1, 2 }, 2));
  System.out.println(ClosestTripletSum(new int[] { -3, -1, 1, 2 }, 1));
  System.out.println(ClosestTripletSum(new int[] { 1, 0, 1, 1 }, 100));
 }

 /*
  * x + y + z = targetNumber
  * Closest:
  * 0 = targetNumber - x - y - z
  * 1 = targetNumber - x - y - z
  * 2 = targetNumber - x - y - z
  * n = targetNumber - x - y - z
  * Which means
  * x + y + z = targetNumber - n
  * Closest Sum = targetNumber - n;
  */
 private static int ClosestTripletSum(int[] arr, int targetNumber) {

  Arrays.sort(arr);

  int n = 0;
  int smallestDiff = Integer.MAX_VALUE;

  for (int i = 0; i < arr.length - 2; i++) {
   int startIndex = i + 1;
   int endIndex = arr.length - 1;

   while (startIndex < endIndex) {
    n = targetNumber - arr[i] - arr[startIndex] - arr[endIndex];
    if (n == 0) {
     return targetNumber;
    }
    if (Math.abs(smallestDiff) > Math.abs(n)
      || (Math.abs(n) == Math.abs(smallestDiff) && n > smallestDiff)) {
     smallestDiff = n;
    }

    if (n > 0) {
     startIndex++;
    } else {
     endIndex--;
    }

   }

  }
  return targetNumber - smallestDiff;
 }

}
