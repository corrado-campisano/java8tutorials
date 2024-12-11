package javaBrainsCourse.lambdasTutorial.b_typeInference;

public class TypeInferenceExample {

	static String sampleString = "Hello Lambda!";
	
	public static void main(String[] args) {
		
		// defining a lambda expression
		StringLengthLambda stringLengthLambda = (String s) -> s.length();
		
		// executing the lambda expression, just like if "stringLengthLambda"
		// was an instance of the interface "StringLengthLambda":
		int len = stringLengthLambda.getLen(sampleString);
		System.out.println("1) Length of '" + sampleString + "' is " + len);
		
		// but, as the compiler has to do type inference, it also knows the return type,
		// so that will also work (compiler knows "s" it's a String):
		StringLengthLambda stringLengthLambda2 = (s) -> s.length();
		len = stringLengthLambda2.getLen(sampleString);
		System.out.println("2) Length of '" + sampleString + "' is " + len);
		
		// another "shortcut" is possible when there's only one parameter as input,
		// you can omit the round brackets around "s":
		StringLengthLambda stringLengthLambda3 = s -> s.length();
		len = stringLengthLambda3.getLen(sampleString);
		System.out.println("3) Length of '" + sampleString + "' is " + len);
		
		// another type inference is done when doing this:
		// (actually, there's a lot the compiler is inferring!)
		printWithLambda(s -> s.length());
		
	}

	
	public static void printWithLambda(StringLengthLambda sll) {
		System.out.println("4) Length of '" + sampleString + "' is " + sll.getLen(sampleString));
	}
	
	
	interface StringLengthLambda {
		int getLen(String s);
	}
}
