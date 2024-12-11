package java8tutorial.t2_learningTheJavaLanguage.c3_classesAndObjects.moreOnClasses.exercises.objects;

public class NumberHolder {
	public int anInt;
    public float aFloat;
    
    
    public NumberHolder(int anInt, float aFloat) {
		this.anInt = anInt;
		this.aFloat = aFloat;
	}
    
    
    public static void main(String[] args) {
    	
    	NumberHolder nh1 = new NumberHolder(2, 3.4F);
    	printNh(nh1);
    	NumberHolder nh2 = new NumberHolder(54, 2.645F);
    	printNh(nh2);	
    }
    
    
    private static void printNh(NumberHolder nh) {
    	System.out.println("int part: " + nh.anInt + ", float part: " + nh.aFloat);
    }
}
