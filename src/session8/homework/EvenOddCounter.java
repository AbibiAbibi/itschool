package session8.homework;

public class EvenOddCounter {

    public static void main(String[] args) {
        int[] numbers = {2, 5, 8, 11, 14, 17, 20, 23, 26, 29};
        int evenCount = 0;
        int oddCount = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Number of even numbers: " + evenCount);
        System.out.println("Number of odd numbers: " + oddCount);
    }
}