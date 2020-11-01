import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;



public class QuestionFrontend extends Application{
	
	
	private MultipleChoiceButton answerButtons[];
	private Question currentQuestion;
	
	private int value;
	private String category;
	
	public static void main(String[] args) {
		QuestionFrontend test = new QuestionFrontend();
		test.launchNewQuestion(10,null);
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
		this.currentQuestion = current.getNewQuestion(category, value);
		
		layout.add(new Label(this.currentQuestion.question),0,0);
		
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
		System.out.println("HELLOTHERE");
		String[] allAnswers = currentQuestion.possibleAnswers;
		
		this.answerButtons = new MultipleChoiceButton[allAnswers.length];
	
		for(int i =0;i<allAnswers.length;i++) {
			boolean currentIsCorrect = allAnswers[i].equals(currentQuestion.answer);
			answerButtons[i] = new MultipleChoiceButton(allAnswers[i],currentIsCorrect);
		}
		
		
		
		
		
		
		
		System.out.println(this.answerButtons[0]);
		
	}
	
	
}
