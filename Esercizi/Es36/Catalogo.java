import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Catalogo<T> {
    private List<T> prodotti;
    
    public Catalogo() {
        this.prodotti = new ArrayList<>();
    }
    
    public void aggiungi(T prodotto) {
        prodotti.add(prodotto);
    }
    
    public List<T> filtra(Predicate<T> filtro) {
        List<T> risultato = new ArrayList<>();
        for (T prodotto : prodotti) {
            if (filtro.test(prodotto)) {
                risultato.add(prodotto);
            }
        }
        return risultato;
    }
    
    public List<T> getTuttiProdotti() {
        return new ArrayList<>(prodotti);
    }
}
