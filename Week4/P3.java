// 3. Write a program that generates the following table: 

// Number    Square
// 10    100
// 9    81
// ..    ….2    4
// 1    1



package Week4;

public class P3 {
    public static void main(String[] args) {
        int number;
        System.out.println("Numbers        Square");
        System.out.println("---------------------");

        for(number=10; number>=1; number--){
            int square = number*number;
            System.out.println(number + "\t\t" + square);
        }
    }  
}
