package Week2;
import java.util.Scanner;
/*
 * or use
 * import java.util,*;// import all utils
 */

public class InputOutput {
    public static void main(String[] args) {
        
    
    /* User Input 
    System.out.println("Print next line");
    "sout" for shortcut
    */
    System.out.println("This string breaks line");
    /* System.out.print */
    System.out.println("This will continue");
    System.out.println("This will continue");
    /* System.out.printf
     * String formatter
     * %s String, %d Integer, %f floating Point, %b boolean
     */
    System.out.printf("Hello %s, Nice", "World");
    System.out.printf("This is num %d",10);
    /* You can use multiple formatter */
    System.out.printf("Num %f and bool %b", 10.3f, false);

    /* User Input*/
    Scanner scan = new Scanner(System.in);
    System.out.println("The following takes whole sentence");
    String wholeWString = scan.nextLine();
    System.out.println("The input is" + wholeWString);
    System.out.println("The following takes integer");
    int intInput = scan.nextInt();
    System.out.println("The input is" + intInput);
    System.out.println("The following takes double");
    double doubleInput = scan.nextDouble();
    System.out.println("The input is " + doubleInput);
    System.out.println("The following takes boolean");
    boolean booleanInput = scan.nextBoolean();
    System.out.println("The input is" + booleanInput);
    scan.close(); // close after taking all the input


    }
    
}
