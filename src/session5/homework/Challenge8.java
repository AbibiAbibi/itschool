package session5.homework;

public class Challenge8 {
    //8. Write a program that prints the first 10 numbers in the
    //Fibonacci series. Use a for loop to accomplish this.
    public static void main(String[] args) {
        int n = 10;  // Number of Fibonacci numbers to print

        int prev1 = 0;
        int prev2 = 1;

        System.out.println("First " + n + " numbers in the fibonacci series:");

        for (int i = 0; i < n; i++) {
            System.out.print(prev1 + " ");
            int next = prev1 + prev2;
            prev1 = prev2;
            prev2 = next;
        }
    }
}