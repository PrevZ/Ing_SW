
public class PayPal extends MetodoPagamento {
    private String email;

    public PayPal(double saldoDisponibile, String email) {
        super(saldoDisponibile);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public void effettuaPagamento(double importo) throws SaldoInsufficienteException {
        if (importo > getSaldoDisponibile()) {
            throw new SaldoInsufficienteException("Saldo insufficiente su account PayPal.");
        }
        setSaldoDisponibile(getSaldoDisponibile() - importo);
        System.out.println("Pagamento di " + importo + "€ effettuato con account PayPal " + email);
    }
}
