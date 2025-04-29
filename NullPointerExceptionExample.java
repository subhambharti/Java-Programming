//66.	Create a program to handle a null pointer exception.

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length()); // NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Null pointer exception caught.");
        }
    }
}
