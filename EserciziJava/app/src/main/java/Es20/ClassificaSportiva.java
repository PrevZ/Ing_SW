import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ClassificaSportiva {
    public static void main(String[] args) {
        ArrayList<Squadra> classifica = new ArrayList<>();

        // Aggiungo alcune squadre
        classifica.add(new Squadra("Milan", 78));
        classifica.add(new Squadra("Inter", 82));
        classifica.add(new Squadra("Juventus", 75));
        classifica.add(new Squadra("Roma", 70));
        classifica.add(new Squadra("Napoli", 79));

        // Ordino la classifica in base ai punti (decrescente)
        Collections.sort(classifica, new Comparator<Squadra>() {
            @Override
            public int compare(Squadra s1, Squadra s2) {
                return Integer.compare(s2.getPunti(), s1.getPunti()); // Ordine decrescente
            }
        });

        // Stampo la classifica
        System.out.println("Classifica:");
        int posizione = 1;
        for (Squadra s : classifica) {
            System.out.println(posizione + ". " + s);
            posizione++;
        }
    }
}
