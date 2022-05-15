import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {

 public static void main(String[] args) {
  String s = "araaci";
  int k = 0;

  System.out.println("After the function call" + MethodName(s, k));
 }

 private static int MethodName(String s, int k) {

  int longestSubstring = 0;
  char[] charArray = s.toCharArray();
  Map<Character, Integer> map = new HashMap<>();
  int windowStart = 0;
  for (int windowEnd = 0; windowEnd < charArray.length; windowEnd++) {

  }
  return longestSubstring;

 }
}