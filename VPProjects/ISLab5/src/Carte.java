import java.util.Date;

public class Carte {

	private String editor;
	private Date dataPublicare;
	private String ISBN;

	public String getEditor() {
		return editor; 
	}

	public void setEditor(String editor) {
		this.editor = editor;
	}

	public Date getData_publicare() {
		return dataPublicare;
	}

	
	public void setData_publicare(Date dataPublicare) {
		this.dataPublicare=dataPublicare;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String ISBN) {
		this.ISBN=ISBN;
	}

}