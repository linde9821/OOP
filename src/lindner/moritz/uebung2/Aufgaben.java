package lindner.moritz.uebung2;

/**
 * @author Moritz Lindner
 */
public class Aufgaben {

	public static void main(String[] args) {
		int[] myArr = new int[10];

		for (int i = 0; i < 10; i++) {
			myArr[i] = i + 1;
		}

		// outputIntArr(myArr);

		aufgabe2(myArr);
		aufgabe3();
		aufgabe4();

		aufgabe5();

		aufgabe6();

		aufgabe7();

		aufgabe8();

		aufgabe9();
	}

	public static void outputIntArr(int[] arr) {
		if (arr != null) {
			for (int i : arr) {
				System.out.println(i);
			}
		}
	}

	public static void aufgabe1() {

	}

	public static void aufgabe2(int[] arr) {
		int i = 0;
		while (i < 10) {
			System.out.println(arr[i]);
			i++;
		}

		i = 0;

		do {
			System.out.println(arr[i]);
			i++;
		} while (i < 9);

		for (int k = 0; k < 10; k++) {
			System.out.println(arr[k]);
		}

		for (int d : arr) {
			System.out.println(d);
		}

	}

	public static void aufgabe3() {
		String[][] myArr = { { "0, 0", "0, 1", "0, 2", "0, 3" }, { "1, 0", "1, 1", "1, 2", "1, 3" },
				{ "2, 0", "2, 1", "2, 2" }, { "3, 0", "3, 1", "3, 2", "3, 3" } };

		myArr[2] = new String[4];

		for (int i = 0; i < 4; i++) {
			myArr[2][i] = ("2, " + i);
		}

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(myArr[i][j] + "|");
			}
			System.out.println();
		}

		for (int i = 0; i < myArr.length; i++) {
			for (int j = 0; j < myArr[i].length; j++) {
				System.out.print(myArr[i][j] + "|");
			}
			System.out.println();
		}

	}

	public static void aufgabe4() {
		int[][] ar = { { 1, 2 }, { 3 } };

		for (int a[] : ar) {
			for (int b : a) {
				System.out.print(b + "|");
			}
			System.out.println();
		}
	}

	public static void aufgabe5() {
		long l = (long) Integer.MAX_VALUE + 56;

		System.out.println(l);

		int i = (int) l;

		System.out.println(i);
	}

	public static void aufgabe6() {
		short s = -5;
		char c = (char) s;

		System.out.println(c);
	}

	public static void aufgabe7() {
		float f = 4.f / 5.f;
		int i = (int) f;

		System.out.println("float (4.f/5.f): " + f + "\nint (float cast to int): " + i);
	}

	public static void aufgabe8() {
		float a = 0.0f / 0.0f;
		float b = 1.0f / 0.0f;
		float c = 1.0f / (49 * 49);

		System.out.println("0.0f/0.0f: " + a);
		System.out.println("1.0f/0.0f: " + b);
		System.out.println("1.0f/(49*49): " + c);

		if (Math.sqrt(3) * Math.sqrt(3) == 3) {
			System.out.println("true");
		} else
			System.out.println("false");
	}

	public static void aufgabe9() {
		int i = Integer.MAX_VALUE;

		System.out.println("int max: " + i);
		i += 1;
		System.out.println("int max + 1:" + i);

		float f = Float.MAX_VALUE;

		System.out.println("float max: " + f);
		f += 20f;
		System.out.println("floar max + 20: " + f);
	}
}
