package homework2.Entities;

public class Student extends User {
	
	private int userId;
	private String firstName;
	private String lastName;
	private int numberOfCourses;

	
	public Student() {

	}


	public Student(int userId, String firstName, String lastName, int numberOfCourses) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.numberOfCourses = numberOfCourses;
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


	public int getNumberOfCourses() {
		return numberOfCourses;
	}


	public void setNumberOfCourses(int numberOfCourses) {
		this.numberOfCourses = numberOfCourses;
	}

	
	

}
