package CodingQuestions;

import java.util.Arrays;

public class TargetSum {
  public static void main(String[] args) {
    int[] arr = new int[] { 1, 2, 3, 9, 6 };
    int targetSum = 6;
    System.err.println("After the funcation call" + Arrays.toString(MethodName(arr, targetSum)));
  }

  private static int[] MethodName(int[] array, int targetSum) {

    int startPointer = 0;
    int endPointer = array.length - 1;
    int[] outputArray = new int[2];
    int currentTargetSum = 0;
    while (startPointer < endPointer) {
      currentTargetSum = array[startPointer] + array[endPointer];

      if (targetSum == currentTargetSum) {
        outputArray[0] = startPointer;
        outputArray[1] = endPointer;
        return outputArray;

      } else if (currentTargetSum > targetSum)
        endPointer--;
      else if (currentTargetSum < targetSum)
        startPointer++;

    }
    return outputArray;
  }
}