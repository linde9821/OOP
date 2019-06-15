package lindner.moritz.etc.thread;

public class Verbraucher implements Runnable {
	private Puffer puffer;
	
	public Verbraucher(Puffer p) {
		puffer = p;
	}
	
	
	@Override
	public void run() {
		for (int i = 0; i <10; i++) {
			int wert = puffer.verbrauchen();
		}
	}

}
