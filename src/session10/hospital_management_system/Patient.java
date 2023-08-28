package session10.hospital_management_system;

import java.util.ArrayList;
import java.util.List;

class Patient {
    private String name;
    private int age;
    private List<String> medicalHistory;
    private int patientID;

    public Patient(String name, int age) {
        this.name = name;
        this.age = age;
        this.medicalHistory = new ArrayList<>();
        this.patientID = generatePatientID();
    }

    public void addMedicalHistory(String history) {
        medicalHistory.add(history);
    }

    public int getPatientID() {
        return patientID;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<String> getMedicalHistory() {
        return medicalHistory;
    }

    private int generatePatientID() {
        return (int) (Math.random() * 10000);
    }
}