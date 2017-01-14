package quizz.Domain;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Courses
 *
 */
@Entity

public class Courses implements Serializable {

	   
	@Id
	private int Id;
	private String Name;
	private String Description;
	private String Contenu;
	@OneToMany(mappedBy="courses")
	private List<Questions> Questions;
	private static final long serialVersionUID = 1L;

	public Courses() {
		super();
	}   
	public int getId() {
		return this.Id;
	}

	public void setId(int Id) {
		this.Id = Id;
	}   
	public String getName() {
		return this.Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}   
	public String getDescription() {
		return this.Description;
	}

	public void setDescription(String Description) {
		this.Description = Description;
	}   
	public String getContenu() {
		return this.Contenu;
	}

	public void setContenu(String Contenu) {
		this.Contenu = Contenu;
	}
	
	
	public List<Questions> getQuestions() {
		return Questions;
	}
	public void setQuestions(List<Questions> questions) {
		Questions = questions;
	}
   
}
