public class PivotIndex {

 public static void main(String[] args) {
  int[] arr = new int[] { 2, 1, -1 };

  System.out.println("After the function call" + findPivotIndex(arr));

 }

 /*
  * Total = Left + Right
  * Left = Right
  * Total = Left + Left
  * Left = Total - Left
  */

 private static int findPivotIndex(int[] nums) {

  int total = 0;
  int leftSum = 0;
  for (int i : nums) {
   total = total + i;
  }
  for (int i = 0; i < nums.length; i++) {

   if (leftSum == total - leftSum - nums[i])
    return i;
   else {
    leftSum = leftSum + nums[i];
   }

  }
  return -1;
 }
}
