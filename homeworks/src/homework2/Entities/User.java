package homework2.Entities;

public class User { // Base class

	private int id;
	private String firstName;
	private String lastName;
	private String imagePath;
	private String eMail;

	public User() { // constructor without parameters

	}

	public User(int id, String firstName, String lastName, String imagePath, String eMail) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.imagePath = imagePath;
		this.eMail = eMail;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoto() {
		return imagePath;
	}

	public void setPhoto(String imagePath) {
		this.imagePath = imagePath;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

}
