
// 72.	Create a program to implement a thread using the Runnable interface

class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread running: " + i);
            try {
                Thread.sleep(500); // Sleep for 500ms
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
    }
}

public class ThreadRunnable {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        thread.start();
        
        System.out.println("Main thread is running");
    }
}