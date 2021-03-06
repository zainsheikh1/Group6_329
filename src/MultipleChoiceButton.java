

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

public class MultipleChoiceButton {
	private String answerText;
	private boolean isCorrect;
	private Button button;
	
	public MultipleChoiceButton(String answerText,boolean isCorrect){
		this.answerText = answerText;
		this.isCorrect = isCorrect;
		
		this.button = new Button(this.answerText);
		button.setStyle(JeopardyFrontend.buttonBackground);
		button.setTextFill(Color.YELLOW);
		
	}
	
	public Button getButton() {
		return button;
	}
	
	public void setWrongStyle() {
		button.setTextFill(javafx.scene.paint.Color.RED);
	}
	public void setRightStyle() {
		button.setTextFill(javafx.scene.paint.Color.LAWNGREEN);
	}
	
	public boolean getIsCorrect() {
		return this.isCorrect;
	}
	
	
	
	
}
