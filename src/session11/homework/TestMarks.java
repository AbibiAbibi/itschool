package session11.homework;

public class TestMarks {

    public static void main(String[] args) {

        StudentA studentA = new StudentA(80, 70, 95);
        StudentB studentB = new StudentB(50, 67, 80, 85);

        System.out.println("Percentage of marks for StudentA: " + studentA.getPercentage() + "%");
        System.out.println("Percentage of marks for StudentB: " + studentB.getPercentage() + "%");
    }
}