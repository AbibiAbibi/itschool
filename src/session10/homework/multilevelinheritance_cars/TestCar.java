package session10.homework.multilevelinheritance_cars;

public class TestCar {

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.make = "Toyota";
        myCar.model = "Camry";
        myCar.year = 2022;
        System.out.println(myCar);
        myCar.start();
        myCar.accelerate();
        myCar.stop();
        System.out.println();

        ElectricCar myElectricCar = new ElectricCar();
        myElectricCar.make = "Nissan";
        myElectricCar.model = "Leaf";
        myElectricCar.year = 2022;
        myElectricCar.batteryCapacity = 60.0;
        myElectricCar.range = 220.0;
        System.out.println(myElectricCar);
        myElectricCar.start();
        myElectricCar.charge(20.3);
        myElectricCar.stop();
        System.out.println();

        Tesla myTesla = new Tesla();
        myTesla.make = "Tesla";
        myTesla.model = "S";
        myTesla.year = 2022;
        myTesla.batteryCapacity = 80.0;
        myTesla.range = 350.0;
        myTesla.autopilotVersion = 2.0;
        System.out.println(myTesla);
        myTesla.start();
        myTesla.charge(5.6);
        myTesla.enableAutopilot();
        myTesla.stop();
    }
}