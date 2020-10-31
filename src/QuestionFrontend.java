import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class QuestionFrontend extends Application{
	
	
	public static void main(String[] args) {
		QuestionFrontend test = new QuestionFrontend();
		test.launchNewQuestion(10,null);
	}
	
	public void launchNewQuestion(int value, String category) {
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		GridPane layout = new GridPane();
		
		
		
		Scene currentScene = new Scene(layout);	
		primaryStage.setScene(currentScene);
		primaryStage.show();
	}
	
	
}
