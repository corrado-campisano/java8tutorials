package java8tutorial.t2_learningTheJavaLanguage.c2_languageBasics.operators.exercises;


// Change the following program to use compound assignments
// DONE, see case where 'oldCode = false';


class ArithmeticDemo {

    public static void main (String[] args){
         
    	boolean oldCode = true;

		int result = 1; // start with 1
		System.out.println(result); System.out.println();
    	
    	if (oldCode) {
	
    		result = result + 2; // result is now 3
            System.out.println(result);
    		
	        result = result - 1; // result is now 2
	        System.out.println(result);
	
	        result = result * 2; // result is now 4
	        System.out.println(result);
	
	        result = result / 2; // result is now 2
	        System.out.println(result);
	
	        result = result + 8; // result is now 10
	        System.out.println(result);
	        
	        result = result % 7; // result is now 3
	        System.out.println(result);
         
    	} else {
    		
    		result += 2; // result is now 3
            System.out.println(result);
    		
	        result -= 1; // result is now 2
	        System.out.println(result);
	
	        result *= 2; // result is now 4
	        System.out.println(result);
	
	        result /= 2; // result is now 2
	        System.out.println(result);
	
	        result += 8; // result is now 10
	        System.out.println(result);
	        
	        result %= 7; // result is now 3
	        System.out.println(result);
    	}
    }
}
