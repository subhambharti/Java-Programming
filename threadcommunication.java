
// 74.	Create a program to implement inter-thread communication.

class Customer {
	int amount=10000;
//creating a withdraw() method which calls the wait() method
	synchronized void withdraw(int amount) {
		System.out.println("going to withdraw...");

		if(this.amount<amount) {
			System.out.println("Less balance; waiting for deposit...");
			try {
				wait();
			}
			catch(Exception e) {}
		}
		this.amount-=amount;
		System.out.println("withdraw completed...");
	}
//creating a deposit() method with calls the notify() method
	synchronized void deposit(int amount) {
		System.out.println("going to deposit...");
		this.amount+=amount;
		System.out.println("deposit completed... ");
		notify();
	}
}
//Creating a Main class to start threads and call deposit() and withdraw()
public class threadcommunication {
	public static void main(String args[]) {
		final Customer c=new Customer();
		new Thread() {
			public void run() {
				c.withdraw(15000);
			}
		} .start();
		new Thread() {
			public void run() {
				c.deposit(10000);
			}
		} .start();
	}
}