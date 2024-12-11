package java8tutorial.t3_essentialJCs.l3_concurrency;

/*
 * Which of these idioms should you use? The first idiom, which employs a Runnable object, is more general, 
 * because the Runnable object can subclass a class other than Thread. The second idiom is easier to use 
 * in simple applications, but is limited by the fact that your task class must be a descendant of Thread. 
 */

public class HelloThread extends Thread {

	public void run() {
		System.out.println("Hello from a thread!");
	}

	public static void main(String args[]) {
		// (new HelloThread()).start();
		Thread t = new HelloThread();
		t.start();
	}

}
