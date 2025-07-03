// Classe astratta Macchina
public abstract class Macchina {
    protected String modello;
    
    public Macchina(String modello) {
        this.modello = modello;
    }
    
    public abstract void avvia();
}
