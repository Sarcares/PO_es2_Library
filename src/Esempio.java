import biblio.Biblioteca;
import biblio.Libro;

public class Esempio {

    public static void main(String[] args) {
        // crea la biblioteca
        Biblioteca biblio = new Biblioteca();
        
        // crea dei libri
        Libro manzoni = new Libro("A. Manzoni","I Promessi Sposi");
        Libro pennac = new Libro("Daniel Pennac","La Fata Carabina");

        // aggiunge i libri alla biblioteca
        biblio.add(manzoni,1,"SC1",4);
        biblio.add(pennac,1,"SC1",1);
        
        String elenco = biblio.getLibri(1,"SC1");
        
        System.out.println(elenco);
    }

}
