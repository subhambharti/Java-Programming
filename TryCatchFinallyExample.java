//62.	Create a program to demonstrate the use of try, catch, and finally.

public class TryCatchFinallyExample {
    public static void main(String[] args) {
        try {
            int num = 10 / 0;
            System.out.println("This will not be printed.");
        } catch (ArithmeticException e) {
            System.out.println("Caught an arithmetic exception.");
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}