package java8tutorial.t2_learningTheJavaLanguage.c5_iFacesAndInherit.iFaces.defaultMethods;

public class TestSimpleTimeClient {
	
	public static void main(String... args) {
		
		TimeClient myTimeClient = new SimpleTimeClient();
		
		System.out.println("Current local time: " + myTimeClient.toString());
		System.out.println("Time in California (ko): " + myTimeClient.getZonedDateTime("Blah blah").toString());
		System.out.println("Time in California (ok): " + myTimeClient.getZonedDateTime("America/Los_Angeles").toString());
	}
}
