import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) throws FileNotFoundException {

		// Napisati program koji prolazi kroz fajl maraton.txt, a zatim ispisuje
		// imena ucesnika i njihova vremena
		// sortirane prema vremenu koje su ostvarili od najmanjeg prema
		// najvecem.

		FileReader fr = new FileReader("maraton.txt");
		BufferedReader br = new BufferedReader(fr);

		Scanner sc = new Scanner(br);

		ArrayList<Ucesnik> ucesnici = new ArrayList<Ucesnik>();

		String ime = null;
		int vrijeme;

		while (sc.hasNext()) {
			ime = sc.next();
			vrijeme = sc.nextInt();

			Ucesnik player1 = new Ucesnik(ime, vrijeme);

			ucesnici.add(player1);
		}

		for (int i = 0; i < ucesnici.size(); i++) {
			System.out.println(ucesnici.get(i).getImena() + " " + ucesnici.get(i).getVremena());
		}

		System.out.println("\nOd najmanjeg vremena:");

		Collections.sort(ucesnici, new Comparator<Ucesnik>() {
			public int compare(Ucesnik u1, Ucesnik u2) {
				return Integer.valueOf(u1.getVremena()).compareTo(u2.getVremena());
			}

		});
		
		for (int i = 0; i < ucesnici.size(); i++) {
			System.out.println(ucesnici.get(i).getImena() + " " + ucesnici.get(i).getVremena());
		}
	}

}
