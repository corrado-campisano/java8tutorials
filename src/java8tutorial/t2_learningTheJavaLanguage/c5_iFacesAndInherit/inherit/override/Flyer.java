package java8tutorial.t2_learningTheJavaLanguage.c5_iFacesAndInherit.inherit.override;

public interface Flyer {
	default public String identifyMyself() {
        return "I am able to fly.";
    }
}
