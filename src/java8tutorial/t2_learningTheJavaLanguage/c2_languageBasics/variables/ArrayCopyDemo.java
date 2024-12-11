package java8tutorial.t2_learningTheJavaLanguage.c2_languageBasics.variables;

class ArrayCopyDemo {
	
    public static void main(String[] args) {
    	
    	
        String[] copyFrom = {
            "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",   
            "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",      
            "Marocchino", "Ristretto" };
        
        
        
        String[] copyTo = new String[7];
        
        
        
        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        
        
        
        System.out.println("\noriginal array(item count: "+copyFrom.length+") :");
        /*
        for (String value : copyFrom) {
            System.out.print(value + " ");           
        }
        * The toString method converts each element of the array to a string,
        * separates them with commas, then surrounds them with brackets
        */
        System.out.println(java.util.Arrays.toString(copyFrom)); 
        
        
        System.out.println("\ncopied array (item count: "+copyTo.length+") :");
        /*
        for (String value : copyTo) {
            System.out.print(value + " ");           
        }
        * Creating a stream that uses an array as its source (the stream method) */
        java.util.Arrays.stream(copyTo).map(value -> value + " ").forEach(System.out::print); 
    }
}