package przedszkole;

import java.time.LocalDate;

public class DzieckoNieposluszne extends Dziecko {

	private String przewinienie;

	public DzieckoNieposluszne(String imie, String nazwisko, LocalDate dataUrodzenia, String ulubionaZabawka,
			String przewinienie) {
		super(imie, nazwisko, dataUrodzenia, ulubionaZabawka);
		this.przewinienie = przewinienie;
	}

	public String getPrzewinienie() {
		return przewinienie;
	}

	public void setPrzewinienie(String przewinienie) {
		this.przewinienie = przewinienie;
	}
	
	
}
