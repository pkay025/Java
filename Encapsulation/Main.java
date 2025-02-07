package Encapsulation;

public class Main {
    public static void main(String[] args) {

    Patient patient = new Patient("P001", "John Smith", 45, "Fever");

    Doctor doctor = new Doctor("D101", "Dr. Alice", "General Medicine");

    // Update the patient's diagnosis to "Flu"
   patient.updateDiagnosis("Flu");

   // Treat the patient and increase the doctor's patientsTreated count
   doctor.treatPatient(patient);

    // Attempt to set the patient's age to a negative value
    patient.setAge(-5);

    // Attempt to update the patient's diagnosis to an empty string
    patient.setDiagnosis("");

        
    }
    

}



