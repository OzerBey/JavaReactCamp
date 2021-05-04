package homework3.Business.Abstract;

import homework3.Entities.Concrete.Player;

public interface PlayerService {

	// CRUD operation
	void add(Player player);

	void delete(Player player);

	void update(Player player);

	void getAll(Player player);

}
