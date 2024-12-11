package java8tutorial.t2_learningTheJavaLanguage.c2_languageBasics.controlFlowStatements.exercises;

public class Snippet {

	public static void main(String args[]) {

		int aNumber = 3;
		
		if (aNumber  >= 0) 
			if (aNumber == 0)
				System.out.println("first string");
			else
				System.out.println("second string");
		System.out.println("third string");
		
		// equivalent, readable code
		if (aNumber  >= 0) {
			
			if (aNumber == 0) {
				System.out.println("first string");
			} else {
				System.out.println("second string");
			}
		}
		System.out.println("third string");
		
	}
}
