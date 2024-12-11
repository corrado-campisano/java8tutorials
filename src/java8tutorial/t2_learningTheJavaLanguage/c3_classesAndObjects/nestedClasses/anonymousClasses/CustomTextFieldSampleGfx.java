package java8tutorial.t2_learningTheJavaLanguage.c3_classesAndObjects.nestedClasses.anonymousClasses;
//package java8tutorial.learningTheJavaLanguage.classesAndObjects.nestedClasses.anonymousClasses;
//
//
///*
//still JFX not working: 
//Errore: impossibile trovare o caricare la classe principale 
//	java8tutorial.learningTheJavaLanguage.classesAndObjects.nestedClasses.anonymousClasses.CustomTextFieldSampleGfx
//Causato da: java.lang.NoClassDefFoundError: javafx/application/Application
// */
//import javafx.application.Application;
//import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
//import javafx.geometry.Insets;
//import javafx.scene.Group;
//import javafx.scene.Scene;
//import javafx.scene.control.*;
//import javafx.scene.layout.GridPane;
//import javafx.stage.Stage;
//
//
///*
//Anonymous classes are ideal for implementing an interface that contains two or more methods. 
//
//The following JavaFX example is from the section Customization of UI Controls. 
//
//The code "final TextField sum = new TextField() {...};" creates a text field that only accepts numeric values. 
//
//It redefines the default implementation of the TextField class with an anonymous class by overriding 
//the replaceText and replaceSelection methods inherited from the TextInputControl class.
// */
//public class CustomTextFieldSampleGfx extends Application {
//    
//    final static Label label = new Label();
// 
//    @Override
//    public void start(Stage stage) {
//        Group root = new Group();
//        Scene scene = new Scene(root, 300, 150);
//        stage.setScene(scene);
//        stage.setTitle("Text Field Sample");
// 
//        GridPane grid = new GridPane();
//        grid.setPadding(new Insets(10, 10, 10, 10));
//        grid.setVgap(5);
//        grid.setHgap(5);
// 
//        scene.setRoot(grid);
//        final Label dollar = new Label("$");
//        GridPane.setConstraints(dollar, 0, 0);
//        grid.getChildren().add(dollar);
//        
//        final TextField sum = new TextField() {
//        	
//        	/*
//        	It redefines the default implementation of the TextField class with an anonymous class 
//        	by overriding the replaceText method inherited from the TextInputControl class.
//        	 */
//            @Override
//            public void replaceText(int start, int end, String text) {
//                if (!text.matches("[a-z, A-Z]")) {
//                    super.replaceText(start, end, text);                     
//                }
//                label.setText("Enter a numeric value");
//            }
//            
//            /*
//        	It redefines the default implementation of the TextField class with an anonymous class 
//        	by overriding the replaceSelection method inherited from the TextInputControl class.
//        	 */
//            @Override
//            public void replaceSelection(String text) {
//                if (!text.matches("[a-z, A-Z]")) {
//                    super.replaceSelection(text);
//                }
//            }
//        };
// 
//        sum.setPromptText("Enter the total");
//        sum.setPrefColumnCount(10);
//        GridPane.setConstraints(sum, 1, 0);
//        grid.getChildren().add(sum);
//        
//        Button submit = new Button("Submit");
//        GridPane.setConstraints(submit, 2, 0);
//        grid.getChildren().add(submit);
//        
//        submit.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent e) {
//                label.setText(null);
//            }
//        });
//        
//        GridPane.setConstraints(label, 0, 1);
//        GridPane.setColumnSpan(label, 3);
//        grid.getChildren().add(label);
//        
//        scene.setRoot(grid);
//        stage.show();
//    }
// 
//    public static void main(String[] args) {
//        launch(args);
//    }
//}
