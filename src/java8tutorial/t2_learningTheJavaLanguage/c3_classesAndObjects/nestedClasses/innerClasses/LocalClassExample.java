package java8tutorial.t2_learningTheJavaLanguage.c3_classesAndObjects.nestedClasses.innerClasses;

/*
Local classes are classes that are defined in a block, 
which is a group of zero or more statements between balanced braces. 

You typically find local classes defined in the body of a method. 


Local classes are similar to inner classes because they cannot define or declare any static members. 
Local classes in static methods, such as the class PhoneNumber, 
which is defined in the static method validatePhoneNumber, 
can only refer to static members of the enclosing class. 

For example, if you do not define the member variable regularExpression as static, 
then the Java compiler generates an error similar to 
"non-static variable regularExpression cannot be referenced from a static context."

Local classes are non-static because they have access to instance members of the enclosing block. 
Consequently, they cannot contain most kinds of static declarations.

You cannot declare an interface inside a block; interfaces are inherently static.

You cannot declare static initializers or member interfaces in a local class.

A local class can have static members provided that they are constant variables. 
(A constant variable is a variable of primitive type or type String that is declared final 
and initialized with a compile-time constant expression. 
A compile-time constant expression is typically a string or an arithmetic expression that 
can be evaluated at compile time.

see more at https://docs.oracle.com/javase/tutorial/java/javaOO/localclasses.html
 */

public class LocalClassExample {

	static String regularExpression = "[^0-9]";

	public static void validatePhoneNumber(String phoneNumber1, String phoneNumber2) {

		/*
		A local class can only access local variables that are declared final. 
		When a local class accesses a local variable or parameter of the enclosing block, 
		it captures that variable or parameter. 
		For example, the PhoneNumber constructor can access the local variable numberLength 
		because it is declared final; numberLength is a captured variable.
		 */
		// Valid in JDK <8:
		// final int numberLength = 10;
		
		/*
		However, starting in Java SE 8, a local class can access local variables and parameters
		of the enclosing block that are final or effectively final. 
		A variable or parameter whose value is never changed after it is initialized is effectively final.
		 */
		// Valid in JDK 8 and later:
		int numberLength = 10;

		// notice that the class definition is inside a method!
		class PhoneNumber {

			String formattedPhoneNumber = null;

			PhoneNumber(String phoneNumber) {
				
				//Because of this assignment statement, the variable numberLength is not effectively final anymore. 
				//As a result, the Java compiler generates an error message similar to 
				//"local variables referenced from an inner class must be final or effectively final"
				//numberLength = 7;
				
				// A local class has access to the members of its enclosing class: regularExpression
				String currentNumber = phoneNumber.replaceAll(regularExpression, "");
				
				// A local class has access to the members of its enclosing class: numberLength
				if (currentNumber.length() == numberLength)
					formattedPhoneNumber = currentNumber;
				else
					formattedPhoneNumber = null;
			}

			public String getNumber() {
				return formattedPhoneNumber;
			}

			/*
			Starting in Java SE 8, if you declare the local class in a method, 
			it can access the method's parameters.
			 */
			// Valid in JDK 8 and later:
			public void printOriginalNumbers() {
				System.out.println("Original numbers are " + phoneNumber1 + " and " + phoneNumber2);
			}
		}

		PhoneNumber myNumber1 = new PhoneNumber(phoneNumber1);
		PhoneNumber myNumber2 = new PhoneNumber(phoneNumber2);

		// Valid in JDK 8 and later:
		myNumber1.printOriginalNumbers();

		if (myNumber1.getNumber() == null)
			System.out.println("First number is invalid");
		else
			System.out.println("First number is " + myNumber1.getNumber());
		if (myNumber2.getNumber() == null)
			System.out.println("Second number is invalid");
		else
			System.out.println("Second number is " + myNumber2.getNumber());

	}

	public static void main(String... args) {
		validatePhoneNumber("123-456-7890", "456-7890");
	}

}
