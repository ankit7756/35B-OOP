/* Nested fo loop
 * Using for loop inside the scope of loop
 */

package Week4;

public class NestedLoop {
    public static void main(String[] args) {
        for(int outer = 0; outer < 2; outer++){
            for(int inner = 3; inner > 0; inner--){
                System.out.println("Inner Index" + inner);
            }
            System.out.println("Outer Index" + outer);
        } 
    }  
}
