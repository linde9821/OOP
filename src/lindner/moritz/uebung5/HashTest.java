package lindner.moritz.uebung5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import lindner.moritz.uebung3.Punkt;

public class HashTest {
	Set<Float> hashSet = new HashSet<Float>();

	public HashTest() {
		for (int i = 5; i >= 0; i--)
			hashSet.add((float) i * i);

		hashSet.add(3.5f);
		hashSet.add(null);
	}

	public static void main(String... args) {
		/*
		 * HashTest hashSetSample = new HashTest();
		 * System.out.println(hashSetSample.hashSet);
		 */

		List<Punkt> punktListe = new ArrayList<Punkt>();

		for (int i = 0; i < 10; i++) {
			punktListe.add(new Punkt(i, Math.sqrt(i)));
		}
		
		System.out.println(punktListe);
	}
}