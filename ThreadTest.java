// Multi Threading

class A extends Thread {
    public void run() {
        for (int i = 1; i < 5; i++) {
            System.out.println("i = " + i);
        }
    }
}

class B extends Thread {
    public void run() {
        for (int j = 1; j < 5; j++) {
            System.out.println("j = " + j);
        }
    }
}

class C extends Thread {
    public void run() {
        for (int k = 1; k < 5; k++) { // Fixed: Added 'int' declaration for k
            System.out.println("k = " + k);
        }
    }
}

public class ThreadTest {
    public static void main(String[] args) {
        A obj1 = new A(); // Create thread A
        B obj2 = new B(); // Create thread B
        C obj3 = new C(); // Create thread C
        
        obj1.start();     // Start thread A
        obj2.start();     // Start thread B
        obj3.start();     // Start thread C
    }
}