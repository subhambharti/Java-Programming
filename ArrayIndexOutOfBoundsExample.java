
//65.	Write a program to handle an array index out-of-bounds exception.

public class ArrayIndexOutOfBoundsExample {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]); // Error: out of bounds
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds!");
        }
    }
}
