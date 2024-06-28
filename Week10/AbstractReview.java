// Corrected the bugs in the following code
// Below is the corrected code with 

package Week10;

public class AbstractReview {
    public static void main(String[] args) {
        // Computer c1 = new Computer(); // Bug: Cannot instantiate the type Computer
        // Commented out because we cannot create an instance of an abstract class

        AppleM3 c1 = new AppleM3(); // Corrected: Create an instance of a concrete subclass
    }
}

abstract class Computer {
    abstract public void on(boolean on);
    abstract boolean off(String state);
    abstract double upgrade(double ram);
    void modelNo() {
        // This method is not abstract and can have a body
    }
}

class AppleM3 extends Computer {
    @Override
    public void on(boolean on) {
        // Provide implementation for on method
    }

    // Bug: Method should not override the non-abstract method modelNo from Computer
    // @Override
    // void modelNo(){
    //     // This should not override the method from Computer
    // }

    @Override
    boolean off(String state) {
        // Provide implementation for off method
        return false; // Example return statement
    }

    @Override
    double upgrade(double ram) {
        // Provide implementation for upgrade method
        return ram + 8; // Example return statement
    }
}
