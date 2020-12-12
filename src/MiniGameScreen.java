import java.util.ArrayList;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;



public class MiniGameScreen{
	
	Backend b = new Backend();
	int correct = 0;

	
	private BorderPane layoutManager;

	
	private Label cypherOut = new Label("");
	private Label answerOut = new Label("");



	public void startMiniGame(Stage primaryStage) throws Exception {
		
		this.layoutManager = new BorderPane();
		this.layoutManager.setStyle(JeopardyFrontend.gameBackground);
		this.layoutManager.setPrefHeight(300);
		this.layoutManager.prefWidth(700);
		
		primaryStage.setMaxWidth(700);
		
		
		GridPane topPane = new GridPane();
		
		Label welcomeMessage = new Label("Welcome to the cyphertext hacker game!");
		Label generalInstruct = new Label("Enter a 4-digit plaintext in each of the plaintext fields.");
		Label l1 = new Label("Our best security experts will encrypt ONE of the plaintexts at random.");
		Label l2 = new Label("The cypher text will be produced such that a randomly generated key will be bit-added to the chosen plaintext.");
		Label l3 = new Label("The key will be a 4-digit number such that the first and third digits are the same and the second and fourth digits are the same.");
		Label l4 = new Label("The first digit of the key will be added to the first digit of the plaintext, the second digits will be added together and so on.");
		Label l5 = new Label("The addition will not be carried and so the digits will loop from 9, back to 0 (5+6 = 0 /=/ 11).");
		Label l6 = new Label("You will play the role of the attacker. ");
		Label l62 = new Label("With these hints, and the produced cyphertext, you must decide which plaintext was chosen for encryption.");
		Label l7 = new Label("Coming up with a perfect solution for figuring out which plaintext was encrypted every time will grant you the rank of MASTER HACKER!"); 
		Label l8 = new Label("Good Luck!");
		Label l9 = new Label("");
		
		l7.setWrapText(true);
		l8.setFont(Font.font("Verdana",15));
		welcomeMessage.setFont(Font.font("Verdana",20));
		
		topPane.add(welcomeMessage, 0,0);
		topPane.add(generalInstruct,0,1);
		topPane.add(l1,0,2);
		topPane.add(l2,0,3);
		topPane.add(l3,0,4);
		topPane.add(l4,0,5);
		topPane.add(l5,0,6);
		topPane.add(l6,0,7);
		topPane.add(l62, 0, 8);
		topPane.add(l7,0,9);
		topPane.add(l8,0,10);
		topPane.add(l9, 0, 11);
		
		
		cypherOut.setFont(Font.font("Verdana",20));
		
		topPane.setHalignment(welcomeMessage, HPos.CENTER);
		topPane.setHalignment(l8, HPos.CENTER);
		
		this.layoutManager.setTop(topPane);
		
		
		GridPane leftPane = new GridPane();
		
		Label leftLabel = new Label("Plaintext 1");
		TextField leftField = new TextField();
		
		leftPane.add(leftLabel,0,0);
		leftPane.add(leftField,0,1);
		
		leftPane.setAlignment(Pos.CENTER);
		
		this.layoutManager.setLeft(leftPane);
		
		
		GridPane rightPane = new GridPane();
		
		Label rightLabel = new Label("Plaintext 2");
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
				answerOut.setText("");//resets text to of "Your are correct/incorrect" to blank everytime button is clicked
				convertButtonAction();
				String pt1 = leftField.getText();
				String pt2 = rightField.getText();
				
				int rand = b.random(1,2);
				String selectedPT = "";
				if(rand==1) {
					selectedPT = pt1;
					correct = 1;
				}else {
					selectedPT = pt2;
					correct  = 2;
				}
				
				String cypherText = b.getCypherText(selectedPT);
				displayCypherText(cypherText);
				
				System.out.println(cypherText);
				
			}
			
		});
		
		
		displayCypherText("");
		
		
		this.layoutManager.setCenter(centerPane);
		centerPane.add(convertButton, 1, 0);
		centerPane.add(cypherOut,1,1);
		centerPane.add(answerOut, 1, 2);
		
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
				if(correct==1) {
					System.out.println("Correct");
					displayAnswer("Correct");
				}else {
					System.out.println("Wrong");
					displayAnswer("Incorrect");
				}
			}
			
		});
		
		
		Button twoButton = new Button("Plaintext 2");
		twoButton.setStyle(JeopardyFrontend.buttonBackground);
		twoButton.setTextFill(Color.YELLOW);
		twoButton.setOnAction(new EventHandler() {

			@Override
			public void handle(Event event) {
				twoButtonAction();
				if(correct==2) {
					System.out.println("Correct");
					displayAnswer("Correct");
				}else {
					System.out.println("Wrong");
					displayAnswer("Incorrect");
				}
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
	
	public void displayAnswer(String valueToDisplay) {
		answerOut.setText("You are "+valueToDisplay);
	}
		
		

	
	
}
