import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner for user input
        int[] originalArray = new int[10]; // Array to store the original inputs
        int[] reversedArray = new int[10]; // Array to store the reversed elements

        System.out.println("Enter 10 integers:");

        // Loop to get 10 integer inputs from the user
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            originalArray[i] = scanner.nextInt(); // Store each input in the array
        }

        // Copy elements from originalArray to reversedArray in reverse order
        for (int i = 0; i < 10; i++) {
            reversedArray[i] = originalArray[9 - i]; // Reverse the index
        }

        System.out.println("Original Array:");
        // Print the original array
        for (int i = 0; i < 10; i++) {
            System.out.print(originalArray[i] + " ");
        }
        System.out.println(); // New line for formatting

        System.out.println("Reversed Array:");
        // Print the reversed array
        for (int i = 0; i < 10; i++) {
            System.out.print(reversedArray[i] + " ");
        }
        System.out.println(); // New line for formatting

        scanner.close(); // Close the Scanner object (best practice)
    }
}
