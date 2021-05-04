package homework3.Business.Concrete;

import homework3.Business.Abstract.GameService;
import homework3.Entities.Concrete.Game;
import homework3.Entities.Concrete.Player;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println("id: " + game.getId() + " " + game.getName() + " added");

	}

	@Override
	public void delete(Game game) {
		System.out.println("id: " + game.getId() + " " + game.getName() + " deleted");

	}

	@Override
	public void buy(Game game) {
		System.out.println("id: " + game.getId() + " " + game.getName() + " bought");

	}

	@Override
	public void giveBack(Game game) {
		System.err.println("You gave " + game.getName() + " back !");

	}

	@Override
	public void getAll() {
		System.out.println("All your games listed");

	}

	@Override
	public void buy(Game game, Player player) {

		System.out.println(
				game.getName() + " bought Total price : " + game.getPrice() + player.getFirstName().toUpperCase());
	}

}
