/**
 * @author Moritz Lindner
 * @since 27.05.2019
 */

package lindner.moritz.uebung6;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Uebung6 {

	public static void main(String[] args) {
		Uebung6 uebung6 = new Uebung6();

		// uebung6.aufgabe0();
		// uebung6.aufgabe1();
		// uebung6.aufgabe2();
		// uebung6.aufgabe3();
		uebung6.aufgabe8();
	}

	public void aufgabe0() {
		List l = null;

		try {
			l.get(0);
		} catch (NullPointerException e) {
			System.out.println("NullPointerException aufgetreten und behoben.");
			l = new ArrayList<Integer>();
		} catch (Exception e) {
			System.out.println("Unbekannter fehler aufgetreten");
		}
	}

	public void aufgabe1() {
		File file = new File(
				"C:\\Users\\Moritz\\Google Drive\\Studium\\Semester-2\\Objektorientierte Programmierung\\Scripte");

		System.out.println(file.getAbsolutePath());
		System.out.println(file.getName());
		System.out.println("exists: " + file.exists());
		System.out.println("last Modified: " + file.lastModified());
		System.out.println("is file: " + file.isFile());
		System.out.println("is directory: " + file.isDirectory());

		// Dateiattribute Folgen
	}

	public void aufgabe2() {
		File dir = new File("files");

		if (!dir.exists() || !dir.isDirectory())
			dir.mkdir();

		File file = new File(dir, "a2file.dat");
		FileOutputStream f = null;

		try {
			file.createNewFile();
			f = new FileOutputStream(file);

			for (int i = 0; i < 100; i++) {
				byte b = 2;
				f.write(b);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				f.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	public void aufgabe3() {
		File dir = new File("files");
		File file = new File(dir, "a2file.dat");

		file.delete();
	}

	public void aufgabe4() {
		File file = new File("files" + File.pathSeparator + "a4.txt");

		try {
			FileWriter fw = new FileWriter(file);
			file.createNewFile();

			// fw.write();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void aufgabe5() {
		File file = new File("files" + File.pathSeparator + "a5.txt");

		try {
			file.createNewFile();
			FileOutputStream fw = new FileOutputStream(file);

			// fw.write();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void aufgabe7() {
		File file = new File("files" + File.separator + "a7.dat");
		RandomAccessFile randAccessFile = null;

		try {
			file.createNewFile();
			randAccessFile = new RandomAccessFile(file, "rw");

			Random r = new Random();
			Set<Integer> lottozahlen = new HashSet<Integer>();

			for (int i = 0; i < 6; i++) {
				while (!lottozahlen.add(r.nextInt(49) + 1))
					;
			}

			for (int i : lottozahlen) {
				randAccessFile.write(i);
			}

			System.out.println("Output from file:");

			randAccessFile.seek(0);

			int val = randAccessFile.read();

			while (val != -1) {
				System.out.print(val + " ");
				val = randAccessFile.read();
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				randAccessFile.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void aufgabe8() {
		File file = new File("files" + File.pathSeparator + "a8.dat");
		RandomAccessFile randAccessFile = null;

		try {
			file.createNewFile();
			randAccessFile = new RandomAccessFile(file, "rw");

			randAccessFile.seek(10);

			randAccessFile.writeChar('a');
			randAccessFile.writeChar('b');
			randAccessFile.writeChar('c');
			randAccessFile.writeChar('d');

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				randAccessFile.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
