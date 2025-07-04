// Classe OrdineNegozio
public class OrdineNegozio implements Spedibile {
    private String codice;
    private String cliente;
    private double importo;
    private String filiale;
    
    public OrdineNegozio(String codice, String cliente, double importo, String filiale) {
        this.codice = codice;
        this.cliente = cliente;
        this.importo = importo;
        this.filiale = filiale;
    }
    
    @Override
    public String spedizione() {
        return "Ritiro presso il negozio: " + filiale;
    }
    
    @Override
    public String toString() {
        return "Ordine Negozio #" + codice + " - Cliente: " + cliente + " - €" + importo;
    }
}
