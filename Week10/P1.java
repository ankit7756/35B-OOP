// 1. Create an abstract class called Animal with an abstract method called sound().
// Implement two subclasses called Dog and Cat that inherit from Animal. 
// Override the sound() method in both subclasses to display the specific sound made by each animal. 
// Write the Java code to implement this scenario.

package Week10;

public class P1 {
    public static void main(String[] args) {
        // Creating objects of subclasses
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        
        // Calling the overridden methods
        myDog.sound();  // Output: Woof woof
        myCat.sound();  // Output: Meow
    }
}

abstract class Animal {
    // Abstract method (does not have a body)
    abstract void sound();
}

class Dog extends Animal {
    // Providing implementation for the abstract method
    @Override
    void sound() {
        System.out.println("Woof woof");
    }
}

class Cat extends Animal {
    // Providing implementation for the abstract method
    @Override
    void sound() {
        System.out.println("Meow");
    }
}
