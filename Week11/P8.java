// 8. You are building a payroll system for a company. 
// The system has a class Employee with a method calculateSalary() to calculate the salary of an employee. 
// Now, you need to create a derived class Manager that inherits from Employee 
// and overrides the calculateSalary() method to include a bonus calculation based on the performance. 
// Implement the classes and demonstrate method overriding for calculating the salary of a manager.

package Week11;

public class P8 {
    public static void main(String[] args) {
        Employee emp = new Employee("John Doe", 50000.0);
        emp.calculateSalary();
        
        System.out.println(); 
    
        Manager manager = new Manager("Jane Smith", 80000.0, 15000.0);
        manager.calculateSalary();
    }
}

class Employee {
    protected String name;
    protected double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public void calculateSalary() {
        System.out.println("Calculating salary for Employee: " + name);
        double totalSalary = baseSalary;
        System.out.println("Base salary: $" + baseSalary);
        System.out.println("Total salary: $" + totalSalary);
    }
}

// Manager class inheriting from Employee
class Manager extends Employee {
    private double bonus;

    public Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public void calculateSalary() {
        System.out.println("Calculating salary for Manager: " + name);
        double totalSalary = baseSalary + bonus;
        System.out.println("Base salary: $" + baseSalary);
        System.out.println("Bonus: $" + bonus);
        System.out.println("Total salary: $" + totalSalary);
    }
}


