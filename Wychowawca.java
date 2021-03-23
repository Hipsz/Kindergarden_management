package przedszkole;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Wychowawca extends Osoba {
	private List<Grupa> grupy = new ArrayList<>();

	public Wychowawca(String imie, String nazwisko, LocalDate dataUrodzenia) {
		super(imie, nazwisko, dataUrodzenia);

	}

	public List<Grupa> getGrupy() {
		return grupy;
	}

	public void setGrupy(List<Grupa> grupy) {
		this.grupy = grupy;
	}

	public abstract double obliczPensje();

}
