package homework2;

public class Main {

	public static void main(String[] args) {
		// User
		User instructor = new Instructor();
		instructor.setId(1);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiroğ");
		instructor.setPhoto("https://blabla");
		instructor.seteMail("ngDmrg@abc.com");

		Student student = new Student();
		student.setId(2);
		student.setFirstName("Yasin");
		student.setLastName("Özer");
		student.setPhoto("https://");
		student.seteMail("yasinozeriletisim@gmail.com");

		UserManager userManager = new UserManager();
		userManager.doComment(instructor);
		userManager.doComment(student);
		userManager.sendPhoto(student);

		StudentManager studentManager = new StudentManager();
		studentManager.completionCourse();

		UserManager userManager2 = new InstructorManager();
		userManager2.sendPhoto(instructor);

	}

}
