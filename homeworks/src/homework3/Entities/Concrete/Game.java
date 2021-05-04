package homework3.Entities.Concrete;

import homework3.Entities.Abstract.Entity;

public class Game implements Entity {

	private int id;
	private String name;
	private String publishDate;
	private String price;

	public Game() {

	}

	public Game(int id, String name, String publishDate, String price) {
		super();
		this.id = id;
		this.name = name;
		this.publishDate = publishDate;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

}
