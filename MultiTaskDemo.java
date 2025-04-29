// 79.	Write a program to handle multiple threads performing different tasks.

class TaskOne extends Thread {
    public void run() {
        System.out.println("Task One: Counting to 5");
        for (int i = 1; i <= 5; i++) System.out.println(i);
    }
}

class TaskTwo extends Thread {
    public void run() {
        System.out.println("Task Two: Printing letters A to E");
        for (char c = 'A'; c <= 'E'; c++) System.out.println(c);
    }
}

public class MultiTaskDemo {
    public static void main(String[] args) {
        new TaskOne().start();
        new TaskTwo().start();
    }
}
