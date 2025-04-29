
// 57.	Write a program to copy the contents of one file to another

import java.io.*;

public class CopyFile {
    public static void copyFile(String sourcePath, String destinationPath) {
        try (FileInputStream fis = new FileInputStream(sourcePath);
             FileOutputStream fos = new FileOutputStream(destinationPath)) {
            
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
            System.out.println("File copied successfully from '" + sourcePath + "' to '" + destinationPath + "'.");
        } catch (IOException e) {
            System.out.println("Error copying file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String sourceFile = "D:\\\\source.txt";  // Use escaped backslashes
        String destinationFile = "D:\\\\destination.txt";  // Use escaped backslashes
        copyFile(sourceFile, destinationFile);
    }
}
