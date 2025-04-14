// Classe Sala
public class Sala {
    private int numero;
    private int postiTotali;
    private int postiOccupati;
    
    public Sala(int numero, int postiTotali) {
        this.numero = numero;
        this.postiTotali = postiTotali;
        this.postiOccupati = 0;
    }
    
    public boolean prenota(int numPosti) {
        if (postiDisponibili() >= numPosti) {
            postiOccupati += numPosti;
            return true;
        }
        return false;
    }
    
    public int postiDisponibili() {
        return postiTotali - postiOccupati;
    }
    
    public int getNumero() {
        return numero;
    }
    
    @Override
    public String toString() {
        return "Sala " + numero + " (" + postiDisponibili() + "/" + postiTotali + " posti disponibili)";
    }
}
