// 4. Write a Java program to create a class called "Employee" 
// with a name, job title, and salary attributes, and methods to calculate and update salary.

package Week7;

public class P4 {
    public static void main(String[] args) {
        Employee emp1 = new Employee("John Doe", "Software Engineer", 5000.0);

        // Display initial details
        emp1.displayDetails();

        // Calculate and display annual salary
        System.out.println("Annual Salary: $" + emp1.calculateSalary());

        // Increase salary by 10%
        emp1.increaseSalary(10);
        emp1.displayDetails();
    }
}
        
class Employee{
    private String name;
    private String jobTitle;
    private double salary;

    public Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }


    public void setSalary(double salary){
        this.salary = salary;
    }
    public double getSalary(){
        return salary;
    }
    public double calculateSalary(){
        return salary*12;
    }

    // Method to increase salary by a given percentage
    public void increaseSalary(double percentage) {
        if (percentage > 0) {
            salary += salary * (percentage / 100);
            System.out.println("Salary increased by " + percentage + "%");
        } else {
            System.out.println("Invalid percentage. Salary remains unchanged.");
        }
    }
     // Method to display employee details
     public void displayDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: $" + salary);
    }
}   

