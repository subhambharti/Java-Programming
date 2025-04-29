//64.	Demonstrate the use of multiple catch blocks in a program.

public class MultipleCatchExample {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]); // ArrayIndexOutOfBoundsException
            int result = 10 / 0; // ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception caught.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds caught.");
        }
    }
}
