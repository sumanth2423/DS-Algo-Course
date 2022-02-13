package CodingQuestions;

public class EvenDigits {
  public static void main(String[] args) {
    int[] nums = new int[] { 12, 342, 2242, 1134 };
    System.out.println("Total Even Digits in the array are " + TotalEvenDigitsSolution1(nums));
    System.out.println("Total Even Digits in the array are " + TotalEvenDigitsSolution2(nums));
  }

  private static int TotalEvenDigitsSolution2(int[] nums) {
    int totalDigits = 0;
    for (int i : nums) {
      int count = 0;
      while (i > 0) {
        i = i / 10;
        count++;
      }
      if (count % 2 == 0) {
        totalDigits++;
      }
    }
    return totalDigits;
  }

  private static int TotalEvenDigitsSolution1(int[] nums) {
    int count = 0;
    for (int i = 0; i < nums.length; i++) {
      if (Integer.toString(nums[i]).toString().length() % 2 == 0) {
        count++;
      }
    }
    return count;
  }

}
