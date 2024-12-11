package java8tutorial.t2_learningTheJavaLanguage.c2_languageBasics.expressionsStatementsBlocks;

class BlockDemo {
	
    public static void main(String[] args) {
    	
         boolean condition = false;
         
         if (condition) { 
        	 // begin block 1
             System.out.println("Condition is true.");
             // end block 1
         } else { 
        	 // begin block 2
             System.out.println("Condition is false.");
             // end block 2
         } 
    }
}

