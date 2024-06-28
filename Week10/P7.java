// 7. You are developing a restaurant management system that handles different types of employees, 
// such as chefs and waiters. Design an interface named "Employee" with the following methods:
// work(): This method should define the work responsibilities of the employee.
// getSalary(): This method should return the salary of the employee.

package Week10;

public class P7 {
    public static void main(String[] args) {
        Chef c1 = new Chef(100000);
        Waiter w1 = new Waiter(50000);

        c1.work();
        System.out.println("The salary of the Chef is: " + c1.getSalary());
        
        w1.work();
        System.out.println("The salary of the Waiter is: " + w1.getSalary());
    }  
}

interface Employee{
    public void work();
    public double getSalary();
}

class Chef implements Employee{
    private double salary;
    public Chef(double salary){
        this.salary = salary;
    }
    public void work(){
        System.out.println("Chef is preparing food.");
    }
    public double getSalary(){
        return salary;
    }
}

class Waiter implements Employee{
    private double salary;
    public Waiter(double salary){
        this.salary = salary;
    }
    public void work(){
        System.out.println("Waiter is serving food.");
    }
    public double getSalary(){
        return salary;
    }
}