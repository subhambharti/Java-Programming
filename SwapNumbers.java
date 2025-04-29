
// 10.	Create a program to swap two numbers without using a third variable

import java.util.Scanner;

public class SwapNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number (a): ");
        int a = input.nextInt();

        System.out.print("Enter the second number (b): ");
        int b = input.nextInt();

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swap using arithmetic operations
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping: a = " + a + ", b = " + b);
        input.close();
    }
}