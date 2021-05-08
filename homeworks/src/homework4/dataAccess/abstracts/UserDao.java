package homework4.dataAccess.abstracts;

import java.util.List;

import homework4.entities.concretes.User;

public interface UserDao { // (Dao) Data Access Object

	void add(User user);

	void delete(User user);

	void update(User user);

	User getById(int id);

	User getByEmail(String eMail);

	boolean eMailCheck(User user);

	List<User> getAll();

}
