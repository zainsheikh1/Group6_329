import java.util.ArrayList;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;



public class MiniGameScreen{
	
	

	
	private BorderPane layoutManager;

	
	private Label cypherOut = new Label("");



	public void startMiniGame(Stage primaryStage) throws Exception {
		
		this.layoutManager = new BorderPane();
		this.layoutManager.setStyle(JeopardyFrontend.gameBackground);
		this.layoutManager.setPrefHeight(300);
		this.layoutManager.prefWidth(700);
		
		primaryStage.setMaxWidth(700);
		
		
		GridPane topPane = new GridPane();
		
		Label welcomeMessage = new Label("Welcome to the cyphertext hacker game!");
		Label generalInstruct = new Label("<General Instructions>");
		Label level1Instruct = new Label("<Level 1 Instructions>");
		Label level2Instruct = new Label("<Level 2 Instructions>");
		Label level3Instruct = new Label("<Label 3 Instructions>");
		
		topPane.add(welcomeMessage, 0,0);
		topPane.add(generalInstruct,0,1);
		topPane.add(level1Instruct,0,2);
		topPane.add(level2Instruct,0,3);
		topPane.add(level3Instruct,0,4);
		
		
		
		this.layoutManager.setTop(topPane);
		
		
		GridPane leftPane = new GridPane();
		
		Label leftLabel = new Label("Plaintext 1");
		TextField leftField = new TextField();
		leftPane.add(leftLabel,0,0);
		leftPane.add(leftField,0,1);
		
		leftPane.setAlignment(Pos.CENTER);
		
		this.layoutManager.setLeft(leftPane);
		
		
		GridPane rightPane = new GridPane();
		
		Label rightLabel = new Label("Plaintext 1");
		TextField rightField = new TextField();
		rightPane.add(rightLabel,0,0);
		rightPane.add(rightField,0,1);
		
		rightPane.setAlignment(Pos.CENTER);
		
		this.layoutManager.setRight(rightPane);
		
		
		
		GridPane centerPane = new GridPane();
		
		Button convertButton = new Button("CONVERT");
		convertButton.setStyle(JeopardyFrontend.buttonBackground);
		convertButton.setTextFill(Color.YELLOW);
		convertButton.setPrefWidth(1000000);
		convertButton.setOnAction(new EventHandler() {

			@Override
			public void handle(Event arg0) {
				convertButtonAction();
				
			}
			
		});
		
		
		displayCypherText("");
		Label questionLabel = new Label("Which plain-text was used to make the cypher text?");
		
		
		this.layoutManager.setCenter(centerPane);
		centerPane.add(convertButton, 1, 0);
		centerPane.add(cypherOut,1,1);
		centerPane.add(questionLabel,1,2);
		
		centerPane.setAlignment(Pos.CENTER);
		cypherOut.setAlignment(Pos.CENTER);
		
		this.layoutManager.setCenter(centerPane);
		
		
		GridPane bottomPane = new GridPane();
		
		Button oneButton = new Button("Plaintext 1");
		oneButton.setStyle(JeopardyFrontend.buttonBackground);
		oneButton.setTextFill(Color.YELLOW);
		oneButton.setOnAction(new EventHandler() {

			@Override
			public void handle(Event event) {
				oneButtonAction();
				
			}
			
		});
		
		
		Button twoButton = new Button("Plaintext 2");
		twoButton.setStyle(JeopardyFrontend.buttonBackground);
		twoButton.setTextFill(Color.YELLOW);
		twoButton.setOnAction(new EventHandler() {

			@Override
			public void handle(Event event) {
				twoButtonAction();
				
			}
			
		});
		
		
		
		oneButton.setPrefWidth(100);
		twoButton.setPrefWidth(100);
		oneButton.setPrefHeight(100);
		twoButton.setPrefHeight(100);
		
		
		bottomPane.setAlignment(Pos.CENTER);
		
		bottomPane.add(oneButton,0,0);
		bottomPane.add(twoButton,1,0);
		
		this.layoutManager.setBottom(bottomPane);
		
		
		
		
		Scene currentScene = new Scene(this.layoutManager);	
		primaryStage.setScene(currentScene);
		primaryStage.showAndWait();

			

		
	}
	
	
	
	public void convertButtonAction() {
		//Implementation of convert button here
		System.out.println("CONVERT");
	}
		
	public void oneButtonAction() {
		//Implementation of oneButton action here
		System.out.println("ONEBUTTON");
	}
	public void twoButtonAction() {
		//Implementation of twoButton action here
		System.out.println("TWOBUTTON");
	}	
	
	public void displayCypherText(String valueToDisplay) {
		cypherOut.setText("Produced Cypher Text = "+valueToDisplay);
	}
		
		
		
		
		
		

	
	
	
	
	
	
}