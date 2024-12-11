package java8tutorial.t4_collections.c1_interfaces;

import java.util.*;

public class Freq {
	
    public static void main(String[] args) {
    	
    	// mappatura: parola <-> #occorrenze
        Map<String, Integer> m = new HashMap<String, Integer>();

        String[] argz= {"tizio", "caio", "sempronio", "caio", "tizio", "caio", "gino"};
		        
        // Initialize frequency table from command line
        for (String currentWord : argz) {
            Integer freq = m.get(currentWord);
            m.put(currentWord, (freq == null) ? 1 : freq + 1);
        }

        System.out.println(m.size() + " distinct words:");
        System.out.println(m);
    }
}
