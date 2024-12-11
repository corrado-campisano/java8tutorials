package java8tutorial.t2_learningTheJavaLanguage.c2_languageBasics.controlFlowStatements.forStatement;


class EnhancedForDemo {
	
    public static void main(String[] args){
    	
         int[] numbers = {1,2,3,4,5,6,7,8,9,10};
         
         // We recommend using this form of the for statement instead of the general form whenever possible
         for (int item : numbers) {
             System.out.println("Current item is: " + item);
         }
    }
}