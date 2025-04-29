// 54.	Create a program to append text to an existing file.

import java.io.*;

public class AppendToFile {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("output.txt", true);
            writer.write("\nThis text is appended to the existing file.");
            writer.close();
            System.out.println("Text appended successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}