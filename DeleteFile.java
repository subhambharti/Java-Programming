// 56. Create a program to delete a file.

import java.io.File;

public class DeleteFile {
    public static void deleteFile(String filePath) {
        File file = new File(filePath);
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("File '" + filePath + "' has been deleted successfully.");
            } else {
                System.out.println("Failed to delete the file.");
            }
        } else {
            System.out.println("File '" + filePath + "' not found.");
        }
    }

    public static void main(String[] args) {
        String fileToDelete = "D:\\example.txt";  // Use absolute path with escaped backslashes
        deleteFile(fileToDelete);
    }
}
