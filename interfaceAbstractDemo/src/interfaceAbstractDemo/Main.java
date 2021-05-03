package interfaceAbstractDemo;

import interfaceAbstractDemo.Abstract.BaseCustomerManager;
import interfaceAbstractDemo.Adapters.MernisServiceAdapter;
import interfaceAbstractDemo.Concrete.CustomerCheckManager;
import interfaceAbstractDemo.Concrete.NeroCustomerManager;
import interfaceAbstractDemo.Concrete.StarbucksCustomerManager;
import interfaceAbstractDemo.Entities.Customer;

public class Main {

	public static void main(String[] args) throws Exception {
		BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());

		BaseCustomerManager fakeMernis = new StarbucksCustomerManager(new CustomerCheckManager());
		BaseCustomerManager baseCustomerManager2 = new NeroCustomerManager();

		Customer yasin = new Customer();
		yasin.setIdentityNumber("01234567890");
		yasin.setFirstName("YASİN");
		yasin.setLastName("ÖZER");
		yasin.setDateOfBirth(1998);
		System.out.println("----------NeroCustomer----------");
		baseCustomerManager2.save(yasin);
		System.out.println("---------fake mernis---------------");
		fakeMernis.save(yasin);
		System.out.println("------result for mernis-------");
		baseCustomerManager.save(yasin);
	}

}
