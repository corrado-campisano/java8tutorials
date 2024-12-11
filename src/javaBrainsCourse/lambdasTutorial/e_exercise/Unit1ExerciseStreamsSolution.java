package javaBrainsCourse.lambdasTutorial.e_exercise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import javaBrainsCourse.lambdasTutorial.e_exercise.Person;

public class Unit1ExerciseStreamsSolution {
	
	public static void main(String[] args) {
		/* sort of unit test
		 Person one = new Person("oneName", "oneSurname", 1);
		 System.out.println(one.toString());
		 */
		
		List<Person> people = Arrays.asList(
				new Person("oneName", "oneSurname", 1),
				new Person("twoName", "twoSurname", 2),
				new Person("threeName", "threeSurname", 3),
				new Person("fourName", "fourSurname", 4),
				new Person("fiveName", "fiveSurname", 5)
			);
		
		// step 1: sort by lastName
		
		System.out.println("\nsort by lastName - using a comparator with anonimous class");
		
		Comparator<Person> comparator = new Comparator<Person>() {
			@Override
			public int compare(Person p1, Person p2) {
				return p1.getLastName().compareTo(p2.getLastName());
			}
		};
		people.stream()
			.sorted(comparator)
			.forEach(System.out::println);
		

		System.out.println("\nsort by lastName - using a comparator with lambda expression");
		Comparator<Person> comparator2 = (p1, p2)-> p1.getLastName().compareTo(p2.getLastName());
		people.stream()
			.sorted(comparator2)
			.forEach(System.out::println);
		
		
		System.out.println("\nsort by lastName - using inline lambda expression");
		people.stream()
			.sorted((p1, p2)-> p1.getLastName().compareTo(p2.getLastName()))
			.forEach(System.out::println);

		// step 2: create a method which prints all elements in the list
		System.out.println("\ncreate a method which prints all elements in the list");
		people.stream()
			.forEach(System.out::println);
		
		// step 3: create a method that prints all people whose lastName starts with "t"
		System.out.println("\ncreate a method that prints all people whose lastName starts with \"t\"");
		people.stream()
			.filter( p -> p.getLastName().startsWith("t"))
			.forEach(System.out::println);
		
	}
}
