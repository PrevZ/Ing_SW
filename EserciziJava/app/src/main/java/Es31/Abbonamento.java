// Implementazione Abbonamento
public class Abbonamento implements Pagabile {
    private String tipo;
    private double tariffa;
    private int mesi;
    private double scontoPercentuale;
    
    public Abbonamento(String tipo, double tariffa, int mesi, double scontoPercentuale) {
        this.tipo = tipo;
        this.tariffa = tariffa;
        this.mesi = mesi;
        this.scontoPercentuale = scontoPercentuale;
    }
    
    @Override
    public double calcolaTotale() {
        double totale = tariffa * mesi;
        double sconto = totale * scontoPercentuale / 100;
        return totale - sconto;
    }
    
    @Override
    public String toString() {
        return "Abbonamento " + tipo + " per " + mesi + " mesi" + 
               " (Tariffa: €" + tariffa + "/mese, Sconto: " + scontoPercentuale + "%)";
    }
}
