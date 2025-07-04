// Classe principale
import java.util.ArrayList;
import java.util.Scanner;

public class RegistroMedico {
    public static void main(String[] args) {
        ArrayList<Paziente> pazienti = new ArrayList<>();
        ArrayList<Medico> medici = new ArrayList<>();
        ArrayList<Visita> visite = new ArrayList<>();
        
        // Aggiungo pazienti di esempio
        pazienti.add(new Paziente("P001", "Mario", "Rossi", "15/04/1980"));
        pazienti.add(new Paziente("P002", "Lucia", "Bianchi", "22/07/1975"));
        pazienti.add(new Paziente("P003", "Giovanni", "Verdi", "10/12/1990"));
        
        // Aggiungo medici di esempio
        medici.add(new Medico("M001", "Antonio", "Ferrari", "Cardiologia"));
        medici.add(new Medico("M002", "Laura", "Russo", "Neurologia"));
        
        // Aggiungo visite di esempio
        visite.add(new Visita("10/01/2023", pazienti.get(0), medici.get(0), 
                             "Ipertensione", "Beta bloccanti"));
        visite.add(new Visita("15/02/2023", pazienti.get(1), medici.get(1), 
                             "Emicrania", "Antidolorifici"));
        visite.add(new Visita("20/03/2023", pazienti.get(0), medici.get(1), 
                             "Vertigini", "Riposo e antivertiginosi"));
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== REGISTRO MEDICO ===");
        System.out.println("Pazienti registrati:");
        for (int i = 0; i < pazienti.size(); i++) {
            System.out.println((i+1) + ". " + pazienti.get(i));
        }
        
        System.out.print("\nInserisci il numero del paziente per cui cercare le visite: ");
        int scelta = scanner.nextInt() - 1;
        scanner.close();
        
        if (scelta >= 0 && scelta < pazienti.size()) {
            Paziente pazienteScelto = pazienti.get(scelta);
            System.out.println("\nVisite per " + pazienteScelto + ":");
            
            boolean trovate = false;
            for (Visita v : visite) {
                if (v.getPaziente().getId().equals(pazienteScelto.getId())) {
                    System.out.println("\n--- Visita ---");
                    System.out.println(v);
                    trovate = true;
                }
            }
            
            if (!trovate) {
                System.out.println("Nessuna visita trovata per questo paziente.");
            }
        } else {
            System.out.println("Scelta non valida.");
        }
    }
}
