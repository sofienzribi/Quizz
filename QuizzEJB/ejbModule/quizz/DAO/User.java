package quizz.DAO;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Stateless
@LocalBean
public class User implements UserRemote, UserLocal {

	@PersistenceContext(name="QuizzEJB")
	EntityManager entityManager ;
	
    public User() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void addUser(quizz.Domain.User utilisateur) {
		entityManager.persist(utilisateur);
		
	}

	@Override
	public void updUser(quizz.Domain.User utilisateur) {
		entityManager.merge(utilisateur);
		
	}

	@Override
	public void delUser(int id) {
		quizz.Domain.User s = findUser(id);
		entityManager.remove(s);
		
	}

	@Override
	public quizz.Domain.User findUser(int id) {
		return entityManager.find(quizz.Domain.User.class, id);
	}

	@Override
	public List<quizz.Domain.User> getAllUser() {
		return entityManager.createQuery("select user from User user",quizz.Domain.User.class).getResultList();
	}

}
