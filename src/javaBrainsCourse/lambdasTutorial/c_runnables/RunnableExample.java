package javaBrainsCourse.lambdasTutorial.c_runnables;


// since the "Runnable" interface has one method, it's a perfect match 
// for "being implemented" as a lambda function!
public class RunnableExample {

	public static void main(String[] args) {
		
		// let's start using an anonymous inner class like this:
		Thread runnableThread = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Printed inside a Runnable inner class");
			}});
		// Causes this thread to begin execution; the Java Virtual Machine calls the run method of this thread.
		runnableThread.start();
		
		
		// let's use a lambda instead: it's a lot more compact and readable!
		Thread lambdaThread = new Thread( () -> System.out.println("Printed inside a lambda Runnable"));
		// Causes this thread to begin execution; the Java Virtual Machine calls the run method of this thread.
		lambdaThread.start();
		
		// BTW: the above is a direct benefit of having reused the interface concept to define lambdas!
		// if lambdas had been defined with this (see javaBrainsCourse.lambdasTutorial.basics.Greeter):
		// FunctionType<InputArgsTypes, OutputType> aLambdaFunction = (...) -> ...;
		// replacing the runnable above would had been a lot more cumbersome!
		// instead, with the actual definition, a lot of backward compatibility is granted!
		
	}

}
