public class Doctor extends Staff {
    private String specialization;
    private int yearsOfExperience;


    public Doctor(String staffId, String name, String department, String specialization, int yearsOfExperience) {
        super(staffId, name, department);
        this.specialization = specialization;
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public void displayDetails() {
        System.out.println("Staff ID: " + getStaffId());
        System.out.println("Name: " + getName());
        System.out.println("Department: " + getDepartment());
        System.out.println("Specialization: " + specialization);
        System.out.println("Experience: " + yearsOfExperience + " years");
    }
}
