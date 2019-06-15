package lindner.moritz.uebung8;

public class ZaehlerA6 implements Runnable {


	@Override
	public void run() {
		
		for (int k = 0; k < 10; k++) {
			Uebung8.i++;
			//System.out.println(Uebung11.i);
		}
	}

}
