import java.net.URL; 
import java.util.*;

import javafx.animation.RotateTransition;
import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.Reflection;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.*;
import javafx.util.Duration;

import com.Music.*;
import com.Images.*;

public class JeopardyFrontend extends Application{
	
	//Stages + scenes
	Stage window;
	
	//game 
	String gameBackground = "-fx-background-color: rgba(100, 125, 255, 0.5);";
	String buttonBackground = "-fx-background-color: #050be7";
	QuestionFrontend question = new QuestionFrontend();
	Button[] buttonList = new Button[25];
	
	//music
	int cycleCount = 1000;
	URL url = this.getClass().getClassLoader().getResource("com/Music/bensound-energy.mp3");
	Media music = new Media(url.toExternalForm());
	MediaPlayer mPlayer = new MediaPlayer(music);
	
	//image + effects
	Image title = new Image("com/Images/jeopardy.png");
	Reflection ref = new Reflection();
	
	/*
	 * Setting content of the Jeopardy game
	 */
	private Parent setContent() {
		GridPane root = new GridPane();
		root.setPrefSize(500,500);
		
		int[] cellValues = {100,200,300,400,500};
		String[] cellLabels = {"I Hear You're Good at Math","Cybercriminal Methods","Linux & Mocha","Blockchain","History and Rules"};
 		for (int i=0; i<5; i++) {
			for (int j = 0; j<5;j++) {
				questionBox questionBox = new questionBox(cellValues[j],cellLabels[i]);
				questionBox.setTranslateX(i*100);
				questionBox.setTranslateY(j*100);
				
				root.getChildren().add(questionBox);
			}
		}

		return root;
	}
	
	/*
	 * Setting the start screen's content
	 */
	private Parent setStart() {
		GridPane startPane = new GridPane();
		startPane.setPrefSize(500, 500);
		
		BackgroundFill backgroundFill = new BackgroundFill(Color.CORNFLOWERBLUE,
				CornerRadii.EMPTY, Insets.EMPTY);
		Background background = new Background(backgroundFill);
		startPane.setBackground(background);
		
		ImageView titleView = new ImageView(title);
		titleView.setFitHeight(400);
		titleView.setFitWidth(400);
		startPane.add(titleView, 1, 0);
		
		RotateTransition rotate = new RotateTransition();
		rotate.setNode(titleView);
		rotate.setDuration(Duration.millis(500));
		rotate.setByAngle(15);
		rotate.setCycleCount(cycleCount);
		rotate.setAutoReverse(true);
		rotate.play();
		
		Button playButton = new Button("Play");
		playButton.setPrefSize(50, 50);
		playButton.setTranslateX(150);
		playButton.setTranslateY(200);
		playButton.setStyle("-fx-font: 10 tahoma; -fx-base: #b6e7c9;");
		playButton.setEffect(ref);
		
		playButton.setOnAction ((event) -> { //changes scene

		});
				
		Button miniGameBtn = new Button("Mini-" + "\ngame");
		miniGameBtn.setPrefSize(50, 50);
		miniGameBtn.setTranslateX(300);
		miniGameBtn.setTranslateY(200);
		miniGameBtn.setStyle("-fx-font: 10 tahoma; -fx-base: #b6e7c9;");
		miniGameBtn.setEffect(ref);
		
		startPane.getChildren().addAll(playButton, miniGameBtn);
		
		return startPane;
	}
	
	/*
	 * Displays application
	 */
	@Override
	public void start(Stage primaryStage) throws Exception{
		//plays music
		mPlayer.setAutoPlay(true);
		mPlayer.setCycleCount(cycleCount);
		
		//runs scenes
		//this portion will the game
//		window = primaryStage;
//		window.setTitle("Jeopardy Game");
//		window.setScene(new Scene(setContent()));
//		window.show();

		//this portion will run the start screen
		window = primaryStage;
		window.setScene(new Scene(setStart()));
		window.show();
	}
	
	
	/*
	 * Sets up a question box 
	 */
	private class questionBox extends GridPane {
		private Text text = new Text(); //by default, application has empty text
		
		public questionBox(int itemValue,String category) {
			Button button = new Button();
			
			button.setMaxSize(50, 50);	
			button.setText(category+"\n$" + itemValue);
			button.setTextFill(Color.YELLOW);
			button.setStyle(buttonBackground);
			button.setTranslateX(25);
			
			Rectangle border = new Rectangle(100,100);
			border.setFill(Color.CORNFLOWERBLUE); 
			border.setStroke(Color.BLACK);
			
			setAlignment(Pos.CENTER);
			getChildren().addAll(border, button);
			
			button.setOnAction((event) -> {
				System.out.println("Button clicked");
				try {
					question.launchNewQuestion(itemValue,"Module00");//Will need to change arguments for specific categories and point scores
					question.startQuestion(new Stage());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});

			
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	
}