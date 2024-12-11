package java8tutorial.t2_learningTheJavaLanguage.c3_classesAndObjects.moreOnClasses.exercises.classes;

public class IdentifyMyPartsExcercise {

	// class variable
	public static int classVariable = 7;
	// instance variable
    public int instanceVariable = 3;
    
    
    public static void main(String[] args) {
    	IdentifyMyPartsExcercise a = new IdentifyMyPartsExcercise();
    	IdentifyMyPartsExcercise b = new IdentifyMyPartsExcercise();
    	
    	a.instanceVariable = 5;
    	b.instanceVariable = 6;

    	// the second statement will affect first object too
    	a.classVariable = 1;
    	b.classVariable = 2;
    	// to show that explicitly, use this way:
    	IdentifyMyPartsExcercise.classVariable = 1;
    	IdentifyMyPartsExcercise.classVariable = 2;
    	
    	System.out.println("a.y = " + a.instanceVariable);
    	System.out.println("b.y = " + b.instanceVariable);
    	System.out.println("a.x = " + a.classVariable);
    	System.out.println("b.x = " + b.classVariable);
    	
    	System.out.println("IdentifyMyPartsExcercise.x = " + IdentifyMyPartsExcercise.classVariable);
    }
}
