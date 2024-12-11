package java8tutorial.t4_collections.c2_streams;

import java.util.List;
import java.util.stream.Collectors;

public class CollectExample {

	public static void main(String[] args) {
		
		// Create sample data
		List<Person> roster = Person.createRoster();
		
		// example using collect(supplier, accumulator, combiner)
		Averager averageCollect = roster.stream()
			.filter(p -> p.getGender() == Person.Sex.MALE)
			.map(p -> p.getAge())
			.collect(Averager::new, Averager::accept, Averager::combine);
		
		System.out.println("Average age of male members: " + averageCollect.average());
		
		
		List<String> namesOfMaleMembersCollect = roster
			    .stream()
			    .filter(p -> p.getGender() == Person.Sex.MALE)
			    .map(p -> p.getName())
			    .collect(Collectors.toList());
	}

}
