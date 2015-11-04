package biblio;

public class Piano {
	
	final static int MAX_BOOKCASE = 30;
	
	Scaffale scaffali[];
	
	/**
	* Costruisce un oggetto piano con 30 scaffali,
	* ogni scaffale ha 6 ripiani e ciascuno di essi ha posto per 10 libri.
	*/
	public Piano() {
		scaffali = new Scaffale[MAX_BOOKCASE];
	}
}
