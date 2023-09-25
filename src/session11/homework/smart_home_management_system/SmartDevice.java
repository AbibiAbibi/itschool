package session11.homework.smart_home_management_system;

public abstract class SmartDevice {

    private String name;
    private boolean isOn;

    public SmartDevice(String name) {
        this.name = name;
        this.isOn = false;
    }

    public void turnOn() {
        isOn = true;
        System.out.println(name + " is turned on.");
    }

    public void turnOff() {
        isOn = false;
        System.out.println(name + " is turned off.");
    }

    public boolean isOn() {
        return isOn;
    }

    public abstract DeviceType getType();

    public abstract void showOptions();
}

class Light extends SmartDevice {
    public Light(String name) {
        super(name);
    }

    @Override
    public DeviceType getType() {
        return DeviceType.LIGHT;
    }

    @Override
    public void showOptions() {
        System.out.println("1. Turn On");
        System.out.println("2. Turn Off");
        System.out.println("3. Adjust Brightness");
        System.out.print("Select an option: ");
    }
}

class Thermostat extends SmartDevice {
    public Thermostat(String name) {
        super(name);
    }

    @Override
    public DeviceType getType() {
        return DeviceType.THERMOSTAT;
    }

    @Override
    public void showOptions() {
        System.out.println("1. Turn On");
        System.out.println("2. Turn Off");
        System.out.println("3. Set Temperature");
        System.out.print("Select an option: ");
    }
}

class Door extends SmartDevice {
    public Door(String name) {
        super(name);
    }

    @Override
    public DeviceType getType() {
        return DeviceType.DOOR;
    }

    @Override
    public void showOptions() {
        System.out.println("1. Lock");
        System.out.println("2. Unlock");
        System.out.print("Select an option: ");
    }
}

class Window extends SmartDevice {
    public Window(String name) {
        super(name);
    }

    @Override
    public DeviceType getType() {
        return DeviceType.WINDOW;
    }

    @Override
    public void showOptions() {
        System.out.println("1. Close");
        System.out.println("2. Open");
        System.out.print("Select an option: ");
    }
}

class Camera extends SmartDevice {
    public Camera(String name) {
        super(name);
    }

    @Override
    public DeviceType getType() {
        return DeviceType.CAMERA;
    }

    @Override
    public void showOptions() {
        System.out.println("1. Turn On");
        System.out.println("2. Turn Off");
        System.out.println("3. Record");
        System.out.println("4. Take Snapshot");
        System.out.print("Select an option: ");
    }
}

class EntertainmentSystem extends SmartDevice {
    public EntertainmentSystem(String name) {
        super(name);
    }

    @Override
    public DeviceType getType() {
        return DeviceType.ENTERTAINMENT_SYSTEM;
    }

    @Override
    public void showOptions() {
        System.out.println("1. Turn On");
        System.out.println("2. Turn Off");
        System.out.println("3. Play");
        System.out.println("4. Stop");
        System.out.print("Select an option: ");
    }
}