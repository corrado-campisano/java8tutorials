package javaBrainsCourse.lambdasTutorial.f_functionInterfaces;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BiPredicate;

import javaBrainsCourse.lambdasTutorial.e_exercise.Person;

/*
 compare this class with the one in package javaBrainsCourse.lambdasTutorial.exercise:
 the Condition interface can be replaced by one of the common utility interfaces available in 
 package java.util.functions: the only thing is we need something like this:
 
public interface Condition {
	boolean test(Person p, String s);
}

or, in the simpler, original example/exercise:
(https://www.youtube.com/watch?v=MqsCdbMQjWc&list=PLqq-6Pq4lTTa9YGfyhyW2CqdtW9RtY-I3&index=15)

something like this:
public interface Condition {
	boolean test(Person p);
}

which is provided by the "Predicate<T>" interface, which has only one abstract method:

boolean test(T t), which uses the generics, so it could be used here (if I sticked with the original exercise!)

unfortunately, my interface has this:
boolean test(Person p, String s);

So, I have to use "BiPredicate<T,U>" interface, which has only one abstract method:
boolean test(T t, U u)

the real fun is that I only have to replace the "Condition" with BiPredicate<T,U> in "printUponCondition":


it was: 
private static void printUponCondition(..., Condition condition, ...) {
			
it's now:
printUponCondition(..., BiPredicate<Person, String> condition, ...) {...}

without having to define the Condition interface!


 */

public class Unit1ExerciseJava8Solution {
	
	
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
		// we are replacing the "Comparator" interface and its anonymous inner class with a lambda expression
		// this can be done, since the "Comparator" interface has only 1 abstract method (functional interface)
		System.out.println("\n\t SORTING PEOPLE BY lastName...");
		Collections.sort(people, (Person arg0, Person arg1) -> arg0.getLastName().compareTo(arg1.getLastName()));
		// notice how more compact and readable this is!
		
		// actually, since "Collections.sort" knows that "people" is a "List" of "Person" objects, we can omit that:
		System.out.println("\n\t SORTING PEOPLE BY lastName... short version");
		Collections.sort(people, (arg0, arg1) -> arg0.getLastName().compareTo(arg1.getLastName()));
		
		
		
		// step 2: create a method which prints all elements in the list
		// this stays unchanged?
		printAll(people);
		// actually, we could get rid of this and use printUponCondition instead!
		System.out.println("\n\t printAll... short version");
		// just make the condition return "TRUE" in any case!
		printUponCondition(people, (Person p, String s) -> true, "ANY", true);
		// as you can see, it's indipendent of the parameter it's given
		printUponCondition(people, (Person p, String s) -> true, "ANY", false);
		
		
		// step 3: create a method that prints all people whose lastName starts with "t"
		// like in step 1, let's replace the anonymous inner class with a lambda expression:
		printUponCondition(people, (Person p, String s) -> (p.getFirstName().startsWith(s)), "m", true);
		// notice how more compact and readable this is!
		
		// also notice it's possible to omit that "p" is a Person and "s" is a String, as the compiler knows that already
		System.out.println("\n\t printUponCondition... short version");
		printUponCondition(people, (p, s) -> (p.getFirstName().startsWith(s)), "m", true);
		
		
		// it's quite easy to do this with different conditions:
		printUponCondition(people, (Person p, String s) -> (p.getLastName().startsWith(s)), "v", false);
		// notice how more compact and readable this is!
		
		// also notice it's possible to omit that "p" is a Person and "s" is a String, as the compiler knows that already
		System.out.println("\n\t printUponCondition... short version");
		printUponCondition(people, (p, s) -> (p.getLastName().startsWith(s)), "v", false);
		
	}
	
	
	private static void printUponCondition(List<Person> people, BiPredicate<Person, String> condition, 
			String nameBeginsWith, boolean firstOrLastName) {
		
		System.out.println("\n\t PRINTING PEOPLE upon Condition ("+
			(firstOrLastName ? "first" : "last") +"Name begins with " + nameBeginsWith +")");
		for (Person p : people) {
			if (condition.test(p, nameBeginsWith))
				System.out.println(p.toString());
		}		
	}
	
	// this stays unchanged?
	// actually, we could get rid of this and use printUponCondition instead!
	private static void printAll(List<Person> people) {
		
		System.out.println("\n\t PRINTING ALL PEOPLE");
		for (Person p : people) {
			System.out.println(p.toString());
		}	
	}
}
