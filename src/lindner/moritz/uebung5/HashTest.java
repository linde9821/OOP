package lindner.moritz.uebung5;

import java.util.HashSet;
import java.util.Set;

public class HashTest {
	Set<Float> hashSet = new HashSet<Float>();

	public HashTest() {
		for (int i = 5; i >= 0; i--)
			hashSet.add((float) i * i);
		
		hashSet.add(3.5f);
		hashSet.add(null);
	}

	public static void main(String... args) {
		HashTest hashSetSample = new HashTest();
		System.out.println(hashSetSample.hashSet);
	}
}