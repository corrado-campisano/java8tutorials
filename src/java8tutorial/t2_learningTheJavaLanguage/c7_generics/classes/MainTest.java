package java8tutorial.t2_learningTheJavaLanguage.c7_generics.classes;

public class MainTest {

	public static void main(String[] args) {
		
		// no generics
		Box box = new Box();
		box.set("ciao");
		System.out.println(box.get());
		
		// single param
		GenericBox<Integer> genericBox = new GenericBox<Integer>();
		genericBox.set(Integer.valueOf(34));
		System.out.println(genericBox.get());
		
		// multiple params
		Pair<String, Integer> p1 = new OrderedPair<String, Integer>("Even", 8);
		System.out.println(p1.getKey() + " - " + p1.getValue());
		
		// multiple params
		Pair<String, String>  p2 = new OrderedPair<String, String>("hello", "world");
		System.out.println(p2.getKey() + " - " + p2.getValue());
		
		// parametrized types - i.e. recursive 
		GenericBox<Integer> qq = new GenericBox<Integer>();
		qq.set(Integer.valueOf(223));
		OrderedPair<String, GenericBox<Integer>> pp = new OrderedPair<>("primes", qq);
		System.out.println(pp.getKey() + " - " + pp.getValue().get());
	}

}
