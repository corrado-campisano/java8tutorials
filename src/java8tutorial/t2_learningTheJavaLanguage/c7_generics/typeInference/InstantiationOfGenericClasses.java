package java8tutorial.t2_learningTheJavaLanguage.c7_generics.typeInference;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InstantiationOfGenericClasses {

	void sampleMethod() {
		
		Map<String, List<String>> myMapVerbose = new HashMap<String, List<String>>();
		
		Map<String, List<String>> myMapShort = new HashMap<>();
		
		Map<String, List<String>> myMapBad = new HashMap(); // unchecked conversion warning
	}
}
