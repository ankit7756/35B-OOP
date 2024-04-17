// 5. WAP prints the following pattern:

// *********

// *********

// *********

// *********

package Week1;

public class pattern2 {
    public static void main(String[] args) {
        int rows = 4;
        int columns = 9;

        for (int i = 1; i <= rows; i++) {
            // Inner loop to print '*' in each row
            for (int j = 1; j <= columns; j++) {
                System.out.print("*");
            }
            // Move to the next line after printing '*' for each row
            System.out.println();
        }
    }
    
}
