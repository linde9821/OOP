package lindner.moritz.uebung3;

/**
 * Punkt Beschreibt einen Punkt.
 * 
 */
public class Punkt {
	public static void iniPunkt() {
		anzahl = 0; // 77
	}

	public static int anzahl;

	protected double x, y;

	/**
	 * Constructs and initializes a point at x, y in the coordinate space.
	 * 
	 * @param x a double
	 * @param y a double
	 */
	public Punkt(double x, double y) {
		anzahl++;
		System.out.println("Anzahl: " + Punkt.anzahl);

		this.x = x;
		this.y = y;
	}

	public Punkt() {
		this(0, 0);
	}

	public static int getAnzahl() {
		return anzahl;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public static double distanz(Punkt a, Punkt b) {
		double x = a.getX() - b.getX();
		double y = a.getY() - b.getY();

		return Math.sqrt((x * x) + (y * y));
	}

	public void translate(double x, double y) {
		this.x += x;
		this.y += y;
	}

	public void translate(Punkt p) {
		this.translate(p.getX(), p.getY());
	}

	public double flaeche() {
		return 0;
	}

	@Override
	public String toString() {
		return "(" + x + "|" + y + ")";
	}
}
