package java8tutorial.t4_collections.c2_streams;

import java.util.List;

public class AggregateExample {

	public static void main(String[] args) {

		// Create sample data
		List<Person> roster = Person.createRoster();
		
		// this prints the name of all members contained in the collection roster with a for-each loop
		System.out.println("simple for-each loop");
		for (Person p : roster) {
		    System.out.println(p.getName() + " " + p.getAge());
		}
		
		// this prints all members contained in the collection roster but with the aggregate operation forEach
		System.out.println("\naggregate forEach operation, using a lambda expression");
		roster.stream()
			.forEach(e -> System.out.println(e.getName() + " " + e.getAge()));
	}

}
