// Classe principale
import java.util.ArrayList;
import java.util.Scanner;

public class CinemaPrenotazioni {
    public static void main(String[] args) {
        // Inizializzo sale, film e prenotazioni
        ArrayList<Sala> sale = new ArrayList<>();
        ArrayList<Film> films = new ArrayList<>();
        ArrayList<Prenotazione> prenotazioni = new ArrayList<>();
        
        // Aggiungo sale
        sale.add(new Sala(1, 100));
        sale.add(new Sala(2, 80));
        sale.add(new Sala(3, 120));
        
        // Aggiungo film
        films.add(new Film("Inception", "Christopher Nolan", 148));
        films.add(new Film("Interstellar", "Christopher Nolan", 169));
        films.add(new Film("Dune", "Denis Villeneuve", 156));
        
        Scanner scanner = new Scanner(System.in);
        int scelta = 0;
        
        do {
            System.out.println("\n=== SISTEMA DI PRENOTAZIONE CINEMA ===");
            System.out.println("1. Mostra sale disponibili");
            System.out.println("2. Mostra film in programmazione");
            System.out.println("3. Effettua una prenotazione");
            System.out.println("4. Visualizza prenotazioni");
            System.out.println("0. Esci");
            System.out.print("Scelta: ");
            
            scelta = scanner.nextInt();
            scanner.nextLine(); // Consuma il newline
            
            switch (scelta) {
                case 1:
                    System.out.println("\nSALE DISPONIBILI:");
                    for (Sala sala : sale) {
                        System.out.println(sala);
                    }
                    break;
                    
                case 2:
                    System.out.println("\nFILM IN PROGRAMMAZIONE:");
                    for (int i = 0; i < films.size(); i++) {
                        System.out.println((i+1) + ". " + films.get(i));
                    }
                    break;
                    
                case 3:
                    System.out.println("\nNUOVA PRENOTAZIONE");
                    
                    // Selezione film
                    System.out.println("Film disponibili:");
                    for (int i = 0; i < films.size(); i++) {
                        System.out.println((i+1) + ". " + films.get(i));
                    }
                    System.out.print("Seleziona film (1-" + films.size() + "): ");
                    int filmScelto = scanner.nextInt() - 1;
                    scanner.nextLine(); // Consuma newline
                    
                    // Selezione sala
                    System.out.println("Sale disponibili:");
                    for (int i = 0; i < sale.size(); i++) {
                        System.out.println((i+1) + ". " + sale.get(i));
                    }
                    System.out.print("Seleziona sala (1-" + sale.size() + "): ");
                    int salaScelto = scanner.nextInt() - 1;
                    scanner.nextLine(); // Consuma newline
                    
                    // Numero di posti
                    System.out.print("Numero di posti da prenotare: ");
                    int numPosti = scanner.nextInt();
                    scanner.nextLine(); // Consuma newline
                    
                    // Nominativo
                    System.out.print("Nominativo: ");
                    String nominativo = scanner.nextLine();
                    
                    // Effettua prenotazione
                    if (sale.get(salaScelto).prenota(numPosti)) {
                        Prenotazione p = new Prenotazione(
                            films.get(filmScelto), 
                            sale.get(salaScelto),
                            numPosti,
                            nominativo
                        );
                        prenotazioni.add(p);
                        System.out.println("Prenotazione effettuata con successo!");
                    } else {
                        System.out.println("Impossibile effettuare la prenotazione: posti insufficienti.");
                    }
                    break;
                    
                case 4:
                    System.out.println("\nPRENOTAZIONI EFFETTUATE:");
                    if (prenotazioni.isEmpty()) {
                        System.out.println("Nessuna prenotazione presente.");
                    } else {
                        for (Prenotazione p : prenotazioni) {
                            System.out.println(p);
                        }
                    }
                    break;
            }
        } while (scelta != 0);
        
        scanner.close();
        System.out.println("Grazie per aver utilizzato il sistema di prenotazione.");
    }
}
