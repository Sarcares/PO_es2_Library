package biblio;

public class Scaffale {

	final static int DEFAULT_SHELVES = 6;
	
	Ripiano ripiani[];
	
	/**
	* Costruisce un oggetto Scaffale con 6 ripiani,
	* ciascun ripiano ha posto per 10 libri.
	*/
	public Scaffale(){
		this(DEFAULT_SHELVES, Ripiano.DEFAULT_BOOKS);
	}

	/**
	 * Costruisce un oggetto Scaffale permettendo di specificarne i parametri.
	 * @param shelves - Numero di ripiani per ogni scaffale
	 * @param books - Numero di libri su ogni ripiano
	 */
	public Scaffale(int shelves, int books) {
		ripiani = new Ripiano[shelves];
		
		for(int i=0; i<shelves; i++) {
			this.ripiani[i] = new Ripiano(books);
		}
	}
}
