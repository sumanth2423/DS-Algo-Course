package CodingQuestions;

public class DuplicateZeros {

  /*
  
  
  */
  public static void main(String[] args) {

    int numArray[] = new int[] { 1, 0, 2, 3, 0, 4, 5, 0 };
    int[] output = DuplicateZeroArraySolutionOne(numArray);

    System.out.println("--output 1 ---");
    for (int i = 0; i < output.length; i++) {
      System.out.println(output[i]);
    }

    int numArray2[] = new int[] { 0, 2, 3 };
    int[] output2 = DuplicateZeroArraySolutionOne(numArray2);

    System.out.println("--output 1 ---");
    for (int i = 0; i < output2.length; i++) {
      System.out.println(output2[i]);
    }

  }

  private static int[] DuplicateZeroArraySolutionOne(int[] numArray) {

    int[] outputArray = new int[numArray.length];
    int outputArrayIndex = 0;

    for (int i = 0; i < numArray.length; i++) {

      if (outputArrayIndex < outputArray.length) {
        outputArray[outputArrayIndex] = numArray[i];
        outputArrayIndex++;
      }

      if (numArray[i] == 0 && (outputArrayIndex < outputArray.length)) {
        outputArray[outputArrayIndex] = 0;
        outputArrayIndex++;
      }
    }
    return outputArray;

  }

}
