package java8tutorial.t4_collections.c2_streams;

import java.util.List;

public class BulkDataOperationsExamples {

	public static void main(String... args) {

		// Create sample data
		List<Person> roster = Person.createRoster();

		// 1a. Print names of members, for-each loop
		System.out.println("Members of the collection (for-each loop):");
		for (Person p : roster) {
			System.out.println(p.getName());
		}

		// 1b. Print names of members, forEach operation
		System.out.println("Members of the collection (bulk data operations):");
		roster.stream()
			.forEach(e -> System.out.println(e.getName()));

		// 2a. Print names of male members, for-each loop
		System.out.println("Male members of the collection (for-each loop):");
		for (Person p : roster) {
			if (p.getGender() == Person.Sex.MALE) {
				System.out.println(p.getName());
			}
		}
		
		// 2b. Print names of male members, forEach operation
		System.out.println("Male members of the collection (bulk data operations):");
		roster.stream()
			.filter(e -> e.getGender() == Person.Sex.MALE)
			.forEach(e -> System.out.println(e.getName()));

		// 3a. Get average age of male members of the collection, for-each loop
		int count=0; double sum=0;
		for (Person p : roster) {
			if (p.getGender() == Person.Sex.MALE) {
				count++;
				sum+=p.getAge();
			}
		}
		double avgA = 0;
		if (count>0) avgA = sum/count;
		System.out.println("Average age of male members (complex for-each loop): " + (avgA));
		
		// 3b. Get average age of male members of the collection, forEach operation, method reference
		double avgB = roster.stream()
			.filter(p -> p.getGender() == Person.Sex.MALE)
			.mapToInt(Person::getAge)
			.average().getAsDouble();
		System.out.println("Average age of male members (bulk data operations, method reference): " + avgB);
		
		// 3c. Get average age of male members of the collection, forEach operation, lambda expression
		double average = roster.stream()
			.filter(p -> p.getGender() == Person.Sex.MALE)
			.mapToInt(p -> p.getAge())
			.average().getAsDouble();
		System.out.println("Average age of male members (bulk data operations, lambda expression): " + average);
	}
}
