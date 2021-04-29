package homework1;

import java.util.ArrayList;

public class StudentManager {

	public void add(Student student, ArrayList<Student> array) {
		array.add(student);
		System.out.println(student.firstName + " added to students list");
	}

	public void show(ArrayList<Student> array) {
		for (Student student : array) {
			System.out.println(student.firstName);
		}

	}
}
