package java8tutorial.t2_learningTheJavaLanguage.c2_languageBasics.operators.assignmentArithmeticAndUnaryOperators;

class PrePostDemo {
	
    public static void main(String[] args){
    	
        int i = 3;
        i++;
        
        // prints 4
        System.out.println(i);
        ++i;
        
        // prints 5
        System.out.println(i);
        
        // prints 6
        // the prefix version (++i) evaluates to the incremented value
        System.out.println(++i);
        
        // prints 6
        // the postfix version (i++) evaluates to the original value
        System.out.println(i++);
        	
        // prints 7
        System.out.println(i);
    }
}
