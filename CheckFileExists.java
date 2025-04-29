//55.	Write a program to check if a file exists.
import java.io.File;

public class CheckFileExists {
    public static void main(String[] args) {
        File file = new File("output.txt");
        if (file.exists()) {
            System.out.println("File exists.");
        } else {
            System.out.println("File does not exist.");
        }
    }
}