// 7. Write a program to calculate the HCF of Two given numbers.

package Week4;
import java.util.Scanner;

public class P7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int hcf = calculateHCF(num1, num2);
        
        System.out.println("The HCF of " + num1 + " and " + num2 + " is: " + hcf);

        scanner.close();
    }

    // Function to calculate the HCF using the Euclidean algorithm
    public static int calculateHCF(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

// Without using methods

// import java.util.Scanner;

// public class P7 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter the first number: ");
//         int num1 = scanner.nextInt();

//         System.out.print("Enter the second number: ");
//         int num2 = scanner.nextInt();

//         int smallerNumber = (num1 < num2) ? num1 : num2;
//         int hcf = 1;

//         for (int i = 1; i <= smallerNumber; i++) {
//             if (num1 % i == 0 && num2 % i == 0) {
//                 hcf = i;
//             }
//         }

//         System.out.println("The HCF of " + num1 + " and " + num2 + " is: " + hcf);

//         scanner.close();
//     }
// }

