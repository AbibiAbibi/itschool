package session10.homework.hierarchicalinheritance_watercraft;

public class TestBoat {

    public static void main(String[] args) {
        Boat myBoat = new Boat();
        myBoat.length = 25.5;
        myBoat.weight = 1500.0;
        System.out.println(myBoat);
        myBoat.sail();
        System.out.println();

        SpeedBoat mySpeedBoat = new SpeedBoat();
        mySpeedBoat.length = 10.0;
        mySpeedBoat.weight = 800.0;
        mySpeedBoat.maxSpeed = 60.0;
        mySpeedBoat.engineType = "Gasoline";
        System.out.println(mySpeedBoat);
        mySpeedBoat.sail();
        mySpeedBoat.turboBoost();
        System.out.println();

        FishingBoat myFishingBoat = new FishingBoat();
        myFishingBoat.length = 24.5;
        myFishingBoat.weight = 2000.0;
        myFishingBoat.fishCapacity = 500.0;
        myFishingBoat.typeOfNet = "Nylon";
        System.out.println(myFishingBoat);
        myFishingBoat.sail();
        myFishingBoat.castNet();
    }
}