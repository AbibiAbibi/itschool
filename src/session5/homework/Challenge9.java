package session5.homework;

public class Challenge9 {
    //9. Given an array of integers, write a program that prints
    //each number in the array followed by "Even" if the number is even,
    //or "Odd" if the number is odd. Utilize a for-each loop for this task.
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Numbers and their parity:");

        for (int num : numbers) {
            System.out.print(num + " is ");
            if (num % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
        }
    }
}