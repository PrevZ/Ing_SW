package Es5;

import java.util.ArrayList;
import java.util.List;

public class SistemaPrenotazioni {
    private List<Viaggio> viaggi;

    public SistemaPrenotazioni() {
        this.viaggi = new ArrayList<>();
    }

    public void aggiungiViaggio(Viaggio viaggio) {
        this.viaggi.add(viaggio);
    }

    public void prenotaViaggio(Viaggio viaggio) {
        try {
            viaggio.prenota();
            System.out.println("Viaggio prenotato: " + viaggio.descrizione());
        } catch (ViaggioGiaPrenotatoException e) {
            System.out.println(e.getMessage());
        }
    }

    public void visualizzaViaggi(){
        for (Viaggio viaggio : viaggi) {
            System.out.println(viaggio.descrizione());
        }
    }
}
