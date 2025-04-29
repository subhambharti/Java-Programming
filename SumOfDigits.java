
// 15.	Write a program to find the sum of digits of a given number.

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        System.out.println("Sum of digits: " + sumOfDigits(number));
    }

    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;  // Extract last digit and add to sum
            num /= 10;        // Remove last digit
        }
        return sum;
    }
}
