// Sottoclasse ContoRisparmio
public class ContoRisparmio extends ContoBancario {
    private double tassoInteresse;
    
    public ContoRisparmio(String numeroConto, String titolare, double saldoIniziale, double tassoInteresse) {
        super(numeroConto, titolare, saldoIniziale);
        this.tassoInteresse = tassoInteresse;
    }
    
    @Override
    public double calcolaInteresse() {
        return saldo * tassoInteresse / 100;
    }
    
    @Override
    public String toString() {
        return "Conto Risparmio N° " + numeroConto + " - Titolare: " + titolare + 
               " - Saldo: €" + saldo;
    }
}
