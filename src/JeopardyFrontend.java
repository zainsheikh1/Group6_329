import java.util.*; 
import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.*;

public class JeopardyFrontend extends Application{
	
	String gameBackground = "-fx-background-color: rgba(100, 125, 255, 0.5);";
	String buttonBackground = "-fx-background-color: #050be7";
	QuestionFrontend question = new QuestionFrontend();

	/*
	 * Setting content of the game
	 */
	private Parent setContent() {
		GridPane root = new GridPane();
		root.setPrefSize(500, 500);
		
		for (int i=0; i<5; i++) {
			for (int j = 0; j<5;j++) {
				questionBox questionBox = new questionBox();
				questionBox.setTranslateX(j*100);
				questionBox.setTranslateY(i*100);
				
				root.getChildren().add(questionBox);
			}
		}

		return root;
	}
	
	/*
	 * Displays application
	 */
	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Jeoprady Game");
		primaryStage.setScene(new Scene(setContent()));
		primaryStage.show();
		
	}
	
	/*
	 * Sets up a question box 
	 */
	private class questionBox extends GridPane {
		private Text text = new Text(); //by default, application has empty text
		
		public questionBox() {
			Button button = new Button();
			button.setMaxSize(50, 50);			
			
			Rectangle border = new Rectangle(100,100);
			border.setFill(null); //makes transparent
			border.setStroke(Color.BLACK);
			
			setAlignment(Pos.CENTER);
			getChildren().addAll(border, button);
			
			button.setOnAction((event) -> {
				System.out.println("Button clicked");
//				question.displayNewQuestion();
			});

			
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	
}
