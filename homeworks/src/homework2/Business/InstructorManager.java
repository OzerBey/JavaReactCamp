package homework2.Business;

import homework2.Entities.User;

public class InstructorManager extends UserManager {

	public void publishCourse() {
		System.out.println("published course");
	}

	public void deleteStudent(User user) {
		System.err.println(user.getFirstName() + " deleted !");
	}
}
