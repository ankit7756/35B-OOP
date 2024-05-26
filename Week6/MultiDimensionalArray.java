package Week6;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        /* One D array, one square bracket []*/
        int[] oneDArray;
        /* Two D array, two square bracket [][] */
        int[][] twoDArray;
        /* Three D array, three square bracket [][][] */
        int[][][] threeDArray;

        /* Memory alloc, must give size to each dimension */
        twoDArray = new int[2][3];
        /* Visual
         * [
         * [0,0,0], -> 0
         * [0,0,0], -> 1
         * ]
         */
        // twoDArray[0]  -> access the oth index array
        twoDArray[0][0] = 10;
        twoDArray[0][1] = 20;
        twoDArray[1][0] = 100;
        twoDArray[1][2] = 200;
        // access in variable
        int arrayElement = twoDArray[0][0];
        System.out.println(arrayElement);
        System.out.println(twoDArray[0][1]);
    }   
}
