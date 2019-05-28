package lindner.moritz.PraxisTest1;


public class Schrank extends Gegenstand {
	public static final double SCHRANK_GEWICHT = 20.0d;
	private static int anzahl = 0;

	public Schrank() {
		super(SCHRANK_GEWICHT);
		id = anzahl;
		anzahl++;
		}

	@Override
	public String toString() {
		return "Schrank " + id + " (" + gewicht + "kg)\n";
	}

}
