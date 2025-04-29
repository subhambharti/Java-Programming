import java.util.Scanner;

class inputTest {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); // Create a Scanner object
        System.out.println("Enter your name:");
        String name = myObj.nextLine(); // Use proper capitalization for String and method
        System.out.println("My name is: " + name);
    }
}
