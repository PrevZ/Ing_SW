import java.util.ArrayList;
import java.util.Scanner;

public class MagazzinoProdotti {
    public static void main(String[] args) {
        ArrayList<Prodotto> magazzino = new ArrayList<>();
        
        // Aggiungo alcuni prodotti
        magazzino.add(new Prodotto("Smartphone", "SM001", 499.99));
        magazzino.add(new Prodotto("Laptop", "LT002", 899.99));
        magazzino.add(new Prodotto("Tablet", "TB003", 299.99));
        magazzino.add(new Prodotto("Cuffie", "CF004", 79.99));
        
        // Cerco un prodotto per codice
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci il codice del prodotto da cercare: ");
        String codiceCercato = scanner.nextLine();
        
        // Ricerca
        boolean trovato = false;
        for (Prodotto p : magazzino) {
            if (p.getCodice().equalsIgnoreCase(codiceCercato)) {
                System.out.println("Prodotto trovato:");
                System.out.println(p);
                trovato = true;
                break;
            }
        }
        
        if (!trovato) {
            System.out.println("Prodotto con codice " + codiceCercato + " non trovato.");
        }
        
        scanner.close();
    }
}
