import java.util.Scanner;
import java.io.*;

public class Zadatak3 {

	public static void main(String[] args) throws FileNotFoundException {
		// Napisati program koji pita korisnika da unese ime,
		// a zatim ispisuje vrijeme koje je ucesnik pod tim imenom ostvario u
		// maratonu citajuci ga iz fajla.

		FileReader fr = new FileReader("maraton.txt");
		BufferedReader br = new BufferedReader(fr);

		Scanner sc = new Scanner(br);

		Scanner unos = new Scanner(System.in);

		String ime;
		String trazenoIme;
		int vrijeme;

		System.out.println("Unesite ime maratonca: ");
		trazenoIme = unos.next();

		while (sc.hasNext()) {
			if (sc.next().equals(trazenoIme)) {
				ime = trazenoIme;
				vrijeme = sc.nextInt();
				System.out.println(ime + " " + vrijeme);
			}

		}
	}

}
