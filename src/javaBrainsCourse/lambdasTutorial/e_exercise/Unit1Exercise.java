package javaBrainsCourse.lambdasTutorial.e_exercise;

import java.util.Arrays;
import java.util.List;

public class Unit1Exercise {

	public static void main(String[] args) {
		/* sort of unit test
		 Person one = new Person("oneName", "oneSurname", 1);
		 System.out.println(one.toString());
		 */
		
		@SuppressWarnings("unused")
		List<Person> people = Arrays.asList(
				new Person("oneName", "oneSurname", 1),
				new Person("twoName", "twoSurname", 2),
				new Person("threeName", "threeSurname", 3),
				new Person("fourName", "fourSurname", 4),
				new Person("fiveName", "fiveSurname", 5)
			);
		
		
		// step 1: sort by lastName
		
		// step 2: create a method which prints all elements in the list
		
		// step 3: create a method that prints all people whose lastName starts with "t"
		
	}

}
