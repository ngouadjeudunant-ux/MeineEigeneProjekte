package javaZertifizierung.Kapitel1;

public class Gdp {

	public static int[] doubleArray(int[] array) {

		int[] result = new int[array.length];

		for (int i = 0; i < array.length; i++) {
			result[i] = array[i] * 2;
		}

		return result;

	}

	public static int[] doubleArr(int[] array) {

		for (int i = 0; i < array.length; i++) {
			array[i] = array[i] * 2;
		}

		return array;

	}

	public static int doubleArr2(int[] array) {
		int b = 0; 
		for (int i = 0; i < array.length; i++) {
			b++;
		}

		return b;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 1 + 0x10;

		System.out.println("i = " + i);

		Double d = 2.0;
		double e = 2.0;
		boolean b = d == e;

		System.out.println(b);
	}

}
