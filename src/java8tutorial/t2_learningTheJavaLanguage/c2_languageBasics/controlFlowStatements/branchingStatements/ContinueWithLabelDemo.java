package java8tutorial.t2_learningTheJavaLanguage.c2_languageBasics.controlFlowStatements.branchingStatements;


/*
 * 
BAD CODE, does not check first letter (here "L"), here's the debugging output:
char 'o' differs from char 'u'
char 'o' differs from char 'u'
char 'k' differs from char 'u'
char ' ' differs from char 'u'
char 'f' differs from char 'u'
char 'o' differs from char 'u'
char 'r' differs from char 'u'
char ' ' differs from char 'u'
char 'a' differs from char 'u'
char ' ' differs from char 'u'
char 's' differs from char 'u'
Found it
 * 
 * */
class ContinueWithLabelDemo {

	public static void main(String[] args) {

		String searchMe = "Look for a substring in me";
		String substring = "sub";
		boolean foundIt = false;

		int max = searchMe.length() - substring.length();

		// outer loop label
		test: for (int i = 0; i <= max; i++) {
			int n = substring.length();
			int j = i;
			int k = 0;

			// inner loop with no label
			while (n-- != 0) {
				if (searchMe.charAt(j++) != substring.charAt(k++)) {
					
					System.out.println("char '" + searchMe.charAt(j++) + "' differs from char '" +substring.charAt(k++) + "'");
					
					// continue outer loop
					continue test;
				}
			}
			foundIt = true;
			
			// stop outer loop
			break test;
		}
		System.out.println(foundIt ? "Found it" : "Didn't find it");
	}
}
