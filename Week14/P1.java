// 1. Create a Student class to simulate a student's profile. The class should have the following attributes: student ID, name, and GPA. 
// Include methods to updateGPA() and printProfile(). Implement functionality to create new student profiles, update GPAs, and print student profiles.

package Week14;

public class P1{
    public static void main(String[] args) {
        Student student1 = new Student("S12345", "Alice Johnson", 3.8);
        Student student2 = new Student("S67890", "Bob Smith", 3.5);

        student1.printProfile();
        System.out.println(); 
        student2.printProfile();
        System.out.println(); 

        // Updating GPA for student1
        student1.updateGPA(3.9);
        System.out.println("Updated GPA for student1:");
        student1.printProfile();
    }
}

class Student {
    private String studentID;
    private String name;
    private double gpa;

    // Constructor to initialize the student's profile
    public Student(String studentID, String name, double gpa) {
        this.studentID = studentID;
        this.name = name;
        this.gpa = gpa;
    }

    // Method to update the GPA
    public void updateGPA(double newGPA) {
        if (newGPA >= 0.0 && newGPA <= 4.0) {
            this.gpa = newGPA;
        } else {
            System.out.println("Invalid GPA. Please enter a value between 0.0 and 4.0.");
        }
    }

    // Method to print the student's profile
    public void printProfile() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Name: " + name);
        System.out.println("GPA: " + gpa);
    }
}