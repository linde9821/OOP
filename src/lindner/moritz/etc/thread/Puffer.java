package lindner.moritz.etc.thread;

public class Puffer {
	private boolean wertVorhanden = false;
	private int wert;

	public synchronized void erzeugen(int i) {
		while (wertVorhanden) {
			try {
				wait();
			} catch (InterruptedException e) {
			}

			System.out.println("Erzeugt: " + i);
			wert = i;
			wertVorhanden = true;
			notifyAll();
		}
	}

	public synchronized int verbrauchen() {
		while (!wertVorhanden) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}

		System.out.println("Verbraucht: " + wert);
		wertVorhanden = false;
		notifyAll();
		return wert;
	}
}
