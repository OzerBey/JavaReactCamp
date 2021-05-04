package homework3.Business.Abstract;

import homework3.Entities.Concrete.Game;
import homework3.Entities.Concrete.Player;

public interface GameService {

	void add(Game game);

	void delete(Game game);

	void buy(Game game);

	void buy(Game game, Player player);

	void giveBack(Game game);

	void getAll();
}
