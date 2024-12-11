package java8tutorial.t2_learningTheJavaLanguage.c2_languageBasics.controlFlowStatements.whileStatements;

class WhileDemo {
	
    public static void main(String[] args){
    	
        int count = 1;
        int max = 10000;
        
        while (count < max) {
            System.out.println("Count is: " + count);
            count++;
        }
    }
}
