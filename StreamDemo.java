// 90.	Create a program to demonstrate the use of Java 8 streams.

import java.util.Arrays;
import java.util.List;

public class StreamDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        names.stream()
             .filter(name -> name.startsWith("A"))
             .map(String::toUpperCase)
             .forEach(System.out::println);
    }
}
