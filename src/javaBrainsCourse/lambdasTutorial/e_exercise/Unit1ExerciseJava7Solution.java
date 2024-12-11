package javaBrainsCourse.lambdasTutorial.e_exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExerciseJava7Solution {
	
	
	public static void main(String[] args) {
		/* sort of unit test
		 Person one = new Person("oneName", "oneSurname", 1);
		 System.out.println(one.toString());
		 */
		
		List<Person> people = Arrays.asList(
				new Person("mario", "rossi", 12),
				new Person("gino", "bianchi", 23),
				new Person("pino", "verdi", 34),
				new Person("nino", "gialli", 45),
				new Person("rino", "marroni", 56),
				new Person("lino", "viola", 67),
				new Person("mino", "misto", 78),
				new Person("tino", "blu", 89)
			);
		
		
		// step 1: sort by lastName
		// use collections sorting and an anonymous inner class
		System.out.println("\n\t SORTING PEOPLE BY lastName...");
		Collections.sort(people, new Comparator<Person>() {
			@Override
			public int compare(Person arg0, Person arg1) {
				return arg0.getLastName().compareTo(arg1.getLastName());
			}
		});
		
		
		// step 2: create a method which prints all elements in the list
		printAll(people);
				
		
		// step 3: create a method that prints all people whose lastName starts with "t"
		
		// this one works, but let's abstract from it...
		printLastNamesBeginningWith(people, "v");
		
		// let's try passing a generic "condition" to the method:
		printUponCondition(people, new Condition() {
			@Override
			public boolean test(Person p, String s) {
				return (p.getLastName().startsWith(s));
			}
		}, "v", false);
		
		// it's quite easy to do this with different conditions:
		printUponCondition(people, new Condition() {
			@Override
			public boolean test(Person p, String s) {
				return (p.getFirstName().startsWith(s));
			}
		}, "m", true);
	}

	
	private static void printUponCondition(List<Person> people, Condition condition, 
			String nameBeginsWith, boolean firstOrLastName) {
		
		System.out.println("\n\t PRINTING PEOPLE upon Condition ("+
			(firstOrLastName ? "first" : "last") +"Name begins with " + nameBeginsWith +")");
		for (Person p : people) {
			if (condition.test(p, nameBeginsWith))
				System.out.println(p.toString());
		}		
	}
	
	
	private static void printLastNamesBeginningWith(List<Person> people, String beginningWith) {
		
		System.out.println("\n\t PRINTING PEOPLE whose lastName begins with " + beginningWith);
		for (Person p : people) {
			if (p.getLastName().startsWith(beginningWith))
				System.out.println(p.toString());
		}		
	}

	private static void printAll(List<Person> people) {
		
		System.out.println("\n\t PRINTING ALL PEOPLE");
		for (Person p : people) {
			System.out.println(p.toString());
		}	
	}
}


