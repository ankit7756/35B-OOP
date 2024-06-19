// 2. Write a Java program to create a class called Employee with methods called work() and getSalary(). 
// Create a subclass called HRManager that overrides the work() method.

package Week9;

public class P2 {
    public static void main(String[] args) {
        // Create an Employee object
        Employee emp = new Employee();
        emp.work();
        System.out.println("Employee Salary: " + emp.getSalary());

        // Create an HRManager object
        HRManager hr = new HRManager();
        hr.work();
        System.out.println("HR Manager Salary: " + hr.getSalary());
    }
}

// Employee class with methods work() and getSalary()
class Employee {
    // Method to simulate work
    public void work() {
        System.out.println("Employee is working.");
    }

    // Method to get the salary of an employee
    public double getSalary() {
        return 50000.0; // Example salary
    }
}

// HRManager subclass extending Employee class
class HRManager extends Employee {
    // Overriding the work method in the HRManager class
    @Override
    public void work() {
        System.out.println("HR Manager is managing employee relations.");
    }

    // HRManager may have a different salary structure
    @Override
    public double getSalary() {
        return 70000.0; // Example salary for HR Manager
    }
}
