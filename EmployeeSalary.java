// Create a class hierarchy for different types of employees with methods for calculating salaries and bonuses.

public class EmployeeSalary {
    public static void main(String[] args) {
        FullTimeEmployee ftEmployee = new FullTimeEmployee("John Doe", 50000);
        PartTimeEmployee ptEmployee = new PartTimeEmployee("Jane Smith", 25, 20);
        Intern intern = new Intern("Tom Brown", 15, 30);

        System.out.println(ftEmployee.getName() + "'s Salary: $" + ftEmployee.calculateSalary());
        System.out.println(ftEmployee.getName() + "'s Bonus: $" + ftEmployee.calculateBonus());

        System.out.println(ptEmployee.getName() + "'s Salary: $" + ptEmployee.calculateSalary());
        System.out.println(ptEmployee.getName() + "'s Bonus: $" + ptEmployee.calculateBonus());

        System.out.println(intern.getName() + "'s Salary: $" + intern.calculateSalary());
        System.out.println(intern.getName() + "'s Bonus: $" + intern.calculateBonus());
    }
}

// Base class Employee
abstract class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double calculateSalary();

    public abstract double calculateBonus();
}

// FullTimeEmployee class
class FullTimeEmployee extends Employee {
    private double annualSalary;

    public FullTimeEmployee(String name, double annualSalary) {
        super(name);
        this.annualSalary = annualSalary;
    }

    @Override
    public double calculateSalary() {
        return annualSalary;
    }

    @Override
    public double calculateBonus() {
        return annualSalary * 0.1; // 10% of annual salary as bonus
    }
}

// PartTimeEmployee class
class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(String name, double hourlyRate, int hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public double calculateBonus() {
        return calculateSalary() * 0.05; // 5% of total salary as bonus
    }
}

// Intern class
class Intern extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public Intern(String name, double hourlyRate, int hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public double calculateBonus() {
        return 0; // Interns do not receive bonuses
    }
}
