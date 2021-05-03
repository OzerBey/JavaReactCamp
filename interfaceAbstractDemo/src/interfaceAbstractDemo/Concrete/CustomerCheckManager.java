package interfaceAbstractDemo.Concrete;

import interfaceAbstractDemo.Entities.Customer;
import interfaceAbstractDemo.Interfaces.CustomerCheckService;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) { // Test simulatio ~ fake Mernis

		return true;

	}

}
