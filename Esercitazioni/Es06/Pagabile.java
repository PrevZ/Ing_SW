
public interface Pagabile {
    void effettuaPagamento(double importo) throws SaldoInsufficienteException;
}
