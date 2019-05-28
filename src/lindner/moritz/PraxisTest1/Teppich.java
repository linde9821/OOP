package lindner.moritz.PraxisTest1;

public class Teppich extends Gegenstand {
	public static double TEPPICH_GEWICHT = 20.0d;
	private static int anzahl = 0;

	public Teppich() {
		super(TEPPICH_GEWICHT);
		id = anzahl;
		anzahl++;
	}

	@Override
	public String toString() {
		return "Teppich " + id + " (" + gewicht + "kg)\n";
	}

}
