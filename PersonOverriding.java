class PersonOverriding {
    public void speak() {
        System.out.println("Person is speaking");
    }
}

class Teacher extends PersonOverriding {
    @Override
    public void speak() {
        System.out.println("Teacher is teaching");
    }
}

public class MethodOverridingExample {
    public static void main(String[] args) {
        PersonOverriding person = new Teacher();  // Parent reference, Child object
        person.speak();  // Calls Teacher's overridden method
    }
}
