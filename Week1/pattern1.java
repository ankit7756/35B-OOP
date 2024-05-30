// 4. WAP that prints the following pattern:

// *

// **

// ***

// ****

package Week1;

public class pattern1 {
    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) {
            // Inner loop to print '*' in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            // Move to the next line after printing '*' for each row
            System.out.println();
        }
    }  
}
