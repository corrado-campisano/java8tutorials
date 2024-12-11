package java8tutorial.t2_learningTheJavaLanguage.c3_classesAndObjects.moreOnClasses;

public class BicycleWithStaticFields {

	// instance variables, not used in this sample
	private int cadence;
	private int gear;
	private int speed;

	/*
	 * The static modifier, in combination with the final modifier, is also used to
	 * define constants. The final modifier indicates that the value of this field
	 * cannot change.
	 */
	static final double PI = 3.141592653589793;

	// add an instance variable for the object ID
	private int id;

	// add a class variable for the
	// number of Bicycle objects instantiated
	private static int numberOfBicycles = 0;

	public static int getNumberOfBicycles() {
		return BicycleWithStaticFields.numberOfBicycles;
	}

	public BicycleWithStaticFields(int startCadence, int startSpeed, int startGear) {
		gear = startGear;
		cadence = startCadence;
		speed = startSpeed;

		// increment number of Bicycles
		// and assign ID number
		id = ++BicycleWithStaticFields.numberOfBicycles;
	}

	// new method to return the ID instance variable
	public int getID() {
		return id;
	}
}
