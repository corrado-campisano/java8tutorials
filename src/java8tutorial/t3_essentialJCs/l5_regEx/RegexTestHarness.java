package java8tutorial.t3_essentialJCs.l5_regEx;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexTestHarness {

	public static void main(String[] args) {

		String regex = "cat.";
		Pattern pattern = Pattern.compile(regex);

		String stringToSearch = "cats and dogs";
		Matcher matcher = pattern.matcher(stringToSearch);

		boolean found = false;
		while (matcher.find()) {
			System.out.format("I found the text \"%s\" starting at index %d and ending at index %d.%n", matcher.group(),
					matcher.start(), matcher.end());
			found = true;
		}
		if (!found) {
			System.out.format("No match found.%n");
		}
	}
}
