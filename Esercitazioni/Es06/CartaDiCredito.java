

public class CartaDiCredito extends MetodoPagamento {
    private String numeroCarta;

    public CartaDiCredito(double saldoDisponibile, String numeroCarta) {
        super(saldoDisponibile);
        this.numeroCarta = numeroCarta;
    }

    public String getNumeroCarta() {
        return numeroCarta;
    }

    @Override
    public void effettuaPagamento(double importo) throws SaldoInsufficienteException {
        if (getSaldoDisponibile() < importo) {
            throw new SaldoInsufficienteException("Saldo insufficiente sulla carta di credito.");
        }
        setSaldoDisponibile(getSaldoDisponibile() - importo);
        System.out.println("Pagamento di " + importo + "€ effettuato con Carta di Credito " + numeroCarta);
    }
}
