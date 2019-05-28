package lindner.moritz.PraxisTest1;

import java.util.ArrayList;
import java.util.List;

public final class Lastwagen {
	private List<Gegenstand> ladungsliste;
	
	public Lastwagen() {
		ladungsliste = new ArrayList<Gegenstand>();
	}
	
	@Override
	public String toString() {
		return ladungsliste.toString() + "\nGesamtgewicht: " + getLadungsGewicht() + "kg";
	}

	public List<Gegenstand> getLadungsliste() {
		return ladungsliste;
	}

	public void setLadungsliste(List<Gegenstand> ladungsliste) {
		this.ladungsliste = ladungsliste;
	}
	
	public double getLadungsGewicht() {
		double gesamtgewicht = 0.0;
		for (Gegenstand g : ladungsliste ) {
			gesamtgewicht += g.getGewicht();
		}
		
		return gesamtgewicht;
	}
	
	public boolean addGegenstand(Gegenstand g) {
		try {
			ladungsliste.add(g);
		}catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
		
		return true;
	}
}
