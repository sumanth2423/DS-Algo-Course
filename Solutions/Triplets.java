public class Triplets {

 public static void main(String[] args) {
  int[] arr = new int[] { 1, 2, 5, 4, 3 };

  System.out.println("After the function call" + MethodName(arr));

 }

 private static int MethodName(int[] array) {
  int totalCount = 0;
  for (int i = 0; i < array.length; i++) {

   for (int j = i + 1; j < array.length; j++) {

    for (int k = j + 1; k < array.length; k++) {
     if (array[i] < array[j] && array[j] > array[k]) {
      totalCount = totalCount + 1;
     }
    }
   }
  }
  return totalCount;
 }
}
