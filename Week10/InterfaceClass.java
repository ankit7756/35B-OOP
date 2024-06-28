package Week10;

public class InterfaceClass {
    public static void main(String[] args) {
        // Create instances of Husky, Wolf, and Cow
        Husky myHusky = new Husky();
        Wolf myWolf = new Wolf();
        Cow myCow = new Cow();

        // Demonstrate Husky behavior
        System.out.println("Husky:");
        myHusky.move();
        myHusky.bark();
        System.out.println("Legs: " + myHusky.legs());
        myHusky.pet();
        myHusky.eat("fish");
        System.out.println();

        // Demonstrate Wolf behavior
        System.out.println("Wolf:");
        myWolf.move();
        myWolf.eat("meat");
        System.out.println();

        // Demonstrate Cow behavior
        System.out.println("Cow:");
        myCow.move();
        myCow.eat("grass");
        System.out.println();
    }
}

// Interface for Animal actions
interface AnimalDo {
    public void move();
    public boolean eat(String food);
}

// Interface for Mammal actions, extending AnimalDo
interface MammalDo extends AnimalDo {
    public int legs();
}

// Interface for Dog actions, extending MammalDo
interface DogDo extends MammalDo {
    public void bark();
}

// Interface for Domestic Animal actions
interface DomesticAnimalDo {
    public void pet();
}

// Husky class implementing multiple interfaces
class Husky implements DogDo, DomesticAnimalDo {
    @Override
    public void pet() {
        System.out.println("Husky likes to be petted.");
    }

    @Override
    public void bark() {
        System.out.println("BOW WOW");
    }

    @Override
    public int legs() {
        return 4;
    }

    @Override
    public void move() {
        System.out.println("Husky moves fast.");
    }

    @Override
    public boolean eat(String food) {
        System.out.println("Husky eats fish.");
        return true;
    }
}

// Wolf class implementing AnimalDo interface
class Wolf implements AnimalDo {
    @Override
    public void move() {
        System.out.println("Wolf moves fast.");
    }

    @Override
    public boolean eat(String food) {
        System.out.println("Wolf eats meat.");
        return true;
    }
}

// Cow class implementing AnimalDo interface
class Cow implements AnimalDo {
    @Override
    public void move() {
        System.out.println("Cow moves slow.");
    }

    @Override
    public boolean eat(String food) {
        System.out.println("Cow eats grass.");
        return true;
    }
}

