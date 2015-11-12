package biblio;

public class Ripiano {
	
	final static int DEFAULT_BOOKS = 10;
	
	Libro libri[];
	
	/**
	* Costruisce un oggetto Ripiano in grado di contenere 10 libri.
	*/
	public Ripiano(){
		this(DEFAULT_BOOKS);
	}

	  /**
	   * Costruisce un oggetto Ripiano permettendo di specificarne i parametri.
	   * @param books - Numero di libri su ogni ripiano
	   */
	public Ripiano(int books) {
		libri = new Libro[books];
	}
}
