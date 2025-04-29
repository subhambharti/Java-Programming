
// 21.	Write a program to demonstrate the use of constructors.

class Person {
    String name;
    int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display details
    public void display() { 
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        // Creating objects
        Person person1 = new Person("Alice", 25);
        Person person2 = new Person("Bob", 30);

        // Displaying object data
        person1.display();
        person2.display();
    }
}
