package java8tutorial.t2_learningTheJavaLanguage.c3_classesAndObjects.nestedClasses;


/*
Terminology: Nested classes are divided into two categories: non-static and static.

 - Non-static nested classes are called inner classes.
 - Nested classes that are declared static are called static nested classes.

There are two special kinds of inner classes: local classes and anonymous classes.
 */
public class OuterClass {
	
	String outerField = "Outer field";
    static String staticOuterField = "Static outer field";

    class InnerClass {
        void accessMembers() {
            System.out.println(outerField);
            System.out.println(staticOuterField);
        }
    }

    static class StaticNestedClass {
    	
    	/*
    	 Note that a static nested class interacts with the instance members of its outer class 
    	 just like any other top-level class. 
    	 
    	 The static nested class StaticNestedClass can't directly access outerField,
    	 because it's an instance variable of the enclosing class, OuterClass. 
    	 */
        void accessMembers(OuterClass outer) {
        	
            // Compiler error: 
        	// Cannot make a static reference to the non-static field:
            // outerField
        	
            // System.out.println(outerField);
        	
            System.out.println(outer.outerField);
            System.out.println(staticOuterField);
        }
    }

    public static void main(String[] args) {
    	
        System.out.println("Inner class:");
        System.out.println("------------");
        OuterClass outerObject = new OuterClass();
        OuterClass.InnerClass innerObject = outerObject.new InnerClass();
        innerObject.accessMembers();

        System.out.println("\nStatic nested class:");
        System.out.println("--------------------");
        StaticNestedClass staticNestedObject = new StaticNestedClass();        
        staticNestedObject.accessMembers(outerObject);
        
        System.out.println("\nTop-level class:");
        System.out.println("--------------------");
        TopLevelClass topLevelObject = new TopLevelClass();        
        topLevelObject.accessMembers(outerObject);                
    }
}
