import javafx.scene.control.Button;

public class MultipleChoiceButton {
	private String answerText;
	private boolean isCorrect;
	private Button button;
	
	public MultipleChoiceButton(String answerText,boolean isCorrect){
		this.answerText = answerText+isCorrect;
		this.isCorrect = isCorrect;
		
		this.button = new Button(this.answerText);
		
	}
	
	public Button getButton() {
		return button;
	}
	
	
	
	
}
