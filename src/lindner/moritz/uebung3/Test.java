package lindner.moritz.uebung3;

public class Test {
	int testVar;

	public static void main(String[] args) {
		Rechteck r = new Rechteck(0, 0, 0, 2, 2, 2, 2, 0);
	
		System.out.println(r.flaeche());
		r.getC().setX(5);
		System.out.println(r.flaeche());

		Dreieck d = new Dreieck(0, 0, 3, 0, 1.5d, 1.5d);
		
		System.out.println(d.flaeche());

	}

	public void testMethode(int testVar) {
		// int testVar;

		System.out.println(testVar);
		System.out.println(this.testVar);
	}
}
