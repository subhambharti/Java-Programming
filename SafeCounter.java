// 78. Create a program to implement a thread-safe counter.

class SafeCounter {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public int getValue() {
        return count;
    }

    public static void main(String[] args) throws InterruptedException {
        SafeCounter counter = new SafeCounter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) counter.increment();
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) counter.increment();
        });

        t1.start(); t2.start();
        t1.join(); t2.join();

        System.out.println("Count = " + counter.getValue());
    }
}
