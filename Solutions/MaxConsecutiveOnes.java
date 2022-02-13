package CodingQuestions;

/*
O(n) Time Complexity whe N is the number of elements in the array
O(1) space complexity as we do not use extra space
*/

public class MaxConsecutiveOnes {

     public static void main(String[] args) {

          int[] arrayInput = new int[] { 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 0, 1, 2, 1, 1, 1, 1, 1, 5, 5, 5, 5, 5,
                    5, 5, 2, 1 };

          int maxCountConsecutiveOnes = MaxCount(arrayInput);

          System.out.println("Consecutive ones count is " + maxCountConsecutiveOnes);

     }

     private static int MaxCount(int[] array) {

          int count = 0;
          int maxCount = 0;

          for (int i = 0; i < array.length; i++) {
               if (array[i] == 1) {
                    count = count + 1;
               } else {
                    maxCount = Math.max(maxCount, count);
                    count = 0;
               }

          }
          return Math.max(count, maxCount);

     }

}
