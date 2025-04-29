//68.	Create a program to handle number format exceptions.

public class NumberFormatExceptionExample {
    public static void main(String[] args) {
        try {
            String str = "abc";
            int num = Integer.parseInt(str); // Error: invalid number
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("Number format exception caught.");
        }
    }
}