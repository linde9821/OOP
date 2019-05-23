package lindner.moritz.uebung4;

import static java.lang.Math.PI;

import java.util.Random;

import lindner.moritz.uebung3.Punkt;

public class uebung4 {

	public static void main(String[] args) {
		// GraphischesObject gO = new GraphischesObject();

		Punkt[] p = new Punkt[3];

		p[0] = new Punkt();
		p[1] = new Punkt(1, 4);
		p[2] = new Punkt(0, 0);

		for (Punkt b : p) {
			System.out.println(b);
		}

		System.out.println(p[2] + "==" + p[0]);

		if (p[2] == p[0]) {
			System.out.println("true");
		} else
			System.out.println("false");

		System.out.println(p[2] + "equals" + p[0]);

		if (p[2].equals(p[0])) {
			System.out.println("true");
		} else
			System.out.println("false");

		
		Aufgabe5();
		
		/*
		 * Was wird verglichen bei == und bei equals
		 */
		String a = "hallo";
		String b = "hallo";
		
		System.out.println(a + "==" + b);
		if (a == b) {
			System.out.println("true");
		} else
			System.out.println("false");

		System.out.println(a + "equals" + b);

		if (a.equals(b)) {
			System.out.println("true");
		} else
			System.out.println("false");
		

		
		System.out.println(Math.PI);
		System.out.println(PI);
	}

	private static void Aufgabe5() {
		String str[] = new String[10];
		String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		Random r = new Random();

		for (int i = 0; i < 10; i++) {
			str[i] = "";
			for (long j = 0; j < 20 /*1000000*/; j++) {
				str[i] += alphabet.charAt(r.nextInt(alphabet.length()));
			}
		}
		
		System.out.println(str[2]);
	}

}
