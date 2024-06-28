// 3. Create an abstract class called Vehicle with abstract methods startEngine() and stopEngine(). 
// Implement two subclasses called Car and Motorcycle that inherit from Vehicle. 
// Implement the startEngine() and stopEngine() methods in both subclasses 
// to start and stop the engines of a car and a motorcycle, respectively. 

package Week10;

public class P3 {
    public static void main(String[] args) {
        Car c1 = new Car();
        Motorcycle m1 = new Motorcycle();
        c1.startEngine();
        c1.stopEngine();
        m1.startEngine();
        m1.stopEngine();     
    } 
}

abstract class Vehicle{
    abstract void startEngine();
    abstract void stopEngine();
}

class Car extends Vehicle{
    @Override
    void startEngine(){
        System.out.println("Car engine started successfully.");
    }
    @Override
    void stopEngine(){
        System.out.println("Car engine stoped successfully.");
    }
}

class Motorcycle extends Vehicle{
    @Override
    void startEngine(){
        System.out.println("Motircycle engine started successfully.");
    }
    @Override
    void stopEngine(){
        System.out.println("Motorcycle engine stoped successfully.");
    }
}