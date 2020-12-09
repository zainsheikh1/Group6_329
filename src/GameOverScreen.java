import java.util.ArrayList;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;



public class GameOverScreen{
	
	

	
	private BorderPane layoutManager;
	private int score;
	




	public void startGameOver(Stage primaryStage, int score, JeopardyFrontend jeopardySession) throws Exception {
		this.score = score;
		this.layoutManager = new BorderPane();
		this.layoutManager.setStyle(JeopardyFrontend.gameBackground);
		

		
		Label scoreHeaderLabel = new Label("Congratulations!\nYour Score is:");
		scoreHeaderLabel.setFont(new Font(50));
		scoreHeaderLabel.setTextAlignment(TextAlignment.CENTER);
		
		this.layoutManager.setTop(scoreHeaderLabel);
		
		Label scoreLabel = new Label(""+score);
		scoreLabel.setFont(new Font(80));
		scoreLabel.setTextAlignment(TextAlignment.CENTER);
		scoreLabel.setAlignment(Pos.CENTER);
		this.layoutManager.setCenter(scoreLabel);
		
		
		GridPane buttonPane = new GridPane();
		
		Button exitButton = new Button("Exit");
		Button restartButton = new Button("Restart");
		buttonPane.setPrefWidth(500);
		exitButton.setPrefWidth(500);
		restartButton.setPrefWidth(500);
		exitButton.setTextFill(Color.YELLOW);
		restartButton.setTextFill(Color.YELLOW);
		exitButton.setStyle(JeopardyFrontend.buttonBackground);
		restartButton.setStyle(JeopardyFrontend.buttonBackground);
		
		exitButton.setOnAction(new EventHandler() {

			@Override
			public void handle(Event arg0) {
				System.exit(0);
				
			}
			
		});
		restartButton.setOnAction(new EventHandler() {
			@Override
			public void handle(Event event) {
				// TODO Auto-generated method stub
				jeopardySession.restartGame();
				primaryStage.hide();
			}
		});
		
		buttonPane.add(restartButton, 0, 0);
		buttonPane.add(exitButton, 0, 1);
		
		this.layoutManager.setBottom(buttonPane);
		
		
		Scene currentScene = new Scene(this.layoutManager);	
		primaryStage.setScene(currentScene);
		primaryStage.showAndWait();

			

		
	}
	
		
		
		
		
		
		
		
		

	
	
	
	
	
	
}