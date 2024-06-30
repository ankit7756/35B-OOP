package Week12;

public class ExceptionHandling{
    public static void main(String[] args){
        System.out.println("Program start");
        int num1 = 10;
        try{
            int num2 = 10/0; // Arthemitic exception - exits here
        }catch(ArithmeticException ex){
            // ex will have the system generated msg
            System.out.println("Cannot divide by zero");
        }finally{
            System.out.println("Finally runs whether exception occurs or not");
        }
        // Note: catch and finally are optional, but, either or both should be present after try
        int[] numA = new int[5];
        numA[0]  = 100;
        try{
            numA[100] = 1000; // ArrayIndexOutOfBoundsException - exits heres
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Array is not long enough");
        }
        // Any object can be assigned value of null
        String data = null;
        try{
            System.out.println(data.length()); // Null pointer execption
        }catch(NullPointerException ex){
            System.out.println("Null value");
        }
        // Multi layered exception
        try{
            int numMulti = 1000/0; // Arithemetic exception
            String d2 = null; // Null pointer execption
            System.out.println(d2.length());
        }catch(ArithmeticException ex){
            System.out.println("Number error");
        }catch(NullPointerException ex){
            System.out.println("Null ayo");
        }finally{
            System.out.println("Try end");
        }
        // Exception
        try{
            int num3 = 10/0;
            int[] numArr2 = new int[100];
            numArr2[10000] = 10;
        }catch(Exception ex){
            System.out.println("I Catch all exception");
        }
        // Note: if you dont know what kind of exception your code throws
        // use exception
        // Throw manually throw exception
        throwExample();
     
        try{
            checkTry();
        }catch(Exception e){

        }
        System.out.println("Program end");
    }

    static void throwExample(){
        throw new ArithmeticException("Where is the number?");
    }
    static void checkTry() throws Exception{
        System.out.println("When runing this function wrap around try catch");
    }
}
