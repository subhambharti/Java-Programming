
// 40.	Create a program to find all permutations of a given string.

import java.util.Scanner;

public class StrPermutations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        // Generate and print permutations
        System.out.println("Permutations of the string:");
        permute(input, "");
        
        scanner.close();
    }

    // Recursive method to generate permutations
    private static void permute(String str, String prefix) {
        if (str.isEmpty()) {
            System.out.println(prefix);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            String remaining = str.substring(0, i) + str.substring(i + 1);
            permute(remaining, prefix + str.charAt(i));
        }
    }
}
