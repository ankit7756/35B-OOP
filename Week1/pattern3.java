package Week1;

public class pattern3 {
    public static void main(String[] args) {
        
        for (int i = 4; i >= 1; i--) {
            // Inner loop to print '*' in each row
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Move to the next line after printing '*' for each row
            System.out.println();
        }
    }
    
}

    
