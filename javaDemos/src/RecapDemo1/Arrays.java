package RecapDemo1;

import java.util.Scanner;

public class Arrays {
	public static void main(String[] args) {
		// miniArrayDemo();
		// doubleArray();
		
		
		
		
		
	}

	public static void doubleArray() {
		double[] myList = { 1.2, 3.4, 5.7, 9.3 };
		double sum = 0;
		double max = myList[0];
		for (double item : myList) {
			if (max < item) {
				max = item;
			}
			sum += item;
			System.out.println(item);
		}
		System.out.println("resul: " + sum);
		System.out.println("max :" + max);
	}

	public static void miniArrayDemo() {
		String std1 = "Yasin";
		String std2 = "Özer";
		String std3 = "Osman";
		String students[] = new String[3];
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < students.length; i++) {
			System.out.println("Enter a name");
			String name = scan.nextLine();
			students[i] = name;
		}
		String a[] = { "ali", "osman", "zeki", "ziya", "pınar", "ayşe", "murtaza" };

		System.out.println("Students added");
		System.out.println("----------Student list---------");
		for (String i : students) {
			System.out.println(i);
		}
	}
}
