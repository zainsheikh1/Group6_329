import java.util.ArrayList;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;



public class QuestionFrontend extends Application{
	
	
	private MultipleChoiceButton answerButtons[];
	private Question currentQuestion;
	
	private static int value;
	private static String category;
	
	public static void main(String[] args) {
		QuestionFrontend test = new QuestionFrontend();
		test.launchNewQuestion(10,"Module00-500");
	}
	
	public void launchNewQuestion(int value, String category) {
		this.value = value;
		this.category = category;
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		GridPane layout = new GridPane();
		
		
		Backend current = new Backend();
		Backend.createQuestionsMap();
		this.currentQuestion = Backend.getQuestion(category);
		
		layout.add(new Label(this.currentQuestion.getQuestion()),0,0);
		
		addAllButtons();
		System.out.print(this.currentQuestion);
		
		
		
		
		
		
		for(int i =0;i<answerButtons.length;i++) {
			layout.add(answerButtons[i].getButton(), 0, i+1);
		}
		Scene currentScene = new Scene(layout);	
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
		
		
		
		
		
		
		
		
	}
	
	
}
