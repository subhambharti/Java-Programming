//69.	Write a program to demonstrate nested try-catch blocks.

public class NestedTryCatchExample {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3};
            try {
                System.out.println(arr[5]); // ArrayIndexOutOfBoundsException
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner catch: Array index out of bounds.");
            }

            int result = 10 / 0; // ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Outer catch: Arithmetic exception.");
        }
    }
}