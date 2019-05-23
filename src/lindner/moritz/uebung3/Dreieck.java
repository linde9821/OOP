package lindner.moritz.uebung3;

public class Dreieck extends Punkt {
	double x2, y2, x3, y3;

	public Dreieck(double x1, double y1, double x2, double y2, double x3, double y3) {
		super(x1, y1);

		this.x2 = x2;
		this.y2 = y2;
		this.x3 = x3;
		this.y3 = y3;
	}

	public Dreieck(Punkt a, Punkt b, Punkt c) {
		this(a.getX(), a.getY(), b.getX(), b.getY(), c.getX(), c.getY());
	}

	public double flaeche() {
		double length = Punkt.distanz(new Punkt(x, y), new Punkt(x2, y2)) / 2;
		Punkt h = new Punkt(x + length, y);
		
		return Punkt.distanz(new Punkt(x, y), h) * Punkt.distanz(h, new Punkt(x3, y3));
	}
}
