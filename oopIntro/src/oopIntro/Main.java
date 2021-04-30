package oopIntro;

public class Main {
	// Everything is class in java.
	public static void main(String[] args) {
		Product product1 = new Product(); // instance creation
		Product product2 = new Product(); // instance creation
		Product product3 = new Product(); // instance creation

		// product1
		product1.setId(1);
		product1.setName("AsusFx504");
		product1.setUnitPrice(6500);
		product1.setDetail("8 GB RAM & 1TB HDD");
		product1.setDiscount(10);

		System.out.println(product2.getUnitPriceAfterDiscount());

		//productManagement(product1, product2, product3);

	}

	private static void productManagement(Product product1, Product product2, Product product3) {
		Product products[] = { product1, product2, product3 };

		System.out.println("number of products :" + products.length);

		for (Product product : products) {
			System.out.println(product.getId() + " " + product.getName());
		}
		Category category1 = new Category();
		category1.id = 1;
		category1.name = "Computer";

		Category category2 = new Category();
		category2.id = 2;
		category2.name = "Garden";

		Category category3 = new Category();
		category3.id = 3;
		category3.name = "Livingroom ";

		ProductManager productManager = new ProductManager();
		// 1st product
		productManager.addToCart(product1);
		// 2nd product
		productManager.addToCart(product2);
		// 3rd product
		productManager.addToCart(product3);
	}
}
