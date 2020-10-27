import javafx.application.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.*;
public class JeopardyFrontend extends Application{
	public static void main(String[] args) {
		launch();
	}
	public void start(Stage primaryStage) {
		
		Backend backend = new Backend();
		
		backend.getNewQuestion("Passwords",100);
		
		
		StackPane root = new StackPane();
		GridPane grid = new GridPane();
		Button[] buttons = new Button[25];
		int currentIndex = 0;
		for(int i =1;i<6;i++) {
			for(int j =1; j<6;j++) {
				Button currentButton = new Button(i+"-"+j);
				buttons[currentIndex] = currentButton;	
				grid.add(currentButton, i, j);
				currentIndex+=1;
			}
		}
		
		root.getChildren().add(grid);
		primaryStage.setScene(new Scene(root));
		primaryStage.show();
	}
	
	
}
