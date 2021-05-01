package homework2;

public class InstructorManager extends UserManager {

	public void publishCourse() {
		System.out.println("published course");
	}

	public void deleteStudent(User user) {
		System.err.println(user.getFirstName() + " deleted !");
	}
}
