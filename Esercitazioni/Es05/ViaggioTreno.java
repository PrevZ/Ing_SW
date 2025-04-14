
public class ViaggioTreno extends Viaggio {
    private int numeroPosto;

    public ViaggioTreno(String destinazione, double prezzo, int numeroPosto) {
        super(destinazione, prezzo);
        this.numeroPosto = numeroPosto;
    }

    public int getNumeroPosto() {
        return numeroPosto;
    }

    @Override
    public String descrizione() {
        return "Viaggio in Treno verso " + getDestinazione() + " con posto numero: " + numeroPosto + " e al prezzo di " + getPrezzo();
    }
    
}
