// 4. Write a JAVA program to check whether a number is even or odd.

package Week3;

import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it's even or odd: ");
        int num = scanner.nextInt();
        if(num%2 == 0){
            System.out.println(num + " is an even number.");
        } else {
            System.out.println(num + " is an odd number.");
        }
        scanner.close();
    }   
}
