/* Task 2
 * Use switch case for the following
 * 0 - Sunday
 * 1 - Monday
 * 2 - Tuesday
 * 3 - Wednesday
 * 4 - Thursday 
 * 5 - Friday
 * 6 - saturday
 * rest - Invalid day
 */

 package Week3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (0-6) to represent a day of the week: ");
        int day = scanner.nextInt();

        String dayOfWeek;

        switch (day) {
            case 0:
                dayOfWeek = "Sunday";
                break;
            case 1:
                dayOfWeek = "Monday";
                break;
            case 2:
                dayOfWeek = "Tuesday";
                break;
            case 3:
                dayOfWeek = "Wednesday";
                break;
            case 4:
                dayOfWeek = "Thursday";
                break;
            case 5:
                dayOfWeek = "Friday";
                break;
            case 6:
                dayOfWeek = "Saturday";
                break;
            default:
                dayOfWeek = "Invalid day";
                break;
        }

        System.out.println("The day is: " + dayOfWeek);

        scanner.close();
    }
}

// Without taking input from the user

// package Week3;

// public class Task2 {
//     public static void main(String[] args) {
//         int day = 3; // Change this value to test different days

//         String dayOfWeek;

//         switch (day) {
//             case 0:
//                 dayOfWeek = "Sunday";
//                 break;
//             case 1:
//                 dayOfWeek = "Monday";
//                 break;
//             case 2:
//                 dayOfWeek = "Tuesday";
//                 break;
//             case 3:
//                 dayOfWeek = "Wednesday";
//                 break;
//             case 4:
//                 dayOfWeek = "Thursday";
//                 break;
//             case 5:
//                 dayOfWeek = "Friday";
//                 break;
//             case 6:
//                 dayOfWeek = "Saturday";
//                 break;
//             default:
//                 dayOfWeek = "Invalid day";
//                 break;
//         }

//         System.out.println("The day is: " + dayOfWeek);
//     }
// }
