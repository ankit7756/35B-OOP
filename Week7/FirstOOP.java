package Week7;

public class FirstOOP {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Ram";
        p1.age = 12;
        p1.gender = 'M';
        System.out.println(p1.name);
        p1.introduction();

        Person p2 = new Person();
        p2.name = "AC";
        p2.age = 20;
        p2.gender = 'M';
        p2.introduction();

        Square s1 = new Square();
        s1.sides = 10;
        int s1Area = s1.area();
        System.out.println(s1Area);
        s1.addSides(2);
        System.out.println(s1.area());

        Rectangle r = new Rectangle();
        r.len = 2.3;
        r.bre = 3.7;
        System.out.println(r.areaOfRect());
        System.out.println(r.perimeterOfRect());
    }
}

class Rectangle {
    double len;
    double bre;

    double areaOfRect(){
        return len*bre;
    }

    double perimeterOfRect(){
        return 2*(len+bre);
    }
}

class Square {
    int sides;
    int area(){
        int area = sides * sides;
        return area;
    }
    void addSides(int val){
        sides = sides + val; // sides will retain state/data
    }
}

class Person {
    //data/fields/attributes/properties
    String name;
    int age;
    char gender;

    // procedures/functions/methods
    void introduction() {
        System.out.println("Hi my name is "+name);
    }
}