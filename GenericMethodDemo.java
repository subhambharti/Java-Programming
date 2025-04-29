// 97.	Write a program to implement a generic method.

public class GenericMethodDemo {
    public static <T> void printArray(T[] array) {
        for (T element : array)
            System.out.println(element);
    }

    public static void main(String[] args) {
        Integer[] nums = {1, 2, 3};
        String[] words = {"A", "B", "C"};
        printArray(nums);
        printArray(words);
    }
}
