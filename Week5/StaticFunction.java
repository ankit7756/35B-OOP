package Week5;

public class StaticFunction {
    public static int multiply(int a, int b){
        int multiplication = a + b;
        return multiplication;
    }
    public static String vendingmachine(int menu){
    if (menu == 1){
        return "Coke";       
    }
    if (menu == 2){
        return "Water";
    }
    if (menu == 3){
        return "Frooti";
    }
    return "Invalid Menu";
}
    public static void main(String[] args) {
        /* if the function is static and in same class
         * no need to make object simply call
         */
        int multiplyReturn = multiply(10,2);
        System.out.println("Result is " + multiplyReturn);
        String iGet = vendingmachine(1);
        System.out.println("I get" + iGet);
    }
    
}
