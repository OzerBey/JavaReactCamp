package fieldsAndAttribute;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		product.id = 1;
		product.name = "Mouse";
		product.stockAmount = 3;
		product.price = 250;

		ProductManager productManager = new ProductManager();
		productManager.add(product);
		

	}

}
