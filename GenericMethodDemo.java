class GenericMethodDemo {
    // Generic method
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"Hello", "Generics", "Java"};

        System.out.print("Integer Array: ");
        printArray(intArray);  // Calling generic method

        System.out.print("String Array: ");
        printArray(strArray);  // Calling generic method
    }
}
