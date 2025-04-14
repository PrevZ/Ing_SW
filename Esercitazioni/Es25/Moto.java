// Implementazione Moto
public class Moto extends Macchina {
    public Moto(String modello) {
        super(modello);
    }
    
    @Override
    public void avvia() {
        System.out.println("La moto " + modello + " si avvia con il kickstart");
    }
}
