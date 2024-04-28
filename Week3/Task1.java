/* Task 1
 * Consider the following marking
 * calculate the total and average in a variable
 * if any if the marking is less than 35, print fail
 * if avg is less than 60, print third division
 * if avg is less than 70, print second division
 * if avg is less than 80, print first division
 * if avg is equal or grater than 80, print distinction
 * if avg is less than 0 or more than 100, print invalid 
 */

 package Week3;

 public class Task1 {
     public static void main(String[] args) {
         int science = 35, english = 55, math = 89;
         int total = science + english + math;
         double average = total / 3.0; // Using 3.0 to force double division
         
         System.out.println("Total marks: " + total);
         System.out.println("Average marks: " + average);
 
         if (average < 0 || average > 100) {
             System.out.println("Invalid");
         } else if (average < 35) {
             System.out.println("Fail");
         } else if (average < 60) {
             System.out.println("Third division");
         } else if (average < 70) {
             System.out.println("Second division");
         } else if (average < 80) {
             System.out.println("First division");
         } else {
             System.out.println("Distinction");
         }
     }
 }
 
 