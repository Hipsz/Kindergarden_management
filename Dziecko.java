package przedszkole;

import java.time.LocalDate;

public abstract class Dziecko extends Osoba {
	private String ulubionaZabawka;

	public Dziecko(String imie, String nazwisko, LocalDate dataUrodzenia, String ulubionaZabawka) {
		super(imie, nazwisko, dataUrodzenia);
		this.ulubionaZabawka = ulubionaZabawka;
	}

	public String getUlubionaZabawka() {
		return ulubionaZabawka;
	}

	public void setUlubionaZabawka(String ulubionaZabawka) {
		this.ulubionaZabawka = ulubionaZabawka;
	}

}
