// 3. Write a Java program to create a class called "Dog" with a name and breed attribute. 
// Create two instances of the "Dog" class, set their attributes using the constructor and
// modify the attributes using the setter methods and print the updated values.


// Program without overriding:

package Week7;

public class P3 {
    public static void main(String[] args) {
        // Create two instances of the Dog class
        Dog dog1 = new Dog("Binnol", "Golden Retriever");
        Dog dog2 = new Dog("Nigga", "Labrador");

        // Print initial values
        System.out.println("Initial values:");
        System.out.println("Dog 1 - Name: " + dog1.getName() + ", Breed: " + dog1.getBreed());
        System.out.println("Dog 2 - Name: " + dog2.getName() + ", Breed: " + dog2.getBreed());

        // Modify the attributes using setter methods
        dog1.setName("Prachanda");
        dog1.setBreed("German Shepherd");

        dog2.setName("Sheru");
        dog2.setBreed("Beagle");

        // Print updated values
        System.out.println("\nUpdated values:");
        System.out.println("Dog 1 - Name: " + dog1.getName() + ", Breed: " + dog1.getBreed());
        System.out.println("Dog 2 - Name: " + dog2.getName() + ", Breed: " + dog2.getBreed());
    }
}

class Dog {
    private String name;
    private String breed;

    // Constructor to initialize name and breed
    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for breed
    public String getBreed() {
        return breed;
    }

    // Setter for breed
    public void setBreed(String breed) {
        this.breed = breed;
    }
}


//Program using override:

// package Week7;

// public class P3 {
//     public static void main(String[] args) {
//         // Create two instances of the Dog class
//         Dog dog1 = new Dog("Binnol", "Golden Retriever");
//         Dog dog2 = new Dog("Nigga", "Labrador");

//         // Print initial values
//         System.out.println("Initial values:");
//         System.out.println(dog1);
//         System.out.println(dog2);

//         // Modify the attributes using setter methods
//         dog1.setName("Prachanda");
//         dog1.setBreed("German Shepherd");

//         dog2.setName("Sheru");
//         dog2.setBreed("Beagle");

//         // Print updated values
//         System.out.println("\nUpdated values:");
//         System.out.println(dog1);
//         System.out.println(dog2);
//     }
// }

// class Dog {
//     private String name;
//     private String breed;

//     // Constructor to initialize name and breed
//     public Dog(String name, String breed) {
//         this.name = name;
//         this.breed = breed;
//     }

//     // Getter for name
//     public String getName() {
//         return name;
//     }

//     // Setter for name
//     public void setName(String name) {
//         this.name = name;
//     }

//     // Getter for breed
//     public String getBreed() {
//         return breed;
//     }

//     // Setter for breed
//     public void setBreed(String breed) {
//         this.breed = breed;
//     }

//     // Override toString method for easy printing
//     @Override
//     public String toString() {
//         return "Dog{name='" + name + "', breed='" + breed + "'}";
//     }
// }
