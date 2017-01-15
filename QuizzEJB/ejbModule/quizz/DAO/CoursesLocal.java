package quizz.DAO;

import java.util.List;

import javax.ejb.Local;

import quizz.Domain.Courses;


@Local
public interface CoursesLocal {
	public void addCourses(quizz.Domain.Courses cour );
	public void updCourses(Courses cour );
	public void delCourses(int id);
	public Courses findCourses(int id);
	public List<Courses> getAllCrs();
}
