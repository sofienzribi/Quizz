package quizz.Domain;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Questions
 *
 */
@Entity

public class Questions implements Serializable {

	   
	@Id
	private int Id;
	private String Question;
	private String Choix;
	private String Reponses;
	private static final long serialVersionUID = 1L;

	public Questions() {
		super();
	}   
	public int getId() {
		return this.Id;
	}

	public void setId(int Id) {
		this.Id = Id;
	}   
	public String getQuestion() {
		return this.Question;
	}

	public void setQuestion(String Question) {
		this.Question = Question;
	}   
	public String getChoix() {
		return this.Choix;
	}

	public void setChoix(String Choix) {
		this.Choix = Choix;
	}   
	public String getReponses() {
		return this.Reponses;
	}

	public void setReponses(String Reponses) {
		this.Reponses = Reponses;
	}
   
}
