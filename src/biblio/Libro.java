package biblio;

public class Libro {
	
	private String autor;
	private String title;
	private int floor;
	private String bookcase;
	private int shelf;
	/**
	 * Costruisce un libro a partire da autore e titolo
	 */
	public Libro(String autore, String titolo) {
		this.autor = autore;
		this.title = titolo;
	}

	/**
	 * Restitiuisce la string corrispondente al libro nella forma "autore, titolo"
	 */
	public String toString() {
		return autor+", "+title;
	}

/* -.-.-.-.-.- Getter and Setter Methods -.-.-.-.-.- */
	/**
	 * Metodo <i>getter</i> per accedere all'autore del libro
	 */
	public String getAutore() {
		return autor;
	}

	/**
	 * Metodo <i>getter</i> per accedere al titolo del libro
	 */
	public String getTitolo() {
		return title;
	}
	
	/**
	 * Restituisce il numero del ripiano in cui si trova il libro
	 */
	public int getRipiano() {
		return this.shelf;
	}

	/**
	 * Restituisce il codice dello scaffale in cui si trova il libro
	 */
	public String getScaffale() {
		return this.bookcase;
	}

	/**
	 * Restituisce il numero del piano in cui si trova il libro
	 */
	public int getPiano() {
		return this.floor;
	}

	/**
	 * Imposta il numero del piano in cui si trova il libro
	 */
	public void setPiano(int floor) {
		this.floor = floor;
	}
	
	/**
	 * Imposta il numero del ripiano in cui si trova il libro
	 */
	public void setRipiano(String bookcase) {
		this.bookcase = bookcase;
	}

	/**
	 * Imposta il codice dello scaffale in cui si trova il libro
	 */
	public void setScaffale(int shelf) {
		this.shelf = shelf;
	}
}