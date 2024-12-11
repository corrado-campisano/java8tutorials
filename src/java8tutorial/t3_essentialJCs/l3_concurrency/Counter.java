package java8tutorial.t3_essentialJCs.l3_concurrency;

class Counter {

	private int c = 0;

	public void increment() {
		c++;
	}

	public void decrement() {
		c--;
	}

	public int value() {
		return c;
	}

}
