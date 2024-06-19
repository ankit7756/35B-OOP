package Week9;

public class InheritanceConstructor {
    public static void main(String[] args) {
        Polo p1 = new Polo();
        p1.differentColor("Yellow");
        Polo p2 = new Polo("Red");
        Polo p3 = new Polo(10);
        // Call constructor with overloaded param
    }   
}

class Shirt{
    String color = "Black"; // super.color
    Shirt(){
        System.out.println("Making shirt");
    }
    Shirt(String color){
        this.color = color;
    }
}

class Polo extends Shirt{
    String color = "White"; // this.color
    String texture;
    Polo(){
        // By default the constructor of parent is called
        // meaning super() or Shirt() on first line of execution
        super("While");
        System.out.println("Making Polo shirt");
    }
    // Constructor Overloading
    // Same name function/Constructor with different logic/param
    Polo(String color){
        this.color = color;
        System.out.println("Constructor with one string");
    }
    Polo(String color, String texture){
        this.color = color;
        this.texture = texture;
        System.out.println("Constructor with two string");
    }
    Polo(int num){
        System.out.println(num);
        System.out.println("Constructor with one int");
    }
    // Note the constructor overload takes the difference in data type
    // not the variable Polo(String c) cannot be made
    void differentColor(String color){
        System.out.println("Param color " + color);
        System.out.println("Class color " + this.color);
        System.out.println("parent color " + super.color);
    }

}

