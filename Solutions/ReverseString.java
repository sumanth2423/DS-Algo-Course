public class ReverseString {

 public static void main(String[] args) {
  char[] arr = new char[] { 'h', 'e', 'l', 'l', 'o' };

  arr = MethodName(arr);

  for (char c : arr) {
   System.out.println(c);
  }

  System.out.println("Example 2-------");

  char[] arr2 = new char[] { 'H', 'a', 'n', 'n', 'a', 'h' };

  arr2 = MethodName(arr2);

  for (char c : arr2) {
   System.out.println(c);
  }

 }

 private static char[] MethodName(char[] s) {

  int startIndex = 0;
  int endIndex = s.length - 1;

  while (startIndex < endIndex) {
   char temp = s[startIndex];
   s[startIndex] = s[endIndex];
   s[endIndex] = temp;

   startIndex++;
   endIndex--;
  }

  return s;

 }
}
