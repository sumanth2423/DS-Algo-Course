public class MaximumSubarraySum {

 public static void main(String[] args) {
  int[] arr = new int[] { 2, 1, 5, 1, 3, 2 };
  int k = 3;

  System.out.println(MethodName(arr, k));

 }

 private static int MethodName(int[] array, int k) {
  int sum = 0;
  int windowStart = 0;
  int result = 0;
  for (int windowEnd = 0; windowEnd < array.length; windowEnd++) {
   sum += array[windowEnd];
   if (windowEnd >= k - 1) {
    if (sum > result) {
     result = Math.max(result, sum);
    }
    sum -= array[windowStart];
    windowStart++;
   }
  }
  return result;

 }
}
