package javaBrainsCourse.lambdasTutorial.a_basics;

public class HelloWorldGreeting implements Greeting {

	@Override
	public void perform() {
		System.out.println("Hello world (behaviour from HelloWorldGreeting)");
	}

}
