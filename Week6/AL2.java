// 2. WAP to sort the integer elements of array of size 10 in ascending and descending order using ArrayList.

package Week6;

import java.util.ArrayList;
import java.util.Collections;

public class AL2 {
    public static void main(String[] args) {
        // Initialize an array of integers
        int[] array = {5, 2, 8, 1, 9, 3, 7, 4, 6, 0};

        // Step 1: Create an ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Step 2: Add elements of the array to the ArrayList
        for (int i = 0; i < array.length; i++) {
            arrayList.add(array[i]);
        }

        // Step 3: Sort the ArrayList in ascending order
        Collections.sort(arrayList);

        // Step 4: Print the sorted ArrayList for ascending order
        System.out.println("Ascending Order:");
        System.out.println(arrayList);

        // Step 5: Sort the ArrayList in descending order
        Collections.reverse(arrayList);

        // Step 6: Print the sorted ArrayList for descending order
        System.out.println("Descending Order:");
        System.out.println(arrayList);
    }
}
