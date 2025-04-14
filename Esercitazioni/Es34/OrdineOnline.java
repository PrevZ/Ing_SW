// Classe OrdineOnline
public class OrdineOnline implements Spedibile {
    private String codice;
    private String cliente;
    private double importo;
    private String indirizzo;
    
    public OrdineOnline(String codice, String cliente, double importo, String indirizzo) {
        this.codice = codice;
        this.cliente = cliente;
        this.importo = importo;
        this.indirizzo = indirizzo;
    }
    
    @Override
    public String spedizione() {
        return "Spedizione tramite corriere all'indirizzo: " + indirizzo;
    }
    
    @Override
    public String toString() {
        return "Ordine Online #" + codice + " - Cliente: " + cliente + " - €" + importo;
    }
}
