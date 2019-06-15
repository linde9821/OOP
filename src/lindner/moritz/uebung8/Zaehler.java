package lindner.moritz.uebung8;

import java.math.BigInteger;

public class Zaehler extends Thread {
	BigInteger i, max, val;
	
	public Zaehler(BigInteger i, BigInteger max) {
		this.i = i;
		this.max = max.add(new BigInteger("1"));
		val = new BigInteger("0");
	}
	
	@Override
	public void run() {
		int last = 0;

		int p, w, g;
		
		p = 0;
		g = Integer.parseInt(max.min(i).toString());
		w = 0;
		
		do {
			val = val.add(i);
			i = i.add(new BigInteger("1"));
			
			p = w/g * 100;
			
			System.out.println(p);
			
		}while(i.compareTo(max) == -1);
		
		//notifyAll();
	}
}
