package biblio;

import java.io.IOException;

public class GestioneBiblio {
	public GestioneBiblio(Biblioteca biblio) {
	}

	public void start() throws IOException {
	}

    public static void main(String[] args) throws IOException {
        Biblioteca biblio = new Biblioteca();
        GestioneBiblio ui = new GestioneBiblio(biblio);
        ui.start();
    }
}
