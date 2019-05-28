package lindner.moritz.PraxisTest1;

public abstract class Gegenstand {
	protected double gewicht;
	protected int id;
	
	public Gegenstand(double gewicht) {
		this.gewicht = gewicht;
	}

	public double getGewicht() {
		return gewicht;
	}
	
	public void changeGewicht(double gewicht) {
		this.gewicht = gewicht;
	}
	
	public int getId() {
		return id;
	}

	@Override
	public abstract String toString();
}
