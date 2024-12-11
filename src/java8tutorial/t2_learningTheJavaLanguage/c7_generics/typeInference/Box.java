package java8tutorial.t2_learningTheJavaLanguage.c7_generics.typeInference;

public class Box<T> {
	 
    private T t; // T stands for "Type"          
 
    public void set(T t) {
        this.t = t;
    }
 
    public T get() {
        return t;
    }
}