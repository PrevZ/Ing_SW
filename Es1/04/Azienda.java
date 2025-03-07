package Es4;

import java.util.ArrayList;
import java.util.List;

public class Azienda {
    private List<Dipendente> dipendenti;

    public Azienda() {
        this.dipendenti = new ArrayList<>();
    }

    public void aggiungiDipendente(Dipendente dipendente) {
        dipendenti.add(dipendente);
    }

    public void stampaStipendiTotali() {
        int totale = 0;

        for (Dipendente dipendente : dipendenti) {
            totale += dipendente.calcolaStipendio();
        }

        System.out.println("Stipendi totali: " + totale);
    }
}
