package java8tutorial.t4_collections.c1_interfaces;

import java.util.*;

public class Shuffle {
	
	public static void main(String[] args) {
		
		String[] argz= {"tizio", "caio", "sempronio", "caio", "tizio", "gino"};
				
		List<String> list = new ArrayList<String>();
		
		for (String a : argz) {
			list.add(a);
		}
		
		Collections.shuffle(list, new Random());
		
		System.out.println(list);
	}
}
