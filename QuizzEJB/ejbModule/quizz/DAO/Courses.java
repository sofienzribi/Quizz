package quizz.DAO;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Session Bean implementation class Courses
 */
@Stateless
@LocalBean
public class Courses implements CoursesRemote, CoursesLocal {

	@PersistenceContext(name="QuizzEJB")
	EntityManager em;
	
    public Courses() {
    }

	@Override
	public void addCourses(quizz.Domain.Courses cour) {
		em.persist(cour);
		
	}

	@Override
	public void updCourses(quizz.Domain.Courses cour) {
		em.merge(cour);
	}

	@Override
	public void delCourses(int id) {
		quizz.Domain.Courses C = findCourses(id);
		em.remove(C);
		
	}

	@Override
	public quizz.Domain.Courses findCourses(int id) {
		return em.find(quizz.Domain.Courses.class, id);
	}

	@Override
	public List<quizz.Domain.Courses> getAllCrs() {
		return em.createQuery("from Courses c",quizz.Domain.Courses.class).getResultList();
	}

}
