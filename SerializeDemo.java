// 88.	Create a program to serialize and deserialize an object.

import java.io.*;

class Person implements Serializable {
    String name;
    int age;
    Person(String n, int a) { name = n; age = a; }
}

public class SerializeDemo {
    public static void main(String[] args) throws Exception {
        Person p = new Person("Alice", 25);

        // Serialization
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("person.ser"));
        out.writeObject(p);
        out.close();

        // Deserialization
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("person.ser"));
        Person p2 = (Person) in.readObject();
        in.close();

        System.out.println("Name: " + p2.name + ", Age: " + p2.age);
    }
}
