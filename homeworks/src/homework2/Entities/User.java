package homework2.Entities;

public class User { // Base class

	private int id;
	private String imagePath;
	private String eMail;

	public User() { // constructor without parameters

	}

	public User(int id, String imagePath, String eMail) {
		this.id = id;
		this.imagePath = imagePath;
		this.eMail = eMail;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}


}
