package java8tutorial.t2_learningTheJavaLanguage.c3_classesAndObjects.classes;

public class Circle {
	int x; int y;

	/*
	 * Reference data type parameters, such as objects, are also passed into methods
	 * by value. This means that when the method returns, the passed-in reference
	 * still references the same object as before. However, the values of the
	 * object's fields can be changed in the method, if they have the proper access
	 * level.
	 */
	public void moveCircle(Circle circle, int deltaX, int deltaY) {
		// code to move origin of circle to x+deltaX, y+deltaY
		circle.setX(circle.getX() + deltaX);
		circle.setY(circle.getY() + deltaY);

		// code to assign a new reference to circle
		circle = new Circle(0, 0);
	}
	
	
	public Circle (int xp, int yp) {
	 x=xp; y=yp;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int xp) {
		x=xp;
	}
	public int getY() {
		return y;
	}
	public void setY(int yp) {
		y=yp;
	}
}
