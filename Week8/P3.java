// 3. You are working on a student information system and need to create a Student class.
// The student class should have private instance variables for the student's name, ID number, and grade point average (GPA).
// Implement getter and setter methods for the name and ID number, ensuring that they can be accessed and modified only through these methods.
// However, the GPA should be read-only and can only be set within the class constructor.

package Week8;

public class P3 {
    public static void main(String[] args) {
        // Create a new Student object with initial details
        Student student = new Student("John Doe", 12345, 3.75);

        // Access student details using getters
        System.out.println("Name: " + student.getName());
        System.out.println("ID Number: " + student.getIdNumber());
        System.out.println("GPA: " + student.getGPA());

        // Modify student's name and ID number using setters
        student.setName("Jane Smith");
        student.setIdNumber(67890);

        // Access updated student details using getters
        System.out.println("Updated Name: " + student.getName());
        System.out.println("Updated ID Number: " + student.getIdNumber());

        // Attempt to modify GPA directly (not allowed, read-only)
        // student.setGPA(4.0); // This line would cause an error if it existed

        // Access GPA (remains unchanged)
        System.out.println("GPA (unchanged): " + student.getGPA());
    }
}

class Student {
    // Private instance variables
    private String name;
    private int idNumber;
    private double gpa;

    // Constructor to initialize the student details
    public Student(String name, int idNumber, double gpa) {
        this.name = name;
        this.idNumber = idNumber;
        this.gpa = gpa; // GPA is set only through the constructor
    }

    // Getter for student's name
    public String getName() {
        return name;
    }

    // Setter for student's name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for ID number
    public int getIdNumber() {
        return idNumber;
    }

    // Setter for ID number
    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    // Getter for GPA (read-only)
    public double getGPA() {
        return gpa;
    }
}
