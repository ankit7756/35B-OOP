package Week4;

public class DoWhile {
    public static void main(String[] args) {
        /* Check the same condition in while and do while for difference */
        int counter = 0;
        while(counter < 0){
            System.out.println("The condition is false, it wont run");
        }
        do{
            System.out.println("This runs first then checks the condition");
        } while (counter < 0);
        /* Do while runs at least once, even if the condition is false */


    } 
}
