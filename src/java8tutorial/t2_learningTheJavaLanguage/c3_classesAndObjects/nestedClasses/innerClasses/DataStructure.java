package java8tutorial.t2_learningTheJavaLanguage.c3_classesAndObjects.nestedClasses.innerClasses;

/*
You can use inner classes to implement helper classes such as the one shown in the this example. 

To handle user interface events, you must know how to use inner classes, 
because the event-handling mechanism makes extensive use of them. 
 */

public class DataStructure {
	
	// Create an array
    private final static int SIZE = 15;
    private int[] arrayOfInts = new int[SIZE];
    
    public DataStructure() {
        // fill the array with ascending integer values
        for (int i = 0; i < SIZE; i++) {
            arrayOfInts[i] = i;
        }
    }
    
    public void printEven() {
        
        // Print out values of even indices of the array
    	
    	// EDIT: intermediate structure not needed, MAYBE somewhat clearer to read
    	// DataStructureIterator iterator = this.new EvenIterator();
    	java.util.Iterator<Integer> iterator = this.new EvenIterator();
        
    	while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
    
    // EDIT: intermediate structure not needed, MAYBE somewhat clearer to read
    //interface DataStructureIterator extends java.util.Iterator<Integer> { } 

    // Inner class implements the DataStructureIterator interface,
    // which extends the Iterator<Integer> interface
    
    // EDIT: intermediate structure not needed, MAYBE somewhat clearer to read
    //private class EvenIterator implements DataStructureIterator {
    private class EvenIterator implements java.util.Iterator<Integer> {
        
        // Start stepping through the array from the beginning
        private int nextIndex = 0;
        
        public boolean hasNext() {
            
            // Check if the current element is the last in the array
            return (nextIndex <= SIZE - 1);
        }        
        
        public Integer next() {
            
            // Record a value of an even index of the array
            Integer retValue = Integer.valueOf(arrayOfInts[nextIndex]);
            
            // Get the next even element
            nextIndex += 2;
            return retValue;
        }
    }
    
    public static void main(String s[]) {
        
        // Fill the array with integer values and print out only
        // values of even indices
        DataStructure ds = new DataStructure();
        ds.printEven();
    }

}
