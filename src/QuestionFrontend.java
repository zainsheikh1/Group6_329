import java.util.ArrayList;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;



public class QuestionFrontend{
	
	
	private MultipleChoiceButton answerButtons[];
	private Question currentQuestion;
	
	private static int value;
	private static String category;
	
	private static boolean userAnswered;
	private static boolean userCorrect;
	
	private GridPane layoutManager;
	
	private Stage primaryStage;
	

	public void launchNewQuestion(int value, String category) {
		this.value = value;
		this.category = category;
		this.userAnswered = false;
		this.userCorrect = false;
		

	}


	public int startQuestion(Stage primaryStage) throws Exception {
		this.primaryStage = primaryStage;
		// TODO Auto-generated method stub
		this.layoutManager = new GridPane();
		this.layoutManager.setStyle(JeopardyFrontend.gameBackground);
		
		Backend current = new Backend();
		Backend.createQuestionsMap();
		this.currentQuestion = Backend.getQuestion(category+"-"+value);
		
		
		Label questionText = new Label(this.currentQuestion.getQuestion());
		questionText.setMaxWidth(1200);
		questionText.setWrapText(true);
		this.layoutManager.add(questionText,0,0);
		
		addAllButtons();
		System.out.print(this.currentQuestion);
		
		
		
		
		
		
		for(int i =0;i<answerButtons.length;i++) {
			this.layoutManager.add(answerButtons[i].getButton(), 0, i+1);
			answerButtons[i].getButton().setMaxWidth(Double.MAX_VALUE);
		}
		layoutManager.add(new Label(""), 0, 100);
		Scene currentScene = new Scene(this.layoutManager);	
		primaryStage.setScene(currentScene);
		primaryStage.showAndWait();

		
		if(userCorrect) {
			return value;
		}else {
			return 0;
		}
		
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
				System.out.println("HELLO");
			}else {
				buttonToChange.setWrongStyle();
				userCorrect = false;
			}
			
		}
		displayExplanation();
	}
	
	
	private void displayExplanation() {
		Label currentExplanation = new Label(this.currentQuestion.getExplanation());
		currentExplanation.setWrapText(true);
		layoutManager.add(currentExplanation, 0, 100);
		currentExplanation.setMaxWidth(Double.MAX_VALUE);
		currentExplanation.setAlignment(Pos.CENTER);
		
		primaryStage.hide();

		primaryStage.show();
	}
	
	
}
