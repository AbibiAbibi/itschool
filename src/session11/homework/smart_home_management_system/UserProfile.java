package session11.homework.smart_home_management_system;

public class UserProfile {

    private UserRole role;

    public UserProfile(UserRole role) {
        this.role = role;
    }

    public UserRole getRole() {
        return role;
    }
}