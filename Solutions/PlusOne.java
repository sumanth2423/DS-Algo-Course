
public class PlusOne {

 public static void main(String[] args) {
  int[] arr = new int[] { 9, 9 };

  System.out.println("After the function call" + java.util.Arrays.toString(MethodName(arr)));

 }

 private static int[] MethodName(int[] digits) {

  for (int i = digits.length - 1; i >= 0; i--) {

   if (digits[i] == 9) {
    digits[i] = 0;
   } else {
    digits[i] = digits[i] + 1;
    return digits;

   }
  }
  digits = new int[digits.length + 1];
  digits[0] = 1;

  return digits;
 }
}
