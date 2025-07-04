
public class Main {
    public static void main(String[] args) {
        Azienda azienda = new Azienda();

        Impiegato impiegato = new Impiegato("Mario Bianchi", 2000);
        Manager manager = new Manager("Francesco Rossi", 3000, 1000);

        // Aggiungi dipendenti all'azienda
        azienda.aggiungiDipendente(impiegato);
        azienda.aggiungiDipendente(manager);
        
        // Stampa gli stipendi totali
        azienda.stampaStipendiTotali();
    }
}
