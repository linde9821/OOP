package lindner.moritz.PraxisTest1;

public class Kiste extends Gegenstand {

	public static final double KISTEN_GEWICHT = 5.0d;
	private static int anzahl = 0;

	public Kiste() {
		super(KISTEN_GEWICHT);
		id = anzahl;
		anzahl++;
	}

	@Override
	public String toString() {
		return "Kiste " + id + " (" + gewicht + "kg)\n";
	}

}
