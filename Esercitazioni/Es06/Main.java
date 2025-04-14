
public class Main {
    public static void main(String[] args) {
        SistemaPagamenti sistema = new SistemaPagamenti();
    
        MetodoPagamento carta = new CartaDiCredito(500.00, "1234-5678-9012-3456");
        MetodoPagamento payPal = new PayPal(300.00, "example01@edu.unife.it");

        sistema.aggiungiMetodoPagamento(carta);
        sistema.aggiungiMetodoPagamento(payPal);

        sistema.effettuaPagamento(300.00);
        sistema.effettuaPagamento(300.00);
        sistema.effettuaPagamento(700.00);
    }
}
