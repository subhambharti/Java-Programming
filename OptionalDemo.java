// 92.	Create a program to demonstrate the use of Optional in Java 8.

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        Optional<String> name = Optional.ofNullable("John");

        name.ifPresent(n -> System.out.println("Name: " + n));
        System.out.println("Name or default: " + name.orElse("Default"));
    }
}
