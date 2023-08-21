package session6.homework;

public class ReverseAString {

    public static void main(String[] args) {
        String input = "salut";

        System.out.println("The reverse of salut is: " + reverseWithStringBuilder(input));
    }

    public static String reverseWithStringBuilder(String input) {
        StringBuilder reversed = new StringBuilder(input);
        reversed.reverse();
        return reversed.toString();
    }
}