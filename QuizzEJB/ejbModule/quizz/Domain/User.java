package quizz.Domain;

import java.io.Serializable;
import java.lang.String;
import java.util.Collection;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: User
 *
 */
@Entity

public class User implements Serializable {

	   
	@Id
	private int Id;
	private String Login;
	private String Password;
	private String Nom;
	private String Prenom;
	@ManyToMany
	private Collection<Courses> cours;
	private static final long serialVersionUID = 1L;

	public User() {
		super();
	}   
	public int getId() {
		return this.Id;
	}

	public void setId(int Id) {
		this.Id = Id;
	}   
	public String getLogin() {
		return this.Login;
	}

	public void setLogin(String Login) {
		this.Login = Login;
	}   
	public String getPassword() {
		return this.Password;
	}

	public void setPassword(String Password) {
		this.Password = Password;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getPrenom() {
		return Prenom;
	}
	public void setPrenom(String prenom) {
		Prenom = prenom;
	}
	public Collection<Courses> getCourses() {
		return cours;
	}
	public void setCourses(Collection<Courses> cours) {
		this.cours = cours;
	}
   
}
