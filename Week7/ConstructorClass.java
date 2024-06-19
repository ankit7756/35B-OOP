package Week7;

public class ConstructorClass {
    public static void main(String[] args) {
        ConstructorExample ce = new ConstructorExample();
        System.out.println("After Object");

        ParamConsturctor pc = new ParamConsturctor(1,2);
        System.out.println(pc.data2);

        Cat c1 = new Cat("Kiyo", 10);
        c1.setAge(c1.getAge()+1);

        c1.breed = "Koga";
        c1.color = "Black";

        System.out.println("Name: "+c1.getName());
        System.out.println("Age: "+ c1.getAge());
        System.out.println("Breed: "+c1.breed);
        System.out.println("Color: "+c1.color);

    }
}

class ConstructorExample { 
    // Non parameterized constructor
    ConstructorExample(){
        System.out.println("I run in object creation");
        // Add more logic
        // Only called once, to set attributes value in  most cases
    }
    
}

class ParamConsturctor {
    private int data1;
    public int data2;
    void setData1(int data1){
        this.data1 = data1;
    }
    ParamConsturctor(int d1, int d2){
        this.data1 = d1;
        this.data2 = d2;
    }
}

class Cat {
    private String name;
    private int age;
    public String breed;
    public String color;
    Cat(String name, int age){
        this.name = name;
        this.age = age;
    }
    String getName(){
        return this.name;
    }
    int getAge(){
        return this.age;
    }
    void setAge(int age){
        this.age = age;
    }
}