package CodingQuestions;

import java.util.Arrays;

public class Template {

 public static void main(String[] args) {
  int[] arr = new int[] { 1, 1, 2 };

  System.err.println("After the funcation call" + Arrays.toString(MethodName(arr)));

 }

 private static int[] MethodName(int[] array) {

  return array;

 }
}
