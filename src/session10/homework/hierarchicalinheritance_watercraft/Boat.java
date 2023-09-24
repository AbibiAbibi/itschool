package session10.homework.hierarchicalinheritance_watercraft;

public class Boat {
    double length;
    double weight;

    void sail() {
        System.out.println("The boat is sailing.");
    }

    @Override
    public String toString() {
        return "Boat:" + '\n' +
                "length = " + length + '\n' +
                "weight = " + weight;
    }
}

class SpeedBoat extends Boat {

    double maxSpeed;
    String engineType;

    void turboBoost() {
        System.out.println("SpeedBoat is boosting.");
    }

    @Override
    public String toString() {
        return "SpeedBoat:" + '\n' +
                "maxSpeed = " + maxSpeed + '\n' +
                "engineType = " + engineType + '\n' +
                "length = " + length + '\n' +
                "weight = " + weight;
    }
}

class FishingBoat extends Boat {

    double fishCapacity;
    String typeOfNet;

    void castNet() {
        System.out.println("FishingBoat is casting the net.");
    }

    @Override
    public String toString() {
        return "FishingBoat:" + '\n' +
                "fishCapacity = " + fishCapacity + '\n' +
                "typeOfNet = " + typeOfNet + '\n' +
                "length = " + length + '\n' +
                "weight = " + weight;
    }
}