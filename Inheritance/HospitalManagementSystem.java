package Inheritance;

import java.util.List;
import java.util.ArrayList;


public class HospitalManagementSystem {
    private List<Staff> staffList;

    public HospitalManagementSystem() {
        staffList = new ArrayList<>();
    }
    public void registerStaff(Staff staff) {
        staffList.add(staff);
        System.out.println("Staff '" + staff.getName() + "' registered successfully");
    }

    public void displayAllStaff() {
        for (Staff staff : staffList) {
            staff.displayDetails();
        }
    }

    public static void main(String[] args) {
        
        HospitalManagementSystem hospital = new HospitalManagementSystem();

        // Register two doctors and one nurse
        Doctor doctor1 = new Doctor("S001", "Dr. Smith", "Cardiology", "Cardiology", 15);
        Doctor doctor2 = new Doctor("S002", "Dr. Lee", "Neurology", "Neurology", 8);
        Nurse nurse = new Nurse("S003", "Nurse Kelly", "Emergency", "Night", 5);

        hospital.registerStaff(doctor1);
        hospital.registerStaff(doctor2);
        hospital.registerStaff(nurse);

        // Display of all registered staff
        hospital.displayAllStaff();

    }
}