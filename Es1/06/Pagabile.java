package Es6;

public interface Pagabile {
    void effettuaPagamento(double importo) throws SaldoInsufficienteException;
}
