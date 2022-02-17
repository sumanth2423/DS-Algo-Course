import java.util.Arrays;

public class Template {

 public static void main(String[] args) {
  int[] arr = new int[] { 1, 1, 2 };

  System.out.println("After the function call" + Arrays.toString(MethodName(arr)));

 }

 private static int[] MethodName(int[] array) {

  return array;

 }
}
