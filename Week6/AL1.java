// 1. Write code that creates an ArrayList that can hold string objects. 
// Add the names of three cars to the ArrayList, and then display the contents of the ArrayList.

package Week6;

import java.util.ArrayList;

public class AL1 {
    public static void main(String[] args) {
        // Create an ArrayList to hold string objects (car names)
        ArrayList<String> cars = new ArrayList<>();

        // Add car names to the ArrayList
        cars.add("Toyota");
        cars.add("Honda");
        cars.add("Ford");

        // Display the contents of the ArrayList
        System.out.println("Car names in the ArrayList:");
        for (String car : cars) {
            System.out.println(car);
        }
    }
}
