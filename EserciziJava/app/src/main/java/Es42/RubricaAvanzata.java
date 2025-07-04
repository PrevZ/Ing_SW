import java.util.ArrayList;
import java.util.Scanner;

public class RubricaAvanzata {
    private ArrayList<Contatto> contatti;
    
    public RubricaAvanzata() {
        this.contatti = new ArrayList<>();
    }
    
    public void aggiungiContatto(Contatto contatto) {
        contatti.add(contatto);
    }
    
    // Ricerca per nome parziale
    public ArrayList<Contatto> cercaPerNomeParziale(String nomeParziale) {
        ArrayList<Contatto> risultati = new ArrayList<>();
        for (Contatto contatto : contatti) {
            if (contatto.getNome().toLowerCase().contains(nomeParziale.toLowerCase())) {
                risultati.add(contatto);
            }
        }
        return risultati;
    }
    
    // Ricerca per dominio email
    public ArrayList<Contatto> cercaPerDominioEmail(String dominio) {
        ArrayList<Contatto> risultati = new ArrayList<>();
        for (Contatto contatto : contatti) {
            if (contatto.getDominioEmail().toLowerCase().equals(dominio.toLowerCase())) {
                risultati.add(contatto);
            }
        }
        return risultati;
    }
    
    // Ricerca per numero
    public Contatto cercaPerNumero(String numero) {
        for (Contatto contatto : contatti) {
            if (contatto.getNumero().equals(numero)) {
                return contatto;
            }
        }
        return null;
    }
    
    public void stampaRubrica() {
        System.out.println("Rubrica completa:");
        for (Contatto contatto : contatti) {
            System.out.println("- " + contatto);
        }
    }
    
    public static void main(String[] args) {
        RubricaAvanzata rubrica = new RubricaAvanzata();
        
        // Aggiungo contatti di esempio
        rubrica.aggiungiContatto(new Contatto("Mario Rossi", "3331234567", "mario.rossi@gmail.com"));
        rubrica.aggiungiContatto(new Contatto("Giulia Bianchi", "3339876543", "giulia.bianchi@yahoo.it"));
        rubrica.aggiungiContatto(new Contatto("Luca Verdi", "3351122334", "luca.verdi@gmail.com"));
        rubrica.aggiungiContatto(new Contatto("Anna Neri", "3357788990", "anna.neri@outlook.com"));
        rubrica.aggiungiContatto(new Contatto("Marco Rossi", "3334455667", "marco.rossi@gmail.com"));
        
        Scanner scanner = new Scanner(System.in);
        int scelta = 0;
        
        do {
            System.out.println("\n=== RUBRICA AVANZATA ===");
            System.out.println("1. Mostra tutti i contatti");
            System.out.println("2. Cerca per nome parziale");
            System.out.println("3. Cerca per dominio email");
            System.out.println("4. Cerca per numero");
            System.out.println("0. Esci");
            System.out.print("Scelta: ");
            
            scelta = scanner.nextInt();
            scanner.nextLine(); // Consuma newline
            
            switch (scelta) {
                case 1:
                    rubrica.stampaRubrica();
                    break;
                    
                case 2:
                    System.out.print("Inserisci parte del nome da cercare: ");
                    String nomeParziale = scanner.nextLine();
                    ArrayList<Contatto> risultatiNome = rubrica.cercaPerNomeParziale(nomeParziale);
                    
                    System.out.println("Risultati trovati:");
                    if (risultatiNome.isEmpty()) {
                        System.out.println("Nessun contatto trovato.");
                    } else {
                        for (Contatto c : risultatiNome) {
                            System.out.println("- " + c);
                        }
                    }
                    break;
                    
                case 3:
                    System.out.print("Inserisci il dominio email (es. gmail.com): ");
                    String dominio = scanner.nextLine();
                    ArrayList<Contatto> risultatiDominio = rubrica.cercaPerDominioEmail(dominio);
                    
                    System.out.println("Contatti con dominio " + dominio + ":");
                    if (risultatiDominio.isEmpty()) {
                        System.out.println("Nessun contatto trovato.");
                    } else {
                        for (Contatto c : risultatiDominio) {
                            System.out.println("- " + c);
                        }
                    }
                    break;
                    
                case 4:
                    System.out.print("Inserisci il numero di telefono: ");
                    String numero = scanner.nextLine();
                    Contatto contattoTrovato = rubrica.cercaPerNumero(numero);
                    
                    if (contattoTrovato != null) {
                        System.out.println("Contatto trovato: " + contattoTrovato);
                    } else {
                        System.out.println("Nessun contatto trovato con questo numero.");
                    }
                    break;
            }
        } while (scelta != 0);
        
        scanner.close();
        System.out.println("Arrivederci!");
    }
}