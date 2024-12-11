package java8tutorial.t2_learningTheJavaLanguage.c1_oopConcepts;

interface BicycleIf {

    //  wheel revolutions per minute
    void changeCadence(int newValue);

    void changeGear(int newValue);

    void speedUp(int increment);

    void applyBrakes(int decrement);
}