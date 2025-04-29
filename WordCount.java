
// 31.	Write a program to count the number of words in a string.

import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        String[] words = input.trim().split("\\s+");
        int wordCount = input.isEmpty() ? 0 : words.length;

        System.out.println("Number of words: " + wordCount);
    }
}
