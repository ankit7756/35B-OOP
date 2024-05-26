/* Task
 * Make ArrayList of the following
 * ["Apple", "Orange", "Banana", "Watermelon", "Pineapple"]
 * Add "Grapes" in 1 index 
 * Remove Watermelon
 * Add pear in the 0th index
 * Change "Pineapple to "Avacado"
 * Change "Apple" to "Cherry"
 * Note: Print on every add and remove to get the new index of ArrayList
 */

package Week6;

import java.util.ArrayList;

public class Task6 {
    public static void main(String[] args) {
        // Create an ArrayList with the given fruits
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Watermelon");
        fruits.add("Pineapple");

        // Print the initial list
        System.out.println("Initial List: " + fruits);

        // Add "Grapes" at index 1
        fruits.add(1, "Grapes");
        System.out.println("After adding Grapes at index 1: " + fruits);

        // Remove "Watermelon"
        fruits.remove("Watermelon");
        System.out.println("After removing Watermelon: " + fruits);

        // Add "Pear" at index 0
        fruits.add(0, "Pear");
        System.out.println("After adding Pear at index 0: " + fruits);

        // Change "Pineapple" to "Avocado"
        fruits.set(5,"Avogado");
        System.out.println("After changing Pineapple to Avocado: " + fruits);

        // Change "Apple" to "Cherry"
        fruits.set(1,"Cherry");
        System.out.println("After changing Apple to Cherry: " + fruits);
    }
}


/* Using another method of .set for changing list */
// public class Task6 {
//     public static void main(String[] args) {
//         // Create an ArrayList with the given fruits
//         ArrayList<String> fruits = new ArrayList<>();
//         fruits.add("Apple");
//         fruits.add("Orange");
//         fruits.add("Banana");
//         fruits.add("Watermelon");
//         fruits.add("Pineapple");

//         // Print the initial list
//         System.out.println("Initial List: " + fruits);

//         // Add "Grapes" at index 1
//         fruits.add(1, "Grapes");
//         System.out.println("After adding Grapes at index 1: " + fruits);

//         // Remove "Watermelon"
//         fruits.remove("Watermelon");
//         System.out.println("After removing Watermelon: " + fruits);

//         // Add "Pear" at index 0
//         fruits.add(0, "Pear");
//         System.out.println("After adding Pear at index 0: " + fruits);

//         // Change "Pineapple" to "Avocado" using indexOf method
//         int indexPineapple = fruits.indexOf("Pineapple");
//         if (indexPineapple != -1) {
//             fruits.set(indexPineapple, "Avocado");
//         }
//         System.out.println("After changing Pineapple to Avocado: " + fruits);

//         // Change "Apple" to "Cherry" using indexOf method
//         int indexApple = fruits.indexOf("Apple");
//         if (indexApple != -1) {
//             fruits.set(indexApple, "Cherry");
//         }
//         System.out.println("After changing Apple to Cherry: " + fruits);
//     }
// }
