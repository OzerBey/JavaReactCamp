package homework2.Entities;

public class Instructor extends User {

	private int userId;
	private String firstName;
	private String lastName;
	private String instructorNumber;
	private int numberOfStudent;

	public Instructor() {

	}

	public Instructor(int userId, String firstName, String lastName, String instructorNumber, int numberOfStudent) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.instructorNumber = instructorNumber;
		this.numberOfStudent = numberOfStudent;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
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

	public String getInstructorNumber() {
		return instructorNumber;
	}

	public void setInstructorNumber(String instructorNumber) {
		this.instructorNumber = instructorNumber;
	}

	public int getNumberOfStudent() {
		return numberOfStudent;
	}

	public void setNumberOfStudent(int numberOfStudent) {
		this.numberOfStudent = numberOfStudent;
	}

	

}
