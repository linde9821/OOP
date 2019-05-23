package lindner.moritz.uebung3;

public class Linie extends Punkt {
	Punkt b;

	public Linie() {
		this(0, 0, 0, 0);
	}

	public Linie(Punkt a, Punkt b) {
		this(a.getX(), a.getY(), b.getX(), b.getY());
	}

	public Linie(double x1, double y1, double x2, double y2) {
		super(x1, y1);
		
		this.b = new Punkt(x2, y2);
	}
	
	public double flaeche() {
		return 0;
	}
}
