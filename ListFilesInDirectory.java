
// 59.	Write a program to list all files in a directory.

import java.io.*;

public class ListFilesInDirectory {
    public static void listFiles(String directoryPath) {
        File directory = new File(directoryPath);
        if (directory.exists() && directory.isDirectory()) {
            File[] files = directory.listFiles();
            if (files != null) {
                System.out.println("Files in directory: " + directoryPath);
                for (File file : files) {
                    System.out.println(file.getName());
                }
            } else {
                System.out.println("Failed to retrieve files.");
            }
        } else {
            System.out.println("Invalid directory path.");
        }
    }

    public static void main(String[] args) {
        String directoryPath = "D:\\"; // Replace with actual directory path
        listFiles(directoryPath);
    }
}
