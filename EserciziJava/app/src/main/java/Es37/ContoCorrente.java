// Sottoclasse ContoCorrente
public class ContoCorrente extends ContoBancario {
    private double tassoInteresse;
    private double massimoScoperto;
    
    public ContoCorrente(String numeroConto, String titolare, double saldoIniziale, 
                        double tassoInteresse, double massimoScoperto) {
        super(numeroConto, titolare, saldoIniziale);
        this.tassoInteresse = tassoInteresse;
        this.massimoScoperto = massimoScoperto;
    }
    
    @Override
    public double calcolaInteresse() {
        // Calcola interesse solo sul saldo positivo
        if (saldo > 0) {
            return saldo * tassoInteresse / 100;
        }
        return 0;
    }
    
    @Override
    public boolean preleva(double importo) {
        if (importo > 0 && (saldo - importo) >= -massimoScoperto) {
            saldo -= importo;
            System.out.println("Prelevati €" + importo + ". Nuovo saldo: €" + saldo);
            return true;
        }
        System.out.println("Prelievo non riuscito: superato il massimo scoperto.");
        return false;
    }
    
    @Override
    public String toString() {
        return "Conto Corrente N° " + numeroConto + " - Titolare: " + titolare + 
               " - Saldo: €" + saldo + " - Massimo scoperto: €" + massimoScoperto;
    }
}
