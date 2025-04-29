
// 26.	Write a program to create and use a static method

class MathUtils {
    // Static method
    static int square(int num) {
        return num * num;
    }

    public static void main(String[] args) {
        // Calling the static method without creating an object
        int result = MathUtils.square(5);
        System.out.println("Square of 5: " + result);
    }
}
