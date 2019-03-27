//Jeremiah Creme
//p.s. It runs? But I have no clue what it is doing

package chap14;

import java.io.*;

public class QuizCard implements Serializable {
	String question;
	String answer;

	public QuizCard(String q, String a) {
		question = q;
		answer = a; 
	}

	public String getQuestion() {
		return question;
	}

	public String getAnswer() {
		return answer;
	}

}

