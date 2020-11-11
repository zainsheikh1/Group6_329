import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



public class Backend {
	
	//Global Variables
	public static Map<String, Question> map = new HashMap<>();

	/*
	 * Function: createQuestionsMap
	 * Description: Creates the hashmap for all questions, using the Question categories as keys
	 */
	public static void createQuestionsMap() throws FileNotFoundException {
		File file = new File("src/Questions");
		Scanner scan = new Scanner(file);
		
		while(scan.hasNextLine()) {
			ArrayList<String> answerList = new ArrayList<String>();
			
			String category = scan.nextLine();
			String type = scan.nextLine();
			String question = scan.nextLine();
			String answer = scan.nextLine();
			answerList.add(answer);
	
			
			String currentWrongAnswer = scan.nextLine();
			while(!currentWrongAnswer.contains("......")) {
				answerList.add(currentWrongAnswer);
				currentWrongAnswer = scan.nextLine();
			}
			Collections.shuffle(answerList);
			
			String explanation = scan.nextLine();
			scan.nextLine();
			Question currentQuestion = new Question(category, type, question, answer, answerList,explanation);
			map.put(category, currentQuestion);
		}
		scan.close();
	}
	
	/*
	 * Function: getQuestion
	 * @param String category
	 * Description: Returns the Question instance with the corresponding category
	 */
	public static Question getQuestion(String category) {
		System.out.println(map);
		System.out.println(category);
		if(map.containsKey(category)) {
			return map.get(category);
		}else {
			System.out.println("BROKEN");
			return null;
		}
	}
	
}
