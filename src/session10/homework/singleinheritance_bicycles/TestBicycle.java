package session10.homework.singleinheritance_bicycles;

public class TestBicycle {

    public static void main(String[] args) {
        Bicycle myBicycle = new Bicycle();
        myBicycle.changeGear(4);
        myBicycle.speedUp(20);
        myBicycle.applyBreak(10);

        MountainBike myMountainBike = new MountainBike();
        myMountainBike.changeGear(3);
        myMountainBike.speedUp(15);
        myMountainBike.applyBreak(7);
        myMountainBike.adjustSuspension("Hard");
    }
}