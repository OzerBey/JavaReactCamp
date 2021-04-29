package RecapDemo1;

public class foundNumber {

	public static void main(String[] args) {
		int numbers[] = { 1, 2, 3, 4, 5, 6, 78, 9, 10 };
		boolean result = IsThere(numbers, 10);
		System.out.println(result);
	}

	private static boolean IsThere(int array[], int number) {
		boolean IsThere = false;
		for (int num : array) {
			if (num == number) {
				IsThere = true;
			}
		}
		return IsThere;
	}

}
