package oopIntro;

public class Product {

	public Product() {
		System.out.println("cunstructor runnig ");
	}

	public Product(int id, String name, double unitPrice, String detail) { // constructor of Product class
		this();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
	}

	int id;
	String name;
	double unitPrice;
	String detail;

}
