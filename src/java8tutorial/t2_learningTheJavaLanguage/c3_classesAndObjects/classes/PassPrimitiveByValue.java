package java8tutorial.t2_learningTheJavaLanguage.c3_classesAndObjects.classes;

public class PassPrimitiveByValue {

	public static void main(String[] args) {

		int x = 3;

		// invoke passMethod() with x as argument
		passMethod(x);

		// print x to see if its value has changed
		System.out.println("After invoking passMethod, x = " + x);

		Circle myCircle = new Circle(3, 5);
		myCircle.moveCircle(myCircle, 23, 56);
		System.out.println("After invoking moveCircle, x = " + myCircle.getX() + ", y=" + myCircle.getY());
	}

	/*
	 * Primitive arguments, such as an int or a double, are passed into methods by
	 * value. This means that any changes to the values of the parameters exist only
	 * within the scope of the method. When the method returns, the parameters are
	 * gone and any changes to them are lost.
	 */
	public static void passMethod(int p) {
		// change parameter in passMethod()
		p = 10;
	}

}
