package lindner.moritz.uebung1;

/**
 * @author Moritz Lindner
 */
public class Aufgabe3 {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + ": " + (i * i));
		}
		
		int y = 4;
		
		int x = (y>0)?7:8;
		
		System.out.println(x);
	}
}
