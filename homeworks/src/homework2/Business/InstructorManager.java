package homework2.Business;

import homework2.Entities.Student;

public class InstructorManager extends UserManager {

	public void publishCourse() {
		System.out.println(" published course");
	}

	public void deleteStudent(Student student) {
		System.err.println(student.getFirstName() + " deleted !");
	}
}
