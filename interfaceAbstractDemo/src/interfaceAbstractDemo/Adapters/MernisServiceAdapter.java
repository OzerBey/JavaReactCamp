package interfaceAbstractDemo.Adapters;

import interfaceAbstractDemo.Entities.Customer;
import interfaceAbstractDemo.Interfaces.CustomerCheckService;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {

		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		try {

			return client.TCKimlikNoDogrula(Long.parseLong(customer.getIdentityNumber().toUpperCase()),
					customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(),
					customer.getDateOfBirth());

		} catch (Exception e) {
			System.err.println(e.toString());
			return false;
		}

	}

}
