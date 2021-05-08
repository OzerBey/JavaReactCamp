package homework4.business.concretes;

import homework4.business.abstracts.AuthService;
import homework4.business.abstracts.UserService;
import homework4.core.utils.Utils;
import homework4.entities.concretes.LoginDto;
import homework4.entities.concretes.User;

public class AuthManager implements AuthService {

	private UserService userService;

	public AuthManager(UserService userService) {
		super();
		this.userService = userService;
	}

	@Override
	public void login(LoginDto dto) {
		User user = userService.getByEmail(dto.geteMail());
		if (user != null && user.getPassword().equals(dto.getPassword())) {
			System.out.println("Successfully login ");
		} else {
			System.err.println("Username or Password incorrect ");
		}
	}

	@Override
	public void register(User user) {
		if (userValidate(user) && passwordValidate(user.getPassword()) && userExists(user.geteMail()) == false
				&& Utils.emailValidate(user.geteMail())) {
			userService.add(user);

		} else
			System.err.println("Registration failed for "+user.getFirstName());
	}

	@Override
	public void verify(User user) {
		if (user != null) {
			User existsUser = userService.getByEmail(user.geteMail());
			existsUser.setVerify(true);

			userService.update(existsUser);
			System.out.println("Verified ✔");
		} else
			System.err.println("Not verified ✘");

	}

	@Override
	public boolean userExists(String email) {
		boolean _userExists = false;
		User user = userService.getByEmail(email);

		if (user == null) {
			System.out.println("null null null");
			_userExists = false;
		} else {
			System.out.println("This( " + email + ") email address already exists");
			_userExists = true;
		}
		return _userExists;
	}

	public boolean userValidate(User user) {
		if (user != null && !user.getFirstName().isEmpty() && !user.getLastName().isEmpty()
				&& !user.geteMail().isEmpty() && !user.getPassword().isEmpty()) {
			System.out.println("uservalidate if :true");
			return true;
		}
		System.out.println("uservalidate : false");
		return false;
	}

	public boolean passwordValidate(String password) {
		boolean validPassword = false;
		if (password.length() >= 6) {
			// System.out.println("pasword 6 log");
			validPassword = true;

		} else {
			System.err.println("Your password must be at least 6 character !");
			validPassword = false;
		}
		return validPassword;

	}

}
