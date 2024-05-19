/* Loop the arr using while loop */

/* Make an array of ["John", "Doe", "Foo", "Bar"]
 * Make a String "Foo"
 * Loop the array and find in which index is "Foo" on
 * Print the index
 */

package Week6;

public class Task2 {
    public static void main(String[] args) {
        // Initialize the array
        String[] names = {"John", "Doe", "Foo", "Bar"};
        
        // String to find
        String target = "Foo";
        
        // Initialize index and flag
        int index = 0;
        boolean found = false;
        
        // Loop through the array using a while loop
        while (index < names.length) {
            if (names[index].equals(target)) {
                found = true;
                break;
            }
            index++;
        }
        
        // Print the result
        if (found) {
            System.out.println("The index of \"" + target + "\" is: " + index);
        } else {
            System.out.println("\"" + target + "\" not found in the array.");
        }
    }
}

