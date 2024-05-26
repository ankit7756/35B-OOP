// 4. Write a Java program to reverse the element of a one-dimensional array.

package Week6;

public class P4 {
    public static void main(String[] args) {
        // Define the array
        int[] numbers = {1, 2, 3, 4, 5};

        // Print the original array
        System.out.println("Original array:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        // Reverse the array
        int n = numbers.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[n - 1 - i];
            numbers[n - 1 - i] = temp;
        }

        // Print the reversed array
        System.out.println("Reversed array:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
