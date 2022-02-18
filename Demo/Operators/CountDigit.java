package Operators;

public class CountDigit {

    public static int countDigits(int n) {
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 1234;
        System.out.println("The total number of digitis in " + n + " are:  " + countDigits(n));

    }
}