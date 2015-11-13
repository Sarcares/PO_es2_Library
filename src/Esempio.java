import biblio.Biblioteca;
import biblio.Libro;

public class Esempio {

    public static void main(String[] args) {
        // crea la biblioteca
        Biblioteca biblio = new Biblioteca();
        
        // crea dei libri
        Libro manzoni = new Libro("A. Manzoni","I Promessi Sposi");
        Libro pennac = new Libro("Daniel Pennac","La Fata Carabina");
        Libro dodo = new Libro("Dan Don", "Azkebefenai");
        
        // aggiunge i libri alla biblioteca
        biblio.add(manzoni,1,"SC1",4);
        biblio.add(pennac,1,"SC1",1);
        
        // cerco i libri nella biblioteca
        if( biblio.contiene(1,"SC1",4,manzoni) )
        	System.out.println(manzoni+" - is in the specified place.");
        else
        	System.out.println(manzoni+" - is not in the specified place.");
        
        if( biblio.contiene(2,"SC1",4,manzoni) )
        	System.out.println(manzoni+" - is in the specified place.");
        else
        	System.out.println(manzoni+" - is not in the specified place.");
        
        if( biblio.contiene(1,"SC1",1,pennac) )
        	System.out.println(pennac+" - is in the specified place.");
        else
        	System.out.println(pennac+" - is not in the specified place.");
        
        if( biblio.contiene(1,"SC4",3,dodo) )
        	System.out.println(dodo+" - is in the specified place.");
        else
        	System.out.println(dodo+" - is not in the specified place.");
        
        //String elenco = biblio.getLibri(1,"SC1");
        //System.out.println(elenco);
    }

}
