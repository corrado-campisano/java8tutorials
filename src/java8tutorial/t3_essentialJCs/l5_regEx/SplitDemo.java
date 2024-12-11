package java8tutorial.t3_essentialJCs.l5_regEx;

import java.util.regex.Pattern;

public class SplitDemo {

	private static final String REGEX = ":";
	private static final String INPUT = "one:two:three:four:five";

	public static void main(String[] args) {
		Pattern p = Pattern.compile(REGEX);
		String[] items = p.split(INPUT);
		for (String s : items) {
			System.out.println(s);
		}
	}
}