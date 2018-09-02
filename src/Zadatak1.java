import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("maraton.txt");
		BufferedReader br = new BufferedReader(fr);

		Scanner sc = new Scanner(br);

		String najbrziUcesnik = sc.next();
		int najbrzeVrijeme = sc.nextInt();

		while (sc.hasNext()) {
			String ime = sc.next();
			int vrijeme = sc.nextInt();

			if (vrijeme < najbrzeVrijeme) {
				najbrzeVrijeme = vrijeme;
				najbrziUcesnik = ime;
			}
		}
		System.out.println(najbrziUcesnik + " " + najbrzeVrijeme);

	}

}
