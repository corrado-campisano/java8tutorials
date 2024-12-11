package java8tutorial.t2_learningTheJavaLanguage.c3_classesAndObjects.objects;

public class Rectangle {

	public int width;
	public int height;
	public Point origin;

	/*
	 *  All classes have at least one constructor. If a class does not explicitly declare any, 
	 *  the Java compiler automatically provides a no-argument constructor, called the default constructor. 
	 *  
	 *  This default constructor calls the class parent's no-argument constructor, 
	 *  or the Object constructor if the class has no other parent. 
	 *  
	 *  If the parent has no constructor (Object does have one), the compiler will reject the program.
	 */
	
	
	public Rectangle(Point originOne, int i, int j) {
		origin=originOne;
		width=i; height=j;
		debug();
	}

	public Rectangle(int i, int j) {
		origin=new Point(0, 0);
		width=i; height=j;
		debug();
	}
	
	private void debug() {
		System.out.println("Width and height are: " + width + ", " + height);
	}	

	public int getArea() {
		return width*height;
	}

	public void move(int i, int j) {
		origin.x=i;
		origin.y=j;
	}

}
