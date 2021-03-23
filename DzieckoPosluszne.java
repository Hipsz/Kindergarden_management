package przedszkole;

import java.time.LocalDate;

public class DzieckoPosluszne extends Dziecko {
	private String odznaka;

	public DzieckoPosluszne(String imie, String nazwisko, LocalDate dataUrodzenia, String ulubionaZabawka,
			String odznaka) {
		super(imie, nazwisko, dataUrodzenia, ulubionaZabawka);
		this.odznaka = odznaka;
	}

	public String getOdznaka() {
		return odznaka;
	}

	public void setOdznaka(String odznaka) {
		this.odznaka = odznaka;
	}

}
