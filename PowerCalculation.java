
// 19.	Write a program to calculate the power of a number using a loop.

import java.util.Scanner;

public class PowerCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the base: ");
        int base = scanner.nextInt();
        
        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();
        
        scanner.close();
        
        System.out.println(base + "^" + exponent + " = " + power(base, exponent));
    }

    public static int power(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }
}
