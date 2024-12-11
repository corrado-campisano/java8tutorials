package java8tutorial.t2_learningTheJavaLanguage.c3_classesAndObjects.classes;

public class Bicycle {
	
	// the Bicycle class has three fields
	public int cadence;
	public int gear;
	public int speed;

	
	// the Bicycle class has two constructors
	
	/*
	 * As with methods, the Java platform differentiates constructors on the basis of the number of arguments in the list and their types.
	 * You cannot write two constructors that have the same number and type of arguments for the same class, 
	 * because the platform would not be able to tell them apart. Doing so causes a compile-time error.
	 */
	
	/*
	 * You don't have to provide any constructors for your class, but you must be careful when doing this. 
	 * The compiler automatically provides a no-argument, default constructor for any class without constructors. 
	 * This default constructor will call the no-argument constructor of the superclass. 
	 * In this situation, the compiler will complain if the superclass doesn't have a no-argument constructor,
	 * so you must verify that it does. 
	 * 
	 * If your class has no explicit superclass, then it has an implicit superclass of Object, 
	 * which does have a no-argument constructor. 
	 */
	
	public Bicycle(int startCadence, int startSpeed, int startGear) {
		gear = startGear;
		cadence = startCadence;
		speed = startSpeed;
	}

	// a no-argument constructor
	public Bicycle() {
	    gear = 1;
	    cadence = 10;
	    speed = 0;
	}
	
	/*
	 * Bicycle yourBike = new Bicycle(); 
	 * invokes the no-argument constructor to create a new Bicycle object called yourBike.
	 */
	
	
	// the Bicycle class has 4+3 methods
	
	public int getCadence() {
        return cadence;
    }
	public void setCadence(int newValue) {
		cadence = newValue;
	}
	
	public int getGear() {
        return gear;
    }
	public void setGear(int newValue) {
		gear = newValue;
	}

	public int getSpeed() {
        return speed;
    }
	
	public void applyBrake(int decrement) {
		speed -= decrement;
	}

	public void speedUp(int increment) {
		speed += increment;
	}
}
