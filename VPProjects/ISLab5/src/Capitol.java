public class Capitol extends ClasaComuna {

	private String rezumat;

	public Capitol(String t, int nr, String rezum) {
		super(t, nr);
		rezumat=rezum;
	}

	public String getRezumat() {
		return rezumat;
	}

	public void setRezumat(String rezumat) {
		this.rezumat = rezumat;
	}

}