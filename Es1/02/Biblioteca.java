package Es2;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<MaterialeBibliotecario> materiali;

    public Biblioteca() {
        this.materiali = new ArrayList<>();
    }

    public void aggiungiMateriale(MaterialeBibliotecario materiale) {
        this.materiali.add(materiale);
    }

    public void rimuoviMateriale(MaterialeBibliotecario materiale) {
        this.materiali.remove(materiale);
    }

    public void visualizzaMateriali() {
        for (MaterialeBibliotecario materiale : this.materiali) {
            System.out.println(materiale);
        }
    }
}
