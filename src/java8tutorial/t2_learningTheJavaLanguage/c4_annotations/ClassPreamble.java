package java8tutorial.t2_learningTheJavaLanguage.c4_annotations;

// To make the information in @ClassPreamble appear in Javadoc-generated documentation, 
// you must annotate the @ClassPreamble definition with the @Documented annotation

//import this to use @Documented
import java.lang.annotation.*;

@Documented
public @interface ClassPreamble {

	String author();

	String date();

	int currentRevision() default 1;

	String lastModified() default "N/A";

	String lastModifiedBy() default "N/A";

	// Note use of array
	String[] reviewers();

}
