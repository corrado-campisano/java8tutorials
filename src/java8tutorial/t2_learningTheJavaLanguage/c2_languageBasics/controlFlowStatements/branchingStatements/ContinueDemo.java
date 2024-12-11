package java8tutorial.t2_learningTheJavaLanguage.c2_languageBasics.controlFlowStatements.branchingStatements;

class ContinueDemo {
	
    public static void main(String[] args) {

        String searchMe = "peter piper picked a " + "peck of pickled peppers";
        
        int max = searchMe.length();
        int numPs = 0;

        for (int i = 0; i < max; i++) {
        	
            // interested only in p's
            if (searchMe.charAt(i) != 'p') {
            	
            	// The continue statement skips the current iteration of a for, while , or do-while loop
                continue;
            }
            
            // process p's
            numPs++;
        }
        
        System.out.println("Found " + numPs + " p's in the string.");
    }
}
