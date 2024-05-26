/*Task
 * Make the following Array name
 * [
 * ["Sarjak", "Ayush", "Rabi"]
 * ["Yudip, "Utsav", "Bibek"]
 * ["Rabina", "Kimti", "Sneha"]
 * ]
 * Also find on which array Kimti is
 * Output : 2
 */

 package Week6;

 public class Task5 {
     public static void main(String[] args) {
         // Create the 2D array
         String[][] names = {
             {"Sarjak", "Ayush", "Rabi"},
             {"Yudip", "Utsav", "Bibek"},
             {"Rabina", "Kimti", "Sneha"}
         };
 
         // Initialize a variable to store the index
         int arrayIndex = -1;
 
         // Loop through the 2D array to find "Kimti"
         for (int i = 0; i < names.length; i++) {
             for (int j = 0; j < names[i].length; j++) {
                 if (names[i][j].equals("Kimti")) {
                     arrayIndex = i; // Keep 0-based index to match the array correctly
                     break; // Exit the inner loop
                 }
             }
             if (arrayIndex != -1) {
                 break; // Exit the outer loop if "Kimti" is found
             }
         }
         // Print the result
         if (arrayIndex != -1) {
             System.out.println("Kimti is found in array: " + (arrayIndex)); // +1 to convert 0-based index to 1-based index for output
         } else {
             System.out.println("Kimti is not found in any array.");
         }
     }
 }
 