class GenericBox<T> {
    private T value;
    public void set(T value) { this.value = value; }
    public T get() { return value; }
}
public class Genericprogramming {
    public static void main(String[] args) {
        GenericBox<Integer> intBox = new GenericBox<>();
        intBox.set(10);
        System.out.println(intBox.get()); // Output: 10
    }
}
