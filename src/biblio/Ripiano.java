package biblio;

public class Ripiano {
	
	final static int MAX_BOOKS = 10;
	
	Libro libri[];
	
	/**
	* Costruisce un oggetto ripiano in grado di contenere 10 libri.
	*/
	public Ripiano(){
		libri = new Libro[MAX_BOOKS];
	}
}
