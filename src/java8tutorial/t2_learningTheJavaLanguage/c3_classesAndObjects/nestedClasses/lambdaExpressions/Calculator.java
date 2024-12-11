package java8tutorial.t2_learningTheJavaLanguage.c3_classesAndObjects.nestedClasses.lambdaExpressions;

public class Calculator {

	// functional interface
	interface IntegerMath {
		int perfomOperation(int a, int b);
	}

	public int operateBinary(int a, int b, IntegerMath operation) {
		return operation.perfomOperation(a, b);
	}

	public static void main(String[] args) {

		Calculator myApp = new Calculator();

		// lambda expressions defined as functional interfaces
		IntegerMath addition = (a, b) -> a + b;
		IntegerMath division = (a, b) -> a / b;

		System.out.println("40 + 2 = " + myApp.operateBinary(40, 2, addition));
		System.out.println("20 / 5 = " + myApp.operateBinary(20, 5, division));
	}
}
