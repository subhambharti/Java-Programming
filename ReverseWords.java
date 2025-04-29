
// 34.	Create a program to reverse each word in a string. 

import java.util.Scanner;

class ReverseWords {
    public static String reverseEachWord(String str) {
        String[] words = str.split("\\s+"); // Split by spacessubham
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            result.append(new StringBuilder(word).reverse()).append(" ");
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        System.out.println("Reversed words: " + reverseEachWord(input));
    }
}
