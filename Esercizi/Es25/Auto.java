// Implementazione Auto
public class Auto extends Macchina {
    public Auto(String modello) {
        super(modello);
    }
    
    @Override
    public void avvia() {
        System.out.println("L'auto " + modello + " si avvia con il motore a combustione");
    }
}
