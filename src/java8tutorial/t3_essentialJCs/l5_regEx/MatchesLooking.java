package java8tutorial.t3_essentialJCs.l5_regEx;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class MatchesLooking {

	private static final String REGEX = "foo";
	private static final String INPUT = "fooooooooooooooooo";
	private static Pattern pattern;
	private static Matcher matcher;

	public static void main(String[] args) {

		// Initialize
		pattern = Pattern.compile(REGEX);
		matcher = pattern.matcher(INPUT);

		System.out.println("Current REGEX is: " + REGEX);
		System.out.println("Current INPUT is: " + INPUT);

		System.out.println("lookingAt(): " + matcher.lookingAt());
		System.out.println("matches(): " + matcher.matches());
	}
}
