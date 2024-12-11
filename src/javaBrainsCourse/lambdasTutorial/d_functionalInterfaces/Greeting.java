package javaBrainsCourse.lambdasTutorial.d_functionalInterfaces;

@FunctionalInterface
public interface Greeting {

	public void perform();
	
	// functional interfaces must declare only one method
	//public int add(int a, int b);
	
	static void foo() {}
	
	default void bar() {}
}
