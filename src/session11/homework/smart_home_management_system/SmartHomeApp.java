package session11.homework.smart_home_management_system;

import java.util.Scanner;

public class SmartHomeApp {

    public static void main(String[] args) {
        SmartHome smartHome = new SmartHome();
        SmartDevice livingRoomLight = new Light("Living Room Light");
        SmartDevice livingRoomThermostat = new Thermostat("Living Room Thermostat");
        SmartDevice mainDoor = new Door("Main Door");
        SmartDevice livingRoomWindow = new Window("Living Room Window");
        SmartDevice securityCamera = new Camera("Security Camera");
        SmartDevice entertainmentSystem = new EntertainmentSystem("Entertainment System");

        UserProfile homeowner = new UserProfile(UserRole.HOMEOWNER);
        UserProfile familyMember = new UserProfile(UserRole.FAMILY_MEMBER);
        UserProfile guest = new UserProfile(UserRole.GUEST);

        smartHome.addDevice(livingRoomLight);
        smartHome.addDevice(livingRoomThermostat);
        smartHome.addDevice(mainDoor);
        smartHome.addDevice(livingRoomWindow);
        smartHome.addDevice(securityCamera);
        smartHome.addDevice(entertainmentSystem);

        smartHome.addUser(homeowner);
        smartHome.addUser(familyMember);
        smartHome.addUser(guest);

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("1. Log in as Homeowner");
            System.out.println("2. Log in as Family Member");
            System.out.println("3. Log in as Guest");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    smartHome.controlDevices(homeowner);
                    interactWithDevices(livingRoomLight, livingRoomThermostat, mainDoor, livingRoomWindow, securityCamera, entertainmentSystem);
                    break;
                case 2:
                    smartHome.controlDevices(familyMember);
                    interactWithDevices(livingRoomLight, livingRoomThermostat, mainDoor, livingRoomWindow, securityCamera, entertainmentSystem);
                    break;
                case 3:
                    smartHome.controlDevices(guest);
                    interactWithDevices(entertainmentSystem);
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
    }

    public static void interactWithDevices(SmartDevice... devices) {
        Scanner scanner = new Scanner(System.in);
        boolean done = false;

        while (!done) {
            System.out.println();
            for (int i = 0; i < devices.length; i++) {
                System.out.println((i + 1) + ". " + devices[i].getType() + " - " + (devices[i].isOn() ? "On" : "Off"));
            }
            System.out.print("Select a device to interact with (1-" + devices.length + ") or 0 to exit: ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                done = true;
            } else if (choice >= 1 && choice <= devices.length) {
                SmartDevice selectedDevice = devices[choice - 1];
                selectedDevice.showOptions();

                int actionChoice = scanner.nextInt();

                switch (actionChoice) {
                    case 1:
                        selectedDevice.turnOn();
                        break;
                    case 2:
                        selectedDevice.turnOff();
                        break;
                    case 3:
                        if (selectedDevice.getType() == DeviceType.LIGHT || selectedDevice.getType() == DeviceType.CAMERA) {
                            System.out.println("Enter brightness level (0-100): ");
                            int brightness = scanner.nextInt();
                            System.out.println("Brightness set to " + brightness);
                        } else if (selectedDevice.getType() == DeviceType.THERMOSTAT) {
                            System.out.println("Enter temperature (in Celsius): ");
                            double temperature = scanner.nextDouble();
                            System.out.println("Temperature set to " + temperature + "°C");
                        } else {
                            System.out.println("Option not available for this device.");
                        }
                        break;
                    case 4:
                        if (selectedDevice.getType() == DeviceType.CAMERA) {
                            System.out.println("Recording...");
                        } else if (selectedDevice.getType() == DeviceType.CAMERA) {
                            System.out.println("Taking a snapshot...");
                        } else {
                            System.out.println("Option not available for this device.");
                        }
                        break;
                    default:
                        System.out.println("Invalid action choice.");
                        break;
                }
            } else {
                System.out.println("Invalid device choice.");
            }
        }
    }
}