package homework3.Business.Concrete;

import homework3.Adapters.EDevletValidationService;
import homework3.Business.Abstract.PlayerService;
import homework3.Entities.Concrete.Player;

public class PlayerManager implements PlayerService {

	private EDevletValidationService validation;

	public PlayerManager(EDevletValidationService validation) {
		super();
		this.validation = validation;
	}

	@Override
	public void add(Player player) {

		/*
		 * // real validation here 
		 * if (validation.checkIfRealPerson(player)) {
		 * System.out.println("id: " + player.getId() + " " + player.getFirstName() +
		 * " " + player.getLastName() + " added to players");
		 * 
		 * } else { System.out.println("invalid person !"); }
		 * 
		 */
		System.out.println("id: " + player.getId() + " " + player.getFirstName() + " " + player.getLastName()
				+ " added to players");

	}

	@Override
	public void delete(Player player) {
		System.out.println("id: " + player.getId() + " " + player.getFirstName() + " " + player.getLastName()
				+ " deleted from players");

	}

	@Override
	public void update(Player player) {
		System.out.println("id: " + player.getId() + " " + player.getFirstName() + " " + player.getLastName()
				+ " updated to players");

	}

	@Override
	public void getAll(Player player) {
		// TODO Auto-generated method stub

	}

}
