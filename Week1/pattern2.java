// 5. WAP prints the following pattern:

// *********

// *********

// *********

// *********

package Week1;

public class pattern2 {
    public static void main(String[] args) {
        
        for (int i = 1; i <= 4; i++) {
            // Inner loop to print '*' in each row
            for (int j = 1; j <= 9; j++) {
                System.out.print("*");
            }
            // Move to the next line after printing '*' for each row
            System.out.println();
        }
    }
    
}
