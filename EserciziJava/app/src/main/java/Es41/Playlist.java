import java.util.ArrayList;

public class Playlist {
    private String nome;
    private ArrayList<Canzone> canzoni;
    
    public Playlist(String nome) {
        this.nome = nome;
        this.canzoni = new ArrayList<>();
    }
    
    public void aggiungiCanzone(Canzone canzone) {
        canzoni.add(canzone);
    }
    
    public void rimuoviCanzone(Canzone canzone) {
        canzoni.remove(canzone);
    }
    
    public ArrayList<Canzone> getCanzoni() {
        return canzoni;
    }
    
    public String getNome() {
        return nome;
    }
    
    // Metodo statico per calcolare la durata totale
    public static int calcolaDurataTotale(Playlist playlist) {
        int durataTotale = 0;
        for (Canzone canzone : playlist.getCanzoni()) {
            durataTotale += canzone.getDurata();
        }
        return durataTotale;
    }
    
    public static String formataDurata(int durataSecondi) {
        int ore = durataSecondi / 3600;
        int minuti = (durataSecondi % 3600) / 60;
        int secondi = durataSecondi % 60;
        
        if (ore > 0) {
            return String.format("%d:%02d:%02d", ore, minuti, secondi);
        } else {
            return String.format("%d:%02d", minuti, secondi);
        }
    }
    
    @Override
    public String toString() {
        return "Playlist: " + nome + " (" + canzoni.size() + " canzoni)";
    }
}