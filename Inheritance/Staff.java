public class Staff {
    private String staffId;
    private String name;
    private String department;

    // Constructor
public Staff(String staffId, String name, String department) {
    this.staffId = staffId;
    this.name = name;
    this.department = department;

    }
public String getStaffId() {
    return staffId;
    }
public String getName() {
    return name;
    }
public String getDepartment() {
    return department;
    }

 // Method to display details
 public void displayDetails() {
    System.out.println("Staff ID: " + staffId);
    System.out.println("Name: " + name);
    System.out.println("Department: " + department);

    }
}