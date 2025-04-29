
// 73. Write a program to demonstrate thread synchronization

class SharedResource {
    private int count = 0;
    
    public synchronized void increment() {
        count++;
        System.out.println(Thread.currentThread().getName() + " - Count: " + count);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }
    }
}

class MyRunnable implements Runnable {
    private SharedResource resource;
    
    public MyRunnable(SharedResource resource) {
        this.resource = resource;
    }
    
    public void run() {
        for (int i = 0; i < 3; i++) {
            resource.increment();
        }
    }
}

public class Threadsynchronization {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        
        Thread thread1 = new Thread(new MyRunnable(resource), "Thread 1");
        Thread thread2 = new Thread(new MyRunnable(resource), "Thread 2");
        
        thread1.start();
        thread2.start();
    }
}
