package RecapDemo1;

public class MultiDimensionalDemo {
	public static void main(String[] args) {
		String cities[][] = new String[3][3]; // 3 rows 3 cols
		cities[0][0] = "İstanbul";
		cities[0][1] = "Ankara";
		cities[0][2] = "İzmir";

		cities[1][0] = "Mersin";
		cities[1][1] = "Elazığ";
		cities[1][2] = "Elbistan";

		cities[2][0] = "Maraş";
		cities[2][1] = "Kars";
		cities[2][2] = "Mardin";

		for (int i = 0; i < cities.length; i++) {
			for (int j = 0; j < cities.length; j++) {
				System.out.println("i:" + i + " j: " + j);
				System.out.println(cities[i][j]);
			}
		}
	}

}
