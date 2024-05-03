package Week4;

public class ForLoop {
    public static void main(String[] args) {     
    
    /* For Loop takes initialization
     * condidtion
     * modify/update
    */
        for(int index = 0; index<=5; index++){
            System.out.println("For Index" + index);

    }
    /* Can use different update logic like
     * for(int index = 0; index <= 5; index += 3)
     */
    /* Using decrement */
        for(int index = 10; index >= 0; index--){
            System.out.println("For Index Decrement" + index);
        }
    
    }
    
}
