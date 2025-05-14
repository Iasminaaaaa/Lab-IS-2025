public class Carte {

	private String editor;
	private date dataPublicare;
	private int ISBN;

	public String getEditor() {
		return editor; 
	}

	public void setEditor(String editor) {
		this.editor = editor;
	}

	public void getData_publicare() {
		return dataPublicare;
	}

	
	public void setData_publicare(date dataPublicare) {
		this.dataPublicare=dataPublicare;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String ISBN) {
		this.ISBN=ISBN;
	}

}