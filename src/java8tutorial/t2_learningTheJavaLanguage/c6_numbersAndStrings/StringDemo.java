package java8tutorial.t2_learningTheJavaLanguage.c6_numbersAndStrings;

public class StringDemo {

	public static void main(String[] args) {

		String palindrome = "Dot saw I was Tod";

		int len = palindrome.length();

		char[] tempCharArray = new char[len];
		char[] charArray = new char[len];

		// put original string in an
		// array of chars
		for (int i = 0; i < len; i++) {
			tempCharArray[i] = palindrome.charAt(i);
		}

		// reverse array of chars
		for (int j = 0; j < len; j++) {
			charArray[j] = tempCharArray[len - 1 - j];
		}

		String reversePalindrome = new String(charArray);
		System.out.println(reversePalindrome);
		
		
		// reverse again more efficiently 
		// i.e. single loop and no tempCharArray
		char[] charArray2 = new char[len];
		for (int i = len-1; i>=0; i--) {
			charArray2[i]=palindrome.charAt(i);
		}
		String reversedAgain = new String(charArray2);
		System.out.println(reversedAgain);
	}
}
