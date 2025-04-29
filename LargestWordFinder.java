
// 58.	Create a program to find the largest word in a file.

import java.io.*;

public class LargestWordFinder {
    public static String findLargestWord(String filePath) {
        String largestWord = "";
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+"); // Split by whitespace
                for (String word : words) {
                    if (word.length() > largestWord.length()) {
                        largestWord = word;
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        return largestWord;
    }

    public static void main(String[] args) {
        String filePath = "D:\\example.txt"; // Replace with the actual file path
        String largestWord = findLargestWord(filePath);
        System.out.println("The largest word in the file is: " + largestWord);
    }
}
