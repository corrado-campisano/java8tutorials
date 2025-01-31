package java8tutorial.t2_learningTheJavaLanguage.c2_languageBasics.variables;

class ArrayDemo {
	
    public static void main(String[] args) {
    	
    	/* noob way to create & initialize literal values...
        // declares an array of integers
        int[] anArray;

        // allocates memory for 10 integers
        anArray = new int[10];
           
        // initialize first element
        anArray[0] = 100;
        // initialize second element
        anArray[1] = 200;
        // and so forth
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;
        */
        
        /* compact way to create & initialize literal values... 
         * Here the length of the array is determined by the number 
         * of values provided between braces and separated by commas.
         */
		int[] anArray = { 
		    100, 200, 300,
		    400, 500, 600, 
		    700, 800, 900, 1000
		};

        System.out.println("Element count: " + anArray.length);
        
        /* noob way to print an array...
        System.out.println("\tElement at index 0: " + anArray[0]);
        System.out.println("\tElement at index 1: " + anArray[1]);
        System.out.println("\tElement at index 2: " + anArray[2]);
        System.out.println("\tElement at index 3: " + anArray[3]);
        System.out.println("\tElement at index 4: " + anArray[4]);
        System.out.println("\tElement at index 5: " + anArray[5]);
        System.out.println("\tElement at index 6: " + anArray[6]);
        System.out.println("\tElement at index 7: " + anArray[7]);
        System.out.println("\tElement at index 8: " + anArray[8]);
        System.out.println("\tElement at index 9: " + anArray[9]);
        */
        
        /* compact way to print an array... */
        for (int i=0; i<anArray.length; i++) {
        	System.out.println("\tElement at index "+i+": " + anArray[i]);
        }
    }
} 
