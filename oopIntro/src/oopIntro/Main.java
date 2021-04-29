package oopIntro;

public class Main {
	// Everything is class in java.
	public static void main(String[] args) {
		Product product1 = new Product(); // instance creation
		Product product2 = new Product(); // instance creation
		Product product3 = new Product(); // instance creation

		product1.id = 1;
		product1.name = "LenovoV14";
		product1.unitPrice = 15000;
		product1.detail = "8 GB RAM";

		product2.id = 2;
		product2.name = "LenovoV15";
		product2.unitPrice = 17000;
		product2.detail = "16 GB RAM";

		product3.id = 2;
		product3.name = "Asus FX504GD";
		product3.unitPrice = 17000;
		product3.detail = "32 GB RAM";

		Product products[] = { product1, product2, product3 };

		System.out.println("number of products :" + products.length);

		for (Product product : products) {
			System.out.println(product.id + " " + product.name);
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
