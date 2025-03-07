import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Veicolo> veicoli = new ArrayList<Veicolo>();

        // Aggiungo diversi veicoli alla lista
        veicoli.add(new Auto("AB123CD"));
        veicoli.add(new Moto("EF456GH"));

        // Avvia tutti i veicoli
        for (Veicolo veicolo : veicoli) {
            veicolo.avvia();
        }

        // Ferma tutti i veicoli
        for (Veicolo veicolo : veicoli) {
            veicolo.ferma();
        }
    }
}