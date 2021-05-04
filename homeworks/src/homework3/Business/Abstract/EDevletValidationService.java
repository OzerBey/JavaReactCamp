package homework3.Business.Abstract;

import homework3.Entities.Concrete.Player;

public interface EDevletValidationService {

	boolean checkIfRealPerson(Player player);
}
