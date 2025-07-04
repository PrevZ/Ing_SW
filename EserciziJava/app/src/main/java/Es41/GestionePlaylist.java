public class GestionePlaylist {
    public static void main(String[] args) {
        // Creo una playlist
        Playlist playlist = new Playlist("Le mie preferite");
        
        // Aggiungo canzoni
     playlist.aggiungiCanzone(new Canzone("Bohemian Rhapsody", "Queen", 355));
     playlist.aggiungiCanzone(new Canzone("Stairway to Heaven", "Led Zeppelin", 482));
     playlist.aggiungiCanzone(new Canzone("Hotel California", "Eagles", 391));
     playlist.aggiungiCanzone(new Canzone("Imagine", "John Lennon", 183));
     playlist.aggiungiCanzone(new Canzone("Smells Like Teen Spirit", "Nirvana", 301));
        
        // Stampo la playlist
        System.out.println (playlist);
        System.out.println("\nCanzoni nella playlist:");
        for (Canzone canzone : playlist.getCanzoni()) {
            System.out.println("- " + canzone);
        }
        
        // Calcolo durata totale usando il metodo statico
        int durataTotale = Playlist.calcolaDurataTotale(playlist);
        String durataFormattata = Playlist.formataDurata(durataTotale);
        
        System.out.println("\nDurata totale playlist: " + durataFormattata);
        System.out.println("Numero totale canzoni: " + playlist.getCanzoni().size());
    }
}