//70.	Create a program to use a custom exception to validate user input.

import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class ValidateUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        try {
            if (age < 18) {
                throw new InvalidAgeException("Age must be 18 or above.");
            }
            System.out.println("Valid age.");
        } catch (InvalidAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}