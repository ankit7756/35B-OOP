// 6. Write a JAVA program to input any alphabet and check whether it is vowel or consonant.

package Week3;

import java.util.Scanner;

public class P6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an alphabet: ");
        char ch = scanner.next().toLowerCase().charAt(0); // Convert to lowercase for simplicity

        if ((ch >= 'a' && ch <= 'z')) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + " is a vowel.");
            } else {
                System.out.println(ch + " is a consonant.");
            }
        } else {
            System.out.println("Invalid input. Please enter a valid alphabet.");
        }
        scanner.close();
    }
}

// package Week3;

// public class P6 {
//     public static void main(String[] args) {
//         char ch = 'b';

//         if ((ch >= 'a' && ch <= 'z')) {
//             if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//                 System.out.println(ch + " is a vowel.");
//             } else {
//                 System.out.println(ch + " is a consonant.");
//             }
//         } else {
//             System.out.println("Invalid input. Please enter a valid alphabet.");
//         } 
//     }
// }