package java8tutorial.t2_learningTheJavaLanguage.c2_languageBasics.controlFlowStatements.forStatement;

class ForDemo {
	
    public static void main(String[] args){
    	
    	int max = 10000;
    	
        for(int i=1; i<max; i++){
        	 
        	System.out.println("Count is: " + i);
        }
        
        /*
        // infinite loop
        for ( ; ; ) {
        	System.out.println("infinite loop...");
        }
        */
    }
}
