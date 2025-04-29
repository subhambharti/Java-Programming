
// 18.	Create a program to find the sum of all even numbers between 1 and n.

import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        scanner.close();
        
        int sum = sumOfEvenNumbers(n);
        System.out.println("Sum of even numbers between 1 and " + n + " is: " + sum);
    }

    public static int sumOfEvenNumbers(int n) {
        int sum = 0;
        for (int i = 2; i <= n; i += 2) {
            sum += i;
        }
        return sum;
    }
}
