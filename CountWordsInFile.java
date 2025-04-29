// 53.	Write a program to count the number of words in a file.

import java.io.*;

public class CountWordsInFile {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
            String line;
            int wordCount = 0;

            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }

            reader.close();
            System.out.println("Total number of words: " + wordCount);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}