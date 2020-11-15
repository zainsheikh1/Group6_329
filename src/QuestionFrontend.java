import java.util.ArrayList;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;



public class QuestionFrontend extends Application{
	
	
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
	
	public void launchNewQuestion(int value, String category) {
		this.value = value;
		this.category = category;
		this.userAnswered = false;
		this.userCorrect = false;
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		this.layoutManager = new GridPane();
		
		
		Backend current = new Backend();
		Backend.createQuestionsMap();
		this.currentQuestion = Backend.getQuestion(category);
		
		this.layoutManager.add(new Label(this.currentQuestion.getQuestion()),0,0);
		
		addAllButtons();
		System.out.print(this.currentQuestion);
		
		
		
		
		
		
		for(int i =0;i<answerButtons.length;i++) {
			this.layoutManager.add(answerButtons[i].getButton(), 0, i+1);
		}
		layoutManager.add(new Label(""), 0, 100);
		Scene currentScene = new Scene(this.layoutManager);	
		primaryStage.setScene(currentScene);
		primaryStage.show();
	}
	
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
		layoutManager.add(new Label("EXPLANATION"), 0, 100);
		
	}
	
	
}
