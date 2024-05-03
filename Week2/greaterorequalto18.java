package Week2;

// public class greaterorequalto18 {
//     public static void main(String[] args) {
//         int a = 20;
//         if (a > 18) {
//             System.out.println("Greater");

//         }
//         else{
//             System.out.println("Less");
//         }
        
//     }
    
    
// }

// When user has to input the value
import java.util.Scanner;
public class greaterorequalto18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (num > 18){
            System.out.println("Greater than 18");

        } else {
            System.out.println("Less than 18");
        }
        scanner.close();



        
    }
    

}