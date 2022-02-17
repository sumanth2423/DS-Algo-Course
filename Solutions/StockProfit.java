
public class StockProfit {
 public static void main(String[] args) {
  int[] prices = new int[] { 7, 2, 5, 1, 3, 6, 4 };
  System.out.println("Max profit is " + CalculateProfit(prices));

  prices = new int[] { 7, 6, 4, 3, 1 };
  System.out.println("Max profit is " + CalculateProfit(prices));

 }

 private static int CalculateProfit(int[] array) {
  int largestDifference = 0;
  int lowest = Integer.MAX_VALUE;

  for (int i = 0; i < array.length; i++) {
   if (array[i] < lowest) {
    lowest = array[i];
   } else {
    largestDifference = Integer.max(array[i] - lowest, largestDifference);
   }
  }

  return largestDifference;
 }

}
