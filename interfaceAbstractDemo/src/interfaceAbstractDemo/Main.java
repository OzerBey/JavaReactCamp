package interfaceAbstractDemo;

import java.time.LocalDate;

import interfaceAbstractDemo.Abstract.BaseCustomerManager;
import interfaceAbstractDemo.Concrete.CustomerCheckManager;
import interfaceAbstractDemo.Concrete.StarbucksCustomerManager;
import interfaceAbstractDemo.Entities.Customer;

public class Main {

	public static void main(String[] args) throws Exception {
		BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new CustomerCheckManager());
		Customer yasin = new Customer();
		yasin.setIdentityNumber("12345678901");
		yasin.setFirstName("yasin");
		yasin.setLastName("özer");
		yasin.setDateOfBirth(LocalDate.of(1998, 5, 15)); // https://www.w3schools.com/java/java_date.asp date time
															// kullanimi
		baseCustomerManager.save(yasin);
	}

}
