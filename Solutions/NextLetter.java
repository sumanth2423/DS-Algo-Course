public class NextLetter {
 public static void main(String[] args) {

  System.out.println(NextLetter.searchNextLetter(new char[] { 'a', 'c', 'f', 'h' }, 'f'));
  System.out.println(NextLetter.searchNextLetter(new char[] { 'a', 'c', 'f', 'h' }, 'b'));
  System.out.println(NextLetter.searchNextLetter(new char[] { 'a', 'c', 'f', 'h' }, 'm'));
  System.out.println(NextLetter.searchNextLetter(new char[] { 'a', 'c', 'f', 'h' }, 'h'));

 }

 public static char searchNextLetter(char[] letters, char key) {

  int startIndex = 0;
  int endIndex = letters.length - 1;
  int totalCount = letters.length;

  while (startIndex <= endIndex) {
   int middleIndex = startIndex + (endIndex - startIndex) / 2;
   if (key > letters[middleIndex]) {
    startIndex = middleIndex + 1;
   } else {
    endIndex = middleIndex - 1;
   }
  }
  return letters[startIndex % totalCount];
 }
}
