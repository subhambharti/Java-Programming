
// 16.	Create a program to print the following pattern:
// *
// **
// ***
// ****
// *****


public class StarPattern {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to next line
        }
    }
}
