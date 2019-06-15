package lindner.moritz.uebung10;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAmount;
import java.util.Date;


//Zeitberechnung mit Java 
public class Uebung10 {

	public static void main(String[] args) {
		Uebung10 u10 = new Uebung10();

		System.out.println("Aufgabe 1:");
		u10.aufgabe1();

		System.out.println("Aufgabe 2:");
		u10.aufgabe2();
		
		System.out.println("Aufgabe 3:");
		u10.aufgabe3();
		
		System.out.println("Aufgabe 4:");
		u10.aufgabe4();
		
		System.out.println("Aufgabe 5:");
		
		System.out.println("Aufgabe 6:");
	}

	public void aufgabe1() {
		Date date = new Date();
		System.out.println(date);
	}

	public void aufgabe2() {
		Duration reise = Duration.of(5, ChronoUnit.HOURS);
		
		System.out.println("5h Reise in Minuten: " + reise.toMinutes());
		System.out.println("5h Reise in Sekunden: " + reise.toSeconds());
	}
	
	public void aufgabe3() {
		final LocalDate myBirthday = LocalDate.of(1998, Month.SEPTEMBER, 21);
		final LocalDate geschätztesTodesdatum = LocalDate.of(2078, Month.JUNE, 27);
		
		final long lebenzeiz = ChronoUnit.DAYS.between(myBirthday, geschätztesTodesdatum);
		float p = (float) ChronoUnit.DAYS.between(myBirthday, LocalDate.now()) / (float)lebenzeiz * 100;
		System.out.println("Lebenszeit in Tagen: " + lebenzeiz);
		System.out.println("Verbaucht: " + ChronoUnit.DAYS.between(myBirthday, LocalDate.now()) + " (" + p + "%)");
		System.out.println("Übrig: " + ChronoUnit.DAYS.between(LocalDate.now(), geschätztesTodesdatum));
	}
	
	public void aufgabe4() {
		/*
		final ChronoUnit a = ChronoUnit.ERAS;
		Period b = new Period(a);
		
		System.out.println("Eine Äre entspricht ");
		*/
		System.out.println("Nicht eingebaut");
	}
	
	public void aufgabe5() {
		
	}
	
	public void aufgabe6() {
		
	}
}
