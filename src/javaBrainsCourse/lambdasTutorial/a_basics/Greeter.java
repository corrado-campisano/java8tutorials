package javaBrainsCourse.lambdasTutorial.a_basics;


public class Greeter {
	
	public static void main (String[] args) {
		
		Greeter greeter = new Greeter();
				
		// ----------------------------------------------------
		// this is how it works before Java8 (no Lambda Expressions)
		// ----------------------------------------------------
		
		
		// calling a method with a single behaviour
		greeter.greet();
		
		// calling a method with a parametric behaviour
		greeter.greet("universe");
		
		// using an interface as a container defining a behaviour
		Greeting helloWorldGreeting = new HelloWorldGreeting();
		// calling a method with a container defining a behaviour
		greeter.greet(helloWorldGreeting);
		
		// the latter was "sort of" passing a behaviour as a parameter,
		// so, sort of "code handled as data", but actually it is passing
		// a class which defines a behaviour, not the behaviour itself
		
		
		/*
		The idea here is to "really" pass a behaviour as a parameter,
		without a container class to define it, as used before Java8,
		as they were "pure functions defined in isolation", so beyond classical OOP,
		which can "really" be treated "values" (so "code as data", i.e. "funtions as values").
		
		So, the idea is to have something new like this ("code as data"):
		
			SomeNewLangFeature aBlockOfCode = {...};
		
		Or better, something like this ("methods [i.e. functions] as values"):
		
			SomeNewLangFeature aBlockOfCode = public void perform() {
				System.out.println("Hello world (lambda behaviour)");
			};
		
		
		Now, there's a lot of redundancy in such a definition:
		 - "public" is meaningless, as we don't want a class container, so we won't need accessibility modifiers;
		 - "void" is redundant, as the compliler can deduct the return type from the code;
		 - "perform" is redundant, as we're referring to this block of code as "aBlockOfCode";
		 
		So, we're left with this:
		
			SomeNewLangFeature aBlockOfCode = () {
				System.out.println("Hello world (lambda behaviour)");
			};
		
		To make this more readable and clearer, we'll add "->" like this:
		
			SomeNewLangFeature aBlockOfCode = () -> {
				System.out.println("Hello world (lambda behaviour)");
			};
		
		Which, in case of single-liners, it will be just this:
		
			SomeNewLangFeature aBlockOfCode = () -> System.out.println("Hello world (lambda behaviour)");
		
		
		With such an approach, we'll "treat code as data", passing the "aBlockOfCode" variable to a method, 
		which will execute the code defined in the variable, sort of what the "eval" function does in javascript.
		
		Indeed, we could also avoid the variable, and pass its value to a method directly:
			someMethod(aBlockOfCode);
		is equivalento to:
			someMethod(() -> System.out.println("Hello world (lambda behaviour)");
		
		
		In addition to this, these "functions" should also be able to take parameters as inputs:
		
			SomeNewLangFeature doubleItFunction = public int doubleIt(int a) {
				return 2 * a;
			}
		
		So, removing the reduntant stuff, we're left with this:
		
			SomeNewLangFeature doubleItFunction = (int a) -> {
				return 2 * a;
			}
		
		Or, give it's a single-liner, something like this ("return" is also redundant):
		
			SomeNewLangFeature doubleItFunction = (int a) -> 2 * a;	
		
		(actually, "return" will be forbidden for single-liners, in actual syntax)
		
		
		Here's another example: 
		
			SomeNewLangFeature addNumbersFunction = (int a, int b) -> a + b;
		
		
		Here's yet another example:
		
			SomeNewLangFeature safeDivideFunction = (int a, int b) -> {
				if (b==0) return 0;
				return a / b;
			};
		
		
		And a final example:
		
			SomeNewLangFeature stringLengthFunction = (String s) -> s.length();
		
		
		Now: how to use that? The key is to define what "SomeNewLangFeature" is...
		
		
		Actually, the specs re-used the concept of an Interface, which has became a "functional interface".
		
		
		Indeed, we could have gone with something like this:
		
			FunctionType<InputArgsTypes, OutputType> aLambdaFunction = (...) -> ...;
		
		As in our example, like this:
			
			FunctionType<void, void> aLambdaFunction = () -> System.out.println("Hello world (lambda behaviour)");
			
		
		On the contrary, they reused the concept of Interface, like with GreetingsLambdaFunction below:
		the trick is to make sure the interface has one method with the same signature of our lambda function.
		
		Doing so, the "class" of our function will be that of the interface:
		
		GreetingsLambdaFunction lambdaGreetingsFunction = () -> System.out.println("Hello world (lambda behaviour)");
		 */
		

		// ----------------------------------------------------
		// this is how it works with Java8's Lambda Expressions
		// ----------------------------------------------------
		
		// first, you have to declare the interface GreetingsLambdaFunction 
		// and then define your function like this: 
		GreetingsLambdaFunction greetingsLambdaFunction = () -> System.out.println("Hello world (lambda behaviour)");
		
		// indeed, that is somewhat optional, as the Greeting interface already had that same signature, 
		// which is the reason the following will also work, as names (for the interface and the method) are arbitrary:
		// (in a way, the following re-defines the "perform" method of the Greeting interface...
		// indeed, this also works:
		helloWorldGreeting = () -> System.out.println("Hello world (lambda behaviour)"); 
		// and actually re-defines the behaviour of that method:
		System.out.println("\t the following is from the re-defined 'helloWorldGreeting' (using previous interface Greeting)...");
		greeter.greet(helloWorldGreeting);
		
		Greeting greetings = () -> System.out.println("Hello world (lambda behaviour)");
		// but mind you cannot add additional methods to this "functional interface", 
		// since the compiler will not be able to tell which method to map, and
		// it will give this error: "The target type of this expression must be a functional interface"
		
		// then you need a method which accepts that function, so you can call it
		
		// calling a method with a lambda behaviour
		System.out.println("\t the following is from the 'greetingsLambdaFunction' (using separate interface GreetingsLambdaFunction)...");
		greeter.greet(greetingsLambdaFunction);
		
		// which will also work with the Greeting interface:
		System.out.println("\t the following is from the re-defined 'greetings' (using previous interface Greeting)...");
		greeter.greet(greetings);
		
		// finally, it is also possible to do both this:
		System.out.println("\t the following is from the 'helloWorldGreeting.perform()' (using previous interface Greeting)...");
		helloWorldGreeting.perform();
		// and this:
		System.out.println("\t the following is from the 'greetings.perform()' (using previous interface Greeting)...");
		greetings.perform();
		/*
		 this means that with this:
		 
		   Greeting greetings = () -> System.out.println("Hello world (lambda behaviour)");
		   
		 we're actually defining an implementation for the interface 'Greeting', 
		 without (explicitly) defining an implementing class
		 
		 Still, there are differences:
		  - "helloWorldGreeting" is an instance of "HelloWorldGreeting", implementing interface "Greeting";
		  - "greetings" is a lambda function of type "Greeting"
		  
		Indeed, the above 
			Greeting greetings = () -> System.out.println("Hello world (lambda behaviour)");
		is just syntactic sugar which actually does this, using an anonymous inner class:
		*/
		Greeting innerClassGreetings = new Greeting() {
			public void perform() {
				System.out.println("Hello world (behaviour from innerClassGreetings)");
			}

		};
		// indeed, it works the same way!
		innerClassGreetings.perform();
				
	}
	
	
	// method with a lambda function
	private void greet(GreetingsLambdaFunction lambdaGreetingsFunction) {
		lambdaGreetingsFunction.aMethodWithSameSignatureAsTheLambdaFunction();
	}

	// method with a single behaviour
	public void greet() {
		System.out.println("Hello world (single behaviour)");
	}
	
	// method with a parametric behaviour
	public void greet(String param) {
		System.out.println("Hello " +param+ " (parametric behaviour)");
	}
	
	// method with a container defining a behaviour
	public void greet(Greeting helloWorldGreeting) {
		helloWorldGreeting.perform();
	}
}


interface GreetingsLambdaFunction {

	// the method signature has to match the lambda function one: 
	// greetingsFunction = () -> System.out.println("Hello world (lambda behaviour)");
	// so, it must be with no parameters and returning void:
	void aMethodWithSameSignatureAsTheLambdaFunction();
}


interface AdditionLambdaFunction{
	
	int aMethodWithSameSignatureAsTheLambdaFunction(int a, int b);
}
