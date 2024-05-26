package Week6;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] arr = new int[4];
        arr[0] =  -10;
        arr[1] = 0;
        arr[2] = 10;
        arr[3] = 20;
    
        /* We need length of array first, use .length */
        int arrayLength = arr.length;
        /* Loop from 0 - (arrayLength - 1), 0 -3 */
        for(int index = 0; index< arrayLength; index++){
            System.out.println(arr[index]);       
        }
        // or, use condition, index <= arrayLength - 1
        System.out.println("Descending loop");
        for(int index = arrayLength - 1; index >= 0; index--){
            System.out.println(arr[index]);
        }  
    }
}
