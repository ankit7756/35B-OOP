/* Make the function for the above name arrayFinder
 * Takes array of String and String as parameter
 * return index if 2nd argument value matches any element of array
 * else return -1
 * print the return index value
 */

package Week6;

public class Task3 {
    public static void main(String[] args) {
        // Initialize the array
        String[] names = {"John", "Doe", "Foo", "Bar"};
        
        // String to find
        String target = "Foo";
        
        // Call the arrayFinder function and print the result
        int index = arrayFinder(names, target);
        System.out.println("The index of \"" + target + "\" is: " + index);
    }

    public static int arrayFinder(String[] array, String find) {
        for (int index = 0; index < array.length; index++) {
            if (array[index].equals(find)) {
                return index;
            }
        }
        return -1;
    }
}


// another way to create the method

    // // Function to find the index of a target string in an array of strings
    // public static int arrayFinder(String[] array, String target) {
    //     // Initialize index
    //     int index = 0;
        
    //     // Loop through the array using a while loop
    //     while (index < array.length) {
    //         if (array[index].equals(target)) {
    //             return index; // Return the index if target is found
    //         }
    //         index++;
    //     }
        
    //     // Return -1 if the target is not found
    //     return -1;
    // }

