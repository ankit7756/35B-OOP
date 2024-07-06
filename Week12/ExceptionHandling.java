package Week12;

public class ExceptionHandling {
    public static void main(String[] args) {
        System.out.println("Program start");
        int num1 = 10;
        try {
            int num2 = 10 / 0; // Arithmetic exception - exits here
        } catch (ArithmeticException ex) {
            // ex will have the system generated message
            System.out.println("Cannot divide by zero");
        } finally {
            System.out.println("Finally runs whether exception occurs or not");
        }
        // Note: catch and finally are optional, but, either or both should be present after try
        int[] numA = new int[5];
        numA[0] = 100;
        try {
            numA[100] = 1000; // ArrayIndexOutOfBoundsException - exits here
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Array is not long enough");
        }
        // Any object can be assigned value of null
        String data = null;
        try {
            System.out.println(data.length()); // Null pointer exception
        } catch (NullPointerException ex) {
            System.out.println("Null value");
        }
        // Multi-layered exception
        try {
            int numMulti = 1000 / 0; // Arithmetic exception
            String d2 = null; // Null pointer exception
            System.out.println(d2.length());
        } catch (ArithmeticException ex) {
            System.out.println("Number error");
        } catch (NullPointerException ex) {
            System.out.println("Null value");
        } finally {
            System.out.println("Try end");
        }
        // Exception
        try {
            int num3 = 10 / 0;
            int[] numArr2 = new int[100];
            numArr2[10000] = 10;
        } catch (Exception ex) {
            System.out.println("I catch all exceptions");
        }
        // Note: if you don't know what kind of exception your code throws, use exception
        // Throw manually throw exception
        throwExample();

        // Task
        // Find the exception and use try-catch block and finally accordingly
        try {
            int number1 = 10;
            int number2 = number1 - 10;
            int number3 = number1 / number2; // ArithmeticException: division by zero
        } catch (ArithmeticException ex) {
            System.out.println("ArithmeticException: Cannot divide by zero");
        } finally {
            System.out.println("ArithmeticException handling complete");
        }

        try {
            String name = null;
            System.out.println(name.length()); // NullPointerException: name is null
        } catch (NullPointerException ex) {
            System.out.println("NullPointerException: Name is null");
        } finally {
            System.out.println("NullPointerException handling complete");
        }

        try {
            String[] names = new String[100];
            names[0] = "Ram";
            names[110] = "Shyam"; // ArrayIndexOutOfBoundsException: index 110 out of bounds
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("ArrayIndexOutOfBoundsException: Index out of bounds");
        } finally {
            System.out.println("ArrayIndexOutOfBoundsException handling complete");
        }
        // Task end

        try {
            checkTry();
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
        System.out.println("Program end");
    }

    static void throwExample() {
        throw new ArithmeticException("Where is the number?");
    }

    static void checkTry() throws Exception {
        System.out.println("When running this function wrap around try-catch");
    }
}
