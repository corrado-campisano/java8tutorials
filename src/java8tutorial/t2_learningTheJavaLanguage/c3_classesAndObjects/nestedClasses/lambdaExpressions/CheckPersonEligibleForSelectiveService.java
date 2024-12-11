package java8tutorial.t2_learningTheJavaLanguage.c3_classesAndObjects.nestedClasses.lambdaExpressions;

import java8tutorial.t2_learningTheJavaLanguage.c3_classesAndObjects.nestedClasses.lambdaExpressions.RosterTest.CheckPerson;

public class CheckPersonEligibleForSelectiveService implements CheckPerson {
	
    public boolean test(Person p) {
        return p.gender == Person.Sex.FEMALE &&
            p.getAge() >= 18 &&
            p.getAge() <= 25;
    }
}
