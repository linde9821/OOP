/**
 * @author Moritz Lindner
 * @since 27.05.2019
 */

package lindner.moritz.uebung6;

import java.io.BufferedWriter;
import java.io.File;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class Uebung6 {

	public static void main(String[] args) {
		Uebung6 uebung6 = new Uebung6();

		uebung6.aufgabe0();
		uebung6.aufgabe1();

	}

	public void aufgabe0() {
		List l = null;

		try {
			l.get(0);
		} catch (NullPointerException e) {
			System.out.println("NullPointerException aufgetreten und behoben.");
			l = new ArrayList<Integer>();
		} catch (Exception e) {
			System.out.println("Unbekannter fehler aufgetreten");
		}
	}

	public void aufgabe1() {
		File file = new File("C:" + File.separator + "Windows");

		System.out.println(file.getAbsolutePath());
		System.out.println(file.getName());

		// Dateiattribute Folgen
	}

	public void aufgabe2() {

	}

}
