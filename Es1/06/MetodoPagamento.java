package Es6;

public abstract class MetodoPagamento implements Pagabile {
    private double saldoDisponibile;

    public MetodoPagamento(double saldoDisponibile) {
        this.saldoDisponibile = saldoDisponibile;
    }

    public double getSaldoDisponibile() {
        return saldoDisponibile;
    }

    public void setSaldoDisponibile(double saldoDisponibile) {
        this.saldoDisponibile = saldoDisponibile;
    }

    @Override 
    public abstract void effettuaPagamento(double importo) throws SaldoInsufficienteException;
}
