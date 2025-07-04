// Classe principale con main
import java.util.ArrayList;

public class RubricaTelefonica {
    public static void main(String[] args) {
        // Creo ArrayList per gestire i contatti
        ArrayList<Contatto> rubrica = new ArrayList<>();
        
        // Aggiungo alcuni contatti
        rubrica.add(new Contatto("Mario Rossi", "3331234567"));
        rubrica.add(new Contatto("Luigi Verdi", "3339876543"));
        rubrica.add(new Contatto("Anna Bianchi", "3351122334"));
        
        // Stampo tutti i contatti
        System.out.println("Contatti in rubrica:");
        for (Contatto c : rubrica) {
            System.out.println(c);
        }
    }
}
