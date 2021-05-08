package homework4.business.abstracts;

import java.util.List;

import homework4.entities.concretes.User;

public interface UserService {

	void add(User user);

	void delete(User user);

	void update(User user);

	User getById(int id);

	User getByEmail(String eMail);

	boolean eMailCheck(User user);

	List<User> getAll();
}
