package interfaceAbstractDemo.Abstract;

import interfaceAbstractDemo.Entities.Customer;
import interfaceAbstractDemo.Interfaces.CustomerService;

public abstract class BaseCustomerManager implements CustomerService {

	// ayni tabloya yazacagımız içic iksii içinde aynı kaydetme metotu geçerlidir
	@Override
	public void save(Customer customer) throws Exception {
		System.out.println("Saved to " + customer.getFirstName());
	}

}
