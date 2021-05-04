package homework3.Business.Abstract;

import homework3.Entities.Concrete.Campaign;
import homework3.Entities.Concrete.Game;
import homework3.Entities.Concrete.Player;

public interface GameSaleService {

	void sales(Player player, Game game, Campaign campaign);

	void sales(Player player, Game game); // without campaign
}
