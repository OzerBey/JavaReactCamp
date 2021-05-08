package homework4.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import homework4.dataAccess.abstracts.UserDao;
import homework4.entities.concretes.User;

public class InMemoryUserDao implements UserDao {

	private List<User> users = new ArrayList<User>(); // Arraylist can inherit the List

	/*
	 * public InMemoryUserDao(List<User> users) { this.users = users; }
	 */

	public InMemoryUserDao() {
		// in Memory simulation
		User yasin = new User(1, "Yasin", "Özer", "yasinozeriletisim@gmail.com", "123456", true);
		User ozer = new User(2, "Ozer", "Bulut", "ozer@abc.com", "123456", true);
		User zeynep = new User(3, "Zeynep Nur", "Özer", "zeynep@abc.com", "123456", true);

		users.add(zeynep);
		users.add(yasin);
		users.add(ozer);
	}

	public void add(User user) {
		users.add(user);
		System.out.println(user.getFirstName() + " added to the InMemory ");

	}

	@Override
	public void delete(User user) {
		// with stream
		User userToDelete = users.stream().filter(u -> u.getId() == user.getId()).findFirst().orElse(null);
		users.remove(userToDelete);
		// users.removeIf(u -> u.getId() == user.getId());
		System.err.println(user.getFirstName() + " deleted from the InMemory ");

	}

	@Override
	public void update(User user) {
		// with stream
		User userUpdate = users.stream().filter(u -> u.getId() == user.getId()).findFirst().orElse(null);
		userUpdate.setFirstName(user.getFirstName());
		userUpdate.setLastName(user.getLastName());
		userUpdate.seteMail(user.geteMail());
		userUpdate.setPassword(user.getPassword());
		userUpdate.setVerify(user.isVerify());
		/*
		 * User userToUpdate = getById(user.getId());
		 * userToUpdate.setFirstName(user.getFirstName());
		 * userToUpdate.setLastName(user.getLastName());
		 * userToUpdate.seteMail(user.geteMail());
		 */
		System.err.println(user.getFirstName() + " updated in InMemory");

	}

	@Override
	public User getById(int id) {
		// with stream
		User userById = users.stream().filter(u -> u.getId() == id).findFirst().orElse(null);
		return userById;

		/*
		 * for (User user : users) { if (user.getId() == id) { return user; } } return
		 * null;
		 */
	}

	@Override
	public User getByEmail(String eMail) {
		// with stream
		User user = users.stream().filter(u -> u.geteMail() == eMail).findFirst().orElse(null);
		System.out.println(user.getFirstName() + " ✔");
		return user;
		/*
		 * for (User user : users) { if (user.geteMail() == eMail) { return user; } }
		 * return null;
		 */
	}

	@Override
	public boolean eMailCheck(User user) {
		boolean isUser = false;
		for (User u : users) {
			if (u.geteMail().equals(user.geteMail())) {
				isUser = true;
			} else
				isUser = false;
		}
		return isUser;
	}

	@Override
	public List<User> getAll() {
		return users;
	}

}
