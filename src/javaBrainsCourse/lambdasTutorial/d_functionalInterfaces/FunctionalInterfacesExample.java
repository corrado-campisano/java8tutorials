package javaBrainsCourse.lambdasTutorial.d_functionalInterfaces;


// a FunctionalInterface, to be used with Lambda Expressions,
// must have ONLY ONE ABSTRACT METHOD, but (with Java8 and above),
// it could also have non-abstract methods (implemented in the interface itself)
//
// in order to prevent such interfaces from being modified (i.e. with 
// additional abstract methods, which would made them unusable with lambdas,
// it is possible to mark them with the "@FunctionalInterface" annotation!
public class FunctionalInterfacesExample {

	public static void main(String[] args) {
		
		// adding a new method to the Greeting interface will give this error here:
		// "The type new Greeting(){} must implement the inherited abstract method Greeting.add(int, int)",
		// but even before you save the Greeting interface, it would show the error:
		// "Invalid '@FunctionalInterface' annotation; Greeting is not a functional interface"
		Greeting innerClassGreetings = new Greeting() {
			public void perform() {
				System.out.println("Hello world (behaviour from innerClassGreetings)");
			}

		};
		// indeed, it works the same way!
		innerClassGreetings.perform();
		
		// adding a new method to the Greeting interface will give this error here:
		// "The target type of this expression must be a functional interface",
		// but even before you save the Greeting interface, it would show the error:
		// "Invalid '@FunctionalInterface' annotation; Greeting is not a functional interface"
		Greeting lamdbaGreetings = () -> System.out.println("Hello world (lambda behaviour)");
		lamdbaGreetings.perform();
	}

}
