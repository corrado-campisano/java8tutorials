package java8tutorial.t2_learningTheJavaLanguage.c5_iFacesAndInherit.iFaces.basics;

public interface Relatable {
    
    // this (object calling isLargerThan)
    // and other must be instances of 
    // the same class returns 1, 0, -1 
    // if this is greater than, 
    // equal to, or less than other
    public int isLargerThan(Relatable other);
}
