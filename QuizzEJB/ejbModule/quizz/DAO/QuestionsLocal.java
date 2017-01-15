package quizz.DAO;

import java.util.List;

import javax.ejb.Local;

import quizz.Domain.Questions;


@Local
public interface QuestionsLocal {
	public void addQuestion(Questions question );
	public void updQuestion(Questions question );
	public void delQuestion(int id);
	public Questions findQuestion(int id);
	public List<Questions> getAllQsts();
}
