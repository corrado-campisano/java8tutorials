package java8tutorial.t2_learningTheJavaLanguage.c2_languageBasics.operators.exercises;


// In the following program, explain why the value "6" is printed twice in a row
// DONE, see comments below


class PrePostDemo {
	
    public static void main(String[] args){
    	
        int i = 3;
        i++;
        
        System.out.println(i);    // "4"
        
        ++i;                     
        
        System.out.println(i);    // "5"
        
        // the prefix version (++i) evaluates to the incremented value        
        System.out.println(++i);  // "6"
        
        // the postfix version (i++) evaluates to the original value
        System.out.println(i++);  // "6"
        
        System.out.println(i);    // "7"
    }
}
