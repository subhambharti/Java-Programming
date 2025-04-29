
// 76.	Create a program to implement a producer-consumer problem.

import java.util.concurrent.ArrayBlockingQueue;

class Buffer {
	private ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);

	public void produce(int item) throws InterruptedException {
		queue.put(item);
		System.out.println("Produced: " + item);
	}

	public int consume() throws InterruptedException {
		int item = queue.take();
		System.out.println("Consumed: " + item);
		return item;
	}
}

public class ProducerConsumer {
	public static void main(String[] args) {
		Buffer buffer = new Buffer();
		int items = 5;

		new Thread(() -> {
			try {
				for (int i = 1; i <= items; i++)
					buffer.produce(i);
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}, "Producer").start();

		new Thread(() -> {
			try {
				for (int i = 1; i <= items; i++)
					buffer.consume();
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}, "Consumer").start();
	}
}