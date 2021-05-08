package homework4.core;

import homework4.business.abstracts.UserService;
import homework4.entities.concretes.LoginDto;
import homework4.entities.concretes.User;

public class GoogleAuthManagerAdapter implements ExternalAuthService {

	private UserService userService;

	public GoogleAuthManagerAdapter(UserService userService) {
		super();
		this.userService = userService;
	}

	@Override
	public void login(LoginDto dto) {

		if (dto != null && dto.getPassword().equals(dto.getPassword())) {
			System.out.println("Successfully login ✔");
		} else {
			System.out.println("Username or password incorrect ✘");
		}
	}

	@Override
	public void register(String email) {
		if (!userExists(email)) {
			userService.add(null);
		} else {

			User user = userService.getByEmail(email);
			LoginDto dto = new LoginDto();
			dto.seteMail(user.geteMail());
			dto.setPassword(user.getPassword());

			login(dto);
		}
	}

	@Override
	public boolean userExists(String email) {
		boolean isExists = false;
		if (userService.getByEmail(email) != null) {
			isExists = true;
		} else
			isExists = false;
		return isExists;
	}

}
