package biblio;

import java.util.ArrayList;
import java.util.List;

public class Ripiano {
	
	final static int DEFAULT_BOOKS = 10;
	private int size;
	
	List<Libro> libri;
	
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
		libri = new ArrayList<Libro>();
		this.size = books;
	}

	/**
	 * Aggiunge il libro specificato nel ripano.
	 * @return <code>true</code> se l'inserimento è andato a buon fine
	 */
	public boolean add(Libro libro) {
		if(libri.size() >= this.size)
			return false;
		
		return libri.add(libro);
	}

	/**
	 * Verifica se il libro specificato si trova nel ripiano.
	 * @return <code>true</code> se il libro è presente
	 */
	public boolean contiene(Libro libro) {
		for(Libro l : this.libri) {
			if( l.equals(libro) )
				return true;
		}
		return false;
	}
	
	/**
	 * This method returns the number of books stored inside the shelf.
	 * @return
	 */
	public int getBooksNumber() {
		return libri.size();
	}
}
