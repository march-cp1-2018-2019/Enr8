

import java.io.*;



public class QuizCard {

	String question;
	String answer;



	public QuizCard(String a, String b) {

		question = a;
		answer = b; 

	}


	//TEACHER NOTES: this is so close!!! remember a setter sets the value, and a getter returns a value!
	// this is a setter so it should set the value like this:
	//public void setQuestion(String s){
	//	this.question = s;
	//}
	
	public String setQuestion() {
		return question;

	}



	public String setAnswer() 
		return answer;

	}

	//TEACHER NOTES: Still need getters here to return the value of question and answer.  like this:
	//public String getQuestion(){
	//	return question;
	//}


}
