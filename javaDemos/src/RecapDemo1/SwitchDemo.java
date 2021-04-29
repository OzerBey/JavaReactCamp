package RecapDemo1;

public class SwitchDemo {

	public static void main(String[] args) {
		char grade = 'F';
		switch (grade) {
		case 'A':
			System.out.println("AWesome :D");
			break;
		case 'B':
			System.out.println("Great ");
		case 'C':
			System.out.println("Good.");
		case 'F':
			System.out.println("So so ...");
			break;
		default:
			System.out.println("Ivalid grade ! ");
			break;
		}
	}

}
