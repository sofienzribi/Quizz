package quizz.DAO;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Session Bean implementation class Questions
 */
@Stateless
@LocalBean
public class Questions implements QuestionsRemote, QuestionsLocal {
	 
	
	@PersistenceContext(name="QuizzEJB")
	EntityManager em;
	
    public Questions() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void addQuestion(quizz.Domain.Questions question) {
		em.persist(question);
		
	}

	@Override
	public void updQuestion(quizz.Domain.Questions question) {
		em.merge(question);
		
	}

	@Override
	public void delQuestion(int id) {
		quizz.Domain.Questions Q = findQuestion(id);
		em.remove(Q); 
	}

	@Override
	public quizz.Domain.Questions findQuestion(int id) {
		return em.find(quizz.Domain.Questions.class, id);
	}

	@Override
	public List<quizz.Domain.Questions> getAllQsts() {
		return em.createQuery("from Questions q",quizz.Domain.Questions.class).getResultList();
	}

}