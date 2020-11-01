

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.paint.Paint;

public class MultipleChoiceButton {
	private String answerText;
	private boolean isCorrect;
	private Button button;
	
	public MultipleChoiceButton(String answerText,boolean isCorrect){
		this.answerText = answerText+isCorrect;
		this.isCorrect = isCorrect;
		
		this.button = new Button(this.answerText);
		this.button.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				buttonWasPressed();
				
			}
			
		});
		
		
	}
	
	public Button getButton() {
		return button;
	}
	
	public void buttonWasPressed() {
	
		
		if(isCorrect) {
		button.setTextFill(javafx.scene.paint.Color.GREEN);
		}else {
			button.setTextFill(javafx.scene.paint.Color.RED);
		}
	}
	
	
	
	
}
