// Classe astratta ContoBancario
public abstract class ContoBancario {
    protected String numeroConto;
    protected String titolare;
    protected double saldo;
    
    public ContoBancario(String numeroConto, String titolare, double saldoIniziale) {
        this.numeroConto = numeroConto;
        this.titolare = titolare;
        this.saldo = saldoIniziale;
    }
    
    public void deposita(double importo) {
        if (importo > 0) {
            saldo += importo;
            System.out.println("Depositati €" + importo + ". Nuovo saldo: €" + saldo);
        }
    }
    
    public boolean preleva(double importo) {
        if (importo > 0 && importo <= saldo) {
            saldo -= importo;
            System.out.println("Prelevati €" + importo + ". Nuovo saldo: €" + saldo);
            return true;
        }
        System.out.println("Prelievo non riuscito.");
        return false;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public abstract double calcolaInteresse();
    
    @Override
    public String toString() {
        return "Conto N° " + numeroConto + " - Titolare: " + titolare + " - Saldo: €" + saldo;
    }
}
