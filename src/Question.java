import java.util.ArrayList;

public class Question {
	private String type;
	private String category;
	private String question;
	private String answer;
	private ArrayList<String> answerList = new ArrayList<String>();
	private String explanation;
	
	public Question(String category, String type, String question, String answer, ArrayList<String> answerList, String explanation) {
		this.category = category;
		this.type = type;
		this.question = question;
		this.answer = answer;
		this.answerList = answerList;
		this.explanation = explanation;
	}
	
	public String getCategory() {return this.category;}
	public String getType() {return this.type;}
	public String getQuestion() {return this.question;}
	public String getAnswer() {return this.answer;}
	public ArrayList<String> getAnswerList() {return this.answerList;}
	public String getExplanation() {return this.explanation;}

}
