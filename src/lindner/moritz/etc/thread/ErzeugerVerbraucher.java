package lindner.moritz.etc.thread;

public class ErzeugerVerbraucher {

	public static void main(String[] args) {
		Puffer p = new Puffer();
		Thread erzeuger1 = new Thread(new Erzeuger(p, 0), "Erzeuger1");
		Thread erzeuger2 = new Thread(new Erzeuger(p, 0), "Erzeuger2");
		Thread verbraucher1 = new Thread(new Verbraucher(p), "Verbraucher1");
		Thread verbraucher2 = new Thread(new Verbraucher(p), "Verbraucher2");
		
		erzeuger1.start();
		erzeuger2.start();
		verbraucher1.start();
		verbraucher2.start();
		
	}

}
