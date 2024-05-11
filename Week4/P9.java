// 9. Write a program that reads ten integer numbers and outputs the number of inputs which are greater than 50, less than 50 or equal to 50. 
// The program should also display the average of all numbers greater than 50 and the average of all numbers less than 50.



package Week4;

import java.util.Scanner;

public class P9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countGreaterThan50 = 0;
        int countLessThan50 = 0;
        int countEqualTo50 = 0;
        int sumGreaterThan50 = 0;
        int sumLessThan50 = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            int number = scanner.nextInt();

            if (number > 50) {
                countGreaterThan50++;
                sumGreaterThan50 += number;
            } else if (number < 50) {
                countLessThan50++;
                sumLessThan50 += number;
            } else {
                countEqualTo50++;
            }
        }

        System.out.println("Numbers greater than 50: " + countGreaterThan50);
        System.out.println("Numbers less than 50: " + countLessThan50);
        System.out.println("Numbers equal to 50: " + countEqualTo50);

        if (countGreaterThan50 > 0) {
            double averageGreaterThan50 = (double) sumGreaterThan50 / countGreaterThan50;
            System.out.println("Average of numbers greater than 50: " + averageGreaterThan50);
        }

        if (countLessThan50 > 0) {
            double averageLessThan50 = (double) sumLessThan50 / countLessThan50;
            System.out.println("Average of numbers less than 50: " + averageLessThan50);
        }

        scanner.close();
    }
}

