package lindner.moritz.etc.thread;

public class Erzeuger implements Runnable {
	private Puffer puffer;
	private int initialWert;
	
	public Erzeuger(Puffer p, int i) {
		puffer = p;
		initialWert = i;
	}

	@Override
	public void run() {
		for (int i = initialWert; i < initialWert + 10; i++) {
			puffer.erzeugen(i);
		}
	}
	
	
}
