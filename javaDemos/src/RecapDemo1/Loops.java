package RecapDemo1;

public class Loops {
	public static void main(String[] args) {
		// for
		for (int i = 0; i <= 10; i += 1) {
			System.out.println(i);
		}
		System.out.println("For loop is over ");
		// while loop
		int i = 1;
		while (i < 10)

		{
			System.out.println(i);
			i += 2;
		}
		System.out.println("While loop is over ");
		// do-while loop
		int j=1;
		do {
			System.out.println(j);
			j+=2;
		} while (j<10);
		System.out.println("do- while loop is over ");
	}
}