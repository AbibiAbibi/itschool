package session13;


public class FloatingPointPrecision {

    public static void main(String[] args) {
        float numberOne = 2.3f;
        float numberTwo = 5.6f;
        float numberThree = 4;

        float average = getAverage(numberOne, numberTwo, numberThree);
        if (average != -1) {
            System.out.println("The average of a three numbers is: " + average);
        } else {
            System.out.println("The number are too large!");
        }
    }

    public static boolean sumOfAnExceedFloat(float numberOne, float numberTwo, float numberThree) {
        return numberOne + numberTwo + numberThree < Float.MAX_VALUE;
    }

    public static float getAverage(float numberOne, float numberTwo, float numberThree) {
        if (sumOfAnExceedFloat(numberOne, numberTwo, numberThree)) {
            return (numberOne + numberTwo + numberThree) / 3;
        }
        return -1;
    }
}