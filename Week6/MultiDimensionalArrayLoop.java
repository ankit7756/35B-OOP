package Week6;

public class MultiDimensionalArrayLoop {
    public static void main(String[] args) {
        int[][] twoArray = new int[2][3];
        twoArray[0][0] = 10;
        twoArray[0][1] = 10;
        twoArray[0][2] = 10;
        twoArray[1][0] = 10;
        twoArray[1][1] = 10;
        twoArray[1][2] = 10;
        /* Visual
         * [
         * [10,20,3],  -> 0
         * [-30,-20,-10] -> 1
         * 
         * Loop multi dim array with nested loop
         * 
         * ]
         */
        /* Loop multi dim array with nested loop */
        /* Outer selects the array, inner selects the actual value inside */
        int outerLength = twoArray.length;
        for(int outer = 0; outer < outerLength; outer++){
            //twoArray[outer] -> iterate each array
            int innerLength = twoArray[outer].length;
            for(int inner = 0; inner < innerLength; inner++){
                System.out.println(twoArray[outer][inner]);
            }   
        }
    }
}   



