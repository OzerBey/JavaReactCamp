package RecapDemo1;

public class IsPrimaryNumber {

	public static void main(String[] args) {
		boolean result = IsPrimary(1);
		System.out.println(result);

	}

	private static boolean IsPrimary(int number) {
		boolean Isprimary = true;
		if (number == 1) {
			Isprimary = false;
		}
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				Isprimary = false;
			}
		}
		return Isprimary;

	}

}
