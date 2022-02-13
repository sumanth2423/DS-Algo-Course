package CodingQuestions;

import java.util.Arrays;

public class SquareArray {
 public static void main(String[] args) {
  int[] arr = new int[] { -2, -1, 0, 2, 3 };
  System.out.println("After the funcation call" + Arrays.toString(SquareArraySolutionOne(arr)));

  arr = new int[] { -2, -1, 0, 2, 3 };
  System.out.println("After the funcation call" + Arrays.toString(SquareArraySolutionTwo(arr)));

 }

 /*
  * Time complexity is O(n) as we are iteration the input array only once
  * Space complexity is O(n) as we are creating outout array
  */
 private static int[] SquareArraySolutionTwo(int[] array) {
  int[] squareArray = new int[array.length];
  int startIndex = 0;
  int endIndex = array.length - 1;
  int highestIndex = array.length - 1;

  while (startIndex <= endIndex) {
   int startIndexSquare = array[startIndex] * array[startIndex];
   int endIndexSquare = array[endIndex] * array[endIndex];
   if (endIndexSquare > startIndexSquare) {
    squareArray[highestIndex--] = endIndexSquare;
    endIndex--;
   } else {
    squareArray[highestIndex--] = startIndexSquare;
    startIndex++;
   }
  }
  return squareArray;
 }

 /*
  * Time complexity is O(n) as we are iteration the input array only once
  * Space complexity is O(1) as we using same outout array
  */
 private static int[] SquareArraySolutionOne(int[] array) {

  int startIndex = 0;
  int endIndex = array.length - 1;

  while (endIndex >= 0) {
   int startIndexSquare = array[startIndex] * array[startIndex];
   int endIndexSquare = array[endIndex] * array[endIndex];

   if (startIndexSquare > endIndexSquare) {
    array[startIndex] = array[endIndex]; // swap index values
    array[endIndex] = startIndexSquare;
    endIndex--;
   } else {
    array[endIndex] = endIndexSquare;
    endIndex--;
   }

  }

  return array;

 }

}
