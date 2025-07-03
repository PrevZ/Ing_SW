// Classe principale
import java.util.ArrayList;

public class GestioneOrdini {
    public static void main(String[] args) {
        ArrayList<Spedibile> ordini = new ArrayList<>();
        
        // Aggiungo ordini online
        ordini.add(new OrdineOnline("OL001", "Mario Rossi", 129.90, "Via Roma 123, Milano"));
        ordini.add(new OrdineOnline("OL002", "Giulia Bianchi", 299.99, "Via Garibaldi 45, Torino"));
        
        // Aggiungo ordini in negozio
        ordini.add(new OrdineNegozio("NG001", "Luca Verdi", 79.50, "Negozio Milano Centro"));
        ordini.add(new OrdineNegozio("NG002", "Anna Neri", 149.90, "Negozio Roma EUR"));
        
        // Stampo tutti gli ordini con relativi metodi di spedizione
        System.out.println("ELENCO ORDINI:");
        for (Spedibile ordine : ordini) {
            System.out.println(ordine);
            System.out.println("Metodo di spedizione: " + ordine.spedizione());
            System.out.println();
        }
    }
}
