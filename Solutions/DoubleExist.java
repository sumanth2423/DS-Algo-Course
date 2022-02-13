package CodingQuestions;

/*
Given an array arr of integers, check if there exists two integers N and M such that N is the double of M ( i.e. N = 2 * M).

More formally check if there exists two indices i and j such that :

i != j
0 <= i, j < arr.length
arr[i] == 2 * arr[j]

*/
public class DoubleExist {

 public static void main(String[] args) {
  int[] numsArray = new int[] { 10, 2, 5, 3 };
  System.out.println("Check If N and Its Double Exist " + NumbersExist(numsArray));

  int[] numsArray2 = new int[] { 1, 1, 1, 1 };
  System.out.println("Check If N and Its Double Exist " + NumbersExist(numsArray2));

  int[] numsArray3 = new int[] {};
  System.out.println("Check If N and Its Double Exist " + NumbersExist(numsArray3));
 }

 private static boolean NumbersExist(int[] numsArray) {
  for (int i = 0; i < numsArray.length; i++) {
   for (int j = 0; j < numsArray.length; j++) {
    if (i != j && numsArray[i] == 2 * numsArray[j]) {
     return true;
    }
   }
  }
  return false;
 }

}
