package homework2.Business;

import homework2.Entities.Student;

public class StudentManager extends UserManager {

	
	public void completionCourse(Student student) {
		System.out.println(student.getFirstName() + " completed your course ");

	}
}
