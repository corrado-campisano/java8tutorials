package java8tutorial.t3_essentialJCs.l3_concurrency;

public class SynchronizedCounter {

	private int c = 0;

	public synchronized void increment() {
		c++;
	}

	public synchronized void decrement() {
		c--;
	}

	public synchronized int value() {
		return c;
	}
}
