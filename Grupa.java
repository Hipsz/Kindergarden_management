package przedszkole;

public class Grupa {
	private static int maxLiczbaDzieci = 15;
	private Wychowawca wychowawca;
	private Sala sala;



	public static int getMaxLiczbaDzieci() {
		return maxLiczbaDzieci;
	}
	public static void setMaxLiczbaDzieci(int maxLiczbaDzieci) {
		Grupa.maxLiczbaDzieci = maxLiczbaDzieci;
	}
	public Sala getSala() {
		return sala;
	}
	public void setSala(Sala sala) {
		this.sala = sala;
	}

	

}
