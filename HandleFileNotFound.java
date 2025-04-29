
// 60.	Create a program to handle file not found exceptions.

import java.io.*;

public class HandleFileNotFound {
    public static void readFile(String filePath) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found - " + filePath);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String filePath = "D:\\example.txt"; // Replace with actual file path
        readFile(filePath);
    }
}
