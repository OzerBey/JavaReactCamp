package firstTask;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<Student>();
		StudentManager studentManager = new StudentManager();
		// ArrayList<Course> courses = new ArrayList<Course>(); // for course array 
		CourseManager courseManager = new CourseManager();
		// student instance
		Student student1 = new Student();
		student1.id = 1;
		student1.firstName = "Yasin";
		student1.lastName = "özer";
		student1.numberOfCourse = 2;

		Student student2 = new Student();
		student2.id = 2;
		student2.firstName = "Zeynep";
		student2.lastName = "Nur";
		student2.numberOfCourse = 1;

		Student student3 = new Student();
		student3.id = 3;
		student3.firstName = "Ozer";
		student3.lastName = "yasin";
		student3.numberOfCourse = 3;

		// course instance
		Course course1 = new Course();
		course1.id = 1;
		course1.name = "C# & Angular";
		course1.IsComplete = true;

		Course course2 = new Course();
		course2.id = 2;
		course2.name = "Programlama Temelleri";
		course2.IsComplete = true;

		Course course3 = new Course();
		course3.id = 3;
		course3.name = "Java & React";
		course3.IsComplete = false;

		// add student with student manager
		studentManager.add(student1, students);
		studentManager.add(student2, students);
		studentManager.add(student3, students);
		// show students list
		studentManager.show(students);

		// add course with course manager
		courseManager.joinToCourse(course1);
		courseManager.joinToCourse(course2);
		courseManager.joinToCourse(course3);
		courseManager.IsSuccesful(course1);

	}

}
