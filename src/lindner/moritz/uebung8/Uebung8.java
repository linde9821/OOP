package lindner.moritz.uebung8;

import java.math.BigInteger;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;

import lindner.moritz.etc.SomeMoreMath;

public class Uebung8 {

	public static Integer i = 0;

	public static void main(String[] args) {

		// Aufgabe 1
		HelloWorld helloWorld = new HelloWorld();
		helloWorld.start();

		// Aufgabe 2
		HelloWorld2 helloWorld2 = new HelloWorld2();
		Thread t = new Thread(helloWorld2);
		t.start();

		Instant beg = Instant.now();
		BigInteger ergb = SomeMoreMath.sum("1000000");

		System.out.println("Time:" + Duration.between(beg, Instant.now()).toMillis() + "ms");
		System.out.println(ergb);

		// Aufgabe 3
		Zaehler z1 = new Zaehler(new BigInteger("0"), new BigInteger("1000000"));
		beg = Instant.now();
		z1.start();

		try {
			z1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Time:" + Duration.between(beg, Instant.now()).toMillis() + "ms");
		System.out.println(z1.val);

		beg = Instant.now();

		z1 = new Zaehler(new BigInteger("0"), new BigInteger("333333"));
		Zaehler z2 = new Zaehler(new BigInteger("333334"), new BigInteger("666666"));
		Zaehler z3 = new Zaehler(new BigInteger("666667"), new BigInteger("1000000"));
		z1.start();
		z2.start();
		z3.start();

		// Aufgabe 4
		try {
			z1.join();
			z2.join();
			z3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		ergb = z1.val.add(z2.val.add(z3.val));
		System.out.println("Time:" + Duration.between(beg, Instant.now()).toMillis() + "ms");
		System.out.println(ergb);

		// Aufgabe 5
		z1 = new Zaehler(new BigInteger("0"), new BigInteger("333333"));
		z2 = new Zaehler(new BigInteger("333334"), new BigInteger("666666"));
		z3 = new Zaehler(new BigInteger("666667"), new BigInteger("1000000"));
		beg = Instant.now();
		z1.start();
		z2.start();
		z3.start();

		try {
			z1.join();
			z2.join();
			z3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Time:" + Duration.between(beg, Instant.now()).toMillis() + "ms");

		ergb = z1.val.add(z2.val.add(z3.val));

		System.out.println(ergb);

		// Aufgabe 6
		ArrayList<Thread> tl = new ArrayList<Thread>();

		for (int i = 0; i < 10; i++) {
			tl.add(new Thread(new ZaehlerA6(), "Zaehler " + i));
		}

		synchronized (i) {
			for (Thread ta : tl) {
				ta.start();
			}

			for (Thread ta : tl) {
				try {
					ta.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

		System.out.println(i);
	}
}
