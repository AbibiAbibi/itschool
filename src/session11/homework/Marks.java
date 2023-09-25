package session11.homework;

public abstract class Marks {

    abstract double getPercentage();
}

class StudentA extends Marks {

    private double subject1;
    private double subject2;
    private double subject3;

    public StudentA(double subject1, double subject2, double subject3) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

    @Override
    double getPercentage() {
        double totalMark = subject1 + subject2 + subject3;
        return (totalMark / 300.0) * 100;
    }
}

class StudentB extends Marks {

    private double subject1;
    private double subject2;
    private double subject3;
    private double subject4;

    public StudentB(double subject1, double subject2, double subject3, double subject4) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
        this.subject4 = subject4;
    }

    @Override
    double getPercentage() {
        double totalMark = subject1 + subject2 + subject3 + subject4;
        return (totalMark / 400.0) * 100;
    }
}