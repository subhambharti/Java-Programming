// 98.	Create a program to sort a list of custom objects using a comparator.
import java.util.*;

class Person {
    String name;
    int age;

    Person(String n, int a) { name = n; age = a; }

    public String toString() { return name + " - " + age; }
}

public class SortCustomObjects {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
            new Person("Alice", 30),
            new Person("Bob", 25)
        );

        people.sort(Comparator.comparingInt(p -> p.age));
        people.forEach(System.out::println);
    }
}
