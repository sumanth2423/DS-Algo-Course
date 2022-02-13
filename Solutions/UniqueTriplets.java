import java.util.*;

// Given an array of unsorted numbers, find all unique triplets in it that add up to zero.

public class UniqueTriplets {

  public static void main(String[] args) {
    int[] arr = new int[] { -3, 0, 1, 2, -1, 1, -2 };

    for (List<Integer> arrList : searchTriplets(arr)) {
      System.out.println(arrList.toString());
    }
  }

  public static List<List<Integer>> searchTriplets(int[] arr) {
    Arrays.sort(arr);
    List<List<Integer>> triplets = new ArrayList<>();
    for (int i = 0; i < arr.length; i++) {
      if (i > 0 && arr[i] == arr[i - 1])
        continue;
      TargetSum(arr, -1 * arr[i], i + 1, triplets);
    }
    return triplets;
  }

  private static void TargetSum(int[] array, int targetsum, int startIndex,
      List<List<Integer>> triplets) {
    List<Integer> outputList = null;
    int endIndex = array.length - 1;

    while (startIndex < endIndex) {

      if (array[startIndex] + array[endIndex] == targetsum) {

        outputList = new ArrayList<>();
        outputList.add(-1 * targetsum);
        outputList.add(array[startIndex]);
        outputList.add(array[endIndex]);
        triplets.add(outputList);
        endIndex--;
        startIndex++;

        // skip duplicates
        while (startIndex < endIndex && array[startIndex] == array[startIndex - 1]) {
          startIndex++;
        }
        // skip duplicates
        while (startIndex < endIndex && array[endIndex] == array[endIndex + 1]) {
          endIndex--;
        }

      } else if (array[startIndex] + array[endIndex] > targetsum) {
        endIndex--;

      } else {
        startIndex++;
      }

    }

  }

}
