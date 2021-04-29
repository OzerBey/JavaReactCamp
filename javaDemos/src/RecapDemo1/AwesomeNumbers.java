package RecapDemo1;

public class AwesomeNumbers {

	public static void main(String[] args) {
		// 6 ->1,2,3
		// 28 ->1,2,4,7,14

		boolean result = AwesomeNumber(28);
		System.out.println(result);
	}

	private static boolean AwesomeNumber(int number) {
		int sum = 0;
		boolean Isfriend = false;
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				sum += i;
			}
		}
		if (sum == number) {
			Isfriend = true;
		}
		return Isfriend;
	}
}
