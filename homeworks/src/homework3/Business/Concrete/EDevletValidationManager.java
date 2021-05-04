package homework3.Business.Concrete;

import homework3.Adapters.EDevletValidationService;
import homework3.Entities.Concrete.Player;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class EDevletValidationManager implements EDevletValidationService {

	@Override
	public boolean checkIfRealPerson(Player player) {

		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		try {

			return client.TCKimlikNoDogrula(Long.parseLong(player.getIdentityNumber().toUpperCase()),
					player.getFirstName().toUpperCase(), player.getLastName().toUpperCase(),
					Integer.parseInt(player.getYearOfBirth()));

		} catch (Exception e) {
			System.err.println(e.toString());
			return false;
		}
	}

	/*
	 * @Override public boolean CheckIfRealPerson(Player player) { // fake validation
	 * 
	 * 
	 * if (player.getIdentityNumber().length() == 11 &&
	 * player.getFirstName().length() >= 3 &&
	 * !(player.getLastName().startsWith("ğ")) &&
	 * Integer.parseInt(player.getYearOfBirth()) < 2000) { return true; } else
	 * return false; }
	 */

}
