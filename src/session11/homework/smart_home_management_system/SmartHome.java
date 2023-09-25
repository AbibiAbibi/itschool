package session11.homework.smart_home_management_system;

import java.util.ArrayList;
import java.util.List;

public class SmartHome {

    private List<SmartDevice> devices;
    private List<UserProfile> users;

    public SmartHome() {
        devices = new ArrayList<>();
        users = new ArrayList<>();
    }

    public void addDevice(SmartDevice device) {
        devices.add(device);
    }

    public void addUser(UserProfile user) {
        users.add(user);
    }

    public void controlDevices(UserProfile user) {
        System.out.println("Logged in as " + user.getRole());
    }
}