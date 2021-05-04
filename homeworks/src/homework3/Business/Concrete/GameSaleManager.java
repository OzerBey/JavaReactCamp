package homework3.Business.Concrete;

import homework3.Business.Abstract.GameSaleService;
import homework3.Entities.Concrete.Campaign;
import homework3.Entities.Concrete.Game;
import homework3.Entities.Concrete.Player;

public class GameSaleManager implements GameSaleService {

	public void sales(Player player, Game game, Campaign campaign) {
		System.out.println("The " + game.getName() + " added to library of " + player.getFirstName() + " using "
				+ campaign.getName());

	}

	@Override
	public void sales(Player player, Game game) {
		System.out.println("The " + game.getName() + " added to library of " + player.getFirstName());

	}

}
