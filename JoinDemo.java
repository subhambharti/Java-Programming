// 80.	Create a program to demonstrate the join() method in threads.

class JoinDemo extends Thread {
    public void run() {
        for (int i = 0; i < 3; i++) System.out.println(Thread.currentThread().getName() + ": " + i);
    }

    public static void main(String[] args) throws InterruptedException {
        JoinDemo t1 = new JoinDemo();
        JoinDemo t2 = new JoinDemo();

        t1.start();
        t1.join(); // Main thread waits for t1 to complete
        t2.start();
    }
}
