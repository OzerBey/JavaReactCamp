package homework1;

public class CourseManager {

	public void joinToCourse(Course course) {
		System.out.println("you joined to " + course.name + " Course");
	}

	public boolean IsSuccesful(Course course) {
		if (course.IsComplete) {
			return true;
		} else {
			return false;
		}

	}
}
