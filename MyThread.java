
// 75.	Write a program to demonstrate thread priorities.


class MyThread extends Thread
{
	public void run()
	{
		System.out.println("Thread Running...");
	}

	public static void main(String[]args)
	{
		MyThread p1 = new MyThread();
		MyThread p2 = new MyThread();
		MyThread p3 = new MyThread();
		p1.start();
		System.out.println("P1 thread priority : " + p1.getPriority());
		System.out.println("P2 thread priority : " + p2.getPriority());
		System.out.println("P3 thread priority : " + p3.getPriority());

	}
}
