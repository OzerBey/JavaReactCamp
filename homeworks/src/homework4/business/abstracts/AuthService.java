package homework4.business.abstracts;

import homework4.entities.concretes.LoginDto;
import homework4.entities.concretes.User;

public interface AuthService {

	void login(LoginDto dto);

	void register(User user);

	void verify(User user);

	boolean userExists(String email); // return true or false
}
