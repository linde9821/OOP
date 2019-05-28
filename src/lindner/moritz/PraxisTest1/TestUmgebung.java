package lindner.moritz.PraxisTest1;

public class TestUmgebung {

	public static void main(String[] args) {
		Lastwagen lastwagen = new Lastwagen();

		// add Schränke
		for (int i = 0; i < 3; i++) {
			lastwagen.addGegenstand(new Schrank());
		}

		// add Kisten
		for (int i = 0; i < 20; i++) {
			lastwagen.addGegenstand(new Kiste());
		}

		// add Teppich
		for (int i = 0; i < 4; i++) {
			lastwagen.addGegenstand(new Teppich());
		}

		// add Klavier
		lastwagen.addGegenstand(new Klavier());

		// Ausgabe
		System.out.println(lastwagen);
	}

}
