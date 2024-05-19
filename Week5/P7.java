// 7. Calculates the factorial of a given number using the Java method.

package Week5;

import java.util.Scanner;

public class P7 {
    public static int FactorialCalculator(int n){
        int factorial = 1;
        for(int i=1; i<=n; i++){
            factorial *= i;
        }
        return factorial;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number to calculate factorial: ");
        int number = scan.nextInt();
        int result = FactorialCalculator(number);
        System.out.println("The factorial of " + number + " is " + result);
        scan.close();
    }
}

