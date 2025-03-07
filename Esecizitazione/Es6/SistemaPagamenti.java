package Es6;

import java.util.ArrayList;
import java.util.List;

public class SistemaPagamenti {
    private List<MetodoPagamento> metodiPagamento;

    public SistemaPagamenti() {
        this.metodiPagamento = new ArrayList<>();
    }

    public void aggiungiMetodoPagamento(MetodoPagamento metodo) {
        metodiPagamento.add(metodo);
    }

    public void effettuaPagamento(double importo) {
        for (MetodoPagamento metodo : metodiPagamento) {
            try {
                metodo.effettuaPagamento(importo);
                return;
            } catch (SaldoInsufficienteException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Nessun metodo di pagamento disponibile con saldo sufficiente.");
    }

    public void visualizzaMetodiPagamento() {
        for (MetodoPagamento metodo : metodiPagamento) {
            System.out.println(metodo);
        }
    }
}
