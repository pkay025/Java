package Encapsulation;

public class Doctor {
    private String doctorId;
    private String name;
    private String specialization;
    private int patientTreated;

public Doctor(String doctorId, String name, String specialization) {
    this.doctorId = doctorId;
    this.name = name;
    this.specialization = specialization;
    this.patientTreated = 0;

    }

public String getDoctorId() {
    return doctorId;
}   

public String getName() {
    return name;          
}   

public String getSpecialization() {
    return specialization;
}

public int getPatientTreated() {
    return patientTreated;
}
public void setDoctorId(String doctorId) {  
    this.doctorId = doctorId;   
}

public void setName(String name) {
    this.name = name;
}

public void setSpecialization(String specialization) {
    this.specialization = specialization;
}

public void setPatientTreated(int patientTreated) {
    this.patientTreated = patientTreated;
}

public void treatPatient(Patient patient) {
    this.patientTreated++;
    System.out.println("Patient treated successfully. Total patients treated: " + this.patientTreated);
}

}
