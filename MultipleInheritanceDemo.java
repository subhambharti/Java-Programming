interface Animal {
    void makeSound();
}

interface Pet {
    void showAffection();
}

class Dog implements Animal, Pet {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }

    @Override
    public void showAffection() {
        System.out.println("Dog wags tail");
    }
}

public class MultipleInheritanceDemo {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.makeSound();
        myDog.showAffection();
    }
}
