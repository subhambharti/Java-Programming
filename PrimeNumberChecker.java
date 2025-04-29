
// 6.	Write a Java program to check if a number is prime

import java.util.Scanner;

public class PrimeNumberChecker {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        boolean isPrime = isPrime(number); // Call the helper function

        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
        input.close();
    }

    // Helper function to check for primality
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }

        // Optimization: Check only up to the square root of n
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // Divisible by another number, so not prime
            }
        }
        return true; // No divisors found, so it's prime
    }
}