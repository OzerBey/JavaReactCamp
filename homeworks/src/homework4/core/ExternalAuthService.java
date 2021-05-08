package homework4.core;

import homework4.entities.concretes.LoginDto;

public interface ExternalAuthService {

	void login(LoginDto dto);

	void register(String email);

	boolean userExists(String email);

}
