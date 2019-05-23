package lindner.moritz.uebung3;

/**
 * @author lindn
 *
 */
public class Rechteck extends Punkt {
	private Punkt b, c, d;

	public Rechteck(Punkt mittelpunkt) {
		this(Math.sqrt((mittelpunkt.getX() * mittelpunkt.getX()) + (mittelpunkt.getY() * mittelpunkt.getY())));
	}

	public Rechteck(double ausdehnung) {
		this(-ausdehnung / 2, ausdehnung / 2, ausdehnung / 2, ausdehnung / 2, -ausdehnung / 2, -ausdehnung / 2,
				ausdehnung / 2, -ausdehnung / 2);
	}

	public Rechteck(Punkt a, Punkt b, Punkt c, Punkt d) {
		this(a.getX(), a.getY(), b.getX(), b.getY(), c.getX(), c.getY(), d.getX(), d.getY());
	}

	public Rechteck(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
		super(x1, y1);
		this.b = new Punkt(x2, y2);
		this.c = new Punkt(x3, y3);
		this.d = new Punkt(x4, y4);
	}

	public double flaeche() {
		return Punkt.distanz(new Punkt(x, y), b) * Punkt.distanz(c, d);
	}

	
	public Punkt getB() {
		return b;
	
	}

	public void setB(Punkt b) {
		this.b = b;
	}

	public Punkt getC() {
		return c;
	}

	public void setC(Punkt c) {
		this.c = c;
	}

	public Punkt getD() {
		return d;
	}

	public void setD(Punkt d) {
		this.d = d;
	}
	
	
}
