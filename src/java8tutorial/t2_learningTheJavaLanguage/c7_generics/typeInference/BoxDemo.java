package java8tutorial.t2_learningTheJavaLanguage.c7_generics.typeInference;

public class BoxDemo {

	  public static <U> void addBox(U u, java.util.List<Box<U>> boxes) {
	    Box<U> box = new Box<>();
	    box.set(u);
	    boxes.add(box);
	  }

	  public static <U> void outputBoxes(java.util.List<Box<U>> boxes) {
	    int counter = 0;
	    for (Box<U> box: boxes) {
	      U boxContents = box.get();
	      System.out.println("Box #" + counter + " contains [" +
	             boxContents.toString() + "]");
	      counter++;
	    }
	  }

	  public static void main(String[] args) {
		  
	    java.util.ArrayList<Box<Integer>> listOfIntegerBoxes = new java.util.ArrayList<>();
	    
	    // The generic method addBox defines one type parameter named U. Generally, 
	    // a Java compiler can infer the type parameters of a generic method call. 
	    // Consequently, in most cases, you do not have to specify them. 
	    
	    // For example, to invoke the generic method addBox, 
	    // you can specify the type parameter with a type witness as follows:
	    BoxDemo.<Integer>addBox(Integer.valueOf(10), listOfIntegerBoxes);
	    
	    // Alternatively, if you omit the type witness,a Java compiler automatically infers 
	    // (from the method's arguments) that the type parameter is Integer:
	    BoxDemo.addBox(Integer.valueOf(20), listOfIntegerBoxes);
	    BoxDemo.addBox(Integer.valueOf(30), listOfIntegerBoxes);
	    
	    BoxDemo.outputBoxes(listOfIntegerBoxes);
	  }
	}
