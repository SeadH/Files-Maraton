import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.io.*;

public class Zadatak5 {

	public static void main(String[] args) throws IOException {
		// Napisati program koji prolazi kroz fajl maraton.txt, pronalazi
		// ucesnike koji su zavrsili maraton za manje od 300 minuta,
		// zatim sprema njihova imena i vrijeme u novi fajl pod nazivom
		// najboljiMaratonci.txt

		FileReader fr = new FileReader("maraton.txt");
		BufferedReader br = new BufferedReader(fr);

		Scanner sc = new Scanner(br);

		ArrayList<Ucesnik> ucesnici = new ArrayList<Ucesnik>();
		String ime;
		int vrijeme;
		int i;
		int best;

		while (sc.hasNext()) {
			ime = sc.next();
			vrijeme = sc.nextInt();

			if (vrijeme < 300) {
				Ucesnik ucesnik = new Ucesnik(ime, vrijeme);

				ucesnici.add(ucesnik);
			}
		}

		for (i = 0; i < ucesnici.size(); i++) {
			System.out.println(i + (1) + ". " + ucesnici.get(i).getImena() + " " + ucesnici.get(i).getVremena());
		}

		PrintWriter pw = new PrintWriter("najboljiMartonci.txt");
		BufferedWriter bw = new BufferedWriter(pw);

		for (i = 0; i < ucesnici.size(); i++) {
			bw.write(i + (1) + ". " + ucesnici.get(i).getImena() + " " + ucesnici.get(i).getVremena());
			bw.newLine();
		}
		bw.close();
	}

}
