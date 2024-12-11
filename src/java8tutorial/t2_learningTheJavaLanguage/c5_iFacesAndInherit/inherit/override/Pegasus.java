package java8tutorial.t2_learningTheJavaLanguage.c5_iFacesAndInherit.inherit.override;

public class Pegasus extends Horse implements Flyer, Mythical {
    public static void main(String... args) {
        Pegasus myApp = new Pegasus();
        
        // Instance methods are preferred over interface default methods
        
        // uses the horse method
        System.out.println(myApp.identifyMyself());
        
        // still uses the horse method
        Flyer flyer = (Flyer) myApp;
        System.out.println(flyer.identifyMyself());
    }
}
