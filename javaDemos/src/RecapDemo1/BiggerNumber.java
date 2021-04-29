package RecapDemo1;

import java.util.ArrayList;

public class BiggerNumber {

	public static void main(String[] args) {
		int sayi1 = 20 * 100;
		int sayi2 = 25;
		int sayi3 = 200;
		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(sayi1);
		array.add(sayi2);
		array.add(sayi3);
		System.out.println(foundIt(array));
	}

	static int foundIt(ArrayList<Integer> array) {
		int max = 0;
		for (int i : array) {
			if (i > max) {
				max = i;
			}
		}
		return max;
	}
}
