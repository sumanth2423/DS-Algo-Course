//find the average of all subarrays of ‘5’ contiguous elements in the given array

public class AverageSubarray {

 public static void main(String[] args) {
  int[] arr = new int[] { 1, 3, 2, 6, -1, 4, 1, 8, 2 };
  int k = 5;

  for (double i : BruteForceSolution(arr, k)) {
   System.out.println(i);
  }
  System.out.println("---Sliding Window----");
  for (double i : SlidingWindow(arr, k)) {
   System.out.println(i);
  }

 }

 // Time complexity is O(N) and space O(1)
 private static double[] SlidingWindow(int[] arr, int k) {
  double[] result = new double[arr.length - k + 1];
  int windowStart = 0;
  double windowSum = 0;
  for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
   windowSum += arr[windowEnd];
   if (windowEnd >= k - 1) {
    result[windowStart] = windowSum / k;
    windowSum -= arr[windowStart];
    windowStart++;
   }
  }

  return result;
 }
 // Since for every element of input array, we are calculating the sum of its
 // next K elements, hence the
 // time complexity is O(N*K) where N is the number of elements in the input
 // array.

 private static double[] BruteForceSolution(int[] arr, int k) {
  double[] result = new double[arr.length - k + 1];// Why?

  for (int i = 0; i <= arr.length - k; i++) {
   double sum = 0;
   for (int j = i; j < i + k; j++) {
    sum += arr[j];
   }
   result[i] = sum / k;

  }
  return result;
 }
}