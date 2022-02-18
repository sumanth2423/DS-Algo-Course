public class StringsDemo {
    public static void main(String[] args) {

        System.out.println("--String Demo--");
        StringToCharArray();
        ReverseString();
        IsPolyndrome("ava", "ava");

    }

    private static void IsPolyndrome(String input, String w) {

        if (input == w) {
            System.out.println("match");
        }
        String output = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            output = output + input.charAt(i);
        }
        System.out.println(output);
        System.out.println(input);
        w = output;
        if (input == w) {
            System.out.println(input + " is a polyndrone");
        } else {
            System.out.println(input + " is not a polyndrone");
        }

    }

    private static void ReverseString() {
        String myString = "ReverseDemo";
        String output = "";

        for (int i = myString.length() - 1; i >= 0; i--) {
            output = output + myString.charAt(i);
        }
        System.out.println("The Reverse string is " + output);
    }

    private static void StringToCharArray() {
        String myName = "String to Character Array";

        char[] charArray = new char[myName.length()];

        for (int i = 0; i < myName.length(); i++) {
            charArray[i] = myName.charAt(i);
        }

        for (char s : charArray) {
            System.out.println(s);
        }
    }

}
