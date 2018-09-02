
public class Ucesnik {

	private String ime;
	private int vrijeme;

	public Ucesnik(String imena, int vremena) {
		super();
		this.ime = imena;
		this.vrijeme = vremena;
	}

	public String getImena() {
		return ime;
	}

	public void setImena(String imena) {
		this.ime = imena;
	}

	public int getVremena() {
		return vrijeme;
	}

	public void setVremena(int vremena) {
		this.vrijeme = vremena;
	}

}
