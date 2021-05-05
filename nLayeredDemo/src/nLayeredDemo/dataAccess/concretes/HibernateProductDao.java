package nLayeredDemo.dataAccess.concretes;

import java.util.List;

import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;

public class HibernateProductDao implements ProductDao {

	@Override
	public void add(Product product) {
		System.out.println(product.getName() + " added with Hibernate");
	}

	@Override
	public void update(Product product) {
		System.out.println(product.getName() + " updated with Hibernate");

	}

	@Override
	public void delete(Product product) {
		System.out.println(product.getName() + " deleted with Hibernate");

	}

	@Override
	public Product getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
