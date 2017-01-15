package quizz.DAO;

import java.util.List;

import javax.ejb.Local;

import quizz.Domain.User;

@Local
public interface UserLocal {
	public void addUser(User utilisateur);
	public void updUser(User utilisateur);
	public void delUser(int id);
	public User findUser(int id);
	public List<User> getAllUser();
}
