// Implementazione Fattura
public class Fattura implements Pagabile {
    private String numero;
    private String descrizione;
    private double importo;
    private double percentualeIVA;
    
    public Fattura(String numero, String descrizione, double importo, double percentualeIVA) {
        this.numero = numero;
        this.descrizione = descrizione;
        this.importo = importo;
        this.percentualeIVA = percentualeIVA;
    }
    
    @Override
    public double calcolaTotale() {
        return importo + (importo * percentualeIVA / 100);
    }
    
    @Override
    public String toString() {
        return "Fattura n. " + numero + " - " + descrizione + 
               " (Imponibile: €" + importo + ", IVA: " + percentualeIVA + "%)";
    }
}
