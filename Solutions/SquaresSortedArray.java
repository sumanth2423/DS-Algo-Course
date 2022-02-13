package CodingQuestions;

import java.util.Arrays;

public class SquaresSortedArray {

  public static void main(String[] args) {

    int[] nums = new int[] { -4, -1, 0, 3, 10 };
    nums = SortedSquaresSolution1(nums);
    nums = SortedSquaresSolution2(nums);

  }

  private static int[] SortedSquaresSolution2(int[] nums) {

    int[] outputArray = new int[nums.length];

    int startIndex = 0;
    int endIndex = nums.length - 1;
    for (int i = outputArray.length - 1; i >= 0; i--) {
      int startIndexNumber = Math.abs(nums[startIndex] * nums[startIndex]);
      int endIndexNumber = Math.abs(nums[endIndex] * nums[endIndex]);

      if (startIndexNumber < endIndexNumber) {
        outputArray[i] = endIndexNumber;
        endIndex--;
      } else if (startIndexNumber > endIndexNumber) {
        outputArray[i] = startIndexNumber;
        startIndex++;
      } else {
        outputArray[i] = startIndexNumber;
        startIndex++;
      }
    }
    return outputArray;

  }

  private static int[] SortedSquaresSolution1(int[] inputArray) {
    int[] outputArray = new int[inputArray.length];

    for (int i = 0; i < outputArray.length; i++) {

      outputArray[i] = inputArray[i] * inputArray[i];

    }

    Arrays.sort(outputArray);
    return outputArray;
  }

}
