package Week6;

import java.util.ArrayList;

public class ArrayListClass {
    public static void main(String[] args) {
        // Import ArrayList from java.util at the top
        // Cannot use primitive data type, use wrapper for it
        ArrayList<Integer> arrayList1 = new ArrayList<>();

        // To add to array list
        arrayList1.add(10);
        arrayList1.add(20);
        System.out.println(arrayList1);

        // Can also add at index directly
        arrayList1.add(1, -20);
        // This will shift the current element at 1st index to 2nd index
        System.out.println(arrayList1);

        // To remove, use .remove(index)
        arrayList1.remove(0); // will remove element at 0th index and shift the 1st element to 0
        System.out.println(arrayList1);

        // To update, use .set(index, value)
        arrayList1.set(0, -200);
        System.out.println(arrayList1);

        // To access .get (index)
        System.out.println("0th index element is: " + arrayList1.get(0));
    }
}
