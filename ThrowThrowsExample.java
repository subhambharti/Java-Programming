//67.	Write a program to demonstrate the use of throw and throws.

class ThrowThrowsExample {
    static void checkAge(int age) throws IllegalArgumentException {
        if (age < 18) {
            throw new IllegalArgumentException("Not eligible for voting.");
        }
        System.out.println("Eligible for voting.");
    }

    public static void main(String[] args) {
        try {
            checkAge(16);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}