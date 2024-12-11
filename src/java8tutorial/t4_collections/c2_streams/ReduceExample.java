package java8tutorial.t4_collections.c2_streams;

import java.util.List;

public class ReduceExample {

	public static void main(String[] args) {

		// Create sample data
		List<Person> roster = Person.createRoster();
		
		Integer totalAge1 = roster
			.stream()
			.mapToInt(p->p.getAge())
			.sum();
		System.out.println("Total age, with mapToInt: " + totalAge1);
		
		Integer totalAge2 = roster
			.stream()
			.map(p->p.getAge())
			.reduce(0, (a, b) -> a + b);
		System.out.println("Total age, with map/reduce: " + totalAge2);
	}

}
