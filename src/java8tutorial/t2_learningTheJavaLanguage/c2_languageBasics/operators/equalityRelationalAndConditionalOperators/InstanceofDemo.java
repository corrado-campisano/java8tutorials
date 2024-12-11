package java8tutorial.t2_learningTheJavaLanguage.c2_languageBasics.operators.equalityRelationalAndConditionalOperators;

class InstanceofDemo {
	
    public static void main(String[] args) {

        Parent parent = new Parent();
        Parent child = new Child();

        // When using the instanceof operator, keep in mind that null is not an instance of anything
        
        System.out.println("\nparent instanceof Parent: " + (parent instanceof Parent));
        
        System.out.println("parent instanceof Child: " + (parent instanceof Child));
        
        System.out.println("parent instanceof MyInterface: " + (parent instanceof MyInterface));
        
        System.out.println("\nchild instanceof Parent: " + (child instanceof Parent));
        
        System.out.println("child instanceof Child: " + (child instanceof Child));
        
        System.out.println("child instanceof MyInterface: " + (child instanceof MyInterface));
        
        // method not visible, editor time error
        //child.doSomething();
        
        if (parent instanceof MyInterface) {
	        // throws java.lang.ClassCastException at compile time, ok in editor
	        Child parent2 = (Child) parent;
	        // cannot be used, since cannot cast parent into child
	        parent2.doSomething();
        } else {
        	System.out.println("\ncasting error(, etc) avoided...");
        }
        
        if (child instanceof MyInterface) {
        	// cast actual Child (implements the required methods) declared as Parent
        	Child child2 = (Child) child;
        
	        System.out.println("\nchild2 instanceof Parent: " + (child2 instanceof Parent));
	        
	        System.out.println("child2 instanceof Child: " + (child2 instanceof Child));
	        
	        System.out.println("child2 instanceof MyInterface: " + (child2 instanceof MyInterface));
	        
	        child2.doSomething();
        }
    }
}

class Parent {}
class Child extends Parent implements MyInterface {

	public void doSomething() {	}
}

interface MyInterface {
	public void doSomething();
}