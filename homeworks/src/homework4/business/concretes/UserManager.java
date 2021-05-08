package homework4.business.concretes;

import java.util.List;

import homework4.business.abstracts.UserService;
import homework4.core.EmailService;
import homework4.dataAccess.abstracts.UserDao;
import homework4.entities.concretes.User;

public class UserManager implements UserService {

	private UserDao userDao;
	private EmailService emailService;

	public UserManager(UserDao userDao, EmailService emailService) {
		this.userDao = userDao;
		this.emailService = emailService;
	}

	@Override
	public void add(User user) {
		if (userValidate(user)) {
			userDao.add(user);
			System.out.println("Sent to " + user.geteMail());
			emailService.send(user.geteMail(), " added");
		}
	}

	@Override
	public void delete(User user) {
		System.err.println(user.getFirstName() + " deleted");
		userDao.delete(user);

	}

	@Override
	public void update(User user) {
		if (userValidate(user)) {
			System.out.println(user.getFirstName() + " updated");
			userDao.update(user);
		}

	}

	@Override
	public User getById(int id) {
		return userDao.getById(id);
	}

	@Override
	public User getByEmail(String eMail) {
		return userDao.getByEmail(eMail);
	}

	@Override
	public boolean eMailCheck(User user) {
		return userDao.eMailCheck(user);
	}

	@Override
	public List<User> getAll() {
		/*
		 * for (User user : userDao.getAll()) { System.out.println(user.getId() + " " +
		 * user.getFirstName() + " " + user.getLastName()); }
		 */
		return userDao.getAll(); // return list of users
	}

	public boolean userValidate(User user) {
		boolean isValid = false;
		if (user.getFirstName().length() >= 2 && user.getLastName().length() >= 2) {
			isValid = true;
		} else {
			System.err.println("Your first name and last name must be at least 2 character length");
			isValid = false;
		}
		return isValid;

	}

}
