package session10.homework.multilevelinheritance_cars;

public class Car {

    String make;
    String model;
    int year;

    void start() {
        System.out.println("Car started!");
    }

    void stop() {
        System.out.println("Car stopped!");
    }

    void accelerate() {
        System.out.println("Car accelerate!");
    }

    @Override
    public String toString() {
        return
                "make = " + make + '\n' +
                "model = " + model + '\n' +
                "year = " + year;
    }
}

class ElectricCar extends Car {

    double batteryCapacity;
    double range;

    void charge(double increment) {
        batteryCapacity += increment;
        System.out.println("Electric car charging.");
    }

    @Override
    public String toString() {
        return
                "make = " + make + '\n' +
                "model = " + model + '\n' +
                "year = " + year + '\n' +
                "batteryCapacity = " + batteryCapacity + '\n' +
                "range = " + range;
    }
}

class Tesla extends ElectricCar {

    double autopilotVersion;

    void enableAutopilot() {
        System.out.println("Autopilot is on!");
    }

    @Override
    public String toString() {
        return
                "make = " + make + '\n' +
                "model = " + model + '\n' +
                "year = " + year + '\n' +
                "batteryCapacity = " + batteryCapacity + '\n' +
                "range = " + range + '\n' +
                "autopilotVersion = " + autopilotVersion;
    }
}