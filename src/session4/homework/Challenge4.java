package session4.homework;

public class Challenge4 {
    // 4. Write a Java program where you declare two integer variables
    // heightOne and heightTwo with any values. Use a ternary operator to
    // determine the greater height and assign it to a variable maximumHeight.
    // Print the result.
    public static void main(String[] args) {
        int heightOne = 175;
        int heightTwo = 180;

        int maximumHeight = (heightOne > heightTwo) ? heightOne : heightTwo;

        System.out.println("Maximum height: " + maximumHeight);
    }
}