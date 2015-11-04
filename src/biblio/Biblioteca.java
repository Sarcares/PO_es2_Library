package biblio;

public class Biblioteca {
  /**
   * Costruisce un oggetto bibioteca con 3 piani, 
   * 30 scaffali per piano, 6 ripiani per scaffale
   * ciascuno con posto per 10 libri
   */
  public Biblioteca() {
  }
  
  /**
   * Aggiunge il libro specificato nel ripano, scaffale
   * e piano specificati.
   * @return <code>true</code> se l'inserimento è andato a buon fine
   */
  public boolean add(Libro libro, int piano, String scaffale, int ripiano) {
    return false;
  }

  /**
   * Verifica se il libro specificato si trova al
   * ripiano, scaffale e piano dati
   * @return <code>true</code> se il libro è presente
   */
  public boolean contiene(int piano, String scaffale, int ripiano, Libro libro) {

    return false;
  }

  /**
   * Restituisce l'elenco dei libri contenuti in uno scaffale
   * Per ogni ripiano nella stringa compare l'indicazione del 
   * ripiano nella forma "Ripiano 1" seguito, nelle righe 
   * successive dai libri contenuti nel ripiano.
   */
  public String getLibri(int piano, String scaffale) {
    return "";
  }

  /**
   * Ricerca un libro inserito nella biblioteca in base
   * a autore e titolo. Se uno dei due è <code>null</code>
   * la ricerca viene fatta solo su un parametro.
   * @return il libro ricercata o <code>null</code> se
   * 		non è stato trovato alcun libro
   */
  public Libro cerca(String autore, String titolo) {
    return null;
  }
}
