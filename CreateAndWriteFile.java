// 51.	Write a program to create and write to a file.


import java.io.*;

public class CreateAndWriteFile {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("output.txt");
            writer.write("Hello, java.\nWelcome to file handling in Java!");
            writer.close();
            System.out.println("File created and written successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}