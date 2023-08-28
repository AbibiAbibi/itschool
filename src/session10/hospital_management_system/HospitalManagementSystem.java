package session10.hospital_management_system;

import java.util.List;

public class HospitalManagementSystem {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();

        Doctor cardiologist = new Doctor("Dr. Smith", "Cardiologist");
        Doctor dermatologist = new Doctor("Dr. Johnson", "Dermatologist");

        hospital.addDoctor(cardiologist);
        hospital.addDoctor(dermatologist);

        Patient patient1 = new Patient("John Doe", 35);
        patient1.addMedicalHistory("Appendectomy in 2010");
        Patient patient2 = new Patient("Jane Smith", 45);
        patient2.addMedicalHistory("Fractured arm in 2018");

        hospital.admitPatient(patient1);
        hospital.admitPatient(patient2);

        hospital.assignPatientToDoctor(patient1, cardiologist);
        hospital.assignPatientToDoctor(patient2, dermatologist);

        List<Patient> allPatients = hospital.getAllPatients();
        List<Doctor> allDoctors = hospital.getAllDoctors();

        System.out.println("List of Patients:");
        for (Patient patient : allPatients) {
            System.out.println("Name: " + patient.getName());
            System.out.println("Age: " + patient.getAge());
            System.out.println("Medical History:");
            for (String history : patient.getMedicalHistory()) {
                System.out.println("- " + history);
            }
            System.out.println("Patient ID: " + patient.getPatientID());
            System.out.println();
        }

        System.out.println("List of Doctors:");
        for (Doctor doctor : allDoctors) {
            System.out.println("Doctor Name: " + doctor.getName());
            System.out.println("Specialization: " + doctor.getSpecialization());
            System.out.println("Patients Under Treatment:");
            for (Patient patient : doctor.getPatientsUnderTreatment()) {
                System.out.println("- " + patient.getName());
            }
            System.out.println();
        }
    }
}