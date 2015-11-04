package biblio;

public class Scaffale {

	final static int MAX_SHELVES = 6;
	
	Ripiano ripiani[];
	
	/**
	* Costruisce un oggetto scaffale con 6 ripiani,
	* ciascun ripiano ha posto per 10 libri.
	*/
	public Scaffale(){
		ripiani = new Ripiano[MAX_SHELVES];
	}
}
