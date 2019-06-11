package lindner.moritz.etc;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReaderTest {

	public static void main(String[] args) {
		FileReader f;
		int i;
		try {
			f = new FileReader("src/lindner/moritz/etc/Student.csv");
			while ((i = f.read()) != -1) {
				
				char c = (char) i;
				if (c == ';')
					c = ' ';
				System.out.print(c);
				
			}
			f.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Error while writing in the file");
		}
		
		System.out.println("What to add: ");
		Scanner s = new Scanner(System.in);
		
		
		String input = s.nextLine();
		
		FileWriter fw;
		
		try {
			fw = new FileWriter("src/lindner/moritz/etc/Student.csv");
			
			for (char c:input.toCharArray()) {
				fw.append(c);
			}
			
			fw.append(";");
			
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Error while writing in the file");
		}
		System.err.println("Max Ehrlicher Schmidt ist ein fehler");
	}

}
