// 3. Write a JAVA program to check whether a number is divisible by 5 and 11 or not.

package Week3;

import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int num = scanner.nextInt();
        if (num%5 == 0 && num%11 == 0){
            System.out.println(num + " is divisible by both 5 and 11");
        } else {
            System.out.println(num + " is not divisible by 5 and 11");
        }
        scanner.close();
    }

    
}
