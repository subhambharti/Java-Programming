
// 17.	Write a program to display all Armstrong numbers between 1 and 500.

public class ArmstrongNumbers {
    public static void main(String[] args) {
        System.out.println("Armstrong numbers between 1 and 500:");
        for (int num = 1; num <= 500; num++) {
            if (isArmstrong(num)) {
                System.out.print(num + " ");
            }
        }
    }

    public static boolean isArmstrong(int num) {
        int sum = 0, temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit * digit * digit;
            temp /= 10;
        }
        return sum == num;
    }
}
