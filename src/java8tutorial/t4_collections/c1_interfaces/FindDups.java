package java8tutorial.t4_collections.c1_interfaces;

import java.util.*;
import java.util.stream.*;

public class FindDups {
	
	public static void main(String[] args) {
		String[] argz= {"tizio", "caio", "sempronio", "caio", "tizio", "gino"};
		usingAggregateOps(argz);
		usingForEach(argz);
	}

	private static void usingForEach(String[] args) {
		
		Set<String> distinctWords = new HashSet<String>();
        for (String a : args) {
        	distinctWords.add(a);
        }
        
        System.out.println(distinctWords.size() + " distinct words: " + distinctWords);
	}

	private static void usingAggregateOps(String[] args) {

		Set<String> distinctWords = Arrays.asList(args).stream().collect(Collectors.toSet());
		
		System.out.println(distinctWords.size() + " distinct words: " + distinctWords);
	}
}
