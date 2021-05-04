package homework3.Entities.Concrete;

import homework3.Entities.Abstract.Entity;

public class Player implements Entity{

	private int id;
	private String identityNumber;
	private String firstName;
	private String lastName;
	private String yearOfBirth;

	public Player() {

	}

	public Player(int id, String identityNumber, String firstName, String lastName, String yearOfBirth) {
		super();
		this.id = id;
		this.identityNumber = identityNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.yearOfBirth = yearOfBirth;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIdentityNumber() {
		return identityNumber;
	}

	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
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

	public String getYearOfBirth() {
		return yearOfBirth;
	}

	public void setYearOfBirth(String yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

}
