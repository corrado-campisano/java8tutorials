package java8tutorial.t2_learningTheJavaLanguage.c2_languageBasics.controlFlowStatements.branchingStatements;

class BreakDemo {
	
    public static void main(String[] args) {

        int[] arrayOfInts = { 32, 87, 3, 589, 12, 1076, 2000, 8, 622, 127 };
        
        int searchfor = 1076;
        System.out.println("searching for: " + searchfor);

        int i;
        boolean foundIt = false;

        for (i = 0; i < arrayOfInts.length; i++) {
        	
        	System.out.println("\tanalizing item " + arrayOfInts[i]);
        	
            if (arrayOfInts[i] == searchfor) {
                foundIt = true;
                // An unlabeled break statement terminates the innermost switch, for, while, or do-while statement, 
                // but a labeled break terminates an outer statement
                System.out.println("\titem found! exiting with an 'unlabeled break'...");
                // stop loop
                break;
            }
        }

        if (foundIt) {
            System.out.println("Found " + searchfor + " at index " + i);
        } else {
            System.out.println(searchfor + " not in the array");
        }
    }
}
