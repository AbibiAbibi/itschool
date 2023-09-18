package session16_lambda.practice;

public class LambdaPractice {

    public static void main(String[] args) {
        IntSum getSum = (a, b) -> a + b;
        System.out.println(getSum.sum(2, 4));

        IntMultiply getMultiply = (a, b) -> a * b;
        System.out.println(getMultiply.multiply(3, 6));
    }
}