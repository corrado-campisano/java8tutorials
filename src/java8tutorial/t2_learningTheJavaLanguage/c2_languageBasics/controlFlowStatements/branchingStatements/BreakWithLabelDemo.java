package java8tutorial.t2_learningTheJavaLanguage.c2_languageBasics.controlFlowStatements.branchingStatements;

class BreakWithLabelDemo {
	
    public static void main(String[] args) {

        int[][] arrayOfInts = { 
        		{ 32, 87, 3, 589 },
        		{ 12, 1076, 2000, 8 },
        		{ 622, 127, 77, 955 }
        		};
        
        int searchfor = 2000;
        System.out.println("searching for: " + searchfor);
        
        int row;
        int col = 0;
        boolean foundIt = false;

        // outer loop label
        search:
        for (row = 0; row < arrayOfInts.length; row++) {
        	
        	System.out.println("\tanalizing row " + (row+1));
        	
        	// inner loop label
        	inner: 
            for (col = 0; col < arrayOfInts[row].length; col++) {
            	
            	System.out.println("\t\tanalizing col " + (col+1));
            	
                if (arrayOfInts[row][col] == searchfor) {
                	
                    foundIt = true;

                    // An unlabeled break statement terminates the innermost switch, for, while, or do-while statement, 
                    // but a labeled break terminates an outer statement
                    System.out.println("\t\texiting outer loop with a 'labeled break'...");
                    // stop outer loop
                    break search;
                    
                } else {
                	
                	boolean executeMeaninglessCode = false;
					// meaningless code, just to show how to use the inner loop label
                	// stop inner loop
                	if (executeMeaninglessCode ) break inner;
                }
            }
        }

        if (foundIt) {
            System.out.println("Found " + searchfor + " at row=" + (row+1) + ", col=" + (col+1));
        } else {
            System.out.println(searchfor + " not in the array");
        }
    }
}