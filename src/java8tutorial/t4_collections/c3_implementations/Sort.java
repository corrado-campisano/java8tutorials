package java8tutorial.t4_collections.c3_implementations;

import java.util.*;

public class Sort {
	
    public static void main(String[] args) {
    	
    	String [] array = {"jhcd", "87gf87g", "jhvfj", "kjghhf"};
    	
        List<String> list = Arrays.asList(array);
        Collections.sort(list);
        System.out.println(list);
    }
}
