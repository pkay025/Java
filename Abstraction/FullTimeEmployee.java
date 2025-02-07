package Abstraction;

public class FullTimeEmployee extends Employee{
    private double salary;

    public FullTimeEmployee(String name, String employeeId, double salary) {
        super(name, employeeId);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
    
    @Override
    public double calculatePay() {
        System.out.println("FullTimeEmployee Pay: " + salary);
        return salary;
    }
}
