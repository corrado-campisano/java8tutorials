package java8tutorial.t2_learningTheJavaLanguage.c3_classesAndObjects.classes;

public class DataArtist {
	
	/*
	 * Overloaded methods are differentiated by the number and the type of the arguments passed into the method. 
	 * 
	 * In the code sample, draw(String s) and draw(int i) are distinct and unique methods,
	 * because they require different argument types.
	 * 
	 * You cannot declare more than one method with the same name and the same number and type of arguments, 
	 * because the compiler cannot tell them apart.
	 * 
	 * The compiler does not consider return type when differentiating methods, 
	 * so you cannot declare two methods with the same signature even if they have a different return type.
	 * 
	 * Note: Overloaded methods should be used sparingly, as they can make code much less readable. 
	 */
	
	
	public void draw(String s) {
        //
    }
    public void draw(int i) {
        //
    }
    public void draw(double f) {
        //
    }
    public void draw(int i, double f) {
        
    }
}
