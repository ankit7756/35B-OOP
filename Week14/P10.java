// 10. Write a program that prompts the user to enter a sentence and reads it into a string. 
// The program should consist of the following methods:

// - a method named "countVowels" that reads a string and returns the number of vowels in the string
// - a method named "countConsonants" that reads a string and returns the number of consonants in the string.
// Invoke the above methods and demonstrate them in the program.

package Week14;

import java.util.Scanner;

public class P10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Count vowels
        int vowelCount = countVowels(sentence);
        System.out.println("Number of vowels: " + vowelCount);

        // Count consonants
        int consonantCount = countConsonants(sentence);
        System.out.println("Number of consonants: " + consonantCount);

        scanner.close();
    }
    public static int countVowels(String str) {
        int count = 0;
        str = str.toLowerCase(); // Convert the string to lowercase for case-insensitive comparison

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
    public static int countConsonants(String str) {
        int count = 0;
        str = str.toLowerCase(); 
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z' && !(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) {
                count++;
            }
        }
        return count;
    }
}
