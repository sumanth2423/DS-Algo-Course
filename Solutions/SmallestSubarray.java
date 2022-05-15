//https://www.educative.io/courses/grokking-the-coding-interview/7XMlMEQPnnQ

public class SmallestSubarray {

 public static void main(String[] args) {
  int[] arr = new int[] { 2, 1, 5, 2, 3, 2 };
  int k = 7;
  System.out.println("After the function call" + MethodName(arr, k));
 }

 // Time Complexity is O(N+N). Outerloop + while loop
 private static int MethodName(int[] arr, int k) {
  int windowStart = 0;
  int sum = 0;
  int smallestwindow = Integer.MAX_VALUE;
  for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
   sum += arr[windowEnd];
   while (sum >= k) {
    smallestwindow = Math.min(smallestwindow, windowEnd - windowStart + 1);
    sum -= arr[windowStart];
    windowStart++;
   }
  }

  return smallestwindow;

 }
}
