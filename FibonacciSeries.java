
// 7.	Create a program to display Fibonacci series up to n terms

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of terms (n): ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            return; // Exit the program if input is invalid
        }
        System.out.println("Fibonacci Series up to " + n + " terms:");
        int first = 0, second = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println(); 
        input.close();
    }
    public static int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }
}