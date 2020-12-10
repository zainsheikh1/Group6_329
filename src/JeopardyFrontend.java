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
import javafx.scene.control.TextField;
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
	static String gameBackground = "-fx-background-color: rgba(100, 125, 255, 0.5);";
	static String buttonBackground = "-fx-background-color: #050be7";
	QuestionFrontend question = new QuestionFrontend();
	ArrayList<Button> buttonList = new ArrayList<Button>();
	
	//music
	int cycleCount = 1000;
	URL url = this.getClass().getClassLoader().getResource("com/Music/bensound-energy.mp3");
	Media music = new Media(url.toExternalForm());
	MediaPlayer mPlayer = new MediaPlayer(music);
	
	//image + effects
	Image title = new Image("com/Images/jeopardyTitleScreen.png");
	Reflection ref = new Reflection();
	Image headerTitle = new Image("com/Images/jeopardyHeader.png");
	
	static Label scoreLabel = new Label("");
	
	private int score = 0;
	
	private boolean allAnswered = false;
	
	/*
	 * Setting content of the Jeopardy game
	 */
	private Parent setContent() {
		GridPane root = new GridPane();
		root.setPrefSize(500,600);
		
		//Create Header
		GridPane headerPane = new GridPane();
		
		Rectangle headerColour = new Rectangle(425,100);
		headerColour.setFill(Color.CORNFLOWERBLUE);
		headerPane.add(headerColour,0,0); 
		
		headerColour = new Rectangle(75,100);
		headerColour.setFill(Color.CORNFLOWERBLUE);
		headerPane.add(headerColour,1,0); 
		
		//headerPane.setTranslateX(200);
		
		root.add(headerPane,0,0);
		
		ImageView titleView = new ImageView(headerTitle);
		titleView.setFitHeight(100/2);
		titleView.setFitWidth(385/2);
		headerPane.add(titleView,0,0);
		
		headerPane.add(scoreLabel,1,0);
		
		
		
		//Create Buttons
		int[] cellValues = {100,200,300,400,500};
		String[] cellLabels = {"I Hear You're Good at Math","Cybercriminal Methods","Linux & Mocha","Blockchain","History and Rules"};
 		for (int i=0; i<5; i++) {
			for (int j = 0; j<5;j++) {
				questionBox questionBox = new questionBox(cellValues[j],cellLabels[i]);
				questionBox.setTranslateX((i*100)-500);
				questionBox.setTranslateY((j*100));
				
				root.add(questionBox,1,1);
			}
		}

		return root;
	}
	
	public void addScore(int newScore) {
		score+=newScore;
		scoreLabel.setText("Score:\n"+(score));
		System.out.println("HELLO");
	}
	
	/*
	 * Setting the start screen's content
	 */
	private Parent setStart() {
		GridPane startPane = new GridPane();
		startPane.setPrefSize(500, 600);
		
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
			window.setScene(new Scene(setContent()));
		});
				
		Button miniGameBtn = new Button("Mini-" + "\ngame");
		miniGameBtn.setPrefSize(50, 50);
		miniGameBtn.setTranslateX(300);
		miniGameBtn.setTranslateY(200);
		miniGameBtn.setStyle("-fx-font: 10 tahoma; -fx-base: #b6e7c9;");
		miniGameBtn.setEffect(ref);
		
		miniGameBtn.setOnAction((event) -> {
			window.setScene(new Scene(setMini()));
		});
		
		startPane.getChildren().addAll(playButton, miniGameBtn);
		

		
		return startPane;
	}
	
	private Parent setMini() {
		GridPane miniPane = new GridPane();
		miniPane.setPrefSize(500, 600);
		
		Image title = new Image("com/Images/ad.png");  //put working
		ImageView titleView = new ImageView(title);
		titleView.setFitHeight(400);
		titleView.setFitWidth(400);
		miniPane.add(titleView, 0,0);
		
		
		
		TextField userTextField = new TextField();
		miniPane.add(userTextField, 1, 1);
		
		return miniPane;
	}
	
	/*
	 * Displays application
	 */
	@Override
	public void start(Stage primaryStage) throws Exception{
		//plays music
		//mPlayer.setAutoPlay(true);
		mPlayer.setCycleCount(cycleCount);
		
		addScore(0);
		
		primaryStage.setMaxWidth(500);
		//runs scenes
		//this portion will the game
//		window = primaryStage;
//		window.setTitle("Jeopardy Game");
//		window.setScene(new Scene(setContent()));
//		window.show();

		//this portion will run the start screen
		window = primaryStage;
		Scene GUIScene = new Scene(setStart());
		window.setScene(GUIScene);
		primaryStage.show();
	}
	
	private void checkScore() throws Exception {
		allAnswered = true;
		for(Button currentButton: buttonList) {
			if(!currentButton.isDisabled()) {
				allAnswered=false;
			}
		}
		if(allAnswered) {
		GameOverScreen endScreen = new GameOverScreen();
		endScreen.startGameOver(new Stage(),score,this);
		}
		}
	
	
	/*
	 * Sets up a question box 
	 */
	private class questionBox extends GridPane {
		private Text text = new Text(); //by default, application has empty text
		
		public questionBox(int itemValue,String category) {
			Button button = new Button();
			
			button.setMaxSize(90, 90);	
			button.setText(category+"\n$" + itemValue);
			button.wrapTextProperty().setValue(true);
			button.setTextFill(Color.YELLOW);
			button.setStyle(buttonBackground);
			button.setTranslateX(5);
			
			Rectangle border = new Rectangle(100,100);
			border.setFill(Color.CORNFLOWERBLUE); 
			border.setStroke(Color.BLACK);
			
			setAlignment(Pos.CENTER);
			getChildren().addAll(border, button);
			buttonList.add(button);
			button.setOnAction((event) -> {
				System.out.println("Button clicked");
				try {
					question.launchNewQuestion(itemValue,"Module00");//Will need to change arguments for specific categories and point scores
					addScore(question.startQuestion(new Stage()));
					
					button.setDisable(true);
					checkScore();
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
	
	public void restartGame() {
		for(Button currentButton :buttonList) {
			currentButton.setDisable(false);
		}
		addScore(-1*score);
	}
	
	
}