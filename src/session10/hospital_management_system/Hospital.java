package session10.hospital_management_system;

import java.util.ArrayList;
import java.util.List;

class Hospital {
    private List<Patient> patients;
    private List<Doctor> doctors;

    public Hospital() {
        this.patients = new ArrayList<>();
        this.doctors = new ArrayList<>();
    }

    public void admitPatient(Patient patient) {
        patients.add(patient);
    }

    public void assignPatientToDoctor(Patient patient, Doctor doctor) {
        doctor.assignPatient(patient);
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public List<Patient> getAllPatients() {
        return patients;
    }

    public List<Doctor> getAllDoctors() {
        return doctors;
    }
}
