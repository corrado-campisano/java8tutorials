package java8tutorial.t2_learningTheJavaLanguage.c7_generics.methods;

public class MainTest {

	public static void main(String[] args) {

		Pair<Integer, String> p1 = new Pair<>(1, "apple");
		Pair<Integer, String> p2 = new Pair<>(2, "pear");

		boolean same;
		// sintassi completa
		same = Util.<Integer, String>compare(p1, p2);
		// sintassi corta
		same = Util.compare(p1, p2);

		// This feature, known as type inference, allows you to invoke a generic method
		// as an ordinary method, without specifying a type between angle brackets.

		System.out.println(same);
	}

}
