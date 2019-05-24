package lindner.moritz.uebung5;

import static java.lang.Math.random;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.Vector;

public class Uebung5 {
	ArrayList<Float> liste = new ArrayList<Float>();

	public static void main(String[] args) {
		Uebung5 uebung5 = new Uebung5();

		for (int i = 0; i < 5; i++) {
			uebung5.liste.add((i + 1) * (i - 0.2f));
		}

		uebung5.aufgabe1();
		System.out.println();
		uebung5.aufgabe2();
		System.out.println();
		uebung5.aufgabe3_1();
		System.out.println();
		uebung5.aufgabe3_2();
		System.out.println();
		uebung5.aufgabe3_3();
		System.out.println();
		uebung5.aufgabe4();
		System.out.println();
		uebung5.aufgabe5();
		System.out.println();
		uebung5.aufgabe6();
		System.out.println();
		uebung5.aufgabe6_2();
		System.out.println();
		uebung5.aufgabe7();
		
	}

	private void aufgabe1() {
		Iterator<Float> it = liste.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

	private void aufgabe2() {
		Iterator<Float> it = liste.iterator();

		float sum = 0.0f;

		while (it.hasNext()) {
			sum += it.next();
		}

		System.out.println("Summe: " + sum);
	}

	private void aufgabe3_1() {
		Iterator<Float> it = liste.iterator();

		float sum = 100.0f;

		while (it.hasNext()) {
			sum -= it.next();
		}

		System.out.println("Subtraktion von 100: " + sum);
	}

	private void aufgabe3_2() {
		Iterator<Float> it = liste.iterator();

		float sum = 1.0f;

		while (it.hasNext()) {
			sum *= it.next();
		}

		System.out.println("Multiplikation: " + sum);
	}

	private void aufgabe3_3() {
		Iterator<Float> it = liste.iterator();

		float sum = 1000f;

		while (it.hasNext()) {
			sum /= it.next();
		}

		System.out.println("1000/alle: " + sum);
	}

	private void aufgabe4() {
		ArrayList<Double> liste = new ArrayList<Double>();

		for (int i = 0; i < 25; i++) {
			liste.add(random() * 100);
		}

		Iterator<Double> it = liste.iterator();

		System.out.println("Aufgabe 4 [unssortiert]");

		while (it.hasNext()) {
			System.out.println(it.next());
		}

		Collections.sort(liste);

		it = liste.iterator();

		System.out.println("Aufgabe 4 [sortiert]");

		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

	private void aufgabe5() {
		final int AMOUNT_TO_GENERATE = 10000000;
		
		ArrayList<Double> liste = new ArrayList<Double>();
		Vector<Double> vector = new Vector<Double>();
		LinkedList<Double> linkedList = new LinkedList<Double>();

		Duration listDuration, vectorDuration, linkedListDuration;
		
		List<Double> randList = new ArrayList<Double>(10000000);
		for (int i = 2; i <= 10000000; i++) {
			randList.add( random() * 100);
		}
		
		Instant beg = Instant.now();
		/*for (int i = 0; i < AMOUNT_TO_GENERATE; i++) {
			double valueToAdd = random() * 100;
			liste.add(valueToAdd);
		}*/
		for (double d : randList) {
			vector.add(d);
		}
		vectorDuration = Duration.between(beg, Instant.now());

		beg = Instant.now();
		/*for (int i = 0; i < AMOUNT_TO_GENERATE; i++) {
			double valueToAdd = random() * 100;
			vector.add(valueToAdd);
		}*/
		for (double d : randList) {
			liste.add(d);
		}
		listDuration = Duration.between(beg, Instant.now());

		beg = Instant.now();
		/*for (int i = 0; i < AMOUNT_TO_GENERATE; i++) {
			double valueToAdd = random() * 100;
			linkedList.add(valueToAdd);
		}*/
		for (double d : randList) {
			linkedList.add(d);
		}
		linkedListDuration = Duration.between(beg, Instant.now());

		System.out.println("Laufzeiten für das Eintragen von " + AMOUNT_TO_GENERATE + " Werten:");

		System.out.println("List: " + listDuration.toMillis() + "ms");
		System.out.println("Vector: " + vectorDuration.toMillis() + "ms");
		System.out.println("LinkedList: " + linkedListDuration.toMillis() + "ms");
	}

	private void aufgabe6() {
		Random r = new Random();
		Set<Integer> lottozahlen = new HashSet<Integer>();

		for (int i = 0; i < 6; i++) {
			while (!lottozahlen.add(r.nextInt(49) + 1))
				;
		}

		System.out.println("Generierte Lottozahlen mit Set<Integer>: " + lottozahlen);
	}

	private void aufgabe6_2() {
		Random r = new Random();
		BitSet lottozahlen = new BitSet();

		for (int i = 0; i < 6; i++) {
			int indexToChange = r.nextInt(49);

			if (!lottozahlen.get(indexToChange))
				lottozahlen.set(r.nextInt(49) + 1);
			else
				i--;
		}

		System.out.println("Generierte Lottozahlen mit BitSet: " + lottozahlen);
	}

	private void aufgabe7() {
		HashMap<String, String> teileDatenbank = new HashMap<String, String>();

		teileDatenbank.put("M0", "Schraube");
		teileDatenbank.put("M1", "Schraubezieher");
		teileDatenbank.put("M2", "Bohrer");
		teileDatenbank.put("M3", "Hammer");
		teileDatenbank.put("M4", "Zange");

		System.out.println("Suche nach M3: " + teileDatenbank.get("M3"));
		System.out.println("Suche nach M4: " + teileDatenbank.get("M4"));
		System.out.println("Suche nach M7: " + teileDatenbank.get("M7"));
	}
}