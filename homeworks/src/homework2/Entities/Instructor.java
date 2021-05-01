package homework2.Entities;

public class Instructor extends User {

	private String instructorNumber;
	private int numberOfStudent;

	public Instructor() {
		
	}
	
	
	
	public Instructor(String instructorNumber, int numberOfStudent) {
		super();
		this.instructorNumber = instructorNumber;
		this.numberOfStudent = numberOfStudent;
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
