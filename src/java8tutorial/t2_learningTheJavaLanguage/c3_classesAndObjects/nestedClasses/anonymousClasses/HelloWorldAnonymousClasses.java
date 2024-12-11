package java8tutorial.t2_learningTheJavaLanguage.c3_classesAndObjects.nestedClasses.anonymousClasses;

/*
Anonymous classes enable you to make your code more concise. 

They enable you to declare and instantiate a class at the same time. 

They are like local classes except that they do not have a name. 

Use them if you need to use a local class only once.


See more at https://docs.oracle.com/javase/tutorial/java/javaOO/anonymousclasses.html
 */

public class HelloWorldAnonymousClasses {
	
	interface HelloWorld {
        public void greet();
        public void greetSomeone(String someone);
    }
  
    public void sayHello() {
        
    	/*
    	While local classes are class declarations, anonymous classes are expressions, 
    	which means that you define the class in another expression. 
    	
    	The following example, HelloWorldAnonymousClasses, uses anonymous classes 
    	in the initialization statements of the local variables frenchGreeting and spanishGreeting, 
    	but uses a local class for the initialization of the variable englishGreeting
    	 */
    	
    	// declaring local class
        class EnglishGreeting implements HelloWorld {
            String name = "world";
            public void greet() {
                greetSomeone("world");
            }
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hello " + name);
            }
        }
        // using local class
        HelloWorld englishGreeting = new EnglishGreeting();
        
        // declaring and using anonymous class:
        /*
        As mentioned previously, an anonymous class is an expression. 
        The syntax of an anonymous class expression is like the invocation of a constructor, 
        except that there is a class definition contained in a block of code.
        
        The anonymous class expression consists of the following:
    		- The new operator
			- The name of an interface to implement or a class to extend. 
				In this example, the anonymous class is implementing the interface HelloWorld.
			- Parentheses that contain the arguments to a constructor, 
				just like a normal class instance creation expression. Note: When you implement an interface, there is no constructor, so you use an empty pair of parentheses, as in this example.
    		- A body, which is a class declaration body. 
    			More specifically, in the body, method declarations are allowed but statements are not.

		Because an anonymous class definition is an expression, it must be part of a statement. 
		In this example, the anonymous class expression is part of the statement that instantiates 
		the frenchGreeting object. (This explains why there is a semicolon after the closing brace.)
		
		Note that you can declare the following in anonymous classes:
			- Fields
			- Extra methods (even if they do not implement any methods of the supertype)
			- Instance initializers
			- Local classes
		However, you cannot declare constructors in an anonymous class.
         */
        HelloWorld frenchGreeting = new HelloWorld() {
            String name = "tout le monde";
            public void greet() {
                greetSomeone("tout le monde");
            }
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Salut " + name);
            }
        };
        
        // declaring and using anonymous class
        /*
        As mentioned previously, an anonymous class is an expression. 
        The syntax of an anonymous class expression is like the invocation of a constructor, 
        except that there is a class definition contained in a block of code.
        
        ...(see above for full comment about anonymous class expression)
         */
        HelloWorld spanishGreeting = new HelloWorld() {
            String name = "mundo";
            public void greet() {
                greetSomeone("mundo");
            }
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hola, " + name);
            }
        };
        
        englishGreeting.greet();
        englishGreeting.greetSomeone("Steve");
        
        frenchGreeting.greet();
        frenchGreeting.greetSomeone("Fred");
        
        spanishGreeting.greet();
        spanishGreeting.greetSomeone("Fernando");
    }

    public static void main(String... args) {
        HelloWorldAnonymousClasses myApp = new HelloWorldAnonymousClasses();
        myApp.sayHello();
    }

}
