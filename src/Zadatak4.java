import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class Zadatak4 {

	public static void main(String[] args) throws FileNotFoundException {
		// Napisati program koji prolazi kroz fajl maraton.txt i ispisuje
		// prosjecno vrijeme koje je bilo potrebno ucesnicima da zavrse maraton.

		boolean uspjesno = false;
		int brojPokusaja = 0;

		while ((!uspjesno) && (brojPokusaja != 3))
			try {
				Scanner unos = new Scanner(System.in);
				String fileName;

				System.out.println("Unesite ime fajla kojeg zelite uèitati: ");
				fileName = unos.next();
				File file = new File(fileName);

				FileReader fr = new FileReader(file);
				BufferedReader br = new BufferedReader(fr);

				Scanner sc = new Scanner(br);

				ArrayList<Ucesnik> ucesnici = new ArrayList<Ucesnik>();

				int ukupnoVrijeme = 0;

				while (sc.hasNext()) {
					String ime = sc.next();
					int vrijeme = sc.nextInt();

					Ucesnik ucesnik = new Ucesnik(ime, vrijeme);

					ucesnici.add(ucesnik);
				}

				sc.close();

				for (int i = 0; i < ucesnici.size(); i++) {
					ukupnoVrijeme += ucesnici.get(i).getVremena();
				}

				System.out.println("Ukupno vrijeme rezultata maratona: " + ukupnoVrijeme + " min");
				System.out
						.println("Prosjecno vrijeme rezultata maratona: " + (ukupnoVrijeme / ucesnici.size()) + " min");

				uspjesno = true;
				// granica = 3;

			} catch (Exception e) {
				System.out.println("Fajl nije pronaðen! " + e);
				brojPokusaja++;
				System.out.println("Pokušaji: " + brojPokusaja + "/3");
				if (brojPokusaja == 3)
					System.out.println("Traži ðe drugo aranee!");

			}
	}

}
