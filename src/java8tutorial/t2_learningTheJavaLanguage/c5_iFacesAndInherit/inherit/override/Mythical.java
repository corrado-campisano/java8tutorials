package java8tutorial.t2_learningTheJavaLanguage.c5_iFacesAndInherit.inherit.override;

public interface Mythical {
	default public String identifyMyself() {
        return "I am a mythical creature.";
    }
}
