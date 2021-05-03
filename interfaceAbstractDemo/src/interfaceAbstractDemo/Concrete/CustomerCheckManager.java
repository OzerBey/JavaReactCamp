package interfaceAbstractDemo.Concrete;

import interfaceAbstractDemo.Entities.Customer;
import interfaceAbstractDemo.Interfaces.CustomerCheckService;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		if (customer.getIdentityNumber().length() == 11) {
			return true;
		} else {
			return false;
		}

	}

}
