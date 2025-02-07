package Encapsulation;

public class Patient {
    private String patientId;
    private String name;
    private int age;
    private String diagnosis;

    public Patient(String patientId, String name, int age, String diagnosis) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.diagnosis = diagnosis;
    }

    public String getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }    

    public int getAge() {
        return age;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    }


    public void setDiagnosis(String diagnosis) {
        if (diagnosis != null && !diagnosis.isEmpty()) {
        this.diagnosis = diagnosis;
        } else {
        System.out.println("Diagnosis cannot be empty");
        }
    }

    public void updateDiagnosis(String newDiagnosis) {
    setDiagnosis(newDiagnosis);
        if (newDiagnosis != null && !newDiagnosis.isEmpty()) {
        System.out.println("Diagnosis updated successfully to: " + newDiagnosis);
        }
    }
}
