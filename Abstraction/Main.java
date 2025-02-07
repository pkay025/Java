package Abstraction;

public class Main {
    public static void main(String[] args) {
        FullTimeEmployee employee1 = new FullTimeEmployee("Paakow Emma", "EOO1", 90000);

        System.out.println("Name: " + employee1.getName());
        System.out.println("Employee ID: " + employee1.getEmployeeId());
        System.out.println("Salary: " + employee1.getSalary());
        employee1.calculatePay();

        FullTimeEmployee employee2 = new FullTimeEmployee("Abigail Kumah Yeboah", "EOO2", 60000);

        System.out.println("Name: " + employee2.getName());
        System.out.println("Employee ID: " + employee2.getEmployeeId());
        System.out.println("Salary: " + employee2.getSalary());
        employee2.calculatePay();

    }
}