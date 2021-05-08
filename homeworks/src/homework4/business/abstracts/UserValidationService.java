package homework4.business.abstracts;

import homework4.entities.concretes.User;

public interface UserValidationService {
	boolean isValid(User user);
}
