import java.util.Scanner;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class Zadatak6 {

	private static int brojLinija(String str) {
		String[] lines = str.split("\r\n|\r|\n");
		return lines.length;
	}

	public static void main(String[] args) throws IOException {

		// Napisati program koji ispisuje koliko ima linija u fajlu koji se
		// nalazi na sledecoj adresi:
		// http://www.textfiles.com/science/astronau.txt

		URL url = new URL("http://www.textfiles.com/science/astronau.txt");
		InputStreamReader isr = new InputStreamReader(url.openStream());
		BufferedReader br = new BufferedReader(isr);

		int brojLinija = 1;

		while (br.readLine() != null) {
			brojLinija++;
		}
		System.out.println("Broj linija u tekstu sa navedene stranice je: " + brojLinija);
	}

}
