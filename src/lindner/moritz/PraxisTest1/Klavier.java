package lindner.moritz.PraxisTest1;

public class Klavier extends Gegenstand {
	public static final double KLAVIER_GEWICHT = 200.0d;
	private static int anzahl = 0;
	
	public Klavier() {
		super(KLAVIER_GEWICHT);
		id = anzahl;
		anzahl++;
	}

	@Override
	public String toString() {
		return "Klavier " + id + " (" + gewicht + "kg)\n";
	}

}
