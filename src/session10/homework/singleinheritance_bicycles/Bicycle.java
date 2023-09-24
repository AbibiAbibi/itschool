package session10.homework.singleinheritance_bicycles;

public class Bicycle {

    private int speed;
    private int gear;

    void changeGear(int newGear) {
        gear = newGear;
    }

    void speedUp(int increment) {
        speed += increment;
    }


    void applyBreak(int decrement) {
        speed -= decrement;
    }
}

class MountainBike extends Bicycle {

    private String tireType;
    private String suspension;

    void adjustSuspension(String newSuspension) {
        suspension = newSuspension;
    }
}