package przedszkole;

import java.time.LocalDate;

public class WychowawcaKwalifikowany extends Wychowawca {

	private String kwalifikacja;

	public WychowawcaKwalifikowany(String imie, String nazwisko, LocalDate dataUrodzenia, String kwalifikacja) {
		super(imie, nazwisko, dataUrodzenia);
		this.kwalifikacja = kwalifikacja;
	}

	public String getKwalifikacja() {
		return kwalifikacja;
	}

	public void setKwalifikacja(String kwalifikacja) {
		this.kwalifikacja = kwalifikacja;
	}

	public double obliczPensje() {
		return (2021 - getDataUrodzenia().getYear()) * 1.5;
	}
}
