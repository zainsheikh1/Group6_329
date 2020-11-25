import java.util.ArrayList;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;



public class QuestionFrontend {
	
	
	private MultipleChoiceButton answerButtons[];
	private Question currentQuestion;
	
	private static int value;
	private static String category;
	
	private static boolean userAnswered;
	private static boolean userCorrect;
	
	private GridPane layoutManager;
	
	public static void main(String[] args) {
		QuestionFrontend test = new QuestionFrontend();
		test.launchNewQuestion(10,"Module00-400");
	}
	
	public int launchNewQuestion(int value, String category) {
		this.value = value;
		this.category = category;
		this.userAnswered = false;
		this.userCorrect = false;
//		launch();
		
		if(userCorrect) {
			return value;
		}
		else {
			return 0;
		}
	}
	
	/**
	 * Will launch GUI question 
	 */
	public void displayNewQuestion() throws Exception{
		this.layoutManager = new GridPane();
		Stage window = new Stage();

		
		Backend current = new Backend();
		Backend.createQuestionsMap();
		this.currentQuestion = Backend.getQuestion(category);
		
		this.layoutManager.add(new Label(this.currentQuestion.getQuestion()), 0, 0);
		
		addAllButtons();
		System.out.print(this.currentQuestion);
		
		window.initModality(Modality.APPLICATION_MODAL); //block action from main window until this one is done
	
		for(int i =0;i<answerButtons.length;i++) {
			this.layoutManager.add(answerButtons[i].getButton(), 0, i+1);
			answerButtons[i].getButton().setMaxWidth(Double.MAX_VALUE);
		}
		
		layoutManager.add(new Label(""), 0, 100);
		Scene currentScene = new Scene(this.layoutManager);	
		window.setScene(currentScene);
		window.showAndWait();
	}

//	@Override
//	public void start(Stage primaryStage) throws Exception {
//		// TODO Auto-generated method stub
//		this.layoutManager = new GridPane();
//		
//		Backend current = new Backend();
//		Backend.createQuestionsMap();
//		this.currentQuestion = Backend.getQuestion(category);
//		
//		this.layoutManager.add(new Label(this.currentQuestion.getQuestion()),0,0);
//		
//		addAllButtons();
//		System.out.print(this.currentQuestion);
//		
//		primaryStage.initModality(Modality.APPLICATION_MODAL);
//		primaryStage.setTitle("question");
//		
//		for(int i =0;i<answerButtons.length;i++) {
//			this.layoutManager.add(answerButtons[i].getButton(), 0, i+1);
//			answerButtons[i].getButton().setMaxWidth(Double.MAX_VALUE);
//		}
//		layoutManager.add(new Label(""), 0, 100);
//		Scene currentScene = new Scene(this.layoutManager);	
//		primaryStage.setScene(currentScene);
//		primaryStage.show();
//	}
	
	public void addAllButtons() {
		ArrayList<String> allAnswers = currentQuestion.getAnswerList();
		
		this.answerButtons = new MultipleChoiceButton[allAnswers.size()];
	
		for(int i =0;i<allAnswers.size();i++) {
			boolean currentIsCorrect = allAnswers.get(i).equals(currentQuestion.getAnswer());
			answerButtons[i] = new MultipleChoiceButton(allAnswers.get(i),currentIsCorrect);
		}
		
		for(MultipleChoiceButton currentButton : this.answerButtons) {
			currentButton.getButton().setOnAction(new EventHandler() {

				@Override
				public void handle(Event event) {
					buttonWasPressed(currentButton);
					
				}
				
			});
		}
		
		
		
		
		
		
		
		
		
		
	}
	
	private void buttonWasPressed(MultipleChoiceButton buttonToChange) {
		if (userAnswered == false) {
			userAnswered = true;
			
			if (buttonToChange.getIsCorrect()) {
				buttonToChange.setRightStyle();
				userCorrect = true;
			}else {
				buttonToChange.setWrongStyle();
				userCorrect = false;
			}
			displayExplanation();
		}
	}
	
	
	private void displayExplanation() {
		Label currentExplanation = new Label(this.currentQuestion.getExplanation());
		layoutManager.add(currentExplanation, 0, 100);
		currentExplanation.setMaxWidth(Double.MAX_VALUE);
		currentExplanation.setAlignment(Pos.CENTER);
	}
	
	
}