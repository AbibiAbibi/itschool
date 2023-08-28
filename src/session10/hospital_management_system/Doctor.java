package session10.hospital_management_system;

import java.util.ArrayList;
import java.util.List;

class Doctor {
    private String name;
    private String specialization;
    private List<Patient> patientsUnderTreatment;

    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
        this.patientsUnderTreatment = new ArrayList<>();
    }

    public void assignPatient(Patient patient) {
        patientsUnderTreatment.add(patient);
    }

    public List<Patient> getPatientsUnderTreatment() {
        return patientsUnderTreatment;
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }
}