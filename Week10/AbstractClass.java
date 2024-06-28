package Week10;

public class AbstractClass {
    public static void main(String[] args) {
        // Create objects of Samsung and Apple
        Samsung samsungPhone = new Samsung();
        Apple applePhone = new Apple();
        
        // Call sms and call function of Samsung
        samsungPhone.sms();
        samsungPhone.call("123-456-7890");

        // Call sms and call function of Apple
        applePhone.sms();
        applePhone.call("987-654-3210");
    } 
}

// To make abstract class use keyword "abstract" before class
// If you make abstract class, you cannot make an object of it
abstract class SmartPhone {
    // abstract class may or may not contain abstract functions
    // to make abstract function use "abstract" before making function
    // abstract class do not have a body
    abstract void sms();
    abstract public boolean call(String number);
    // abstract class can have normal functions
    void imei() {
        System.out.println("Imei number");
    }
}

// Abstract class can only be used in sub/child class
class Samsung extends SmartPhone {
    // When extending abstract class we have to implement/override
    // all the abstract functions of the abstract class
    @Override
    void sms() {
        System.out.println("Samsung way of sending sms.");
    }
    @Override
    public boolean call(String number) {
        System.out.println("Samsung calling to " + number);
        return true;
    }
}

// Task
// Make a class Apple extending smartphone
// Make object of Samsung and Apple,
// call sms and call function of them 

class Apple extends SmartPhone {
    @Override
    void sms() {
        System.out.println("Apple way of sending sms.");
    }
    @Override
    public boolean call(String number) {
        System.out.println("Apple calling to " + number);
        return true;
    }
}

