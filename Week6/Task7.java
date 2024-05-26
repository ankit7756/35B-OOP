/* Make an ArrayList as students as following
 * ["Aruna","Sheerya","Yudip","Anjali","Nischay","Krishna"]
 * Make two another ArrayList males and females
 * Loop the students ArayList
 * add "Yudip","Nischay" and "Krishna" in males
 * add "Aruna", "Sherya" and "Anjali" in females
 * Print Anjali from females
 * Print Yudip from males
 */

package Week6;

import java.util.ArrayList;

public class Task7 {
    public static void main(String[] args) {
        // Create an ArrayList with the given students
        ArrayList<String> students = new ArrayList<>();
        students.add("Aruna");
        students.add("Sheerya");
        students.add("Yudip");
        students.add("Anjali");
        students.add("Nischay");
        students.add("Krishna");

        // Create two additional ArrayLists for males and females
        ArrayList<String> males = new ArrayList<>();
        ArrayList<String> females = new ArrayList<>();

        // Loop through the students ArrayList
        for (String student : students) {
            if (student.equals("Yudip") || student.equals("Nischay") || student.equals("Krishna")) {
                males.add(student);
            } else if (student.equals("Aruna") || student.equals("Sheerya") || student.equals("Anjali")) {
                females.add(student);
            }
        }

        // Print "Anjali" from females
        System.out.println("From females: " + females.get(females.indexOf("Anjali")));

        // Print "Yudip" from males
        System.out.println("From males: " + males.get(males.indexOf("Yudip")));
    }
}



