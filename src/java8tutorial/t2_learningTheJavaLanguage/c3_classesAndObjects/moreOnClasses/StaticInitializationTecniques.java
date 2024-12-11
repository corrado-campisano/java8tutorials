package java8tutorial.t2_learningTheJavaLanguage.c3_classesAndObjects.moreOnClasses;

public class StaticInitializationTecniques {

	/*
	 * This works well when the initialization value is available and the
	 * initialization can be put on one line. However, this form of initialization
	 * has limitations because of its simplicity. If initialization requires some
	 * logic (for example, error handling or a for loop to fill a complex array),
	 * simple assignment is inadequate
	 */
	// initialize to 10
	public static int capacity = 10;
	// initialize to false
	private boolean full = false;

	/*
	 * Instance variables can be initialized in constructors, where error handling
	 * or other logic can be used. To provide the same capability for class
	 * variables, the Java programming language includes static initialization
	 * blocks. A class can have any number of static initialization blocks, and they
	 * can appear anywhere in the class body. The runtime system guarantees that
	 * static initialization blocks are called in the order that they appear in the
	 * source code.
	 */
	static {
		// whatever code is needed for initialization goes here
	}

	/*
	 * There is an alternative to static blocks — you can write a private static
	 * method. The advantage of private static methods is that they can be reused
	 * later if you need to reinitialize the class variable.
	 */
	public static Double myStaticVar = initializeClassVariable();

	private static Double initializeClassVariable() {
		// initialization code goes here, must return a value
		return 1.5D;
	}

	/*
	 * Normally, you would put code to initialize an instance variable in a
	 * constructor. There are two alternatives to using a constructor to initialize
	 * instance variables: initializer blocks and final methods. Initializer blocks
	 * for instance variables look just like static initializer blocks, but without
	 * the static keyword. The Java compiler copies initializer blocks into every
	 * constructor. Therefore, this approach can be used to share a block of code
	 * between multiple constructors.
	 */
	{
		// whatever code is needed for initialization goes here
	}

	/*
	 * A final method cannot be overridden in a subclass. This is discussed in the
	 * lesson on interfaces and inheritance. Here is an example of using a final
	 * method for initializing an instance variable.
	 * This is especially useful if subclasses might want to reuse the
	 * initialization method. The method is final because calling non-final methods
	 * during instance initialization can cause problems.
	 */
	private Double myInstanceVar  = initializeInstanceVariable();
	protected final Double initializeInstanceVariable() {
		// initialization code goes here, must return a value
		return 1.5D;
	}
}
