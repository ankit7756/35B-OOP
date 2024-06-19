package Week9;

public class InheritanceClass {
    public static void main(String[] args) {
        // Testing the first part of the inheritance example
        ChildClass cc = new ChildClass();
        cc.firstname = "xyz";
        cc.lastname = "Doe";
        cc.expenses = 100.11;
        // cc.salary = 1000;  // Cannot access private member of ParentClass
        cc.info();
        cc.detail();

        // Testing the GrandChildClass
        GrandChildClass gcc = new GrandChildClass();
        gcc.firstname = "John";
        gcc.middlename = "Michael";
        gcc.lastname = "Smith";
        gcc.expenses = 200.22;
        gcc.info();
        gcc.detail();
        gcc.description();

        // Testing the BrotherClass
        BrotherClass bc = new BrotherClass();
        bc.lastname = "Johnson";
        bc.address = "123 Main St";
        bc.expenses = 300.33;
        bc.info();
        bc.living();

        // Creating a Labrador object and filling parent attributes
        Labrador labrador = new Labrador();
        labrador.setName("Buddy");
        labrador.setFur("Short");
        labrador.setBreed("Labrador");
        labrador.setCountry("USA");
        labrador.setColor("Yellow");

        // Calling all parent functions
        labrador.speaks();
        labrador.barks();
        labrador.plays();
    } 
}

class ParentClass {
    public String lastname;
    private int salary;
    protected double expenses;

    void info() {
        System.out.println("Parent function: " + lastname);
    }
}

// To use inheritance use the keyword "extend"
// single level inheritance, one parent/super - one child/sub
class ChildClass extends ParentClass {
    String firstname;

    void detail() {
        System.out.println(firstname + " " + lastname);
    }
}

// Multiple level inheritance, nested class, child class has another child class 
class GrandChildClass extends ChildClass {
    String middlename;

    void description() {
        System.out.println(firstname + " " + middlename + " " + lastname);
    }
}

// Tree/hierarchical inheritance
// One parent, multiple children
class BrotherClass extends ParentClass {
    String address;

    void living() {
        System.out.println(lastname + " " + address);
    }
}

// To do:
// 1. Create Labrador object.
// 2. Fill all parent attributes.
// 3. Call all parent functions.

// Animal hierarchy classes

class Animal {
    private String name; 

    public void setName(String name) {
        this.name = name;
    }

    public void speaks() {
        System.out.println(name + " is speaking.");
    }
}

class Mammal extends Animal {
    private String breed;
    private String fur;

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setFur(String fur) {
        this.fur = fur;
    }
}

class Reptile extends Animal {
    public void laysEggs() {
        System.out.println("Reptile is laying eggs.");
    }
}

class Amphibian extends Reptile {
    public void swims() {
        System.out.println("Amphibian is swimming.");
    }
}

class Dog extends Mammal {
    private String country;

    public void setCountry(String country) {
        this.country = country;
    }

    public void barks() {
        System.out.println("Dog is barking.");
    }
}

class Cat extends Mammal {
    public void meows() {
        System.out.println("Cat is meowing.");
    }
}

class Labrador extends Dog {
    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    public void plays() {
        System.out.println("Labrador is playing.");
    }
}

class GermanShepard extends Dog {
    private String spot;

    public void setSpot(String spot) {
        this.spot = spot;
    }

    public void guards() {
        System.out.println("German Shepard is guarding.");
    }
}
