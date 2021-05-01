package homework2.Entities;

public class Student extends User {

	private int numberOfCourses;

	public Student() {

	}

	public Student(int numberOfCourses) {
		super();
		this.numberOfCourses = numberOfCourses;
	}

	public int getNumberOfCourses() {
		return numberOfCourses;
	}

	public void setNumberOfCourses(int numberOfCourses) {
		this.numberOfCourses = numberOfCourses;
	}

}
