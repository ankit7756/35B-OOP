// 2. Write a program that displays the following table (note that 1 mile is 1.609 kilometers):
// Miles    Kilometers

// 1    1.609
// 2    3.218
// …    ….
// 9    14.481
// 10    16.090


package Week4;

public class P2 {
    public static void main(String[] args) {
        int miles;
        System.out.println("Miles    Kilometers");
        System.out.println("_____________________");

        for(miles = 1; miles<=10; miles++){
            double kilometers = miles * 1.609;
            System.out.println(miles + "\t\t" + kilometers);
        }
    }  
}
