import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Zadatak7 {

	public static void main(String[] args) throws IOException {
		// Napisati program koji ucitava imena iz fajla imena.txt, a zatim ih
		// ispisuje sortirane po abecedi.

		FileReader fr = new FileReader("imena.txt");
		BufferedReader br = new BufferedReader(fr);

		Scanner sc = new Scanner(br);
		String ime;

		ArrayList<String> imena = new ArrayList<>();

		while (sc.hasNext()) {
			ime = sc.next();
			imena.add(ime);

		}
		for (String s : imena) {
			System.out.println(s);
		}

		System.out.println("\nAbecedni raspored: \n");

		Collections.sort(imena);

		for (int i = 0; i < imena.size(); i++) {
			System.out.println(imena.get(i));
		}

	}

}
