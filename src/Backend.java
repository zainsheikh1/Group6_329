import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



public class Backend {
	
	//Global Variables
	public static Map<String, ArrayList<Question>> map = new HashMap<>();

	//Random Number Generator
	public static int random(int min, int max) {
		return (int) (Math.random() * (max-min + 1) + min);
	}
	
	
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
			while(!currentWrongAnswer.equals("..............................................................................................................................")) {
				answerList.add(currentWrongAnswer);		
				currentWrongAnswer = scan.nextLine();
			}
			Collections.shuffle(answerList);
			String explanation = scan.nextLine();
			
			
			
			String append = scan.nextLine();
			while(!append.equals("..............................................................................................................................")) {
				explanation += ("\n" + append);
				append = scan.nextLine();
			}
			Question currentQuestion = new Question(category, type, question, answer, answerList,explanation);
			ArrayList<Question> temp =new ArrayList<Question>();
			if(map.get(category)!=null) {
				temp = map.get(category);
				
			}
			temp.add(currentQuestion);
			
			map.put(category, temp);
		}
		scan.close();
	}
	
	/*
	 * Function: getQuestion
	 * @param String category
	 * Description: Returns the Question instance with the corresponding category
	 */
	public static Question getQuestion(String category) {
		int rand = random(0,map.get(category).size()-1);
		
		if(map.containsKey(category)) {
			return map.get(category).get(rand);
		}else {
			return null;
		}
		
	}
	
	
	//Check Function
	private static boolean check(String pt, int digits) {
		if(pt.length() != digits) {
			return false;
		}
		for(int i=0; i<pt.length(); i++) {
			if(!Character.isDigit(pt.charAt(i))) {
				return false;
			}
		}
		return true;
	}
	
	
	//Convert to cyphertext
	public String getCypherText(String pt) {
		int k1 = random(0,9);
		int k2 = random(0,9);
		int k3 = k1;
		int k4 = k2;
		
		int n1 = Character.getNumericValue(pt.charAt(0));
		int n2 = Character.getNumericValue(pt.charAt(1));
		int n3 = Character.getNumericValue(pt.charAt(2));
		int n4 = Character.getNumericValue(pt.charAt(3));
		
		n1 += k1;
		if(n1>9) {
			n1 -= 10;
		}
		n2 += k2;
		if(n2>9) {
			n2 -= 10;
		}
		n3 += k3;
		if(n3>9) {
			n3 -= 10;
		}
		n4 += k4;
		if(n4>9) {
			n4 -= 10;
		}
		
		String cypherText = "" + n1 + n2 + n3 + n4;
		return cypherText;
	}
	
	
	
	
	
	
	
	
	
}
