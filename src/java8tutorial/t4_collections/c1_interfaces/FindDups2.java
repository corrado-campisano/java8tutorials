package java8tutorial.t4_collections.c1_interfaces;

import java.util.*;

public class FindDups2 {
	public static void main(String[] args) {
		String[] argz= {"tizio", "caio", "sempronio", "caio", "tizio", "gino"};
				
		Set<String> uniques = new HashSet<String>();
		Set<String> dups = new HashSet<String>();

		for (String a : argz) {
			if (!uniques.add(a)) {
				dups.add(a);
			}
		}
		
		// Destructive set-difference
		uniques.removeAll(dups);

		System.out.println("Unique words:    " + uniques);
		System.out.println("Duplicate words: " + dups);
	}
}
