package interfaceAbstractDemo.Concrete;

import interfaceAbstractDemo.Abstract.BaseCustomerManager;
import interfaceAbstractDemo.Entities.Customer;
import interfaceAbstractDemo.Interfaces.CustomerCheckService;

public class StarbucksCustomerManager extends BaseCustomerManager {

	private CustomerCheckService customerCheckService;

	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) throws Exception {
		if (customerCheckService.checkIfRealPerson(customer)) {
			
			super.save(customer);
		} else {
			throw new Exception("not a valid person");
		}
	}
}
