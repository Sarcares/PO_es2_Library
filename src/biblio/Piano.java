package biblio;

public class Piano {
	
	final static int DEFAULT_BOOKCASES = 30;
	
	Scaffale scaffali[];
	
	/**
	* Costruisce un oggetto piano con 30 scaffali,
	* ogni scaffale ha 6 ripiani e ciascuno di essi ha posto per 10 libri.
	*/
	public Piano() {
		this(DEFAULT_BOOKCASES, Scaffale.DEFAULT_SHELVES, Ripiano.DEFAULT_BOOKS);
	}

	  /**
	   * Costruisce un oggetto Piano permettendo di specificarne i parametri.
	   * @param bookcase - Numero di scaffali per piano
	   * @param shelves - Numero di ripiani per ogni scaffale
	   * @param books - Numero di libri su ogni ripiano
	   */
	public Piano(int bookcases, int shelves, int books) {
		scaffali = new Scaffale[bookcases];
		
		for(int i=0; i<bookcases; i++) {
			this.scaffali[i] = new Scaffale(shelves, books);
		}
	}
}
