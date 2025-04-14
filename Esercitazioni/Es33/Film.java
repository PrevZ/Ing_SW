// Classe Film
public class Film {
    private String titolo;
    private String regista;
    private int durata; // in minuti
    
    public Film(String titolo, String regista, int durata) {
        this.titolo = titolo;
        this.regista = regista;
        this.durata = durata;
    }
    
    public String getTitolo() {
        return titolo;
    }
    
    @Override
    public String toString() {
        return titolo + " (" + durata + " min) - Regia di " + regista;
    }
}
