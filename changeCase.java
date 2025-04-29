
// 39.	Write a Java program to convert a string to uppercase and lowercase.

import java.util.Scanner;

public class changeCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        String upperCase = input.toUpperCase();
        String lowerCase = input.toLowerCase();
        
        System.out.println("Uppercase: " + upperCase);
        System.out.println("Lowercase: " + lowerCase);
        
        scanner.close();
    }
}
