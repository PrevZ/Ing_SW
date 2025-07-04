// Classe figlia Alimentare
public class Alimentare extends Prodotto {
    private LocalDate dataScadenza;
    private boolean biologico;
    
    public Alimentare(String codice, String nome, double prezzo, LocalDate dataScadenza, boolean biologico) {
        super(codice, nome, prezzo);
        this.dataScadenza = dataScadenza;
        this.biologico = biologico;
    }
    
    public LocalDate getDataScadenza() {
        return dataScadenza;
    }
    
    public boolean isBiologico() {
        return biologico;
    }
    
    @Override
    public String getInfoSpecifiche() {
        return "Scadenza: " + dataScadenza + (biologico ? ", Biologico" : "");
    }
    
    @Override
    public String toString() {
        return super.toString() + " - " + getInfoSpecifiche();
    }
}
