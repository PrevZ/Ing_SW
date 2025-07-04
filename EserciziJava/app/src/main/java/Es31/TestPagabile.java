// Classe principale
public class TestPagabile {
    public static void main(String[] args) {
        Pagabile[] pagabili = new Pagabile[3];
        
        pagabili[0] = new Fattura("F001", "Servizio consulenza", 1000.00, 22);
        pagabili[1] = new Abbonamento("Premium", 9.99, 12, 15);
        pagabili[2] = new Fattura("F002", "Prodotti software", 500.00, 22);
        
        double totaleDaPagare = 0;
        
        for (Pagabile p : pagabili) {
            System.out.println(p + " - Totale: €" + String.format("%.2f", p.calcolaTotale()));
            totaleDaPagare += p.calcolaTotale();
        }
        
        System.out.println("\nTotale complessivo da pagare: €" + String.format("%.2f", totaleDaPagare));
    }
}
