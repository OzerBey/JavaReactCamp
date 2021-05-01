package homework2.UI;

import homework2.Business.InstructorManager;
import homework2.Business.StudentManager;
import homework2.Business.UserManager;
import homework2.Entities.Instructor;
import homework2.Entities.Student;

public class Main {

	public static void main(String[] args) {
		// instructor
		Instructor instructor = new Instructor();
		instructor.setId(1);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiroğ");
		instructor.setPhoto("https://blabla");
		instructor.seteMail("ngDmrg@abc.com");
		instructor.setInstructorNumber("12345");
		instructor.setNumberOfStudent(10000);

		// student
		Student student = new Student();
		student.setId(2);
		student.setFirstName("Yasin");
		student.setLastName("Özer");
		student.setPhoto("https://");
		student.seteMail("yasinozeriletisim@gmail.com");
		student.setNumberOfCourses(3);

		UserManager userManager = new UserManager();
		userManager.doComment(instructor);
		userManager.doComment(student);
		userManager.sendPhoto(student);
		userManager.showProfile(instructor);

		StudentManager studentManager = new StudentManager();
		studentManager.completionCourse(student);

		InstructorManager userManager2 = new InstructorManager();
		userManager2.sendPhoto(instructor);
		userManager2.deleteStudent(student);// retrun alert message

	}

}
