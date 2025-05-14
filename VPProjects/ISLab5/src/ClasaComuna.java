public abstract class ClasaComuna {

	private String titlu;
	private int numar;

	public ClasaComuna(String t, int nr) {
		titlu=t;
		numar=nr;
	}
	
	public String getTitlu() {
		return titlu;
	}

	public void setTitlu(String titlu) {
		this.titlu = titlu;
	}

	public int getNumar() {
		return numar;
	}

	public void setNumar(int numar) {
		this.numar = numar;
	}

}