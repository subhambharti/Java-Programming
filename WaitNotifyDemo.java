// 77.	Write a program to demonstrate the wait() and notify() methods.

class WaitNotifyDemo {
    private static final Object lock = new Object();

    static class Waiter extends Thread {
        public void run() {
            synchronized (lock) {
                System.out.println("Waiting for notification...");
                try {
                    lock.wait();
                } catch (InterruptedException e) {}
                System.out.println("Received notification, continuing...");
            }
        }
    }

    static class Notifier extends Thread {
        public void run() {
            synchronized (lock) {
                System.out.println("Notifier sending signal...");
                lock.notify();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Waiter();
        Thread t2 = new Notifier();
        t1.start();
        Thread.sleep(1000);
        t2.start();
    }
}
