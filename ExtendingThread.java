
// 71.	Write a program to create a thread by extending the Thread class.

class MyThread extends Thread {
    public void run() {
        for(int i = 0; i < 3; i++) {
            System.out.println("Thread " + getName() + ": " + i);
        }
    }
}

public class ExtendingThread {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
    }
}