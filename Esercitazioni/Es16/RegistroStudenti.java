// Classe principale
import java.util.ArrayList;

public class RegistroStudenti {
    public static void main(String[] args) {
        ArrayList<Studente> registro = new ArrayList<>();
        
        // Aggiungo alcuni studenti
        registro.add(new Studente("Mario Rossi", "12345", new int[]{28, 30, 27, 25}));
        registro.add(new Studente("Giulia Bianchi", "67890", new int[]{30, 30, 29, 28}));
        registro.add(new Studente("Luca Verdi", "54321", new int[]{18, 25, 27, 22}));
        
        // Stampo le medie
        System.out.println("Medie degli studenti:");
        for (Studente s : registro) {
            System.out.printf("%s (Matricola: %s): %.2f\n", 
                              s.getNome(), s.getMatricola(), s.calcolaMedia());
        }
    }
}
