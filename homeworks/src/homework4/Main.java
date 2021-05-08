package homework4;

import homework4.business.concretes.AuthManager;
import homework4.business.concretes.UserManager;
import homework4.core.githubEmail.GithubMailManagerAdapter;
import homework4.core.googleEmail.GoogleMailManagerAdapter;
import homework4.dataAccess.concretes.HibernateUserDao;
import homework4.dataAccess.concretes.InMemoryUserDao;
import homework4.entities.concretes.LoginDto;
import homework4.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		// new users
		User ali = new User(4, "Ali", "Özer", "ali@abc.com", "123456", true);
		User eda = new User(5, "Eda", "Yazıcı", "eda@abc.com", "123456", true);
		User gülbeyaz = new User(6, "Gülbeyaz", "Bozkurt", "gülbeyaz@abc.com", "1234567", true);
		InMemoryUserDao inMemoryUserDao = new InMemoryUserDao();
		UserManager userManager = new UserManager(inMemoryUserDao, new GithubMailManagerAdapter());
		userManager.add(gülbeyaz);
		userManager.add(eda);
		// userManager.delete(ali);
		// userManager.update(ali);

		// Auth System
		AuthManager authManager = new AuthManager(userManager);

		// same email check

		authManager.register(eda);
		authManager.login(new LoginDto(eda.geteMail(), eda.getPassword()));

		boolean result = userManager.eMailCheck(gülbeyaz);
		System.out.println(result);
		// userManager.add(gülbeyaz);
		// authManager.login(new LoginDto("gülbeyaz@abc.com", "123456"));

		for (User user : userManager.getAll())
			System.out.println(user.getFirstName() + " " + user.getLastName());

	}

}
