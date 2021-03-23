package przedszkole;

import java.time.LocalDate;

public class WychowawcaTymczasowy extends Wychowawca {

	public WychowawcaTymczasowy(String imie, String nazwisko, LocalDate dataUrodzenia) {
		super(imie, nazwisko, dataUrodzenia);

	}

	public double obliczPensje() {
		return (2021 - getDataUrodzenia().getYear()) * 1.2;
	}

}
