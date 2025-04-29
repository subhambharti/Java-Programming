
// 5.	Create a program to reverse a given string

import java.util.Scanner;

public class StringReversal {
    
    // Method to reverse a string
    public static String reverseString(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return reverseString(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        System.out.println("Reversed string: " + reverseString(input));
        
        scanner.close();
    }
}
