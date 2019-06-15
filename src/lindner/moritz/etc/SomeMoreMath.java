package lindner.moritz.etc;

import java.math.BigInteger;

public class SomeMoreMath {
	public static BigInteger sum(BigInteger i) {
		return (((i.pow(2)).add(i)).divide(new BigInteger("2")));
	}
	
	public static int sum(int i) {
		return Integer.parseInt(sum(new BigInteger(Integer.toString(i))).toString());
	}
	
	public static long sum(long i) {
		return Long.parseLong(sum(new BigInteger(Long.toString(i))).toString());
	}
	
	public static BigInteger sum(String s) {
		return sum(new BigInteger(s));
	}
}
