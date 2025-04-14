// Classe principale
import java.util.List;
import java.util.function.Predicate;

public class GestioneCatalogo {
    public static void main(String[] args) {
        // Creo un catalogo di prodotti
        Catalogo<Prodotto> catalogo = new Catalogo<>();
        
        // Aggiungo prodotti
        catalogo.aggiungi(new Prodotto("Laptop XPS", "Elettronica", 1299.99, true));
        catalogo.aggiungi(new Prodotto("iPhone 13", "Elettronica", 799.99, true));
        catalogo.aggiungi(new Prodotto("T-shirt Basic", "Abbigliamento", 19.99, true));
        catalogo.aggiungi(new Prodotto("Scarpe Running", "Abbigliamento", 89.99, false));
        catalogo.aggiungi(new Prodotto("Monitor 27\"", "Elettronica", 349.99, true));
        catalogo.aggiungi(new Prodotto("Mouse Wireless", "Elettronica", 24.99, false));
        
        // Stampo tutti i prodotti
        System.out.println("TUTTI I PRODOTTI:");
        for (Prodotto p : catalogo.getTuttiProdotti()) {
            System.out.println(p);
        }
        
        // Filtro per categoria
        Predicate<Prodotto> filtroCategoria = p -> p.getCategoria().equals("Elettronica");
        List<Prodotto> prodottiElettronici = catalogo.filtra(filtroCategoria);
        
        System.out.println("\nPRODOTTI ELETTRONICI:");
        for (Prodotto p : prodottiElettronici) {
            System.out.println(p);
        }
        
        // Filtro per disponibilità
        Predicate<Prodotto> filtroDisponibili = Prodotto::isDisponibile;
        List<Prodotto> prodottiDisponibili = catalogo.filtra(filtroDisponibili);
        
        System.out.println("\nPRODOTTI DISPONIBILI:");
        for (Prodotto p : prodottiDisponibili) {
            System.out.println(p);
        }
        
        // Filtro per prezzo < 100
        Predicate<Prodotto> filtroPrezzo = p -> p.getPrezzo() < 100;
        List<Prodotto> prodottiEconomici = catalogo.filtra(filtroPrezzo);
        
        System.out.println("\nPRODOTTI SOTTO €100:");
        for (Prodotto p : prodottiEconomici) {
            System.out.println(p);
        }
        
        // Filtri combinati (elettronici disponibili)
        Predicate<Prodotto> filtroCombinato = filtroCategoria.and(filtroDisponibili);
        List<Prodotto> elettroniciDisponibili = catalogo.filtra(filtroCombinato);
        
        System.out.println("\nPRODOTTI ELETTRONICI DISPONIBILI:");
        for (Prodotto p : elettroniciDisponibili) {
            System.out.println(p);
        }
    }
}
