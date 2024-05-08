// 1. Write a program that asks your name and prints “Hello your name” five times. Use a loop.

package Week4;

import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello, " + name);
        }
        
        scanner.close();
    }
}


























 



// package Week4;

// public class P1 {
//     public static void main(String[] args) {
//         int n;
        
//         System.out.println("Number    Number Squared");
//         System.out.println("_____________");

//         for (n = 1; n <= 10; n++) {
//             int result = n * n;
//             System.out.println(n + "\t\t" + result);
//         }
//     }
// }
