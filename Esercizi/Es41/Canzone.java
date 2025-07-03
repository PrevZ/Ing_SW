public class Canzone {
    private String titolo;
    private String artista;
    private int durata; // in secondi
    
    public Canzone(String titolo, String artista, int durata) {
        this.titolo = titolo;
        this.artista = artista;
        this.durata = durata;
    }
    
    public String getTitolo() {
        return titolo;
    }
    
    public String getArtista() {
        return artista;
    }
    
    public int getDurata() {
        return durata;
    }
    
    public String getDurataFormattata() {
        int minuti = durata / 60;
        int secondi = durata % 60;
        return String.format("%d:%02d", minuti, secondi);
    }
    
    @Override
    public String toString() {
        return titolo + " - " + artista + " (" + getDurataFormattata() + ")";
    }
}