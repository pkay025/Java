package Inheritance;

public  class Nurse extends Staff{
    private String shift;
    private int patientAssigned;

    public Nurse( String staffId, String name, String department, String shift, int patientAssigned) {
        super(staffId, name, department);
        this.shift = shift;
        this.patientAssigned = patientAssigned;
    }

    @Override
    public void displayDetails() {
        System.out.println("Staff ID: " + getStaffId());
        System.out.println("Name: " + getName());
        System.out.println("Department: " + getDepartment());
        System.out.println("Shift: " + shift);
        System.out.println("PatientAssigned: " + patientAssigned + " patients");
    }
    
}
